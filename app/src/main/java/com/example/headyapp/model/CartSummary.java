package com.example.headyapp.model;

/**
 * Cart summary entity
 *
 * @author Rakesh
 */
public class CartSummary
{
    int cartTotal;
    int estimatedTax;
    int totalPayable;

    public int getCartTotal()
    {
        return cartTotal;
    }

    public void setCartTotal(int cartTotal)
    {
        this.cartTotal = cartTotal;
    }

    public int getEstimatedTax()
    {
        return estimatedTax;
    }

    public void setEstimatedTax(int estimatedTax)
    {
        this.estimatedTax = estimatedTax;
    }

    public int getTotalPayable()
    {
        return totalPayable;
    }

    public void setTotalPayable(int totalPayable)
    {
        this.totalPayable = totalPayable;
    }
}
