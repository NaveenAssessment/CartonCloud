
package com.cartoncloud.assignment.orderserviceapi.model;

import java.util.HashMap;
import java.util.List;
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
    "purchase_order_id",
    "customer_id",
    "product_id",
    "unit_quantity_confirmed",
    "unit_quantity_initial",
    "unit_quantity_onhand",
    "unit_quantity_free",
    "expiry_date",
    "product_unit_of_measure_id",
    "product_status_id",
    "parent_id",
    "date_created",
    "last_modified",
    "version",
    "arrival_date",
    "date_allocated",
    "original_date_allocated",
    "date_depleted",
    "product_type_id",
    "warehouse_id",
    "send_warn_email",
    "product_packaging_id",
    "warehouse_location_id",
    "charge_new_storage",
    "warehouse_location_capacity_id",
    "warehouse_location_pick_efficiency_id",
    "purchase_order_history_status_id",
    "pallet_id",
    "custom_field_1",
    "custom_field_2",
    "custom_field_3",
    "confirmed",
    "adjustment",
    "labels_printed",
    "custom_field_4",
    "custom_field_5",
    "custom_field_6",
    "custom_field_7",
    "custom_field_8",
    "custom_field_9",
    "custom_field_10",
    "pallet_rental_applies",
    "Product",
    "ProductPackaging",
    "WarehouseLocation",
    "unit_quantity_packed",
    "product_storage_charge_method",
    "scale_msg",
    "pallet_qty",
    "pallet_qty_name",
    "undercharging_storage",
    "location_already_used",
    "custom_fields",
    "additional_info"
})
public class PurchaseOrderProduct {

    @JsonProperty("id")
    private String id;
    @JsonProperty("purchase_order_id")
    private String purchaseOrderId;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("unit_quantity_confirmed")
    private Object unitQuantityConfirmed;
    @JsonProperty("unit_quantity_initial")
    private String unitQuantityInitial;
    @JsonProperty("unit_quantity_onhand")
    private String unitQuantityOnhand;
    @JsonProperty("unit_quantity_free")
    private String unitQuantityFree;
    @JsonProperty("expiry_date")
    private String expiryDate;
    @JsonProperty("product_unit_of_measure_id")
    private String productUnitOfMeasureId;
    @JsonProperty("product_status_id")
    private String productStatusId;
    @JsonProperty("parent_id")
    private Object parentId;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("version")
    private String version;
    @JsonProperty("arrival_date")
    private String arrivalDate;
    @JsonProperty("date_allocated")
    private Object dateAllocated;
    @JsonProperty("original_date_allocated")
    private Object originalDateAllocated;
    @JsonProperty("date_depleted")
    private Object dateDepleted;
    @JsonProperty("product_type_id")
    private String productTypeId;
    @JsonProperty("warehouse_id")
    private String warehouseId;
    @JsonProperty("send_warn_email")
    private String sendWarnEmail;
    @JsonProperty("product_packaging_id")
    private String productPackagingId;
    @JsonProperty("warehouse_location_id")
    private Object warehouseLocationId;
    @JsonProperty("charge_new_storage")
    private String chargeNewStorage;
    @JsonProperty("warehouse_location_capacity_id")
    private Object warehouseLocationCapacityId;
    @JsonProperty("warehouse_location_pick_efficiency_id")
    private Object warehouseLocationPickEfficiencyId;
    @JsonProperty("purchase_order_history_status_id")
    private String purchaseOrderHistoryStatusId;
    @JsonProperty("pallet_id")
    private String palletId;
    @JsonProperty("custom_field_1")
    private String customField1;
    @JsonProperty("custom_field_2")
    private String customField2;
    @JsonProperty("custom_field_3")
    private String customField3;
    @JsonProperty("confirmed")
    private boolean confirmed;
    @JsonProperty("adjustment")
    private String adjustment;
    @JsonProperty("labels_printed")
    private String labelsPrinted;
    @JsonProperty("custom_field_4")
    private String customField4;
    @JsonProperty("custom_field_5")
    private String customField5;
    @JsonProperty("custom_field_6")
    private String customField6;
    @JsonProperty("custom_field_7")
    private String customField7;
    @JsonProperty("custom_field_8")
    private String customField8;
    @JsonProperty("custom_field_9")
    private String customField9;
    @JsonProperty("custom_field_10")
    private String customField10;
    @JsonProperty("pallet_rental_applies")
    private boolean palletRentalApplies;
    @JsonProperty("Product")
    private Product product;
    @JsonProperty("ProductPackaging")
    private ProductPackaging productPackaging;
    @JsonProperty("WarehouseLocation")
    private Object warehouseLocation;
    @JsonProperty("unit_quantity_packed")
    private String unitQuantityPacked;
    @JsonProperty("product_storage_charge_method")
    private String productStorageChargeMethod;
    @JsonProperty("scale_msg")
    private String scaleMsg;
    @JsonProperty("pallet_qty")
    private int palletQty;
    @JsonProperty("pallet_qty_name")
    private String palletQtyName;
    @JsonProperty("undercharging_storage")
    private boolean underchargingStorage;
    @JsonProperty("location_already_used")
    private boolean locationAlreadyUsed;
    @JsonProperty("custom_fields")
    private List<Object> customFields = null;
    @JsonProperty("additional_info")
    private String additionalInfo;
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

