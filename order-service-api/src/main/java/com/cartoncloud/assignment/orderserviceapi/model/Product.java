
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
    "customer_code",
    "name",
    "description",
    "product_type_id",
    "product_unit_of_measure_id",
    "product_group_id",
    "warning_threshold_days",
    "expiry_threshold_days",
    "product_packaging_id",
    "require_weight",
    "active",
    "warehouse_ids",
    "product_unit_of_measure_category_id",
    "created",
    "modified",
    "custom_field_1",
    "custom_field_2",
    "custom_field_3",
    "low_stock_threshold",
    "low_stock_notification_enable",
    "low_stock_bitmask",
    "storage_charge_method_id",
    "per_item_storage_charge",
    "volume",
    "weight",
    "allow_zero_storage_charge",
    "custom_field_4",
    "custom_field_5",
    "custom_field_6",
    "custom_field_7",
    "custom_field_8",
    "custom_field_9",
    "custom_field_10",
    "pop_expiry_date_required",
    "pop_custom_field_disable_bitmask",
    "pop_custom_field_optional_bitmask",
    "pop_custom_field_require_bitmask",
    "pop_custom_field_require_on_outgoing_bitmask",
    "stock_selection_method_id",
    "pop_initial_status_id"
})
public class Product {

    @JsonProperty("id")
    private String id;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("customer_code")
    private String customerCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("product_type_id")
    private String productTypeId;
    @JsonProperty("product_unit_of_measure_id")
    private String productUnitOfMeasureId;
    @JsonProperty("product_group_id")
    private Object productGroupId;
    @JsonProperty("warning_threshold_days")
    private String warningThresholdDays;
    @JsonProperty("expiry_threshold_days")
    private String expiryThresholdDays;
    @JsonProperty("product_packaging_id")
    private String productPackagingId;
    @JsonProperty("require_weight")
    private String requireWeight;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("warehouse_ids")
    private String warehouseIds;
    @JsonProperty("product_unit_of_measure_category_id")
    private String productUnitOfMeasureCategoryId;
    @JsonProperty("created")
    private String created;
    @JsonProperty("modified")
    private String modified;
    @JsonProperty("custom_field_1")
    private Object customField1;
    @JsonProperty("custom_field_2")
    private Object customField2;
    @JsonProperty("custom_field_3")
    private Object customField3;
    @JsonProperty("low_stock_threshold")
    private Object lowStockThreshold;
    @JsonProperty("low_stock_notification_enable")
    private String lowStockNotificationEnable;
    @JsonProperty("low_stock_bitmask")
    private String lowStockBitmask;
    @JsonProperty("storage_charge_method_id")
    private String storageChargeMethodId;
    @JsonProperty("per_item_storage_charge")
    private String perItemStorageCharge;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("allow_zero_storage_charge")
    private String allowZeroStorageCharge;
    @JsonProperty("custom_field_4")
    private Object customField4;
    @JsonProperty("custom_field_5")
    private Object customField5;
    @JsonProperty("custom_field_6")
    private Object customField6;
    @JsonProperty("custom_field_7")
    private Object customField7;
    @JsonProperty("custom_field_8")
    private Object customField8;
    @JsonProperty("custom_field_9")
    private Object customField9;
    @JsonProperty("custom_field_10")
    private Object customField10;
    @JsonProperty("pop_expiry_date_required")
    private String popExpiryDateRequired;
    @JsonProperty("pop_custom_field_disable_bitmask")
    private String popCustomFieldDisableBitmask;
    @JsonProperty("pop_custom_field_optional_bitmask")
    private String popCustomFieldOptionalBitmask;
    @JsonProperty("pop_custom_field_require_bitmask")
    private String popCustomFieldRequireBitmask;
    @JsonProperty("pop_custom_field_require_on_outgoing_bitmask")
    private String popCustomFieldRequireOnOutgoingBitmask;
    @JsonProperty("stock_selection_method_id")
    private String stockSelectionMethodId;
    @JsonProperty("pop_initial_status_id")
    private String popInitialStatusId;
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

