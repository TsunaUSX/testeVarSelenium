package Testes;

import org.junit.Assert;
import org.junit.Test;

public class Teste1 {
	
	
	@Test
	public void main ()
	{
		System.out.println("Recebi o parâmetro: " + System.getProperty("parametro1"));
		Assert.assertTrue(System.getProperty("parametro1").equals("123454321"));
		System.out.println("Valor boolean: " + Boolean.getBoolean("paramBool"));
		Assert.assertTrue(Boolean.getBoolean("paramBool"));
	}
}
