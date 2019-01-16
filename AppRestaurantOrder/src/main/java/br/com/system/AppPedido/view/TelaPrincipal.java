package br.com.system.AppPedido.view;

import java.util.List;
import java.util.Scanner;

import br.com.system.AppPedido.busines.Business;
import br.com.system.AppPedido.model.ItemHorario;
import br.com.system.AppPedido.model.Prato;

public class TelaPrincipal {
		
	private Business business = new Business();
	private Scanner sc;
		
	public void start() {
		
		System.out.println("Bem vindo ao Restaut Order");
		System.out.println("Digite o valor solicitado e tecle ENTER");
		while (!business.getHorario().equals(ItemHorario.MORNING.getDescricao()) && !business.getHorario().equals(ItemHorario.NIGHT.getDescricao())) {
			System.out.print(" 1 - You must enter time of day as “morning” or “night”:");
			business.verificaHorario(entradaDados());
		}
		
		List<Integer> listaPratos = null;
		while (listaPratos == null) {
			System.out.print(" 2 - You must enter a comma delimited list of dish types with at least one selection");
			listaPratos = business.validaEntrada(entradaDados());
		}
		
		//Processa Pedidos
		business.processaPedido(listaPratos);
		
		imprimePedido();
	}
	
	/**
	 * Captura a valores do console.
	 */
	private String entradaDados() {
		String retorno = "";
		 sc = new Scanner(System.in);
		 retorno = sc.next();
		 return retorno;
	 }
	
	private void imprimePedido() {
		StringBuffer saida = new StringBuffer();
		saida.append("Output: \n");
		saida.append(business.getHorario());
		for (Prato prato : business.getPedido()) {
			saida.append("," + prato.getTipoPrato());			
		}	
		System.out.print(saida);
	}

}
