package com.lara.rest;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/customers")
public class JsonFromRestful 
{
	
	@GET
	@Path("cust_json/{cusNo}")
	@Produces({MediaType.APPLICATION_JSON})
	public Customer produceCustomerDetailsinJSON(@PathParam("cusNo") int no)
	{
		Customer cust = new Customer();
		cust.setCustNo(no);
		cust.setCustName("username");
		cust.setCustPassword("password");
		cust.setCustFirstName("firstname");
		cust.setCustLastName("lastname");
		cust.setCustAddress("address");
		cust.setCustEmailId("emailid");
		cust.setCustMobileNo("mobileno");
		cust.setCustCountry("india");
		return cust;
	}
	
	@GET
	@Path("cust_xml/{cusNo}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer produceCustomerDetailsinXml(@PathParam("cusNo") int no)
	{
		Customer cust = new Customer();
		cust.setCustNo(no);
		cust.setCustName("username");
		cust.setCustPassword("password");
		cust.setCustFirstName("firstname");
		cust.setCustLastName("lastname");
		cust.setCustAddress("address");
		cust.setCustEmailId("emailid");
		cust.setCustMobileNo("mobileno");
		cust.setCustCountry("india");
		return cust;
	}
}
