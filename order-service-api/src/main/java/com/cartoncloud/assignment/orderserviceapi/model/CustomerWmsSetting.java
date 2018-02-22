
package com.cartoncloud.assignment.orderserviceapi.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "customer_id",
    "sale_order_import_out_of_stock_products",
    "sale_order_use_expired_stock",
    "sale_order_import_not_exist_products",
    "sale_order_import_invalid_products_unit_of_measure",
    "sale_order_import_products_carton_inconsistency",
    "sale_order_minimum_purchase_order_history_status_id",
    "purchase_order_import_not_exist_products",
    "purchase_order_import_invalid_products_unit_of_measure",
    "first_cut_off_time",
    "final_cut_off_time",
    "reject_after_cut_off",
    "purchase_order_detailed_differences",
    "kg_tolerance_percentage",
    "auto_generate_consignment",
    "auto_generate_consignment_status",
    "send_sale_order_without_customer_invoice",
    "pop_expiry_date_required",
    "pop_custom_field_1",
    "pop_custom_field_2",
    "pop_custom_field_3",
    "sale_order_optimization_retains_bitmask",
    "pop_custom_field_is_required_bitmask",
    "pop_custom_field_is_required_on_outgoing_bitmask",
    "pop_custom_field_is_unique_bitmask",
    "pop_custom_field_is_scannable_bitmask",
    "pop_custom_field_options",
    "product_custom_field_1",
    "product_custom_field_2",
    "product_custom_field_3",
    "enable_cut_off",
    "auto_dispatch_time",
    "allow_document_upload",
    "document_upload_default",
    "auto_dispatch",
    "deplete_purchase_order_product_at_sale_order_status_id",
    "sale_order_default_sender_address_id",
    "sale_order_default_after_pack_screen",
    "pop_custom_field_4",
    "pop_custom_field_5",
    "pop_custom_field_6",
    "pop_custom_field_7",
    "pop_custom_field_8",
    "pop_custom_field_9",
    "pop_custom_field_10",
    "allow_force_complete_on_wave_pick",
    "disable_quantity_confirmation_on_pick_sheet",
    "storage_charge_method_id",
    "product_custom_field_4",
    "product_custom_field_5",
    "product_custom_field_6",
    "product_custom_field_7",
    "product_custom_field_8",
    "product_custom_field_9",
    "product_custom_field_10",
    "restrict_from_customers",
    "customer_default_wave_pick_type_id",
    "barcode_regex_array"
})
public class CustomerWmsSetting {

