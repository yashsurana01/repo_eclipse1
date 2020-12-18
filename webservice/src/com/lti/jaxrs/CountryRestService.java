package com.lti.jaxrs;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lti.beans.Country;
import com.lti.services.CountryService;


@Path("/countries")
public class CountryRestService {
	
	
	CountryService cs=new CountryService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getCountries()
	{
		return cs.getAllCountries();
	}
	
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id") int id)
	{
		return cs.getCountry(id);
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Country addCountry(Country c)
	{
		return cs.addCountry(c);
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCountry(@PathParam("id") int id)
	{
		cs.deleteCountry(id);
	}
	
}
