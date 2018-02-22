
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
    "name",
    "20_container_unload_charge",
    "40_container_unload_charge",
    "20_container_hand_unload_charge",
    "40_container_hand_unload_charge",
    "inbound_pallet_wrap_charge",
    "sale_order_charge",
    "outbound_sku_charge",
    "minimum_sku_charge",
    "purchase_order_charge",
    "fuel_levy_offset",
    "storage_charge_days",
    "consignment_charge_scheme_id",
    "consignment_rate_per_hour",
    "sale_order_charge_scheme_id",
    "purchase_order_charge_scheme_id",
    "outbound_pallet_wrap_charge",
    "sale_order_charge_percentage",
    "purchase_order_charge_percentage",
    "consignment_charge_percentage",
    "manifest_charge_scheme_id",
    "manifest_pickup_charge",
    "double_charge_storage",
    "inbound_pallet_receive_charge",
    "outbound_urgent_sale_order_charge",
    "inbound_invoice_upload_charge",
    "storage_pallet_rental_charge",
    "consignment_group_charging",
    "consignment_invoice_level_id",
    "consignment_cod_collection_charge",
    "customer_charge_relationship_id",
    "customer_charge_relationship_child_id",
    "charge_for_returns",
    "outbound_urgent_purchase_order_charge",
    "ignore_base_setting",
    "charge_product_type_option",
    "minimum_charge_sale_order",
    "minimum_charge_purchase_order",
    "minimum_charge_manifest",
    "minimum_charge_consignment",
    "minimum_charge_storage_period",
    "minimum_charge_apply_fuel_levy",
    "picking_charge_option_id",
    "administration_fee",
    "putaway_charge_option_id",
    "consignment_rate_per_distance",
    "enable_parser_uom_charging",
    "invoice_minimum_fee",
    "warehouse_minimum_fee",
    "charge_source_model_class_id",
    "charge_source_model_id"
})
public class CustomerCharge {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("20_container_unload_charge")
    private String _20ContainerUnloadCharge;
    @JsonProperty("40_container_unload_charge")
    private String _40ContainerUnloadCharge;
    @JsonProperty("20_container_hand_unload_charge")
    private String _20ContainerHandUnloadCharge;
    @JsonProperty("40_container_hand_unload_charge")
    private String _40ContainerHandUnloadCharge;
    @JsonProperty("inbound_pallet_wrap_charge")
    private String inboundPalletWrapCharge;
    @JsonProperty("sale_order_charge")
    private String saleOrderCharge;
    @JsonProperty("outbound_sku_charge")
    private String outboundSkuCharge;
    @JsonProperty("minimum_sku_charge")
    private String minimumSkuCharge;
    @JsonProperty("purchase_order_charge")
    private String purchaseOrderCharge;
    @JsonProperty("fuel_levy_offset")
    private String fuelLevyOffset;
    @JsonProperty("storage_charge_days")
    private String storageChargeDays;
    @JsonProperty("consignment_charge_scheme_id")
    private String consignmentChargeSchemeId;
    @JsonProperty("consignment_rate_per_hour")
    private String consignmentRatePerHour;
    @JsonProperty("sale_order_charge_scheme_id")
    private String saleOrderChargeSchemeId;
    @JsonProperty("purchase_order_charge_scheme_id")
    private String purchaseOrderChargeSchemeId;
    @JsonProperty("outbound_pallet_wrap_charge")
    private String outboundPalletWrapCharge;
    @JsonProperty("sale_order_charge_percentage")
    private String saleOrderChargePercentage;
    @JsonProperty("purchase_order_charge_percentage")
    private String purchaseOrderChargePercentage;
    @JsonProperty("consignment_charge_percentage")
    private String consignmentChargePercentage;
    @JsonProperty("manifest_charge_scheme_id")
    private String manifestChargeSchemeId;
    @JsonProperty("manifest_pickup_charge")
    private String manifestPickupCharge;
    @JsonProperty("double_charge_storage")
    private boolean doubleChargeStorage;
    @JsonProperty("inbound_pallet_receive_charge")
    private String inboundPalletReceiveCharge;
    @JsonProperty("outbound_urgent_sale_order_charge")
    private String outboundUrgentSaleOrderCharge;
    @JsonProperty("inbound_invoice_upload_charge")
    private String inboundInvoiceUploadCharge;
    @JsonProperty("storage_pallet_rental_charge")
    private String storagePalletRentalCharge;
    @JsonProperty("consignment_group_charging")
    private boolean consignmentGroupCharging;
    @JsonProperty("consignment_invoice_level_id")
    private String consignmentInvoiceLevelId;
    @JsonProperty("consignment_cod_collection_charge")
    private String consignmentCodCollectionCharge;
    @JsonProperty("customer_charge_relationship_id")
    private String customerChargeRelationshipId;
    @JsonProperty("customer_charge_relationship_child_id")
    private String customerChargeRelationshipChildId;
    @JsonProperty("charge_for_returns")
    private boolean chargeForReturns;
    @JsonProperty("outbound_urgent_purchase_order_charge")
    private String outboundUrgentPurchaseOrderCharge;
    @JsonProperty("ignore_base_setting")
    private boolean ignoreBaseSetting;
    @JsonProperty("charge_product_type_option")
    private String chargeProductTypeOption;
    @JsonProperty("minimum_charge_sale_order")
    private String minimumChargeSaleOrder;
    @JsonProperty("minimum_charge_purchase_order")
    private Object minimumChargePurchaseOrder;
    @JsonProperty("minimum_charge_manifest")
    private Object minimumChargeManifest;
    @JsonProperty("minimum_charge_consignment")
    private Object minimumChargeConsignment;
    @JsonProperty("minimum_charge_storage_period")
    private Object minimumChargeStoragePeriod;
    @JsonProperty("minimum_charge_apply_fuel_levy")
    private String minimumChargeApplyFuelLevy;
    @JsonProperty("picking_charge_option_id")
    private String pickingChargeOptionId;
    @JsonProperty("administration_fee")
    private String administrationFee;
    @JsonProperty("putaway_charge_option_id")
    private String putawayChargeOptionId;
    @JsonProperty("consignment_rate_per_distance")
    private String consignmentRatePerDistance;
    @JsonProperty("enable_parser_uom_charging")
    private boolean enableParserUomCharging;
    @JsonProperty("invoice_minimum_fee")
    private String invoiceMinimumFee;
    @JsonProperty("warehouse_minimum_fee")
    private String warehouseMinimumFee;
    @JsonProperty("charge_source_model_class_id")
    private int chargeSourceModelClassId;
    @JsonProperty("charge_source_model_id")
    private String chargeSourceModelId;
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

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("20_container_unload_charge")
    public String get20ContainerUnloadCharge() {
        return _20ContainerUnloadCharge;
    }

