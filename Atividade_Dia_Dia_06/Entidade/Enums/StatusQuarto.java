package Atividade_Dia_Dia_06.Entidade.Enums;

public enum StatusQuarto {
    DISPONiVEL(" disponivel"),
    OCUPADO( "ocupado");
    private String descricao;

    StatusQuarto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
