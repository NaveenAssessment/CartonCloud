package com.cartoncloud.assignment.orderserviceapi.service;

import java.util.List;

import com.cartoncloud.assignment.orderserviceapi.model.ProductGroupTotal;

/**
 * @author naveen
 *
 */
public interface OrderTotalService {

	public List<ProductGroupTotal> calculateOrderTotal(List<Integer> orderIds);
	
}