    @JsonProperty("id")
    private String id;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("sale_order_import_out_of_stock_products")
    private String saleOrderImportOutOfStockProducts;
    @JsonProperty("sale_order_use_expired_stock")
    private String saleOrderUseExpiredStock;
    @JsonProperty("sale_order_import_not_exist_products")
    private String saleOrderImportNotExistProducts;
    @JsonProperty("sale_order_import_invalid_products_unit_of_measure")
    private String saleOrderImportInvalidProductsUnitOfMeasure;
    @JsonProperty("sale_order_import_products_carton_inconsistency")
    private String saleOrderImportProductsCartonInconsistency;
    @JsonProperty("sale_order_minimum_purchase_order_history_status_id")
    private String saleOrderMinimumPurchaseOrderHistoryStatusId;
    @JsonProperty("purchase_order_import_not_exist_products")
    private String purchaseOrderImportNotExistProducts;
    @JsonProperty("purchase_order_import_invalid_products_unit_of_measure")
    private String purchaseOrderImportInvalidProductsUnitOfMeasure;
    @JsonProperty("first_cut_off_time")
    private String firstCutOffTime;
    @JsonProperty("final_cut_off_time")
    private String finalCutOffTime;
    @JsonProperty("reject_after_cut_off")
    private String rejectAfterCutOff;
    @JsonProperty("purchase_order_detailed_differences")
    private boolean purchaseOrderDetailedDifferences;
    @JsonProperty("kg_tolerance_percentage")
    private String kgTolerancePercentage;
    @JsonProperty("auto_generate_consignment")
    private String autoGenerateConsignment;
    @JsonProperty("auto_generate_consignment_status")
    private String autoGenerateConsignmentStatus;
    @JsonProperty("send_sale_order_without_customer_invoice")
    private boolean sendSaleOrderWithoutCustomerInvoice;
    @JsonProperty("pop_expiry_date_required")
    private String popExpiryDateRequired;
    @JsonProperty("pop_custom_field_1")
    private Object popCustomField1;
    @JsonProperty("pop_custom_field_2")
    private Object popCustomField2;
    @JsonProperty("pop_custom_field_3")
    private Object popCustomField3;
    @JsonProperty("sale_order_optimization_retains_bitmask")
    private String saleOrderOptimizationRetainsBitmask;
    @JsonProperty("pop_custom_field_is_required_bitmask")
    private String popCustomFieldIsRequiredBitmask;
    @JsonProperty("pop_custom_field_is_required_on_outgoing_bitmask")
    private String popCustomFieldIsRequiredOnOutgoingBitmask;
    @JsonProperty("pop_custom_field_is_unique_bitmask")
    private String popCustomFieldIsUniqueBitmask;
    @JsonProperty("pop_custom_field_is_scannable_bitmask")
    private String popCustomFieldIsScannableBitmask;
    @JsonProperty("pop_custom_field_options")
    private String popCustomFieldOptions;
    @JsonProperty("product_custom_field_1")
    private Object productCustomField1;
    @JsonProperty("product_custom_field_2")
    private Object productCustomField2;
    @JsonProperty("product_custom_field_3")
    private Object productCustomField3;
    @JsonProperty("enable_cut_off")
    private String enableCutOff;
    @JsonProperty("auto_dispatch_time")
    private String autoDispatchTime;
    @JsonProperty("allow_document_upload")
    private String allowDocumentUpload;
    @JsonProperty("document_upload_default")
    private String documentUploadDefault;
    @JsonProperty("auto_dispatch")
    private String autoDispatch;
    @JsonProperty("deplete_purchase_order_product_at_sale_order_status_id")
    private String depletePurchaseOrderProductAtSaleOrderStatusId;
    @JsonProperty("sale_order_default_sender_address_id")
    private Object saleOrderDefaultSenderAddressId;
    @JsonProperty("sale_order_default_after_pack_screen")
    private String saleOrderDefaultAfterPackScreen;
    @JsonProperty("pop_custom_field_4")
    private String popCustomField4;
    @JsonProperty("pop_custom_field_5")
    private String popCustomField5;
    @JsonProperty("pop_custom_field_6")
    private String popCustomField6;
    @JsonProperty("pop_custom_field_7")
    private String popCustomField7;
    @JsonProperty("pop_custom_field_8")
    private String popCustomField8;
    @JsonProperty("pop_custom_field_9")
    private String popCustomField9;
    @JsonProperty("pop_custom_field_10")
    private String popCustomField10;
    @JsonProperty("allow_force_complete_on_wave_pick")
    private boolean allowForceCompleteOnWavePick;
    @JsonProperty("disable_quantity_confirmation_on_pick_sheet")
    private boolean disableQuantityConfirmationOnPickSheet;
    @JsonProperty("storage_charge_method_id")
    private String storageChargeMethodId;
    @JsonProperty("product_custom_field_4")
    private Object productCustomField4;
    @JsonProperty("product_custom_field_5")
    private Object productCustomField5;
    @JsonProperty("product_custom_field_6")
    private Object productCustomField6;
    @JsonProperty("product_custom_field_7")
    private Object productCustomField7;
    @JsonProperty("product_custom_field_8")
    private Object productCustomField8;
    @JsonProperty("product_custom_field_9")
    private Object productCustomField9;
    @JsonProperty("product_custom_field_10")
    private Object productCustomField10;
    @JsonProperty("restrict_from_customers")
    private boolean restrictFromCustomers;
    @JsonProperty("customer_default_wave_pick_type_id")
    private Object customerDefaultWavePickTypeId;
    @JsonProperty("barcode_regex_array")
    private Object barcodeRegexArray;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("sale_order_import_out_of_stock_products")
    public String getSaleOrderImportOutOfStockProducts() {
        return saleOrderImportOutOfStockProducts;
    }

