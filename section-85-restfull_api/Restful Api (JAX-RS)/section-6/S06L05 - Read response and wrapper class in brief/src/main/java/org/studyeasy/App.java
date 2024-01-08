package org.studyeasy;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.studyeasy.model.Brand;




public class App {

	static Client client = ClientBuilder.newClient();
	static WebTarget baseBrandURL = client
			.target("http://localhost:8080/restapp/showroom/brands");
	static WebTarget brandURL = baseBrandURL.path("{brandId}");

	public static void main(String[] args) {

		Brand[] response = baseBrandURL.request(MediaType.APPLICATION_JSON)
				.get(Brand[].class);
		
		for(Brand brand: response) {
			System.out.println(brand);
		}
		
		
	}

}
