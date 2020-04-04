package com.example.headyapp.domain.cartdetails;

import com.example.headyapp.model.CartSummary;
import com.example.headyapp.model.roomentities.relation.CartDetail;

import java.util.List;

/**
 * Contract for view and presenter
 *
 * @author Rakesh
 */
interface Contracts
{

    interface View
    {
        void initView();

        void populateData(List<CartDetail> categoryDTOList, CartSummary cartSummary);

        void onError(Throwable throwable);

        void showLoading();

        void hideLoading();

        void removeFromCart(CartDetail cartDetail);

        void productRemoved();
    }

    interface Presenter
    {
        void init();

        void fetchCartProductDetails();

        void showLoading();

        void hideLoading();

        void onDetach();
    }
}
