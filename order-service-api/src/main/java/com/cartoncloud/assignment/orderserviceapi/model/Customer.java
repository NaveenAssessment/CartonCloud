
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
    "telephone",
    "customer_charge_id",
    "active",
    "warehouse_ids",
    "code",
    "logo_remote_file_id",
    "customer_type_id",
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
    "custom_field_11",
    "custom_field_12",
    "custom_field_13",
    "custom_field_14",
    "custom_field_15",
    "custom_field_16",
    "custom_field_17",
    "custom_field_18",
    "custom_field_19",
    "custom_field_20",
    "CustomerWmsSetting"
})
public class Customer {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("telephone")
    private String telephone;
    @JsonProperty("customer_charge_id")
    private String customerChargeId;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("warehouse_ids")
    private String warehouseIds;
    @JsonProperty("code")
    private String code;
    @JsonProperty("logo_remote_file_id")
    private Object logoRemoteFileId;
    @JsonProperty("customer_type_id")
    private String customerTypeId;
    @JsonProperty("custom_field_1")
    private String customField1;
    @JsonProperty("custom_field_2")
    private String customField2;
    @JsonProperty("custom_field_3")
    private String customField3;
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
    @JsonProperty("custom_field_11")
    private String customField11;
    @JsonProperty("custom_field_12")
    private String customField12;
    @JsonProperty("custom_field_13")
    private String customField13;
    @JsonProperty("custom_field_14")
    private String customField14;
    @JsonProperty("custom_field_15")
    private String customField15;
    @JsonProperty("custom_field_16")
    private String customField16;
    @JsonProperty("custom_field_17")
    private String customField17;
    @JsonProperty("custom_field_18")
    private String customField18;
    @JsonProperty("custom_field_19")
    private String customField19;
    @JsonProperty("custom_field_20")
    private String customField20;
    @JsonProperty("CustomerWmsSetting")
    private CustomerWmsSetting customerWmsSetting;
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

    @JsonProperty("telephone")
    public String getTelephone() {
        return telephone;
    }

    @JsonProperty("telephone")
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @JsonProperty("customer_charge_id")
    public String getCustomerChargeId() {
        return customerChargeId;
    }

    @JsonProperty("customer_charge_id")
    public void setCustomerChargeId(String customerChargeId) {
        this.customerChargeId = customerChargeId;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("logo_remote_file_id")
    public Object getLogoRemoteFileId() {
        return logoRemoteFileId;
    }

    @JsonProperty("logo_remote_file_id")
    public void setLogoRemoteFileId(Object logoRemoteFileId) {
        this.logoRemoteFileId = logoRemoteFileId;
    }

    @JsonProperty("customer_type_id")
    public String getCustomerTypeId() {
        return customerTypeId;
    }

    @JsonProperty("customer_type_id")
    public void setCustomerTypeId(String customerTypeId) {
        this.customerTypeId = customerTypeId;
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

    @JsonProperty("custom_field_11")
    public String getCustomField11() {
        return customField11;
    }

    @JsonProperty("custom_field_11")
    public void setCustomField11(String customField11) {
        this.customField11 = customField11;
    }

    @JsonProperty("custom_field_12")
    public String getCustomField12() {
        return customField12;
    }

    @JsonProperty("custom_field_12")
    public void setCustomField12(String customField12) {
        this.customField12 = customField12;
    }

    @JsonProperty("custom_field_13")
    public String getCustomField13() {
        return customField13;
    }

    @JsonProperty("custom_field_13")
    public void setCustomField13(String customField13) {
        this.customField13 = customField13;
    }

    @JsonProperty("custom_field_14")
    public String getCustomField14() {
        return customField14;
    }

    @JsonProperty("custom_field_14")
    public void setCustomField14(String customField14) {
        this.customField14 = customField14;
    }

    @JsonProperty("custom_field_15")
    public String getCustomField15() {
        return customField15;
    }

    @JsonProperty("custom_field_15")
    public void setCustomField15(String customField15) {
        this.customField15 = customField15;
    }

    @JsonProperty("custom_field_16")
    public String getCustomField16() {
        return customField16;
    }

    @JsonProperty("custom_field_16")
    public void setCustomField16(String customField16) {
        this.customField16 = customField16;
    }

    @JsonProperty("custom_field_17")
    public String getCustomField17() {
        return customField17;
    }

    @JsonProperty("custom_field_17")
    public void setCustomField17(String customField17) {
        this.customField17 = customField17;
    }

    @JsonProperty("custom_field_18")
    public String getCustomField18() {
        return customField18;
    }

    @JsonProperty("custom_field_18")
    public void setCustomField18(String customField18) {
        this.customField18 = customField18;
    }

    @JsonProperty("custom_field_19")
    public String getCustomField19() {
        return customField19;
    }

    @JsonProperty("custom_field_19")
    public void setCustomField19(String customField19) {
        this.customField19 = customField19;
    }

    @JsonProperty("custom_field_20")
    public String getCustomField20() {
        return customField20;
    }

    @JsonProperty("custom_field_20")
    public void setCustomField20(String customField20) {
        this.customField20 = customField20;
    }

    @JsonProperty("CustomerWmsSetting")
    public CustomerWmsSetting getCustomerWmsSetting() {
        return customerWmsSetting;
    }

    @JsonProperty("CustomerWmsSetting")
    public void setCustomerWmsSetting(CustomerWmsSetting customerWmsSetting) {
        this.customerWmsSetting = customerWmsSetting;
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
