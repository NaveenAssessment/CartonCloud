package com.cartoncloud.assignment.orderserviceapi.service;

import java.util.List;

import com.cartoncloud.assignment.orderserviceapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrder;

/**
 * @author naveen
 *
 */
public interface OrderTotalService {

	public List<ProductGroupTotal> calculateOrderTotal(List<PurchaseOrder> orderList);

}
