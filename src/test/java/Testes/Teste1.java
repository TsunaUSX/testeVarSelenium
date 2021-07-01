package Testes;

import org.junit.Assert;
import org.junit.Test;

public class Teste1 {
	
	
	@Test
	public void main ()
	{
		System.out.println(System.getProperty("Dparametro1"));
		Assert.assertEquals("123454321", System.getProperty("Dparametro1"));
	}
}
