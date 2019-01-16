package br.com.system.AppPedido.model;

public enum ItemHorario {
	MORNING("morning"),
	NIGHT("night");
 
    private String descricao;
 
    ItemHorario(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