    @JsonProperty("20_container_unload_charge")
    public void set20ContainerUnloadCharge(String _20ContainerUnloadCharge) {
        this._20ContainerUnloadCharge = _20ContainerUnloadCharge;
    }

    @JsonProperty("40_container_unload_charge")
    public String get40ContainerUnloadCharge() {
        return _40ContainerUnloadCharge;
    }

    @JsonProperty("40_container_unload_charge")
    public void set40ContainerUnloadCharge(String _40ContainerUnloadCharge) {
        this._40ContainerUnloadCharge = _40ContainerUnloadCharge;
    }

    @JsonProperty("20_container_hand_unload_charge")
    public String get20ContainerHandUnloadCharge() {
        return _20ContainerHandUnloadCharge;
    }

    @JsonProperty("20_container_hand_unload_charge")
    public void set20ContainerHandUnloadCharge(String _20ContainerHandUnloadCharge) {
        this._20ContainerHandUnloadCharge = _20ContainerHandUnloadCharge;
    }

    @JsonProperty("40_container_hand_unload_charge")
    public String get40ContainerHandUnloadCharge() {
        return _40ContainerHandUnloadCharge;
    }

    @JsonProperty("40_container_hand_unload_charge")
    public void set40ContainerHandUnloadCharge(String _40ContainerHandUnloadCharge) {
        this._40ContainerHandUnloadCharge = _40ContainerHandUnloadCharge;
    }

