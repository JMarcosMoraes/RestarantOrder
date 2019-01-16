package br.com.system.AppPedido.model;

public class Prato {

	private Integer idPrato;
	private String tipoPrato;
	private String horario;
	private int qtd;
	
	public Integer getIdPrato() {
		return idPrato;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setIdPrato(Integer idPrato) {
		this.idPrato = idPrato;
	}
	public String getTipoPrato() {
		return tipoPrato;
	}
	public void setTipoPrato(String tipoPrato) {
		this.tipoPrato = tipoPrato;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
		
}