    @JsonProperty("sale_order_import_out_of_stock_products")
    public void setSaleOrderImportOutOfStockProducts(String saleOrderImportOutOfStockProducts) {
        this.saleOrderImportOutOfStockProducts = saleOrderImportOutOfStockProducts;
    }

    @JsonProperty("sale_order_use_expired_stock")
    public String getSaleOrderUseExpiredStock() {
        return saleOrderUseExpiredStock;
    }

    @JsonProperty("sale_order_use_expired_stock")
    public void setSaleOrderUseExpiredStock(String saleOrderUseExpiredStock) {
        this.saleOrderUseExpiredStock = saleOrderUseExpiredStock;
    }

    @JsonProperty("sale_order_import_not_exist_products")
    public String getSaleOrderImportNotExistProducts() {
        return saleOrderImportNotExistProducts;
    }

    @JsonProperty("sale_order_import_not_exist_products")
    public void setSaleOrderImportNotExistProducts(String saleOrderImportNotExistProducts) {
        this.saleOrderImportNotExistProducts = saleOrderImportNotExistProducts;
    }

    @JsonProperty("sale_order_import_invalid_products_unit_of_measure")
    public String getSaleOrderImportInvalidProductsUnitOfMeasure() {
        return saleOrderImportInvalidProductsUnitOfMeasure;
    }

    @JsonProperty("sale_order_import_invalid_products_unit_of_measure")
    public void setSaleOrderImportInvalidProductsUnitOfMeasure(String saleOrderImportInvalidProductsUnitOfMeasure) {
        this.saleOrderImportInvalidProductsUnitOfMeasure = saleOrderImportInvalidProductsUnitOfMeasure;
    }

    @JsonProperty("sale_order_import_products_carton_inconsistency")
    public String getSaleOrderImportProductsCartonInconsistency() {
        return saleOrderImportProductsCartonInconsistency;
    }

    @JsonProperty("sale_order_import_products_carton_inconsistency")
    public void setSaleOrderImportProductsCartonInconsistency(String saleOrderImportProductsCartonInconsistency) {
        this.saleOrderImportProductsCartonInconsistency = saleOrderImportProductsCartonInconsistency;
    }

    @JsonProperty("sale_order_minimum_purchase_order_history_status_id")
    public String getSaleOrderMinimumPurchaseOrderHistoryStatusId() {
        return saleOrderMinimumPurchaseOrderHistoryStatusId;
    }

    @JsonProperty("sale_order_minimum_purchase_order_history_status_id")
    public void setSaleOrderMinimumPurchaseOrderHistoryStatusId(String saleOrderMinimumPurchaseOrderHistoryStatusId) {
        this.saleOrderMinimumPurchaseOrderHistoryStatusId = saleOrderMinimumPurchaseOrderHistoryStatusId;
    }

    @JsonProperty("purchase_order_import_not_exist_products")
    public String getPurchaseOrderImportNotExistProducts() {
        return purchaseOrderImportNotExistProducts;
    }

    @JsonProperty("purchase_order_import_not_exist_products")
    public void setPurchaseOrderImportNotExistProducts(String purchaseOrderImportNotExistProducts) {
        this.purchaseOrderImportNotExistProducts = purchaseOrderImportNotExistProducts;
    }

    @JsonProperty("purchase_order_import_invalid_products_unit_of_measure")
    public String getPurchaseOrderImportInvalidProductsUnitOfMeasure() {
        return purchaseOrderImportInvalidProductsUnitOfMeasure;
    }

    @JsonProperty("purchase_order_import_invalid_products_unit_of_measure")
    public void setPurchaseOrderImportInvalidProductsUnitOfMeasure(String purchaseOrderImportInvalidProductsUnitOfMeasure) {
        this.purchaseOrderImportInvalidProductsUnitOfMeasure = purchaseOrderImportInvalidProductsUnitOfMeasure;
    }

    @JsonProperty("first_cut_off_time")
    public String getFirstCutOffTime() {
        return firstCutOffTime;
    }

    @JsonProperty("first_cut_off_time")
    public void setFirstCutOffTime(String firstCutOffTime) {
        this.firstCutOffTime = firstCutOffTime;
    }

    @JsonProperty("final_cut_off_time")
    public String getFinalCutOffTime() {
        return finalCutOffTime;
    }

