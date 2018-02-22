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
"purchase_order_ids"
})
public class PurchaseOrderRequest {

@JsonProperty("purchase_order_ids")
private List<Integer> purchaseOrderIds = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("purchase_order_ids")
public List<Integer> getPurchaseOrderIds() {
return purchaseOrderIds;
}

@JsonProperty("purchase_order_ids")
public void setPurchaseOrderIds(List<Integer> purchaseOrderIds) {
this.purchaseOrderIds = purchaseOrderIds;
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