    @JsonProperty("customer_code")
    public String getCustomerCode() {
        return customerCode;
    }

    @JsonProperty("customer_code")
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("product_type_id")
    public String getProductTypeId() {
        return productTypeId;
    }

    @JsonProperty("product_type_id")
    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    @JsonProperty("product_unit_of_measure_id")
    public String getProductUnitOfMeasureId() {
        return productUnitOfMeasureId;
    }

    @JsonProperty("product_unit_of_measure_id")
    public void setProductUnitOfMeasureId(String productUnitOfMeasureId) {
        this.productUnitOfMeasureId = productUnitOfMeasureId;
    }

    @JsonProperty("product_group_id")
    public Object getProductGroupId() {
        return productGroupId;
    }

    @JsonProperty("product_group_id")
    public void setProductGroupId(Object productGroupId) {
        this.productGroupId = productGroupId;
    }

    @JsonProperty("warning_threshold_days")
    public String getWarningThresholdDays() {
        return warningThresholdDays;
    }

    @JsonProperty("warning_threshold_days")
    public void setWarningThresholdDays(String warningThresholdDays) {
        this.warningThresholdDays = warningThresholdDays;
    }

    @JsonProperty("expiry_threshold_days")
    public String getExpiryThresholdDays() {
        return expiryThresholdDays;
    }

    @JsonProperty("expiry_threshold_days")
    public void setExpiryThresholdDays(String expiryThresholdDays) {
        this.expiryThresholdDays = expiryThresholdDays;
    }

    @JsonProperty("product_packaging_id")
    public String getProductPackagingId() {
        return productPackagingId;
    }

    @JsonProperty("product_packaging_id")
    public void setProductPackagingId(String productPackagingId) {
        this.productPackagingId = productPackagingId;
    }

    @JsonProperty("require_weight")
    public String getRequireWeight() {
        return requireWeight;
    }

    @JsonProperty("require_weight")
    public void setRequireWeight(String requireWeight) {
        this.requireWeight = requireWeight;
    }

    @JsonProperty("active")
    public boolean isActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(boolean active) {
        this.active = active;
    }

    @JsonProperty("warehouse_ids")
    public String getWarehouseIds() {
        return warehouseIds;
    }