    @JsonProperty("final_cut_off_time")
    public void setFinalCutOffTime(String finalCutOffTime) {
        this.finalCutOffTime = finalCutOffTime;
    }

    @JsonProperty("reject_after_cut_off")
    public String getRejectAfterCutOff() {
        return rejectAfterCutOff;
    }

    @JsonProperty("reject_after_cut_off")
    public void setRejectAfterCutOff(String rejectAfterCutOff) {
        this.rejectAfterCutOff = rejectAfterCutOff;
    }

    @JsonProperty("purchase_order_detailed_differences")
    public boolean isPurchaseOrderDetailedDifferences() {
        return purchaseOrderDetailedDifferences;
    }

    @JsonProperty("purchase_order_detailed_differences")
    public void setPurchaseOrderDetailedDifferences(boolean purchaseOrderDetailedDifferences) {
        this.purchaseOrderDetailedDifferences = purchaseOrderDetailedDifferences;
    }

    @JsonProperty("kg_tolerance_percentage")
    public String getKgTolerancePercentage() {
        return kgTolerancePercentage;
    }

    @JsonProperty("kg_tolerance_percentage")
    public void setKgTolerancePercentage(String kgTolerancePercentage) {
        this.kgTolerancePercentage = kgTolerancePercentage;
    }

    @JsonProperty("auto_generate_consignment")
    public String getAutoGenerateConsignment() {
        return autoGenerateConsignment;
    }

    @JsonProperty("auto_generate_consignment")
    public void setAutoGenerateConsignment(String autoGenerateConsignment) {
        this.autoGenerateConsignment = autoGenerateConsignment;
    }

    @JsonProperty("auto_generate_consignment_status")
    public String getAutoGenerateConsignmentStatus() {
        return autoGenerateConsignmentStatus;
    }

    @JsonProperty("auto_generate_consignment_status")
    public void setAutoGenerateConsignmentStatus(String autoGenerateConsignmentStatus) {
        this.autoGenerateConsignmentStatus = autoGenerateConsignmentStatus;
    }

    @JsonProperty("send_sale_order_without_customer_invoice")
    public boolean isSendSaleOrderWithoutCustomerInvoice() {
        return sendSaleOrderWithoutCustomerInvoice;
    }

    @JsonProperty("send_sale_order_without_customer_invoice")
    public void setSendSaleOrderWithoutCustomerInvoice(boolean sendSaleOrderWithoutCustomerInvoice) {
        this.sendSaleOrderWithoutCustomerInvoice = sendSaleOrderWithoutCustomerInvoice;
    }

    @JsonProperty("pop_expiry_date_required")
    public String getPopExpiryDateRequired() {
        return popExpiryDateRequired;
    }

    @JsonProperty("pop_expiry_date_required")
    public void setPopExpiryDateRequired(String popExpiryDateRequired) {
        this.popExpiryDateRequired = popExpiryDateRequired;
    }

    @JsonProperty("pop_custom_field_1")
    public Object getPopCustomField1() {
        return popCustomField1;
    }

    @JsonProperty("pop_custom_field_1")
    public void setPopCustomField1(Object popCustomField1) {
        this.popCustomField1 = popCustomField1;
    }

    @JsonProperty("pop_custom_field_2")
    public Object getPopCustomField2() {
        return popCustomField2;
    }

    @JsonProperty("pop_custom_field_2")
    public void setPopCustomField2(Object popCustomField2) {
        this.popCustomField2 = popCustomField2;
    }

    @JsonProperty("pop_custom_field_3")
    public Object getPopCustomField3() {
        return popCustomField3;
    }

    @JsonProperty("pop_custom_field_3")
    public void setPopCustomField3(Object popCustomField3) {
        this.popCustomField3 = popCustomField3;
    }

    @JsonProperty("sale_order_optimization_retains_bitmask")
    public String getSaleOrderOptimizationRetainsBitmask() {
        return saleOrderOptimizationRetainsBitmask;
    }

    @JsonProperty("sale_order_optimization_retains_bitmask")
    public void setSaleOrderOptimizationRetainsBitmask(String saleOrderOptimizationRetainsBitmask) {
        this.saleOrderOptimizationRetainsBitmask = saleOrderOptimizationRetainsBitmask;
    }

