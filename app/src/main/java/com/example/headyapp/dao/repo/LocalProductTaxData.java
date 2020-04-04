package com.example.headyapp.dao.repo;

import com.example.headyapp.database.AppDatabase;
import com.example.headyapp.model.roomentities.ProductTax;

import java.util.List;

import javax.inject.Inject;
/**
 * local data source.
 * @author Rakesh
 */
public class LocalProductTaxData implements DataSource<ProductTax>
{

    AppDatabase appDatabase;

    @Inject
    public LocalProductTaxData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ProductTax productTax)
    {
        appDatabase.productTaxDataDao().insert(productTax);
    }

    @Override
    public void addItems(List<ProductTax> items)
    {
    }
}
