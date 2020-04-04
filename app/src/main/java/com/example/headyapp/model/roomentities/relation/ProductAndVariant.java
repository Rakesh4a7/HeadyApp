package com.example.headyapp.model.roomentities.relation;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import com.example.headyapp.model.roomentities.Product;
import com.example.headyapp.model.roomentities.Variant;

import java.util.List;

/**
 * Product and variant
 *
 * @author Rakesh
 */
public class ProductAndVariant
{
    @Embedded
    public Product product;

    @Relation(parentColumn = "id", entityColumn = "product_id")
    public List<Variant> variants;
}