    @JsonProperty("pop_custom_field_is_required_bitmask")
    public String getPopCustomFieldIsRequiredBitmask() {
        return popCustomFieldIsRequiredBitmask;
    }

    @JsonProperty("pop_custom_field_is_required_bitmask")
    public void setPopCustomFieldIsRequiredBitmask(String popCustomFieldIsRequiredBitmask) {
        this.popCustomFieldIsRequiredBitmask = popCustomFieldIsRequiredBitmask;
    }

    @JsonProperty("pop_custom_field_is_required_on_outgoing_bitmask")
    public String getPopCustomFieldIsRequiredOnOutgoingBitmask() {
        return popCustomFieldIsRequiredOnOutgoingBitmask;
    }

    @JsonProperty("pop_custom_field_is_required_on_outgoing_bitmask")
    public void setPopCustomFieldIsRequiredOnOutgoingBitmask(String popCustomFieldIsRequiredOnOutgoingBitmask) {
        this.popCustomFieldIsRequiredOnOutgoingBitmask = popCustomFieldIsRequiredOnOutgoingBitmask;
    }

    @JsonProperty("pop_custom_field_is_unique_bitmask")
    public String getPopCustomFieldIsUniqueBitmask() {
        return popCustomFieldIsUniqueBitmask;
    }

    @JsonProperty("pop_custom_field_is_unique_bitmask")
    public void setPopCustomFieldIsUniqueBitmask(String popCustomFieldIsUniqueBitmask) {
        this.popCustomFieldIsUniqueBitmask = popCustomFieldIsUniqueBitmask;
    }

    @JsonProperty("pop_custom_field_is_scannable_bitmask")
    public String getPopCustomFieldIsScannableBitmask() {
        return popCustomFieldIsScannableBitmask;
    }

    @JsonProperty("pop_custom_field_is_scannable_bitmask")
    public void setPopCustomFieldIsScannableBitmask(String popCustomFieldIsScannableBitmask) {
        this.popCustomFieldIsScannableBitmask = popCustomFieldIsScannableBitmask;
    }

    @JsonProperty("pop_custom_field_options")
    public String getPopCustomFieldOptions() {
        return popCustomFieldOptions;
    }

    @JsonProperty("pop_custom_field_options")
    public void setPopCustomFieldOptions(String popCustomFieldOptions) {
        this.popCustomFieldOptions = popCustomFieldOptions;
    }

    @JsonProperty("product_custom_field_1")
    public Object getProductCustomField1() {
        return productCustomField1;
    }

    @JsonProperty("product_custom_field_1")
    public void setProductCustomField1(Object productCustomField1) {
        this.productCustomField1 = productCustomField1;
    }

    @JsonProperty("product_custom_field_2")
    public Object getProductCustomField2() {
        return productCustomField2;
    }

    @JsonProperty("product_custom_field_2")
    public void setProductCustomField2(Object productCustomField2) {
        this.productCustomField2 = productCustomField2;
    }

    @JsonProperty("product_custom_field_3")
    public Object getProductCustomField3() {
        return productCustomField3;
    }

    @JsonProperty("product_custom_field_3")
    public void setProductCustomField3(Object productCustomField3) {
        this.productCustomField3 = productCustomField3;
    }

    @JsonProperty("enable_cut_off")
    public String getEnableCutOff() {
        return enableCutOff;
    }

    @JsonProperty("enable_cut_off")
    public void setEnableCutOff(String enableCutOff) {
        this.enableCutOff = enableCutOff;
    }

    @JsonProperty("auto_dispatch_time")
    public String getAutoDispatchTime() {
        return autoDispatchTime;
    }

    @JsonProperty("auto_dispatch_time")
    public void setAutoDispatchTime(String autoDispatchTime) {
        this.autoDispatchTime = autoDispatchTime;
    }

    @JsonProperty("allow_document_upload")
    public String getAllowDocumentUpload() {
        return allowDocumentUpload;
    }

    @JsonProperty("allow_document_upload")
    public void setAllowDocumentUpload(String allowDocumentUpload) {
        this.allowDocumentUpload = allowDocumentUpload;
    }