    @JsonProperty("inbound_pallet_wrap_charge")
    public String getInboundPalletWrapCharge() {
        return inboundPalletWrapCharge;
    }

    @JsonProperty("inbound_pallet_wrap_charge")
    public void setInboundPalletWrapCharge(String inboundPalletWrapCharge) {
        this.inboundPalletWrapCharge = inboundPalletWrapCharge;
    }

    @JsonProperty("sale_order_charge")
    public String getSaleOrderCharge() {
        return saleOrderCharge;
    }

    @JsonProperty("sale_order_charge")
    public void setSaleOrderCharge(String saleOrderCharge) {
        this.saleOrderCharge = saleOrderCharge;
    }

    @JsonProperty("outbound_sku_charge")
    public String getOutboundSkuCharge() {
        return outboundSkuCharge;
    }

    @JsonProperty("outbound_sku_charge")
    public void setOutboundSkuCharge(String outboundSkuCharge) {
        this.outboundSkuCharge = outboundSkuCharge;
    }

    @JsonProperty("minimum_sku_charge")
    public String getMinimumSkuCharge() {
        return minimumSkuCharge;
    }

    @JsonProperty("minimum_sku_charge")
    public void setMinimumSkuCharge(String minimumSkuCharge) {
        this.minimumSkuCharge = minimumSkuCharge;
    }

    @JsonProperty("purchase_order_charge")
    public String getPurchaseOrderCharge() {
        return purchaseOrderCharge;
    }

    @JsonProperty("purchase_order_charge")
    public void setPurchaseOrderCharge(String purchaseOrderCharge) {
        this.purchaseOrderCharge = purchaseOrderCharge;
    }

    @JsonProperty("fuel_levy_offset")
    public String getFuelLevyOffset() {
        return fuelLevyOffset;
    }

    @JsonProperty("fuel_levy_offset")
    public void setFuelLevyOffset(String fuelLevyOffset) {
        this.fuelLevyOffset = fuelLevyOffset;
    }

    @JsonProperty("storage_charge_days")
    public String getStorageChargeDays() {
        return storageChargeDays;
    }

    @JsonProperty("storage_charge_days")
    public void setStorageChargeDays(String storageChargeDays) {
        this.storageChargeDays = storageChargeDays;
    }

    @JsonProperty("consignment_charge_scheme_id")
    public String getConsignmentChargeSchemeId() {
        return consignmentChargeSchemeId;
    }

    @JsonProperty("consignment_charge_scheme_id")
    public void setConsignmentChargeSchemeId(String consignmentChargeSchemeId) {
        this.consignmentChargeSchemeId = consignmentChargeSchemeId;
    }

    @JsonProperty("consignment_rate_per_hour")
    public String getConsignmentRatePerHour() {
        return consignmentRatePerHour;
    }

    @JsonProperty("consignment_rate_per_hour")
    public void setConsignmentRatePerHour(String consignmentRatePerHour) {
        this.consignmentRatePerHour = consignmentRatePerHour;
    }

    @JsonProperty("sale_order_charge_scheme_id")
    public String getSaleOrderChargeSchemeId() {
        return saleOrderChargeSchemeId;
    }

    @JsonProperty("sale_order_charge_scheme_id")
    public void setSaleOrderChargeSchemeId(String saleOrderChargeSchemeId) {
        this.saleOrderChargeSchemeId = saleOrderChargeSchemeId;
    }

    @JsonProperty("purchase_order_charge_scheme_id")
    public String getPurchaseOrderChargeSchemeId() {
        return purchaseOrderChargeSchemeId;
    }

    @JsonProperty("purchase_order_charge_scheme_id")
    public void setPurchaseOrderChargeSchemeId(String purchaseOrderChargeSchemeId) {
        this.purchaseOrderChargeSchemeId = purchaseOrderChargeSchemeId;
    }

    @JsonProperty("outbound_pallet_wrap_charge")
    public String getOutboundPalletWrapCharge() {
        return outboundPalletWrapCharge;
    }

    @JsonProperty("outbound_pallet_wrap_charge")
    public void setOutboundPalletWrapCharge(String outboundPalletWrapCharge) {
        this.outboundPalletWrapCharge = outboundPalletWrapCharge;
    }

