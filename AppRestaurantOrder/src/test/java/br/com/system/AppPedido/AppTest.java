package br.com.system.AppPedido;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.system.AppPedido.busines.Business;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testeEntrada() {
    	
    	Business business = new Business();
    	List<Integer> listaPratos = new ArrayList<>();
    	listaPratos.add(1);
    	listaPratos.add(2);
    	listaPratos.add(3);
    	listaPratos.add(4);
    	business.processaPedido(listaPratos);
    	
    	assertTrue(business.getPedido() != null);
    	
    }
    
    @Test
    public void testeDois() {
    	Business business = new Business();
    	String valorEntrada = "1,2,3,4";
    	List<Integer> listaPratos = business.validaEntrada(valorEntrada);
    	assertTrue(listaPratos != null);
    }
    
    @Test
    public void testeTres() {
    	Business business = new Business();
    	String valorEntrada = "1,2,3,4a";
    	List<Integer> listaPratos = business.validaEntrada(valorEntrada);
    	assertTrue(listaPratos != null);
    }
}
