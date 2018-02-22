
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
    "product_id",
    "product_unit_of_measure_category_id",
    "product_unit_of_measure_id",
    "date_created",
    "last_modified",
    "description",
    "ProductPackagingProductUnitOfMeasure"
})
public class ProductPackaging {

    @JsonProperty("id")
    private String id;
    @JsonProperty("customer_id")
    private String customerId;
    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("product_unit_of_measure_category_id")
    private String productUnitOfMeasureCategoryId;
    @JsonProperty("product_unit_of_measure_id")
    private String productUnitOfMeasureId;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("description")
    private String description;
    @JsonProperty("ProductPackagingProductUnitOfMeasure")
    private List<ProductPackagingProductUnitOfMeasure> productPackagingProductUnitOfMeasure = null;
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

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("product_unit_of_measure_category_id")
    public String getProductUnitOfMeasureCategoryId() {
        return productUnitOfMeasureCategoryId;
    }

    @JsonProperty("product_unit_of_measure_category_id")
    public void setProductUnitOfMeasureCategoryId(String productUnitOfMeasureCategoryId) {
        this.productUnitOfMeasureCategoryId = productUnitOfMeasureCategoryId;
    }

    @JsonProperty("product_unit_of_measure_id")
    public String getProductUnitOfMeasureId() {
        return productUnitOfMeasureId;
    }

    @JsonProperty("product_unit_of_measure_id")
    public void setProductUnitOfMeasureId(String productUnitOfMeasureId) {
        this.productUnitOfMeasureId = productUnitOfMeasureId;
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

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("ProductPackagingProductUnitOfMeasure")
    public List<ProductPackagingProductUnitOfMeasure> getProductPackagingProductUnitOfMeasure() {
        return productPackagingProductUnitOfMeasure;
    }

    @JsonProperty("ProductPackagingProductUnitOfMeasure")
    public void setProductPackagingProductUnitOfMeasure(List<ProductPackagingProductUnitOfMeasure> productPackagingProductUnitOfMeasure) {
        this.productPackagingProductUnitOfMeasure = productPackagingProductUnitOfMeasure;
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
