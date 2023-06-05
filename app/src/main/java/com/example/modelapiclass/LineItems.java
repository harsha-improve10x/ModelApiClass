package com.example.modelapiclass;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LineItems {

    @SerializedName("id")
    public Integer id;

    @SerializedName("admin_graphql_api_id")
    public String adminGraphApiId;

    @SerializedName("fulfillable_quantity")
    public Integer fulfillableQuantity;

    @SerializedName("fulfillment_service")
    public String fulfillableService;

    @SerializedName("fulfillment_status")
    public String fulfillmentStatus;

    @SerializedName("gift_card")
    public Boolean giftCard;

    @SerializedName("grams")
    public Integer grams;

    @SerializedName("name")
    public String name;

    @SerializedName("origin_location")
    public OriginLocation originLocation;

    @SerializedName("pre_tax_price")
    public String preTaxPrice;

    @SerializedName("pre_tax_price_set")
    public Money preTaxPriceSet;

    public String price;

    @SerializedName("price_set")
    public Money priceSet;

    @SerializedName("product_exists")
    public Boolean productExists;

    @SerializedName("product_id")
    public Integer productId;

    public ArrayList<String> properties;

    public Integer quantity;

    @SerializedName("requires_shipping")
    public boolean requiresShipping;

    public String sku;

    @SerializedName("tax_code")
    public String taxCode;

    public Boolean taxable;

    public String title;

    @SerializedName("total_discount")
    public String totalDiscount;

    @SerializedName("total_discount_set")
    public Money totalDiscountSet;

    @SerializedName("variant_id")
    public Integer variationId;

    @SerializedName("variant_inventory_management")
    public String variantInventoryManagement;

    @SerializedName("variant_title")
    public String variantTitle;

    public String vendor;

    @SerializedName("tax_lines")
    public ArrayList<TaxLines> taxLines;

    public ArrayList<String> duties;

    @SerializedName("discount_allocations")
    public ArrayList<String> discountAllocations;
}
