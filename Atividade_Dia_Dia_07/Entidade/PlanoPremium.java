package Atividade_Dia_Dia_07.Entidade;

public class PlanoPremium {
    private String qualidadeVideo="4K Ultra HD";
    private int limiteTelas = 4;
    public PlanoPremium(String nome, String email, String tipoPlano){
        super(nome,email,tipoPlano);

    }
    @Override
    public int precoBase() {
        return 50;
    }
    @Override
    public String Recibo() {
        return "Plano Premiun preço:" + precoBase() + " Qualidade: " +qualidadeVideo+ "disponibilidade de "+limiteTelas+" telas e assistir" ;
    }


}
