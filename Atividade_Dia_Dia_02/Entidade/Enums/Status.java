package Atividade_Dia_Dia_02.Entidade.Enums;

public enum Status {
    INFORMACOES_ADICIONADAS("Informações adicionadas"),
    ITEM_ADICIONADO("Item adicionado"),
    COMPRA_REALIZADA_COM_SUCESSO("Compra realizada com sucesso");

    private String descricao;
    Status (String descricao){
        this.descricao=descricao;
    }
    public String getDescricao() {
        return descricao;
    }

}
