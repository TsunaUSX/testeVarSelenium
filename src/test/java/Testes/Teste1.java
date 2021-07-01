package Testes;

import org.junit.Assert;
import org.junit.Test;

public class Teste1 {
	
	
	@Test
	public void main ()
	{
		System.out.println(System.getProperty("parametro1"));
		Assert.assertEquals("123454321", System.getProperty("parametro1"));
	}
}
