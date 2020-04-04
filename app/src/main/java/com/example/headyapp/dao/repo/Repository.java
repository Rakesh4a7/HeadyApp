package com.example.headyapp.dao.repo;

/**
 * This is repository for accessing database. This repository provide single connection to database.
 *
 * @author Rakesh
 */
public interface Repository
{
    LocalCategoryData categoryData();

    LocalParentChildCategoryMappingData parentChildCategoryMappingData();

    LocalProductData productData();

    LocalProductRankingData productRankingData();

    LocalProductTaxData productTaxData();

    LocalTaxData taxData();

    LocalVariantData variantData();

    LocalCartData cardData();
}