    @JsonProperty("document_upload_default")
    public String getDocumentUploadDefault() {
        return documentUploadDefault;
    }

    @JsonProperty("document_upload_default")
    public void setDocumentUploadDefault(String documentUploadDefault) {
        this.documentUploadDefault = documentUploadDefault;
    }

    @JsonProperty("auto_dispatch")
    public String getAutoDispatch() {
        return autoDispatch;
    }

    @JsonProperty("auto_dispatch")
    public void setAutoDispatch(String autoDispatch) {
        this.autoDispatch = autoDispatch;
    }

    @JsonProperty("deplete_purchase_order_product_at_sale_order_status_id")
    public String getDepletePurchaseOrderProductAtSaleOrderStatusId() {
        return depletePurchaseOrderProductAtSaleOrderStatusId;
    }

    @JsonProperty("deplete_purchase_order_product_at_sale_order_status_id")
    public void setDepletePurchaseOrderProductAtSaleOrderStatusId(String depletePurchaseOrderProductAtSaleOrderStatusId) {
        this.depletePurchaseOrderProductAtSaleOrderStatusId = depletePurchaseOrderProductAtSaleOrderStatusId;
    }

    @JsonProperty("sale_order_default_sender_address_id")
    public Object getSaleOrderDefaultSenderAddressId() {
        return saleOrderDefaultSenderAddressId;
    }

    @JsonProperty("sale_order_default_sender_address_id")
    public void setSaleOrderDefaultSenderAddressId(Object saleOrderDefaultSenderAddressId) {
        this.saleOrderDefaultSenderAddressId = saleOrderDefaultSenderAddressId;
    }

    @JsonProperty("sale_order_default_after_pack_screen")
    public String getSaleOrderDefaultAfterPackScreen() {
        return saleOrderDefaultAfterPackScreen;
    }

    @JsonProperty("sale_order_default_after_pack_screen")
    public void setSaleOrderDefaultAfterPackScreen(String saleOrderDefaultAfterPackScreen) {
        this.saleOrderDefaultAfterPackScreen = saleOrderDefaultAfterPackScreen;
    }

    @JsonProperty("pop_custom_field_4")
    public String getPopCustomField4() {
        return popCustomField4;
    }

    @JsonProperty("pop_custom_field_4")
    public void setPopCustomField4(String popCustomField4) {
        this.popCustomField4 = popCustomField4;
    }

    @JsonProperty("pop_custom_field_5")
    public String getPopCustomField5() {
        return popCustomField5;
    }

    @JsonProperty("pop_custom_field_5")
    public void setPopCustomField5(String popCustomField5) {
        this.popCustomField5 = popCustomField5;
    }

    @JsonProperty("pop_custom_field_6")
    public String getPopCustomField6() {
        return popCustomField6;
    }

    @JsonProperty("pop_custom_field_6")
    public void setPopCustomField6(String popCustomField6) {
        this.popCustomField6 = popCustomField6;
    }

    @JsonProperty("pop_custom_field_7")
    public String getPopCustomField7() {
        return popCustomField7;
    }

    @JsonProperty("pop_custom_field_7")
    public void setPopCustomField7(String popCustomField7) {
        this.popCustomField7 = popCustomField7;
    }

    @JsonProperty("pop_custom_field_8")
    public String getPopCustomField8() {
        return popCustomField8;
    }

    @JsonProperty("pop_custom_field_8")
    public void setPopCustomField8(String popCustomField8) {
        this.popCustomField8 = popCustomField8;
    }

    @JsonProperty("pop_custom_field_9")
    public String getPopCustomField9() {
        return popCustomField9;
    }

    @JsonProperty("pop_custom_field_9")
    public void setPopCustomField9(String popCustomField9) {
        this.popCustomField9 = popCustomField9;
    }

    @JsonProperty("pop_custom_field_10")
    public String getPopCustomField10() {
        return popCustomField10;
    }

    @JsonProperty("pop_custom_field_10")
    public void setPopCustomField10(String popCustomField10) {
        this.popCustomField10 = popCustomField10;
    }

    @JsonProperty("allow_force_complete_on_wave_pick")
    public boolean isAllowForceCompleteOnWavePick() {
        return allowForceCompleteOnWavePick;
    }

