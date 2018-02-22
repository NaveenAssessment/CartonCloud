package com.cartoncloud.assignment.orderserviceapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.math.BigDecimal;

/**
 * naveen
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_type_id",
    "total"
})
public class ProductGroupTotal {
  @JsonProperty("product_type_id")
  private Integer product_type_id;

  @JsonProperty("total")
  private BigDecimal total;

  public ProductGroupTotal() {
  }

  public ProductGroupTotal(Integer product_type_id, BigDecimal total) {
    this.product_type_id = product_type_id;
    this.total = total;
  }

  @JsonProperty("product_type_id")
  public Integer getProduct_type_id() {

    return product_type_id;
  }
  @JsonProperty("product_type_id")
  public void setProduct_type_id(Integer product_type_id) {
    this.product_type_id = product_type_id;
  }
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }
  @JsonProperty("total")
  public void setTotal(BigDecimal total) {
    this.total = total;
  }
}
