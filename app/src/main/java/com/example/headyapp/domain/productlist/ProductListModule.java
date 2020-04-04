package com.example.headyapp.domain.productlist;

import com.example.headyapp.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Product list module
 *
 * @author Rakesh
 */
@Module
public class ProductListModule
{

    private final Contracts.View productListView;

    public ProductListModule(Contracts.View productListView)
    {
        this.productListView = productListView;
    }

    @Provides
    @ProductListScope
    ProductListPresenter provideProductListPresenter( Repository repository)
    {
        return new ProductListPresenter(productListView, repository);
    }
}
