package com.example.headyapp.domain.categorylist;

import com.example.headyapp.api.ApiService;
import com.example.headyapp.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Category module.
 *
 * @author Rakesh
 */
@Module
public class CategoryModule
{
    private final Contracts.View categoryView;

    public CategoryModule(Contracts.View categoryView)
    {
        this.categoryView = categoryView;
    }

    @Provides
    @CategoryScope
    CategoryListPresenter provideCategoryListPresenter(ApiService apiService, Repository repository)
    {
        return new CategoryListPresenter(categoryView, apiService,repository);
    }
}
