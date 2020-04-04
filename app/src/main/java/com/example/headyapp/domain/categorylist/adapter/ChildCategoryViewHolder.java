package com.example.headyapp.domain.categorylist.adapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.headyapp.R;
import com.example.headyapp.domain.categorylist.Contracts;
import com.example.headyapp.model.response.CategoryDTO;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Child category view holder.
 *
 * @author Rakesh
 */
public class ChildCategoryViewHolder extends ChildViewHolder implements View.OnClickListener
{
    @BindView(R.id.tv_category_name)
    TextView artistName;
    @BindView(R.id.ll_base_child)
    LinearLayout llBaseChild;
    Contracts.View categoryView;

    public ChildCategoryViewHolder(View itemView, Contracts.View categoryView)
    {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.categoryView = categoryView;
        llBaseChild.setOnClickListener(this);

    }

    public void onBind(CategoryDTO categoryDTO)
    {
        artistName.setText(categoryDTO.getName());
        llBaseChild.setTag(categoryDTO);

    }

    @Override
    public void onClick(View v)
    {
        categoryView.onCategoryItemSelected((CategoryDTO) v.getTag());
    }
}