package com.rest;
//http://localhost:8080/Lab9/json/service/get
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/json/service")
public class JSONService{
	@GET
	@Path("/get")
	@Produces("application/json")
	public Product getApplication() {
		Product p=new Product();
		p.setName("nemo");
		p.setId(1);
		return p;
	}
	@POST
	@Path("/post")
	@Consumes("application/json")
	public void postApplication(Product p) {
		System.out.println(p.getName()+""+p.getId());
	}
}
