package com.lti.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.lti.beans.Country;

public class CountryService {

 static HashMap<Integer,Country> hm;

public CountryService()
{
	if(hm==null)
	{
		hm=new HashMap<Integer,Country>();
		
		Country c1=new Country(1,"India");
		Country c2=new Country(2,"USA");
		Country c3=new Country(3,"France");
		Country c4=new Country(4,"Cuba");
		
		hm.put(1,c1);
		hm.put(2,c2);
		hm.put(3,c3);
		hm.put(4,c4);
	}

}
	

public List getAllCountries()
{
	List countries=new ArrayList(hm.values());
	return countries;
}

public Country getCountry(int id)
{
	Country c=hm.get(id);
		
	return c;
}

public Country addCountry(Country c)
{
	c.setId(hm.size()+1);
	hm.put(c.getId(),c);
	return c;
}

public void deleteCountry(int id)
{
	hm.remove(id);
}

public static HashMap<Integer,Country> getCountryId()
{
	return hm;
}

}
