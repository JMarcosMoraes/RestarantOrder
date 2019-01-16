package br.com.system.AppPedido;

import br.com.system.AppPedido.view.TelaPrincipal;

/**
 * Restaurant Order APP
 * 
 * Classe Principal
 * @author jose marcos vilas boas
 */
public class App {
	
	private static TelaPrincipal telaPrincipal;
	
	public static void main( String[] args ){
      start();
    }
    
    private static void start() {
    	telaPrincipal = new TelaPrincipal();
    	telaPrincipal.start();
    }
}
