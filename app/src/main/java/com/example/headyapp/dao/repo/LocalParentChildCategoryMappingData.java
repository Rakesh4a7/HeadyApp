package com.example.headyapp.dao.repo;

import com.example.headyapp.database.AppDatabase;
import com.example.headyapp.model.roomentities.ParentChildCategoryMapping;

import java.util.List;

import javax.inject.Inject;

/**
 * local data source.
 * @author Rakesh
 */
public class LocalParentChildCategoryMappingData implements DataSource<ParentChildCategoryMapping>
{

    AppDatabase appDatabase;

    @Inject
    public LocalParentChildCategoryMappingData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ParentChildCategoryMapping parentChildCategoryMapping)
    {
        appDatabase.parentChildCategoryMappingDataDao().insert(parentChildCategoryMapping);
    }

    @Override
    public void addItems(List<ParentChildCategoryMapping> items)
    {
    }
}
