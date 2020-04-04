package com.example.headyapp.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.headyapp.dao.CartDao;
import com.example.headyapp.dao.CategoryDao;
import com.example.headyapp.dao.ParentChildCategoryMappingDao;
import com.example.headyapp.dao.ProductDao;
import com.example.headyapp.dao.ProductRankingDao;
import com.example.headyapp.dao.ProductTaxDao;
import com.example.headyapp.dao.TaxDao;
import com.example.headyapp.dao.VariantDao;
import com.example.headyapp.model.roomentities.Cart;
import com.example.headyapp.model.roomentities.Category;
import com.example.headyapp.model.roomentities.ParentChildCategoryMapping;
import com.example.headyapp.model.roomentities.Product;
import com.example.headyapp.model.roomentities.ProductRanking;
import com.example.headyapp.model.roomentities.ProductTax;
import com.example.headyapp.model.roomentities.Tax;
import com.example.headyapp.model.roomentities.Variant;

/**
 * Room database for storing api response data.
 *
 * @author Rakesh
 */
@Database(entities = {Category.class, Product.class, Tax.class, Variant.class, ProductTax.class,
        ProductRanking.class, ParentChildCategoryMapping.class, Cart.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract CategoryDao categoryDataDao();

    public abstract ProductDao productDataDao();

    public abstract TaxDao taxDataDao();

    public abstract VariantDao variantDataDao();

    public abstract ProductTaxDao productTaxDataDao();

    public abstract ProductRankingDao productRankingDataDao();

    public abstract ParentChildCategoryMappingDao parentChildCategoryMappingDataDao();

    public abstract CartDao cartDao();
}
