
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
    "info",
    "data"
})
public class PurchaseOrder {

    @JsonProperty("info")
    private String info;
    @JsonProperty("data")
    private Data data;

	@JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("info")
    public String getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(String info) {
        this.info = info;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
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
   		return "PurchaseOrder [info=" + info + ", data=" + data + ", additionalProperties=" + additionalProperties
   				+ ", getInfo()=" + getInfo() + ", getData()=" + getData() + ", getAdditionalProperties()="
   				+ getAdditionalProperties() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
   				+ ", toString()=" + super.toString() + "]";
   	}

}