    @JsonProperty("warehouse_ids")
    public void setWarehouseIds(String warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    @JsonProperty("product_unit_of_measure_category_id")
    public String getProductUnitOfMeasureCategoryId() {
        return productUnitOfMeasureCategoryId;
    }

    @JsonProperty("product_unit_of_measure_category_id")
    public void setProductUnitOfMeasureCategoryId(String productUnitOfMeasureCategoryId) {
        this.productUnitOfMeasureCategoryId = productUnitOfMeasureCategoryId;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("modified")
    public String getModified() {
        return modified;
    }

    @JsonProperty("modified")
    public void setModified(String modified) {
        this.modified = modified;
    }

    @JsonProperty("custom_field_1")
    public Object getCustomField1() {
        return customField1;
    }

    @JsonProperty("custom_field_1")
    public void setCustomField1(Object customField1) {
        this.customField1 = customField1;
    }

    @JsonProperty("custom_field_2")
    public Object getCustomField2() {
        return customField2;
    }

    @JsonProperty("custom_field_2")
    public void setCustomField2(Object customField2) {
        this.customField2 = customField2;
    }

    @JsonProperty("custom_field_3")
    public Object getCustomField3() {
        return customField3;
    }

    @JsonProperty("custom_field_3")
    public void setCustomField3(Object customField3) {
        this.customField3 = customField3;
    }

    @JsonProperty("low_stock_threshold")
    public Object getLowStockThreshold() {
        return lowStockThreshold;
    }

    @JsonProperty("low_stock_threshold")
    public void setLowStockThreshold(Object lowStockThreshold) {
        this.lowStockThreshold = lowStockThreshold;
    }

    @JsonProperty("low_stock_notification_enable")
    public String getLowStockNotificationEnable() {
        return lowStockNotificationEnable;
    }

    @JsonProperty("low_stock_notification_enable")
    public void setLowStockNotificationEnable(String lowStockNotificationEnable) {
        this.lowStockNotificationEnable = lowStockNotificationEnable;
    }

    @JsonProperty("low_stock_bitmask")
    public String getLowStockBitmask() {
        return lowStockBitmask;
    }

    @JsonProperty("low_stock_bitmask")
    public void setLowStockBitmask(String lowStockBitmask) {
        this.lowStockBitmask = lowStockBitmask;
    }

    @JsonProperty("storage_charge_method_id")
    public String getStorageChargeMethodId() {
        return storageChargeMethodId;
    }

    @JsonProperty("storage_charge_method_id")
    public void setStorageChargeMethodId(String storageChargeMethodId) {
        this.storageChargeMethodId = storageChargeMethodId;
    }

    @JsonProperty("per_item_storage_charge")
    public String getPerItemStorageCharge() {
        return perItemStorageCharge;
    }

    @JsonProperty("per_item_storage_charge")
    public void setPerItemStorageCharge(String perItemStorageCharge) {
        this.perItemStorageCharge = perItemStorageCharge;
    }

    @JsonProperty("volume")
    public String getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(String volume) {
        this.volume = volume;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("allow_zero_storage_charge")
    public String getAllowZeroStorageCharge() {
        return allowZeroStorageCharge;
    }

    @JsonProperty("allow_zero_storage_charge")
    public void setAllowZeroStorageCharge(String allowZeroStorageCharge) {
        this.allowZeroStorageCharge = allowZeroStorageCharge;
    }

    @JsonProperty("custom_field_4")
    public Object getCustomField4() {
        return customField4;
    }

    @JsonProperty("custom_field_4")
    public void setCustomField4(Object customField4) {
        this.customField4 = customField4;
    }

    @JsonProperty("custom_field_5")
    public Object getCustomField5() {
        return customField5;
    }

    @JsonProperty("custom_field_5")
    public void setCustomField5(Object customField5) {
        this.customField5 = customField5;
    }

    @JsonProperty("custom_field_6")
    public Object getCustomField6() {
        return customField6;
    }

    @JsonProperty("custom_field_6")
    public void setCustomField6(Object customField6) {
        this.customField6 = customField6;
    }

    @JsonProperty("custom_field_7")
    public Object getCustomField7() {
        return customField7;
    }

    @JsonProperty("custom_field_7")
    public void setCustomField7(Object customField7) {
        this.customField7 = customField7;
    }

    @JsonProperty("custom_field_8")
    public Object getCustomField8() {
        return customField8;
    }

    @JsonProperty("custom_field_8")
    public void setCustomField8(Object customField8) {
        this.customField8 = customField8;
    }

    @JsonProperty("custom_field_9")
    public Object getCustomField9() {
        return customField9;
    }

    @JsonProperty("custom_field_9")
    public void setCustomField9(Object customField9) {
        this.customField9 = customField9;
    }

    @JsonProperty("custom_field_10")
    public Object getCustomField10() {
        return customField10;
    }

    @JsonProperty("custom_field_10")
    public void setCustomField10(Object customField10) {
        this.customField10 = customField10;
    }

    @JsonProperty("pop_expiry_date_required")
    public String getPopExpiryDateRequired() {
        return popExpiryDateRequired;
    }

    @JsonProperty("pop_expiry_date_required")
    public void setPopExpiryDateRequired(String popExpiryDateRequired) {
        this.popExpiryDateRequired = popExpiryDateRequired;
    }

    @JsonProperty("pop_custom_field_disable_bitmask")
    public String getPopCustomFieldDisableBitmask() {
        return popCustomFieldDisableBitmask;
    }

    @JsonProperty("pop_custom_field_disable_bitmask")
    public void setPopCustomFieldDisableBitmask(String popCustomFieldDisableBitmask) {
        this.popCustomFieldDisableBitmask = popCustomFieldDisableBitmask;
    }

    @JsonProperty("pop_custom_field_optional_bitmask")
    public String getPopCustomFieldOptionalBitmask() {
        return popCustomFieldOptionalBitmask;
    }

    @JsonProperty("pop_custom_field_optional_bitmask")
    public void setPopCustomFieldOptionalBitmask(String popCustomFieldOptionalBitmask) {
        this.popCustomFieldOptionalBitmask = popCustomFieldOptionalBitmask;
    }

    @JsonProperty("pop_custom_field_require_bitmask")
    public String getPopCustomFieldRequireBitmask() {
        return popCustomFieldRequireBitmask;
    }

    @JsonProperty("pop_custom_field_require_bitmask")
    public void setPopCustomFieldRequireBitmask(String popCustomFieldRequireBitmask) {
        this.popCustomFieldRequireBitmask = popCustomFieldRequireBitmask;
    }

    @JsonProperty("pop_custom_field_require_on_outgoing_bitmask")
    public String getPopCustomFieldRequireOnOutgoingBitmask() {
        return popCustomFieldRequireOnOutgoingBitmask;
    }

    @JsonProperty("pop_custom_field_require_on_outgoing_bitmask")
    public void setPopCustomFieldRequireOnOutgoingBitmask(String popCustomFieldRequireOnOutgoingBitmask) {
        this.popCustomFieldRequireOnOutgoingBitmask = popCustomFieldRequireOnOutgoingBitmask;
    }

    @JsonProperty("stock_selection_method_id")
    public String getStockSelectionMethodId() {
        return stockSelectionMethodId;
    }

    @JsonProperty("stock_selection_method_id")
    public void setStockSelectionMethodId(String stockSelectionMethodId) {
        this.stockSelectionMethodId = stockSelectionMethodId;
    }

    @JsonProperty("pop_initial_status_id")
    public String getPopInitialStatusId() {
        return popInitialStatusId;
    }

    @JsonProperty("pop_initial_status_id")
    public void setPopInitialStatusId(String popInitialStatusId) {
        this.popInitialStatusId = popInitialStatusId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", customerId=" + customerId + ", customerCode=" + customerCode + ", name=" + name
				+ ", description=" + description + ", productTypeId=" + productTypeId + ", productUnitOfMeasureId="
				+ productUnitOfMeasureId + ", productGroupId=" + productGroupId + ", warningThresholdDays="
				+ warningThresholdDays + ", expiryThresholdDays=" + expiryThresholdDays + ", productPackagingId="
				+ productPackagingId + ", requireWeight=" + requireWeight + ", active=" + active + ", warehouseIds="
				+ warehouseIds + ", productUnitOfMeasureCategoryId=" + productUnitOfMeasureCategoryId + ", created="
				+ created + ", modified=" + modified + ", customField1=" + customField1 + ", customField2="
				+ customField2 + ", customField3=" + customField3 + ", lowStockThreshold=" + lowStockThreshold
				+ ", lowStockNotificationEnable=" + lowStockNotificationEnable + ", lowStockBitmask=" + lowStockBitmask
				+ ", storageChargeMethodId=" + storageChargeMethodId + ", perItemStorageCharge=" + perItemStorageCharge
				+ ", volume=" + volume + ", weight=" + weight + ", allowZeroStorageCharge=" + allowZeroStorageCharge
				+ ", customField4=" + customField4 + ", customField5=" + customField5 + ", customField6=" + customField6
				+ ", customField7=" + customField7 + ", customField8=" + customField8 + ", customField9=" + customField9
				+ ", customField10=" + customField10 + ", popExpiryDateRequired=" + popExpiryDateRequired
				+ ", popCustomFieldDisableBitmask=" + popCustomFieldDisableBitmask + ", popCustomFieldOptionalBitmask="
				+ popCustomFieldOptionalBitmask + ", popCustomFieldRequireBitmask=" + popCustomFieldRequireBitmask
				+ ", popCustomFieldRequireOnOutgoingBitmask=" + popCustomFieldRequireOnOutgoingBitmask
				+ ", stockSelectionMethodId=" + stockSelectionMethodId + ", popInitialStatusId=" + popInitialStatusId
				+ ", additionalProperties=" + additionalProperties + "]";
	}

}
