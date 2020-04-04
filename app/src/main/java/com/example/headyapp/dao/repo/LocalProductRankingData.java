package com.example.headyapp.dao.repo;

import com.example.headyapp.database.AppDatabase;
import com.example.headyapp.model.roomentities.ProductRanking;

import java.util.List;

import javax.inject.Inject;
/**
 * local data source.
 * @author Rakesh
 */
public class LocalProductRankingData implements DataSource<ProductRanking>
{

    AppDatabase appDatabase;

    @Inject
    public LocalProductRankingData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ProductRanking productRanking)
    {
        appDatabase.productRankingDataDao().insert(productRanking);
    }

    @Override
    public void addItems(List<ProductRanking> items)
    {

    }
}
