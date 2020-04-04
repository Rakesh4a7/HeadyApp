package com.example.headyapp.domain.cartdetails;

import android.os.Bundle;

import com.example.headyapp.BaseToolBarActivity;
import com.example.headyapp.R;
import com.example.headyapp.util.ActivityUtil;

/**
 * This activity shows the shopping bag.
 * This is in all separate module which may need to call from various places.
 *
 * @author Rakesh
 */
public class CartActivity extends BaseToolBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ActivityUtil.replaceFragment(this, null, CartFragment.newInstance(), false, R.id.content_frame);

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(R.string.shopping_cart);
    }

}
