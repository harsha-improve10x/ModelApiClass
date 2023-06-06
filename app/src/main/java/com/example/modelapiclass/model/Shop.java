package com.example.modelapiclass.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Shop {

    @SerializedName("_id")
    public String serverId;

    public Integer id;

    @SerializedName("admin_graphql_api_id")
    public String adminGraphApiId;

    @SerializedName("app_id")
    public Integer appId;

    @SerializedName("browser_ip")
    public String browserIp;

    @SerializedName("buyer_accepts_marketing")
    public Boolean buyerAcceptsMarketing;

    @SerializedName("cancel_reason")
    public String cancelReason;

    @SerializedName("cancelled_at")
    public String cancelledAt;

    @SerializedName("cart_token")
    public String cartToken;

    @SerializedName("checkout_id")
    public Integer checkoutId;

    @SerializedName("checkout_token")
    public String checkoutToken;

    @SerializedName("client_details")
    public ClientDetails clientDetails;

    @SerializedName("closed_at")
    public String closedAt;

    public Boolean confirmed;

    @SerializedName("created_at")
    public String createdAt;

    public String currency;

    @SerializedName("current_subtotal_price")
    public String currentSubTotal;

    @SerializedName("current_subtotal_price_set")
    public Money priceSet;

    @SerializedName("current_total_discounts")
    public String currentTotalDiscounts;

    @SerializedName("current_total_discounts_set")
    public Money currentTotalDiscountSet;

    @SerializedName("current_total_duties_set")
    public String currentTotalDutiesSet;

    @SerializedName("current_total_price")
    public String currentTotalPrice;

    @SerializedName("current_total_price_set")
    public Money currentTotalPriceSet;

    @SerializedName("current_total_tax")
    public String currentTotalTax;

    @SerializedName("current_total_tax_set")
    public Money currentTotalTaxSet;
    @SerializedName("customer_locale")
    public String customerLocal;

    @SerializedName("device_id")
    public String deviceId;

    @SerializedName("discount_codes")
    public ArrayList<String> discountCodes;

    @SerializedName("estimated_taxes")
    public Boolean estimatedTaxes;

    @SerializedName("financial_status")
    public String financialStatus;

    @SerializedName("fulfillment_status")
    public String fulfillmentStatus;

    @SerializedName("gateway")
    public String gateway;

    @SerializedName("landing_site")
    public String landingSite;

    @SerializedName("landing_site_ref")
    public String landingSiteRef;

    @SerializedName("location_id")
    public String locationId;

    public String name;

    public String note;

    @SerializedName("note_attributes")
    public ArrayList<String> noteAttributes;

    public Integer number;

    @SerializedName("order_number")
    public Integer orderNumber;

    @SerializedName("order_status_url")
    public String orderStatusUrl;

    @SerializedName("original_total_duties_set")
    public String originalTotalDutiesSet;

    @SerializedName("payment_gateway_names")
    public ArrayList<String> paymentGateWayNames;

    @SerializedName("presentment_currency")
    public String presentmentCurrency;

    @SerializedName("processed_at")
    public String processedAt;

    @SerializedName("processing_method")
    public String processingMethod;

    public String reference;

    @SerializedName("referring_site")
    public String referringSite;

    @SerializedName("source_identifier")
    public String sourceIdentifier;

   @SerializedName("source_name")
    public String sourceName;

   @SerializedName("source_url")
   public String sourceUrl;

   @SerializedName("subtotal_price")
   public String subtotalPrice;

   @SerializedName("subtotal_price_set")
   public Money subTotalPriceSet;

   public String tags;

   @SerializedName("taxes_included")
   public Boolean taxesIncluded;

   public Boolean test;

   public String token;

   @SerializedName("total_discounts")
   public String totalDiscounts;

   @SerializedName("total_discounts_set")
   public Money totalDiscountSet;

   @SerializedName("total_line_items_price")
   public String totalLineItemsPrice;

   @SerializedName("total_line_items_price_set")
   public Money totalLineItemsPriceSet;

   @SerializedName("total_outstanding")
   public String totalOutstanding;

   @SerializedName("total_price")
   public String totalPrice;

   @SerializedName("total_price_set")
   public Money totalPriceSet;

   @SerializedName("total_price_usd")
   public String totalPriceUsd;

   @SerializedName("total_shipping_price_set")
   public Money totalShippingPriceSet;

   @SerializedName("total_tax")
   public String totalTax;

   @SerializedName("total_tax_set")
   public Money totalTaxSet;

   @SerializedName("total_tip_received")
   public String totalTipReceived;

   @SerializedName("total_weight")
   public String totalWeight;

   @SerializedName("updated_at")
   public String updatedAt;

   @SerializedName("user_id")
   public String userId;

   @SerializedName("discount_applications")
   public ArrayList<String> discountApplications;

   @SerializedName("fulfillments")
   public ArrayList<String> fulFillments;

   @SerializedName("line_items")
   public ArrayList<LineItems> lineItems;

   @SerializedName("payment_terms")
   public String paymentTerms;

   public ArrayList<String> refunds;

}
