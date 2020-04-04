package com.example.headyapp;

import com.example.headyapp.api.ApiModule;
import com.example.headyapp.domain.cartdetails.CartComponent;
import com.example.headyapp.domain.cartdetails.CartModule;
import com.example.headyapp.domain.categorylist.CategoryComponent;
import com.example.headyapp.domain.categorylist.CategoryModule;
import com.example.headyapp.domain.productdetails.ProductDetailComponent;
import com.example.headyapp.domain.productdetails.ProductDetailModule;
import com.example.headyapp.domain.productlist.ProductListComponent;
import com.example.headyapp.domain.productlist.ProductListModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * App component
 *
 * @author Rakesh
 */
@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent
{
    void inject(BaseApplication baseApplication);

    CategoryComponent newCategoryComponent(CategoryModule categoryModule);

    ProductListComponent newProductListComponent(ProductListModule categoryModule);

    ProductDetailComponent newProductDetailComponent(ProductDetailModule categoryModule);

    CartComponent newCartComponent(CartModule cartModule);
}