    @JsonProperty("sale_order_charge_percentage")
    public String getSaleOrderChargePercentage() {
        return saleOrderChargePercentage;
    }

    @JsonProperty("sale_order_charge_percentage")
    public void setSaleOrderChargePercentage(String saleOrderChargePercentage) {
        this.saleOrderChargePercentage = saleOrderChargePercentage;
    }

    @JsonProperty("purchase_order_charge_percentage")
    public String getPurchaseOrderChargePercentage() {
        return purchaseOrderChargePercentage;
    }

    @JsonProperty("purchase_order_charge_percentage")
    public void setPurchaseOrderChargePercentage(String purchaseOrderChargePercentage) {
        this.purchaseOrderChargePercentage = purchaseOrderChargePercentage;
    }

    @JsonProperty("consignment_charge_percentage")
    public String getConsignmentChargePercentage() {
        return consignmentChargePercentage;
    }

    @JsonProperty("consignment_charge_percentage")
    public void setConsignmentChargePercentage(String consignmentChargePercentage) {
        this.consignmentChargePercentage = consignmentChargePercentage;
    }

    @JsonProperty("manifest_charge_scheme_id")
    public String getManifestChargeSchemeId() {
        return manifestChargeSchemeId;
    }

    @JsonProperty("manifest_charge_scheme_id")
    public void setManifestChargeSchemeId(String manifestChargeSchemeId) {
        this.manifestChargeSchemeId = manifestChargeSchemeId;
    }

    @JsonProperty("manifest_pickup_charge")
    public String getManifestPickupCharge() {
        return manifestPickupCharge;
    }

    @JsonProperty("manifest_pickup_charge")
    public void setManifestPickupCharge(String manifestPickupCharge) {
        this.manifestPickupCharge = manifestPickupCharge;
    }

    @JsonProperty("double_charge_storage")
    public boolean isDoubleChargeStorage() {
        return doubleChargeStorage;
    }

    @JsonProperty("double_charge_storage")
    public void setDoubleChargeStorage(boolean doubleChargeStorage) {
        this.doubleChargeStorage = doubleChargeStorage;
    }

    @JsonProperty("inbound_pallet_receive_charge")
    public String getInboundPalletReceiveCharge() {
        return inboundPalletReceiveCharge;
    }

    @JsonProperty("inbound_pallet_receive_charge")
    public void setInboundPalletReceiveCharge(String inboundPalletReceiveCharge) {
        this.inboundPalletReceiveCharge = inboundPalletReceiveCharge;
    }

    @JsonProperty("outbound_urgent_sale_order_charge")
    public String getOutboundUrgentSaleOrderCharge() {
        return outboundUrgentSaleOrderCharge;
    }

    @JsonProperty("outbound_urgent_sale_order_charge")
    public void setOutboundUrgentSaleOrderCharge(String outboundUrgentSaleOrderCharge) {
        this.outboundUrgentSaleOrderCharge = outboundUrgentSaleOrderCharge;
    }

    @JsonProperty("inbound_invoice_upload_charge")
    public String getInboundInvoiceUploadCharge() {
        return inboundInvoiceUploadCharge;
    }

    @JsonProperty("inbound_invoice_upload_charge")
    public void setInboundInvoiceUploadCharge(String inboundInvoiceUploadCharge) {
        this.inboundInvoiceUploadCharge = inboundInvoiceUploadCharge;
    }

    @JsonProperty("storage_pallet_rental_charge")
    public String getStoragePalletRentalCharge() {
        return storagePalletRentalCharge;
    }

    @JsonProperty("storage_pallet_rental_charge")
    public void setStoragePalletRentalCharge(String storagePalletRentalCharge) {
        this.storagePalletRentalCharge = storagePalletRentalCharge;
    }

    @JsonProperty("consignment_group_charging")
    public boolean isConsignmentGroupCharging() {
        return consignmentGroupCharging;
    }

    @JsonProperty("consignment_group_charging")
    public void setConsignmentGroupCharging(boolean consignmentGroupCharging) {
        this.consignmentGroupCharging = consignmentGroupCharging;
    }

