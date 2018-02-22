
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
    "default_adhoc_charge_config_id",
    "meta",
    "CustomerCharge",
    "charge_type_id",
    "model_key",
    "apply_fuel_levy"
})
public class AdhocChargeDatum {

    @JsonProperty("default_adhoc_charge_config_id")
    private String defaultAdhocChargeConfigId;
    @JsonProperty("meta")
    private String meta;
    @JsonProperty("CustomerCharge")
    private CustomerCharge customerCharge;
    @JsonProperty("charge_type_id")
    private int chargeTypeId;
    @JsonProperty("model_key")
    private String modelKey;
    @JsonProperty("apply_fuel_levy")
    private boolean applyFuelLevy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("default_adhoc_charge_config_id")
    public String getDefaultAdhocChargeConfigId() {
        return defaultAdhocChargeConfigId;
    }

    @JsonProperty("default_adhoc_charge_config_id")
    public void setDefaultAdhocChargeConfigId(String defaultAdhocChargeConfigId) {
        this.defaultAdhocChargeConfigId = defaultAdhocChargeConfigId;
    }

    @JsonProperty("meta")
    public String getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(String meta) {
        this.meta = meta;
    }

    @JsonProperty("CustomerCharge")
    public CustomerCharge getCustomerCharge() {
        return customerCharge;
    }

    @JsonProperty("CustomerCharge")
    public void setCustomerCharge(CustomerCharge customerCharge) {
        this.customerCharge = customerCharge;
    }

    @JsonProperty("charge_type_id")
    public int getChargeTypeId() {
        return chargeTypeId;
    }

    @JsonProperty("charge_type_id")
    public void setChargeTypeId(int chargeTypeId) {
        this.chargeTypeId = chargeTypeId;
    }

    @JsonProperty("model_key")
    public String getModelKey() {
        return modelKey;
    }

    @JsonProperty("model_key")
    public void setModelKey(String modelKey) {
        this.modelKey = modelKey;
    }

    @JsonProperty("apply_fuel_levy")
    public boolean isApplyFuelLevy() {
        return applyFuelLevy;
    }

    @JsonProperty("apply_fuel_levy")
    public void setApplyFuelLevy(boolean applyFuelLevy) {
        this.applyFuelLevy = applyFuelLevy;
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
