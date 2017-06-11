package com.lara.rest;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class Client_Rest 
{
	static final String REST_URI = "http://localhost:9999/Restservices_JSON";
	static final String CUSTOMER = "/customers/cust_json/";
	static final String CUSTOMER_XML = "/customers/cust_xml/";
	
	public static void main(String[] args)
	{
		int num=200;
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(REST_URI);
		
		WebResource addService = service.path("rest").path(CUSTOMER+num); 
		System.out.println("Response :" + getResponseJson(addService));
		System.out.println("output as JSON :" + getOutputAsJson(addService));
		System.out.println("_____________________________________");
		WebResource addServiceXml = service.path("rest").path(CUSTOMER+num);
		System.out.println("Response XML:"+ getResponseXml(addServiceXml));
		System.out.println("Output as XML:"+getOutputAsXml(addServiceXml));
	}
	private static String getResponseJson(WebResource service)
	{
		return service.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).toString();
	}
	private static String getOutputAsJson(WebResource service)
	{
		return service.accept(MediaType.APPLICATION_JSON).get(String.class);
	}
	private static String getResponseXml(WebResource service)
	{
		return service.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class).toString();
	}
	private static String getOutputAsXml(WebResource service)
	{
		return service.accept(MediaType.APPLICATION_JSON).get(String.class);
	}
}