    @JsonProperty("allow_force_complete_on_wave_pick")
    public void setAllowForceCompleteOnWavePick(boolean allowForceCompleteOnWavePick) {
        this.allowForceCompleteOnWavePick = allowForceCompleteOnWavePick;
    }

    @JsonProperty("disable_quantity_confirmation_on_pick_sheet")
    public boolean isDisableQuantityConfirmationOnPickSheet() {
        return disableQuantityConfirmationOnPickSheet;
    }

    @JsonProperty("disable_quantity_confirmation_on_pick_sheet")
    public void setDisableQuantityConfirmationOnPickSheet(boolean disableQuantityConfirmationOnPickSheet) {
        this.disableQuantityConfirmationOnPickSheet = disableQuantityConfirmationOnPickSheet;
    }

    @JsonProperty("storage_charge_method_id")
    public String getStorageChargeMethodId() {
        return storageChargeMethodId;
    }

    @JsonProperty("storage_charge_method_id")
    public void setStorageChargeMethodId(String storageChargeMethodId) {
        this.storageChargeMethodId = storageChargeMethodId;
    }

    @JsonProperty("product_custom_field_4")
    public Object getProductCustomField4() {
        return productCustomField4;
    }

    @JsonProperty("product_custom_field_4")
    public void setProductCustomField4(Object productCustomField4) {
        this.productCustomField4 = productCustomField4;
    }

    @JsonProperty("product_custom_field_5")
    public Object getProductCustomField5() {
        return productCustomField5;
    }

    @JsonProperty("product_custom_field_5")
    public void setProductCustomField5(Object productCustomField5) {
        this.productCustomField5 = productCustomField5;
    }

    @JsonProperty("product_custom_field_6")
    public Object getProductCustomField6() {
        return productCustomField6;
    }

    @JsonProperty("product_custom_field_6")
    public void setProductCustomField6(Object productCustomField6) {
        this.productCustomField6 = productCustomField6;
    }

    @JsonProperty("product_custom_field_7")
    public Object getProductCustomField7() {
        return productCustomField7;
    }

    @JsonProperty("product_custom_field_7")
    public void setProductCustomField7(Object productCustomField7) {
        this.productCustomField7 = productCustomField7;
    }

    @JsonProperty("product_custom_field_8")
    public Object getProductCustomField8() {
        return productCustomField8;
    }

    @JsonProperty("product_custom_field_8")
    public void setProductCustomField8(Object productCustomField8) {
        this.productCustomField8 = productCustomField8;
    }

    @JsonProperty("product_custom_field_9")
    public Object getProductCustomField9() {
        return productCustomField9;
    }

    @JsonProperty("product_custom_field_9")
    public void setProductCustomField9(Object productCustomField9) {
        this.productCustomField9 = productCustomField9;
    }

    @JsonProperty("product_custom_field_10")
    public Object getProductCustomField10() {
        return productCustomField10;
    }

    @JsonProperty("product_custom_field_10")
    public void setProductCustomField10(Object productCustomField10) {
        this.productCustomField10 = productCustomField10;
    }

    @JsonProperty("restrict_from_customers")
    public boolean isRestrictFromCustomers() {
        return restrictFromCustomers;
    }

    @JsonProperty("restrict_from_customers")
    public void setRestrictFromCustomers(boolean restrictFromCustomers) {
        this.restrictFromCustomers = restrictFromCustomers;
    }

    @JsonProperty("customer_default_wave_pick_type_id")
    public Object getCustomerDefaultWavePickTypeId() {
        return customerDefaultWavePickTypeId;
    }

    @JsonProperty("customer_default_wave_pick_type_id")
    public void setCustomerDefaultWavePickTypeId(Object customerDefaultWavePickTypeId) {
        this.customerDefaultWavePickTypeId = customerDefaultWavePickTypeId;
    }

    @JsonProperty("barcode_regex_array")
    public Object getBarcodeRegexArray() {
        return barcodeRegexArray;
    }

    @JsonProperty("barcode_regex_array")
    public void setBarcodeRegexArray(Object barcodeRegexArray) {
        this.barcodeRegexArray = barcodeRegexArray;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
