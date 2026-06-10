package Atividade_Dia_Dia_03.Entidade.Enums;

public enum Status {
    IMFORMACOES_ADICIONADAS("Informações adicionadas"),
    VERIFICANDO_HORARIO_DISPONIVEL("Verificando horário disponível"),
    COMSULTA_CONFIRMADA("Consulta confirmada"),
    ATENDIMENTO_ENCERRADO("Atendimento encerrado");
    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

}
