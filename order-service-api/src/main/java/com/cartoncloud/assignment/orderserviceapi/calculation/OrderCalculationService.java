package com.cartoncloud.assignment.orderserviceapi.calculation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cartoncloud.assignment.orderserviceapi.common.ProductType;
import com.cartoncloud.assignment.orderserviceapi.model.Product;
import com.cartoncloud.assignment.orderserviceapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrder;
import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrderProduct;

/**
 * naveen
 */
@Component
public class OrderCalculationService {

  public List<ProductGroupTotal> calculateProductTotal(List<PurchaseOrder> orderLists) {
    Map<Integer, BigDecimal> productGroupTotal = new HashMap<>();
   // Multimap<Integer, BigDecimal> multimap = ArrayListMultimap.create();
    for (PurchaseOrder order : orderLists) {
      List<PurchaseOrderProduct> poProductLst = order.getData().getPurchaseOrderProduct();
      for (PurchaseOrderProduct product : poProductLst) {
        BigDecimal productTotal = performFormulaBasedCalculation(product);
        Integer productId = Integer.parseInt(product.getProductTypeId());
        if (productGroupTotal.containsKey(productId)) {
          productGroupTotal.put(productId, productGroupTotal.get(productId).add(productTotal));
        }
        else {
          productGroupTotal.put(productId, productTotal);
        }

        //    multimap.put(new Integer(product.getProductTypeId()),performFormulaBasedCalculation(product));
      }
    }

    List<ProductGroupTotal> productGroupTotalLst = new ArrayList<>();
  
    	for (Map.Entry<Integer, BigDecimal> entry : productGroupTotal.entrySet()) {
    	    productGroupTotalLst.add(new ProductGroupTotal(entry.getKey(), entry.getValue()));
    	}
//    return getProductGroupTotal(multimap);
    return productGroupTotalLst;
  }

  /* private Map<Integer, BigDecimal> getProductGroupTotal(Multimap<Integer, BigDecimal> multimap) {
    Map<Integer, BigDecimal> productGroupTotal = new HashMap<>();
    for (Integer key : multimap.keySet()) {
      if (productGroupTotal.containsKey(key)) {
        productGroupTotal.put(key, productGroupTotal.get(key).add((BigDecimal) multimap.get(key)));
      }
      else {
        productGroupTotal.put(key, (BigDecimal) multimap.get(key));
      }
    }
    return productGroupTotal;
  }
  */


  private BigDecimal performFormulaBasedCalculation(PurchaseOrderProduct poProduct) {
    BigDecimal orderTotal = BigDecimal.ZERO;
    if (ProductType.TYPE1.getId().equals(poProduct.getProductTypeId())) {
      //by weight
      orderTotal = getUnitQuanity(poProduct).multiply(getProductWeight(poProduct.getProduct()));

    }
    else if (ProductType.TYPE2.getId().equals(poProduct.getProductTypeId())) {
      //By volume
      orderTotal = getUnitQuanity(poProduct).multiply(getProductVolume(poProduct.getProduct()));
    }
    return orderTotal;
  }

  public BigDecimal getProductWeight(Product product) {
    return new BigDecimal(product.getWeight());
  }

  public BigDecimal getProductVolume(Product product) {
    return new BigDecimal(product.getVolume());
  }

  public BigDecimal getUnitQuanity(PurchaseOrderProduct poProduct) {
    return new BigDecimal(poProduct.getUnitQuantityInitial());
  }
}

