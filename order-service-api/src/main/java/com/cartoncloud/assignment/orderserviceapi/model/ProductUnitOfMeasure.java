
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
    "code",
    "product_unit_of_measure_category_id",
    "oversize_warning",
    "locked",
    "custom_field_id",
    "fullname"
})
public class ProductUnitOfMeasure {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("product_unit_of_measure_category_id")
    private String productUnitOfMeasureCategoryId;
    @JsonProperty("oversize_warning")
    private String oversizeWarning;
    @JsonProperty("locked")
    private String locked;
    @JsonProperty("custom_field_id")
    private String customFieldId;
    @JsonProperty("fullname")
    private String fullname;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("product_unit_of_measure_category_id")
    public String getProductUnitOfMeasureCategoryId() {
        return productUnitOfMeasureCategoryId;
    }

    @JsonProperty("product_unit_of_measure_category_id")
    public void setProductUnitOfMeasureCategoryId(String productUnitOfMeasureCategoryId) {
        this.productUnitOfMeasureCategoryId = productUnitOfMeasureCategoryId;
    }

    @JsonProperty("oversize_warning")
    public String getOversizeWarning() {
        return oversizeWarning;
    }

    @JsonProperty("oversize_warning")
    public void setOversizeWarning(String oversizeWarning) {
        this.oversizeWarning = oversizeWarning;
    }

    @JsonProperty("locked")
    public String getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(String locked) {
        this.locked = locked;
    }

    @JsonProperty("custom_field_id")
    public String getCustomFieldId() {
        return customFieldId;
    }

    @JsonProperty("custom_field_id")
    public void setCustomFieldId(String customFieldId) {
        this.customFieldId = customFieldId;
    }

    @JsonProperty("fullname")
    public String getFullname() {
        return fullname;
    }

    @JsonProperty("fullname")
    public void setFullname(String fullname) {
        this.fullname = fullname;
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
