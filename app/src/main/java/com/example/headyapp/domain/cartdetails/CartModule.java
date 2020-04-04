package com.example.headyapp.domain.cartdetails;

import com.example.headyapp.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;

/**
 * Cart Module.
 *
 * @author Rakesh
 */

@Module
public class CartModule
{

    private final Contracts.View cartView;

    public CartModule(Contracts.View cartView)
    {
        this.cartView = cartView;
    }

    @Provides
    @CartScope
    CartPresenter provideCartPresenter(Repository repository)
    {
        return new CartPresenter(cartView, repository);
    }
}
