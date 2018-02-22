package com.cartoncloud.assignment.orderserviceapi.client;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
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
	public void testGetOrderDetails( ) {
		PurchaseOrder result = service.getOrderDetails("2344");
		System.out.println("---------------------------");
		System.out.println(result);
		assertNotNull(result);
		assertEquals(result.getInfo(), "SUCCESS");
	}
	
	@Ignore
	@Test
	public void testInvalidGetOrderDetails( ) {
		PurchaseOrder result = service.getOrderDetails("999999");
		System.out.println("---------------------------");
		System.out.println(result);
	}

}
