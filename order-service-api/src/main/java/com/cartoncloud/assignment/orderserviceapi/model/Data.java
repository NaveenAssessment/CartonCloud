
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
    "customer_id",
    "purchase_order_history_status_id",
    "date_added",
    "arrival_date",
    "last_modified",
    "version",
    "customer_reference",
    "adjustment",
    "purchaseorder_filename",
    "comment",
    "invoice_id",
    "income",
    "expense",
    "20_ft_containers_unloaded",
    "40_ft_containers_unloaded",
    "20_ft_containers_hand_unloaded",
    "40_ft_containers_hand_unloaded",
    "warehouse_id",
    "pallets_wrapped",
    "pallets_received",
    "purchase_order_charge_scheme_id",
    "value",
    "charge_error",
    "verified_quantities",
    "invoice_filename",
    "invoice_upload_role_id",
    "charges_finalized",
    "special_instruction",
    "verification_email_sent",
    "order_urgent",
    "customer_urgent",
    "rts_record",
    "arrival_temperatures",
    "bill_id",
    "purchase_order_expense_charge_scheme_id",
    "shipment_id",
    "custom_field_1",
    "custom_field_2",
    "custom_field_3",
    "custom_field_4",
    "custom_field_5",
    "custom_field_6",
    "custom_field_7",
    "custom_field_8",
    "custom_field_9",
    "custom_field_10",
    "Customer",
    "PurchaseOrderHistoryStatus",
    "PurchaseOrderProduct",
    "AdhocChargeData",
    "complete"
})
public class Data {

    @JsonProperty("id")
    private String id;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("purchase_order_history_status_id")
    private String purchaseOrderHistoryStatusId;
    @JsonProperty("date_added")
    private String dateAdded;
    @JsonProperty("arrival_date")
    private String arrivalDate;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("version")
    private String version;
    @JsonProperty("customer_reference")
    private String customerReference;
    @JsonProperty("adjustment")
    private String adjustment;
    @JsonProperty("purchaseorder_filename")
    private Object purchaseorderFilename;
    @JsonProperty("comment")
    private Object comment;
    @JsonProperty("invoice_id")
    private Object invoiceId;
    @JsonProperty("income")
    private String income;
    @JsonProperty("expense")
    private String expense;
    @JsonProperty("20_ft_containers_unloaded")
    private String _20FtContainersUnloaded;
    @JsonProperty("40_ft_containers_unloaded")
    private String _40FtContainersUnloaded;
    @JsonProperty("20_ft_containers_hand_unloaded")
    private String _20FtContainersHandUnloaded;
    @JsonProperty("40_ft_containers_hand_unloaded")
    private String _40FtContainersHandUnloaded;
    @JsonProperty("warehouse_id")
    private String warehouseId;
    @JsonProperty("pallets_wrapped")
    private String palletsWrapped;
    @JsonProperty("pallets_received")
    private String palletsReceived;
    @JsonProperty("purchase_order_charge_scheme_id")
    private String purchaseOrderChargeSchemeId;
    @JsonProperty("value")
    private String value;
    @JsonProperty("charge_error")
    private String chargeError;
    @JsonProperty("verified_quantities")
    private String verifiedQuantities;
    @JsonProperty("invoice_filename")
    private Object invoiceFilename;
    @JsonProperty("invoice_upload_role_id")
    private Object invoiceUploadRoleId;
    @JsonProperty("charges_finalized")
    private boolean chargesFinalized;
    @JsonProperty("special_instruction")
    private String specialInstruction;
    @JsonProperty("verification_email_sent")
    private boolean verificationEmailSent;
    @JsonProperty("order_urgent")
    private String orderUrgent;
    @JsonProperty("customer_urgent")
    private String customerUrgent;
    @JsonProperty("rts_record")
    private Object rtsRecord;
    @JsonProperty("arrival_temperatures")
    private Object arrivalTemperatures;
    @JsonProperty("bill_id")
    private Object billId;
    @JsonProperty("purchase_order_expense_charge_scheme_id")
    private String purchaseOrderExpenseChargeSchemeId;
    @JsonProperty("shipment_id")
    private Object shipmentId;
    @JsonProperty("custom_field_1")
    private Object customField1;
    @JsonProperty("custom_field_2")
    private Object customField2;
    @JsonProperty("custom_field_3")
    private Object customField3;
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
    @JsonProperty("Customer")
    private Customer customer;
    @JsonProperty("PurchaseOrderHistoryStatus")
    private PurchaseOrderHistoryStatus purchaseOrderHistoryStatus;
    @JsonProperty("PurchaseOrderProduct")
    private List<PurchaseOrderProduct> purchaseOrderProduct = null;
    @JsonProperty("AdhocChargeData")
    private List<AdhocChargeDatum> adhocChargeData = null;
    @JsonProperty("complete")
    private boolean complete;
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

    @JsonProperty("purchase_order_history_status_id")
    public String getPurchaseOrderHistoryStatusId() {
        return purchaseOrderHistoryStatusId;
    }

