package br.com.system.AppPedido.model;

public enum ItemNight {
	STEAK("steak"),
    POTATO("potato"),
    WINE("wine"),
    CAKE
    ("cake");
 
    private String descricao;
 
    ItemNight(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
