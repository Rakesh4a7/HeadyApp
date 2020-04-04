package com.example.headyapp.domain.categorylist.adapter;

import com.example.headyapp.model.response.CategoryDTO;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Category group
 *
 * @author Rakesh
 */
public class CategoryGroup extends ExpandableGroup<CategoryDTO>
{
    private CategoryDTO parentCategory;

    public CategoryGroup(CategoryDTO categoryDTO, List<CategoryDTO> items)
    {
        super(categoryDTO.getName(), items);
        parentCategory = categoryDTO;
    }

    public CategoryDTO getParentCategory()
    {
        return parentCategory;
    }
}