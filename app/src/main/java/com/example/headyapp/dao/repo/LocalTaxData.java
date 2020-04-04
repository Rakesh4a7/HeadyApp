package com.example.headyapp.dao.repo;

import com.example.headyapp.database.AppDatabase;
import com.example.headyapp.model.roomentities.Tax;

import java.util.List;

import javax.inject.Inject;
/**
 * local data source.
 * @author Rakesh
 */
public class LocalTaxData implements DataSource<Tax>
{

    AppDatabase appDatabase;

    @Inject
    public LocalTaxData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(Tax tax)
    {
        appDatabase.taxDataDao().insert(tax);
    }

    @Override
    public void addItems(List<Tax> items)
    {

    }
}
