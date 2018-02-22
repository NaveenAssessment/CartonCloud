package com.cartoncloud.assignment.orderserviceapi.client;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cartoncloud.assignment.orderserviceapi.model.PurchaseOrder;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author naveen PurchaseOrder service rest client
 *
 */
@Service
public class PurchaseOrdersService {

	@Autowired
	private RestTemplate restTemplate;

	public PurchaseOrder getOrderDetails(String id) {
		String url = "https://api.cartoncloud.com.au/CartonCloud_Demo/PurchaseOrders/{id}";

		// URI (URL) parameters
		Map<String, String> uriParams = new HashMap<String, String>();
		uriParams.put("id", id);

		// Query parameters
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url)
				// Add query parameter
				.queryParam("version", "5").queryParam("associated", "true");
		String uri = builder.buildAndExpand(uriParams).toUri().toString();

		HttpHeaders headers = setHeaders();
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		System.out.println(uri);
		restTemplate.getInterceptors()
				.add(new BasicAuthorizationInterceptor("interview-test@cartoncloud.com.au", "test123456"));
		
		ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		PurchaseOrder purchaseOrder = null;

		try {
			// Convert JSON string to Object
			purchaseOrder = mapper.readValue(result.getBody(), PurchaseOrder.class);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return purchaseOrder;
	}

	private HttpHeaders setHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}

}
