package Testes;

import org.junit.Assert;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Teste1 {
	
	
	@Test
	public void main ()
	{
		System.out.println("Recebi o parâmetro: " + System.getProperty("parametro1"));
		Assert.assertTrue(System.getProperty("parametro1").equals("123454321"));
		System.out.println("Valor boolean: " + Boolean.getBoolean("paramBool"));
		Assert.assertTrue(Boolean.getBoolean("paramBool"));
		
		
		RestAssured.baseURI= "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(payload.AddPlace()).when().post("maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response();
	}
}
