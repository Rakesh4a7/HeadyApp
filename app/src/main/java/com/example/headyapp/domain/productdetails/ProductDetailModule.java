package com.example.headyapp.domain.productdetails;

import com.example.headyapp.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Product detail module
 *
 * @author Rakesh
 */
@Module
public class ProductDetailModule
{

    private final Contracts.View productListView;

    public ProductDetailModule(Contracts.View productListView)
    {
        this.productListView = productListView;
    }

    @Provides
    @ProductDetailScope
    ProductDetailPresenter provideProductDetailPresenter(Repository repository)
    {
        return new ProductDetailPresenter(productListView, repository);
    }
}