    @JsonProperty("consignment_invoice_level_id")
    public String getConsignmentInvoiceLevelId() {
        return consignmentInvoiceLevelId;
    }

    @JsonProperty("consignment_invoice_level_id")
    public void setConsignmentInvoiceLevelId(String consignmentInvoiceLevelId) {
        this.consignmentInvoiceLevelId = consignmentInvoiceLevelId;
    }

    @JsonProperty("consignment_cod_collection_charge")
    public String getConsignmentCodCollectionCharge() {
        return consignmentCodCollectionCharge;
    }

    @JsonProperty("consignment_cod_collection_charge")
    public void setConsignmentCodCollectionCharge(String consignmentCodCollectionCharge) {
        this.consignmentCodCollectionCharge = consignmentCodCollectionCharge;
    }

    @JsonProperty("customer_charge_relationship_id")
    public String getCustomerChargeRelationshipId() {
        return customerChargeRelationshipId;
    }

    @JsonProperty("customer_charge_relationship_id")
    public void setCustomerChargeRelationshipId(String customerChargeRelationshipId) {
        this.customerChargeRelationshipId = customerChargeRelationshipId;
    }

    @JsonProperty("customer_charge_relationship_child_id")
    public String getCustomerChargeRelationshipChildId() {
        return customerChargeRelationshipChildId;
    }

    @JsonProperty("customer_charge_relationship_child_id")
    public void setCustomerChargeRelationshipChildId(String customerChargeRelationshipChildId) {
        this.customerChargeRelationshipChildId = customerChargeRelationshipChildId;
    }

    @JsonProperty("charge_for_returns")
    public boolean isChargeForReturns() {
        return chargeForReturns;
    }

    @JsonProperty("charge_for_returns")
    public void setChargeForReturns(boolean chargeForReturns) {
        this.chargeForReturns = chargeForReturns;
    }

    @JsonProperty("outbound_urgent_purchase_order_charge")
    public String getOutboundUrgentPurchaseOrderCharge() {
        return outboundUrgentPurchaseOrderCharge;
    }

    @JsonProperty("outbound_urgent_purchase_order_charge")
    public void setOutboundUrgentPurchaseOrderCharge(String outboundUrgentPurchaseOrderCharge) {
        this.outboundUrgentPurchaseOrderCharge = outboundUrgentPurchaseOrderCharge;
    }

    @JsonProperty("ignore_base_setting")
    public boolean isIgnoreBaseSetting() {
        return ignoreBaseSetting;
    }

    @JsonProperty("ignore_base_setting")
    public void setIgnoreBaseSetting(boolean ignoreBaseSetting) {
        this.ignoreBaseSetting = ignoreBaseSetting;
    }

    @JsonProperty("charge_product_type_option")
    public String getChargeProductTypeOption() {
        return chargeProductTypeOption;
    }

    @JsonProperty("charge_product_type_option")
    public void setChargeProductTypeOption(String chargeProductTypeOption) {
        this.chargeProductTypeOption = chargeProductTypeOption;
    }

    @JsonProperty("minimum_charge_sale_order")
    public String getMinimumChargeSaleOrder() {
        return minimumChargeSaleOrder;
    }

    @JsonProperty("minimum_charge_sale_order")
    public void setMinimumChargeSaleOrder(String minimumChargeSaleOrder) {
        this.minimumChargeSaleOrder = minimumChargeSaleOrder;
    }

    @JsonProperty("minimum_charge_purchase_order")
    public Object getMinimumChargePurchaseOrder() {
        return minimumChargePurchaseOrder;
    }

    @JsonProperty("minimum_charge_purchase_order")
    public void setMinimumChargePurchaseOrder(Object minimumChargePurchaseOrder) {
        this.minimumChargePurchaseOrder = minimumChargePurchaseOrder;
    }

    @JsonProperty("minimum_charge_manifest")
    public Object getMinimumChargeManifest() {
        return minimumChargeManifest;
    }

    @JsonProperty("minimum_charge_manifest")
    public void setMinimumChargeManifest(Object minimumChargeManifest) {
        this.minimumChargeManifest = minimumChargeManifest;
    }