    @JsonProperty("purchase_order_history_status_id")
    public void setPurchaseOrderHistoryStatusId(String purchaseOrderHistoryStatusId) {
        this.purchaseOrderHistoryStatusId = purchaseOrderHistoryStatusId;
    }

    @JsonProperty("date_added")
    public String getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("date_added")
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("arrival_date")
    public String getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("arrival_date")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
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

    @JsonProperty("customer_reference")
    public String getCustomerReference() {
        return customerReference;
    }

    @JsonProperty("customer_reference")
    public void setCustomerReference(String customerReference) {
        this.customerReference = customerReference;
    }

    @JsonProperty("adjustment")
    public String getAdjustment() {
        return adjustment;
    }

    @JsonProperty("adjustment")
    public void setAdjustment(String adjustment) {
        this.adjustment = adjustment;
    }

    @JsonProperty("purchaseorder_filename")
    public Object getPurchaseorderFilename() {
        return purchaseorderFilename;
    }

    @JsonProperty("purchaseorder_filename")
    public void setPurchaseorderFilename(Object purchaseorderFilename) {
        this.purchaseorderFilename = purchaseorderFilename;
    }

    @JsonProperty("comment")
    public Object getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Object comment) {
        this.comment = comment;
    }

    @JsonProperty("invoice_id")
    public Object getInvoiceId() {
        return invoiceId;
    }

    @JsonProperty("invoice_id")
    public void setInvoiceId(Object invoiceId) {
        this.invoiceId = invoiceId;
    }

    @JsonProperty("income")
    public String getIncome() {
        return income;
    }

    @JsonProperty("income")
    public void setIncome(String income) {
        this.income = income;
    }

    @JsonProperty("expense")
    public String getExpense() {
        return expense;
    }

    @JsonProperty("expense")
    public void setExpense(String expense) {
        this.expense = expense;
    }

    @JsonProperty("20_ft_containers_unloaded")
    public String get20FtContainersUnloaded() {
        return _20FtContainersUnloaded;
    }

    @JsonProperty("20_ft_containers_unloaded")
    public void set20FtContainersUnloaded(String _20FtContainersUnloaded) {
        this._20FtContainersUnloaded = _20FtContainersUnloaded;
    }

    @JsonProperty("40_ft_containers_unloaded")
    public String get40FtContainersUnloaded() {
        return _40FtContainersUnloaded;
    }

    @JsonProperty("40_ft_containers_unloaded")
    public void set40FtContainersUnloaded(String _40FtContainersUnloaded) {
        this._40FtContainersUnloaded = _40FtContainersUnloaded;
    }

    @JsonProperty("20_ft_containers_hand_unloaded")
    public String get20FtContainersHandUnloaded() {
        return _20FtContainersHandUnloaded;
    }

    @JsonProperty("20_ft_containers_hand_unloaded")
    public void set20FtContainersHandUnloaded(String _20FtContainersHandUnloaded) {
        this._20FtContainersHandUnloaded = _20FtContainersHandUnloaded;
    }

    @JsonProperty("40_ft_containers_hand_unloaded")
    public String get40FtContainersHandUnloaded() {
        return _40FtContainersHandUnloaded;
    }

    @JsonProperty("40_ft_containers_hand_unloaded")
    public void set40FtContainersHandUnloaded(String _40FtContainersHandUnloaded) {
        this._40FtContainersHandUnloaded = _40FtContainersHandUnloaded;
    }

    @JsonProperty("warehouse_id")
    public String getWarehouseId() {
        return warehouseId;
    }

    @JsonProperty("warehouse_id")
    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    @JsonProperty("pallets_wrapped")
    public String getPalletsWrapped() {
        return palletsWrapped;
    }

    @JsonProperty("pallets_wrapped")
    public void setPalletsWrapped(String palletsWrapped) {
        this.palletsWrapped = palletsWrapped;
    }

    @JsonProperty("pallets_received")
    public String getPalletsReceived() {
        return palletsReceived;
    }

    @JsonProperty("pallets_received")
    public void setPalletsReceived(String palletsReceived) {
        this.palletsReceived = palletsReceived;
    }

    @JsonProperty("purchase_order_charge_scheme_id")
    public String getPurchaseOrderChargeSchemeId() {
        return purchaseOrderChargeSchemeId;
    }

    @JsonProperty("purchase_order_charge_scheme_id")
    public void setPurchaseOrderChargeSchemeId(String purchaseOrderChargeSchemeId) {
        this.purchaseOrderChargeSchemeId = purchaseOrderChargeSchemeId;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("charge_error")
    public String getChargeError() {
        return chargeError;
    }

    @JsonProperty("charge_error")
    public void setChargeError(String chargeError) {
        this.chargeError = chargeError;
    }

    @JsonProperty("verified_quantities")
    public String getVerifiedQuantities() {
        return verifiedQuantities;
    }

    @JsonProperty("verified_quantities")
    public void setVerifiedQuantities(String verifiedQuantities) {
        this.verifiedQuantities = verifiedQuantities;
    }

    @JsonProperty("invoice_filename")
    public Object getInvoiceFilename() {
        return invoiceFilename;
    }

    @JsonProperty("invoice_filename")
    public void setInvoiceFilename(Object invoiceFilename) {
        this.invoiceFilename = invoiceFilename;
    }

    @JsonProperty("invoice_upload_role_id")
    public Object getInvoiceUploadRoleId() {
        return invoiceUploadRoleId;
    }

    @JsonProperty("invoice_upload_role_id")
    public void setInvoiceUploadRoleId(Object invoiceUploadRoleId) {
        this.invoiceUploadRoleId = invoiceUploadRoleId;
    }

    @JsonProperty("charges_finalized")
    public boolean isChargesFinalized() {
        return chargesFinalized;
    }

    @JsonProperty("charges_finalized")
    public void setChargesFinalized(boolean chargesFinalized) {
        this.chargesFinalized = chargesFinalized;
    }

    @JsonProperty("special_instruction")
    public String getSpecialInstruction() {
        return specialInstruction;
    }

    @JsonProperty("special_instruction")
    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }

    @JsonProperty("verification_email_sent")
    public boolean isVerificationEmailSent() {
        return verificationEmailSent;
    }

    @JsonProperty("verification_email_sent")
    public void setVerificationEmailSent(boolean verificationEmailSent) {
        this.verificationEmailSent = verificationEmailSent;
    }

    @JsonProperty("order_urgent")
    public String getOrderUrgent() {
        return orderUrgent;
    }

    @JsonProperty("order_urgent")
    public void setOrderUrgent(String orderUrgent) {
        this.orderUrgent = orderUrgent;
    }

    @JsonProperty("customer_urgent")
    public String getCustomerUrgent() {
        return customerUrgent;
    }

    @JsonProperty("customer_urgent")
    public void setCustomerUrgent(String customerUrgent) {
        this.customerUrgent = customerUrgent;
    }

    @JsonProperty("rts_record")
    public Object getRtsRecord() {
        return rtsRecord;
    }

    @JsonProperty("rts_record")
    public void setRtsRecord(Object rtsRecord) {
        this.rtsRecord = rtsRecord;
    }

    @JsonProperty("arrival_temperatures")
    public Object getArrivalTemperatures() {
        return arrivalTemperatures;
    }

    @JsonProperty("arrival_temperatures")
    public void setArrivalTemperatures(Object arrivalTemperatures) {
        this.arrivalTemperatures = arrivalTemperatures;
    }

    @JsonProperty("bill_id")
    public Object getBillId() {
        return billId;
    }

    @JsonProperty("bill_id")
    public void setBillId(Object billId) {
        this.billId = billId;
    }

    @JsonProperty("purchase_order_expense_charge_scheme_id")
    public String getPurchaseOrderExpenseChargeSchemeId() {
        return purchaseOrderExpenseChargeSchemeId;
    }

    @JsonProperty("purchase_order_expense_charge_scheme_id")
    public void setPurchaseOrderExpenseChargeSchemeId(String purchaseOrderExpenseChargeSchemeId) {
        this.purchaseOrderExpenseChargeSchemeId = purchaseOrderExpenseChargeSchemeId;
    }

    @JsonProperty("shipment_id")
    public Object getShipmentId() {
        return shipmentId;
    }

    @JsonProperty("shipment_id")
    public void setShipmentId(Object shipmentId) {
        this.shipmentId = shipmentId;
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

    @JsonProperty("Customer")
    public Customer getCustomer() {
        return customer;
    }

    @JsonProperty("Customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @JsonProperty("PurchaseOrderHistoryStatus")
    public PurchaseOrderHistoryStatus getPurchaseOrderHistoryStatus() {
        return purchaseOrderHistoryStatus;
    }

    @JsonProperty("PurchaseOrderHistoryStatus")
    public void setPurchaseOrderHistoryStatus(PurchaseOrderHistoryStatus purchaseOrderHistoryStatus) {
        this.purchaseOrderHistoryStatus = purchaseOrderHistoryStatus;
    }

    @JsonProperty("PurchaseOrderProduct")
    public List<PurchaseOrderProduct> getPurchaseOrderProduct() {
        return purchaseOrderProduct;
    }

    @JsonProperty("PurchaseOrderProduct")
    public void setPurchaseOrderProduct(List<PurchaseOrderProduct> purchaseOrderProduct) {
        this.purchaseOrderProduct = purchaseOrderProduct;
    }

    @JsonProperty("AdhocChargeData")
    public List<AdhocChargeDatum> getAdhocChargeData() {
        return adhocChargeData;
    }

    @JsonProperty("AdhocChargeData")
    public void setAdhocChargeData(List<AdhocChargeDatum> adhocChargeData) {
        this.adhocChargeData = adhocChargeData;
    }

    @JsonProperty("complete")
    public boolean isComplete() {
        return complete;
    }

    @JsonProperty("complete")
    public void setComplete(boolean complete) {
        this.complete = complete;
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
