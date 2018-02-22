
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
    "product_packaging_id",
    "product_unit_of_measure_category_id",
    "product_unit_of_measure_id",
    "code",
    "image_filename",
    "base_per_this",
    "this_per_base",
    "net_weight",
    "gross_weight",
    "length",
    "width",
    "height",
    "is_base",
    "description",
    "barcode",
    "date_created",
    "last_modified",
    "ProductUnitOfMeasure"
})
public class ProductPackagingProductUnitOfMeasure {

    @JsonProperty("id")
    private String id;
    @JsonProperty("product_packaging_id")
    private String productPackagingId;
    @JsonProperty("product_unit_of_measure_category_id")
    private String productUnitOfMeasureCategoryId;
    @JsonProperty("product_unit_of_measure_id")
    private String productUnitOfMeasureId;
    @JsonProperty("code")
    private String code;
    @JsonProperty("image_filename")
    private Object imageFilename;
    @JsonProperty("base_per_this")
    private String basePerThis;
    @JsonProperty("this_per_base")
    private String thisPerBase;
    @JsonProperty("net_weight")
    private Object netWeight;
    @JsonProperty("gross_weight")
    private Object grossWeight;
    @JsonProperty("length")
    private Object length;
    @JsonProperty("width")
    private Object width;
    @JsonProperty("height")
    private Object height;
    @JsonProperty("is_base")
    private boolean isBase;
    @JsonProperty("description")
    private String description;
    @JsonProperty("barcode")
    private Object barcode;
    @JsonProperty("date_created")
    private String dateCreated;
    @JsonProperty("last_modified")
    private String lastModified;
    @JsonProperty("ProductUnitOfMeasure")
    private ProductUnitOfMeasure productUnitOfMeasure;
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

    @JsonProperty("product_packaging_id")
    public String getProductPackagingId() {
        return productPackagingId;
    }

    @JsonProperty("product_packaging_id")
    public void setProductPackagingId(String productPackagingId) {
        this.productPackagingId = productPackagingId;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("image_filename")
    public Object getImageFilename() {
        return imageFilename;
    }

    @JsonProperty("image_filename")
    public void setImageFilename(Object imageFilename) {
        this.imageFilename = imageFilename;
    }

    @JsonProperty("base_per_this")
    public String getBasePerThis() {
        return basePerThis;
    }

    @JsonProperty("base_per_this")
    public void setBasePerThis(String basePerThis) {
        this.basePerThis = basePerThis;
    }

    @JsonProperty("this_per_base")
    public String getThisPerBase() {
        return thisPerBase;
    }

    @JsonProperty("this_per_base")
    public void setThisPerBase(String thisPerBase) {
        this.thisPerBase = thisPerBase;
    }

    @JsonProperty("net_weight")
    public Object getNetWeight() {
        return netWeight;
    }

    @JsonProperty("net_weight")
    public void setNetWeight(Object netWeight) {
        this.netWeight = netWeight;
    }

    @JsonProperty("gross_weight")
    public Object getGrossWeight() {
        return grossWeight;
    }

    @JsonProperty("gross_weight")
    public void setGrossWeight(Object grossWeight) {
        this.grossWeight = grossWeight;
    }

    @JsonProperty("length")
    public Object getLength() {
        return length;
    }

    @JsonProperty("length")
    public void setLength(Object length) {
        this.length = length;
    }

    @JsonProperty("width")
    public Object getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Object width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Object getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Object height) {
        this.height = height;
    }

    @JsonProperty("is_base")
    public boolean isIsBase() {
        return isBase;
    }

    @JsonProperty("is_base")
    public void setIsBase(boolean isBase) {
        this.isBase = isBase;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("barcode")
    public Object getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(Object barcode) {
        this.barcode = barcode;
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

    @JsonProperty("ProductUnitOfMeasure")
    public ProductUnitOfMeasure getProductUnitOfMeasure() {
        return productUnitOfMeasure;
    }

    @JsonProperty("ProductUnitOfMeasure")
    public void setProductUnitOfMeasure(ProductUnitOfMeasure productUnitOfMeasure) {
        this.productUnitOfMeasure = productUnitOfMeasure;
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
