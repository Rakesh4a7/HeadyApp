package com.example.headyapp.domain.categorylist;

import android.os.Bundle;
import android.view.Menu;

import com.example.headyapp.BaseToolBarActivity;
import com.example.headyapp.R;
import com.example.headyapp.util.ActivityUtil;

/**
 * This activity shows the categories
 * .
 * This is in all separate module which may need to call from various places.
 *
 * @author Rakesh
 */
public class CategoryListActivity extends BaseToolBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
        ActivityUtil.replaceFragment(this, null, CategoryListFragment.newInstance(), false, R.id.content_frame);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(R.string.app_name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
