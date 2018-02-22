package com.cartoncloud.assignment.orderserviceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cartoncloud.assignment.orderserviceapi.calculation.OrderCalculationService;
import com.cartoncloud.assignment.orderserviceapi.client.PurchaseOrdersService;
import com.cartoncloud.assignment.orderserviceapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrder;

/**
 * @author naveen
 *
 */
@Service
public class OrderTotalServiceImpl implements OrderTotalService {

	@Autowired
	private OrderCalculationService orderCalculationService;

	@Autowired
	private PurchaseOrdersService purchaseOrdersService;

	@Override
	public List<ProductGroupTotal> calculateOrderTotal(List<Integer> orderIds) {

		List<PurchaseOrder> orderLists = purchaseOrdersService.getOrderDetails(orderIds);

		return orderCalculationService.calculateProductTotal(orderLists);
	}

}