    @JsonProperty("purchase_order_id")
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    @JsonProperty("purchase_order_id")
    public void setPurchaseOrderId(String purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    @JsonProperty("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @JsonProperty("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("unit_quantity_confirmed")
    public Object getUnitQuantityConfirmed() {
        return unitQuantityConfirmed;
    }

    @JsonProperty("unit_quantity_confirmed")
    public void setUnitQuantityConfirmed(Object unitQuantityConfirmed) {
        this.unitQuantityConfirmed = unitQuantityConfirmed;
    }

    @JsonProperty("unit_quantity_initial")
    public String getUnitQuantityInitial() {
        return unitQuantityInitial;
    }

    @JsonProperty("unit_quantity_initial")
    public void setUnitQuantityInitial(String unitQuantityInitial) {
        this.unitQuantityInitial = unitQuantityInitial;
    }

    @JsonProperty("unit_quantity_onhand")
    public String getUnitQuantityOnhand() {
        return unitQuantityOnhand;
    }

    @JsonProperty("unit_quantity_onhand")
    public void setUnitQuantityOnhand(String unitQuantityOnhand) {
        this.unitQuantityOnhand = unitQuantityOnhand;
    }

    @JsonProperty("unit_quantity_free")
    public String getUnitQuantityFree() {
        return unitQuantityFree;
    }

    @JsonProperty("unit_quantity_free")
    public void setUnitQuantityFree(String unitQuantityFree) {
        this.unitQuantityFree = unitQuantityFree;
    }

    @JsonProperty("expiry_date")
    public String getExpiryDate() {
        return expiryDate;
    }

    @JsonProperty("expiry_date")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @JsonProperty("product_unit_of_measure_id")
    public String getProductUnitOfMeasureId() {
        return productUnitOfMeasureId;
    }

    @JsonProperty("product_unit_of_measure_id")
    public void setProductUnitOfMeasureId(String productUnitOfMeasureId) {
        this.productUnitOfMeasureId = productUnitOfMeasureId;
    }

    @JsonProperty("product_status_id")
    public String getProductStatusId() {
        return productStatusId;
    }

    @JsonProperty("product_status_id")
    public void setProductStatusId(String productStatusId) {
        this.productStatusId = productStatusId;
    }

    @JsonProperty("parent_id")
    public Object getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("date_created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date_created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("last_modified")
    public String getLastModified() {
        return lastModified;
    }

    @JsonProperty("last_modified")
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("arrival_date")
    public String getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("arrival_date")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("date_allocated")
    public Object getDateAllocated() {
        return dateAllocated;
    }

    @JsonProperty("date_allocated")
    public void setDateAllocated(Object dateAllocated) {
        this.dateAllocated = dateAllocated;
    }

    @JsonProperty("original_date_allocated")
    public Object getOriginalDateAllocated() {
        return originalDateAllocated;
    }

    @JsonProperty("original_date_allocated")
    public void setOriginalDateAllocated(Object originalDateAllocated) {
        this.originalDateAllocated = originalDateAllocated;
    }

    @JsonProperty("date_depleted")
    public Object getDateDepleted() {
        return dateDepleted;
    }

    @JsonProperty("date_depleted")
    public void setDateDepleted(Object dateDepleted) {
        this.dateDepleted = dateDepleted;
    }

    @JsonProperty("product_type_id")
    public String getProductTypeId() {
        return productTypeId;
    }

    @JsonProperty("product_type_id")
    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    @JsonProperty("warehouse_id")
    public String getWarehouseId() {
        return warehouseId;
    }

    @JsonProperty("warehouse_id")
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    @JsonProperty("send_warn_email")
    public String getSendWarnEmail() {
        return sendWarnEmail;
    }

    @JsonProperty("send_warn_email")
    public void setSendWarnEmail(String sendWarnEmail) {
        this.sendWarnEmail = sendWarnEmail;
    }

    @JsonProperty("product_packaging_id")
    public String getProductPackagingId() {
        return productPackagingId;
    }

    @JsonProperty("product_packaging_id")
    public void setProductPackagingId(String productPackagingId) {
        this.productPackagingId = productPackagingId;
    }

    @JsonProperty("warehouse_location_id")
    public Object getWarehouseLocationId() {
        return warehouseLocationId;
    }

    @JsonProperty("warehouse_location_id")
    public void setWarehouseLocationId(Object warehouseLocationId) {
        this.warehouseLocationId = warehouseLocationId;
    }

    @JsonProperty("charge_new_storage")
    public String getChargeNewStorage() {
        return chargeNewStorage;
    }

    @JsonProperty("charge_new_storage")
    public void setChargeNewStorage(String chargeNewStorage) {
        this.chargeNewStorage = chargeNewStorage;
    }

    @JsonProperty("warehouse_location_capacity_id")
    public Object getWarehouseLocationCapacityId() {
        return warehouseLocationCapacityId;
    }

    @JsonProperty("warehouse_location_capacity_id")
    public void setWarehouseLocationCapacityId(Object warehouseLocationCapacityId) {
        this.warehouseLocationCapacityId = warehouseLocationCapacityId;
    }

    @JsonProperty("warehouse_location_pick_efficiency_id")
    public Object getWarehouseLocationPickEfficiencyId() {
        return warehouseLocationPickEfficiencyId;
    }

    @JsonProperty("warehouse_location_pick_efficiency_id")
    public void setWarehouseLocationPickEfficiencyId(Object warehouseLocationPickEfficiencyId) {
        this.warehouseLocationPickEfficiencyId = warehouseLocationPickEfficiencyId;
    }

    @JsonProperty("purchase_order_history_status_id")
    public String getPurchaseOrderHistoryStatusId() {
        return purchaseOrderHistoryStatusId;
    }

    @JsonProperty("purchase_order_history_status_id")
    public void setPurchaseOrderHistoryStatusId(String purchaseOrderHistoryStatusId) {
        this.purchaseOrderHistoryStatusId = purchaseOrderHistoryStatusId;
    }

    @JsonProperty("pallet_id")
    public String getPalletId() {
        return palletId;
    }

    @JsonProperty("pallet_id")
    public void setPalletId(String palletId) {
        this.palletId = palletId;
    }

    @JsonProperty("custom_field_1")
    public String getCustomField1() {
        return customField1;
    }

    @JsonProperty("custom_field_1")
    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    @JsonProperty("custom_field_2")
    public String getCustomField2() {
        return customField2;
    }

    @JsonProperty("custom_field_2")
    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    @JsonProperty("custom_field_3")
    public String getCustomField3() {
        return customField3;
    }

    @JsonProperty("custom_field_3")
    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    @JsonProperty("confirmed")
    public boolean isConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("adjustment")
    public String getAdjustment() {
        return adjustment;
    }

    @JsonProperty("adjustment")
    public void setAdjustment(String adjustment) {
        this.adjustment = adjustment;
    }

    @JsonProperty("labels_printed")
    public String getLabelsPrinted() {
        return labelsPrinted;
    }

    @JsonProperty("labels_printed")
    public void setLabelsPrinted(String labelsPrinted) {
        this.labelsPrinted = labelsPrinted;
    }

    @JsonProperty("custom_field_4")
    public String getCustomField4() {
        return customField4;
    }

    @JsonProperty("custom_field_4")
    public void setCustomField4(String customField4) {
        this.customField4 = customField4;
    }

    @JsonProperty("custom_field_5")
    public String getCustomField5() {
        return customField5;
    }

    @JsonProperty("custom_field_5")
    public void setCustomField5(String customField5) {
        this.customField5 = customField5;
    }

    @JsonProperty("custom_field_6")
    public String getCustomField6() {
        return customField6;
    }

    @JsonProperty("custom_field_6")
    public void setCustomField6(String customField6) {
        this.customField6 = customField6;
    }

    @JsonProperty("custom_field_7")
    public String getCustomField7() {
        return customField7;
    }

    @JsonProperty("custom_field_7")
    public void setCustomField7(String customField7) {
        this.customField7 = customField7;
    }

    @JsonProperty("custom_field_8")
    public String getCustomField8() {
        return customField8;
    }

    @JsonProperty("custom_field_8")
    public void setCustomField8(String customField8) {
        this.customField8 = customField8;
    }

    @JsonProperty("custom_field_9")
    public String getCustomField9() {
        return customField9;
    }

    @JsonProperty("custom_field_9")
    public void setCustomField9(String customField9) {
        this.customField9 = customField9;
    }

    @JsonProperty("custom_field_10")
    public String getCustomField10() {
        return customField10;
    }

    @JsonProperty("custom_field_10")
    public void setCustomField10(String customField10) {
        this.customField10 = customField10;
    }

    @JsonProperty("pallet_rental_applies")
    public boolean isPalletRentalApplies() {
        return palletRentalApplies;
    }

    @JsonProperty("pallet_rental_applies")
    public void setPalletRentalApplies(boolean palletRentalApplies) {
        this.palletRentalApplies = palletRentalApplies;
    }

    @JsonProperty("Product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("Product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("ProductPackaging")
    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    @JsonProperty("ProductPackaging")
    public void setProductPackaging(ProductPackaging productPackaging) {
        this.productPackaging = productPackaging;
    }

    @JsonProperty("WarehouseLocation")
    public Object getWarehouseLocation() {
        return warehouseLocation;
    }

    @JsonProperty("WarehouseLocation")
    public void setWarehouseLocation(Object warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    @JsonProperty("unit_quantity_packed")
    public String getUnitQuantityPacked() {
        return unitQuantityPacked;
    }

    @JsonProperty("unit_quantity_packed")
    public void setUnitQuantityPacked(String unitQuantityPacked) {
        this.unitQuantityPacked = unitQuantityPacked;
    }

    @JsonProperty("product_storage_charge_method")
    public String getProductStorageChargeMethod() {
        return productStorageChargeMethod;
    }

    @JsonProperty("product_storage_charge_method")
    public void setProductStorageChargeMethod(String productStorageChargeMethod) {
        this.productStorageChargeMethod = productStorageChargeMethod;
    }

    @JsonProperty("scale_msg")
    public String getScaleMsg() {
        return scaleMsg;
    }

    @JsonProperty("scale_msg")
    public void setScaleMsg(String scaleMsg) {
        this.scaleMsg = scaleMsg;
    }

    @JsonProperty("pallet_qty")
    public int getPalletQty() {
        return palletQty;
    }

    @JsonProperty("pallet_qty")
    public void setPalletQty(int palletQty) {
        this.palletQty = palletQty;
    }

    @JsonProperty("pallet_qty_name")
    public String getPalletQtyName() {
        return palletQtyName;
    }

    @JsonProperty("pallet_qty_name")
    public void setPalletQtyName(String palletQtyName) {
        this.palletQtyName = palletQtyName;
    }

    @JsonProperty("undercharging_storage")
    public boolean isUnderchargingStorage() {
        return underchargingStorage;
    }

    @JsonProperty("undercharging_storage")
    public void setUnderchargingStorage(boolean underchargingStorage) {
        this.underchargingStorage = underchargingStorage;
    }

    @JsonProperty("location_already_used")
    public boolean isLocationAlreadyUsed() {
        return locationAlreadyUsed;
    }

    @JsonProperty("location_already_used")
    public void setLocationAlreadyUsed(boolean locationAlreadyUsed) {
        this.locationAlreadyUsed = locationAlreadyUsed;
    }

    @JsonProperty("custom_fields")
    public List<Object> getCustomFields() {
        return customFields;
    }

    @JsonProperty("custom_fields")
    public void setCustomFields(List<Object> customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("additional_info")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additional_info")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
