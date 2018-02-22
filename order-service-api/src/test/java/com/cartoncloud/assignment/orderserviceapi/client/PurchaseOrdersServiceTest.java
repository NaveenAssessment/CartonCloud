package com.cartoncloud.assignment.orderserviceapi.client;


import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrder;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseOrdersServiceTest {
	
	@Autowired
	private PurchaseOrdersService service;
	
	@Test
	public void testGetOrderDetails( ) throws Exception {
		List<Integer> order = new ArrayList<>();
		order.add(2344);
		List<PurchaseOrder> result = service.getOrderDetails(order);
		System.out.println("---------------------------");
		System.out.println(result);
		assertNotNull(result);
	}

}
