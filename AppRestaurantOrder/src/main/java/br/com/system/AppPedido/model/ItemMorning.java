package br.com.system.AppPedido.model;

public enum ItemMorning {
	EGGS("eggs"),
    TOAST("Toast"),
    COFEE("coffee");
 
    private String descricao;
 
    ItemMorning(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