    @JsonProperty("minimum_charge_consignment")
    public Object getMinimumChargeConsignment() {
        return minimumChargeConsignment;
    }

    @JsonProperty("minimum_charge_consignment")
    public void setMinimumChargeConsignment(Object minimumChargeConsignment) {
        this.minimumChargeConsignment = minimumChargeConsignment;
    }

    @JsonProperty("minimum_charge_storage_period")
    public Object getMinimumChargeStoragePeriod() {
        return minimumChargeStoragePeriod;
    }

    @JsonProperty("minimum_charge_storage_period")
    public void setMinimumChargeStoragePeriod(Object minimumChargeStoragePeriod) {
        this.minimumChargeStoragePeriod = minimumChargeStoragePeriod;
    }

    @JsonProperty("minimum_charge_apply_fuel_levy")
    public String getMinimumChargeApplyFuelLevy() {
        return minimumChargeApplyFuelLevy;
    }

    @JsonProperty("minimum_charge_apply_fuel_levy")
    public void setMinimumChargeApplyFuelLevy(String minimumChargeApplyFuelLevy) {
        this.minimumChargeApplyFuelLevy = minimumChargeApplyFuelLevy;
    }

    @JsonProperty("picking_charge_option_id")
    public String getPickingChargeOptionId() {
        return pickingChargeOptionId;
    }

    @JsonProperty("picking_charge_option_id")
    public void setPickingChargeOptionId(String pickingChargeOptionId) {
        this.pickingChargeOptionId = pickingChargeOptionId;
    }

    @JsonProperty("administration_fee")
    public String getAdministrationFee() {
        return administrationFee;
    }

    @JsonProperty("administration_fee")
    public void setAdministrationFee(String administrationFee) {
        this.administrationFee = administrationFee;
    }

    @JsonProperty("putaway_charge_option_id")
    public String getPutawayChargeOptionId() {
        return putawayChargeOptionId;
    }

    @JsonProperty("putaway_charge_option_id")
    public void setPutawayChargeOptionId(String putawayChargeOptionId) {
        this.putawayChargeOptionId = putawayChargeOptionId;
    }

    @JsonProperty("consignment_rate_per_distance")
    public String getConsignmentRatePerDistance() {
        return consignmentRatePerDistance;
    }

    @JsonProperty("consignment_rate_per_distance")
    public void setConsignmentRatePerDistance(String consignmentRatePerDistance) {
        this.consignmentRatePerDistance = consignmentRatePerDistance;
    }

    @JsonProperty("enable_parser_uom_charging")
    public boolean isEnableParserUomCharging() {
        return enableParserUomCharging;
    }

    @JsonProperty("enable_parser_uom_charging")
    public void setEnableParserUomCharging(boolean enableParserUomCharging) {
        this.enableParserUomCharging = enableParserUomCharging;
    }

    @JsonProperty("invoice_minimum_fee")
    public String getInvoiceMinimumFee() {
        return invoiceMinimumFee;
    }

    @JsonProperty("invoice_minimum_fee")
    public void setInvoiceMinimumFee(String invoiceMinimumFee) {
        this.invoiceMinimumFee = invoiceMinimumFee;
    }

    @JsonProperty("warehouse_minimum_fee")
    public String getWarehouseMinimumFee() {
        return warehouseMinimumFee;
    }

    @JsonProperty("warehouse_minimum_fee")
    public void setWarehouseMinimumFee(String warehouseMinimumFee) {
        this.warehouseMinimumFee = warehouseMinimumFee;
    }

    @JsonProperty("charge_source_model_class_id")
    public int getChargeSourceModelClassId() {
        return chargeSourceModelClassId;
    }

    @JsonProperty("charge_source_model_class_id")
    public void setChargeSourceModelClassId(int chargeSourceModelClassId) {
        this.chargeSourceModelClassId = chargeSourceModelClassId;
    }

    @JsonProperty("charge_source_model_id")
    public String getChargeSourceModelId() {
        return chargeSourceModelId;
    }

    @JsonProperty("charge_source_model_id")
    public void setChargeSourceModelId(String chargeSourceModelId) {
        this.chargeSourceModelId = chargeSourceModelId;
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
