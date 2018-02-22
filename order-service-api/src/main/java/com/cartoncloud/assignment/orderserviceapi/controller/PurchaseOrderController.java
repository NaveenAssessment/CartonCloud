/**
 * 
 */
package com.cartoncloud.assignment.orderserviceapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartoncloud.assignment.orderserviceapi.client.PurchaseOrdersService;
import com.cartoncloud.assignment.orderserviceapi.model.ProductGroupTotal;
import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrder;
import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrderRequest;
import com.cartoncloud.assignment.orderserviceapi.service.OrderTotalService;

import io.swagger.annotations.ApiParam;

/**
 * @author naveen
 *
 */
@RestController
public class PurchaseOrderController {
	
	@Autowired
	private PurchaseOrdersService purchaseOrdersService;
	
	@Autowired
	private OrderTotalService orderTotalService;
	
	@RequestMapping(
			value= "/test",
	        produces = { "application/json;charset=UTF-8" }, 
	        consumes = { "application/json" },
	        method = RequestMethod.POST)
	public ResponseEntity <List<ProductGroupTotal>> calculateOrderTotal(
		@RequestBody PurchaseOrderRequest request) {
		
	    List<Integer> orderIds = request.getPurchaseOrderIds();
	    List<PurchaseOrder> orderList = new ArrayList<>();
		for (Integer orderId:orderIds){
			orderList.add(purchaseOrdersService.getOrderDetails(orderId.toString()));
        }
		
		List<ProductGroupTotal> orderGroupTotal = orderTotalService.calculateOrderTotal(orderList);
		return new ResponseEntity<List<ProductGroupTotal>>(orderGroupTotal, HttpStatus.OK);
	}

}
