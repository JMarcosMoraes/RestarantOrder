package br.com.system.AppPedido.busines;

import java.util.ArrayList;
import java.util.List;

import br.com.system.AppPedido.model.ItemHorario;
import br.com.system.AppPedido.model.ItemMorning;
import br.com.system.AppPedido.model.ItemNight;
import br.com.system.AppPedido.model.Prato;

public class Business {

	private List<Prato> pedido = new ArrayList<>();
	private String horario = "";

	/**
	 * Analisar se valor é igual a morning ou night 
	 * 1 para morning 
	 * 2 para night 
	 * 0 para error
	 */
	public void verificaHorario(String valor) {
		if (valor.equals(ItemHorario.MORNING.getDescricao())) {
			setHorario(valor);
		}else if (valor.equals(ItemHorario.NIGHT.getDescricao())) {
			setHorario(valor);
		}
	}

	/**
	 * Realiza a validação da entrada esperando valores inteiros.
	 * 
	 * @param valorEntrada String
	 * @return List<Integer>
	 */
	public List<Integer> validaEntrada(String valorEntrada) {
		List<Integer> listaPratos = new ArrayList<>();
		try {
			String[] itens = valorEntrada.split(",");
			for (String item : itens) {
				Integer prato = Integer.parseInt(item);
				listaPratos.add(prato);
			}
		} catch (Exception ex) {
			System.out.println("Erro no valor de entrada: " + ex.getMessage());
		}
		return listaPratos;
	}
	
	public List<Prato> processaPedido(List<Integer> pratos){
		
		for (Integer tipoPrato : pratos) {
			Prato prato = new Prato();
			prato.setTipoPrato(converteTipoPrato(tipoPrato, this.getHorario()));
			pedido.add(prato);
		}
		
		return pedido;
	}

	private String converteTipoPrato(Integer valor, String horario) {
		if(ItemHorario.MORNING.getDescricao().equals(horario)) {
			if (valor == 1) {
				return ItemMorning.EGGS.getDescricao();
			}
			if (valor == 2) {
				return ItemMorning.TOAST.getDescricao();
			}
			if (valor == 3) {
				return ItemMorning.COFEE.getDescricao();
			}
		}
		if(ItemHorario.NIGHT.getDescricao().equals(horario)) {
			if (valor == 1) {
				return ItemNight.STEAK.getDescricao();
			}
			if (valor == 2) {
				return ItemNight.POTATO.getDescricao();
			}
			if (valor == 3) {
				return ItemNight.WINE.getDescricao();
			}
			if (valor == 4) {
				return ItemNight.CAKE.getDescricao();
			}
		}
		return "error";
	}
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public List<Prato> getPedido() {
		return pedido;
	}

	public void setPedido(List<Prato> pedido) {
		this.pedido = pedido;
	}
}
