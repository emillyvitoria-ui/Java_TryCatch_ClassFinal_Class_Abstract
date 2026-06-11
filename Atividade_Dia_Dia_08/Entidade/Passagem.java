package Atividade_Dia_Dia_08.Entidade;

public class  Passagem {


        private String nomePassageiro;
        private String numeroVoo;
        private double precoOriginal;

        public Passagem(String nomePassageiro, String numeroVoo, double precoOriginal) {
            this.nomePassageiro = nomePassageiro;
            this.numeroVoo = numeroVoo;
            this.precoOriginal = precoOriginal;
        }

        public String getNomePassageiro() {
            return nomePassageiro;
        }

        public void setNomePassageiro(String nomePassageiro) {
            this.nomePassageiro = nomePassageiro;
        }

        public String getNumeroVoo() {
            return numeroVoo;
        }

        public void setNumeroVoo(String numeroVoo) {
            this.numeroVoo = numeroVoo;
        }

        public double getPrecoOriginal() {
            return precoOriginal;
        }

        public void setPrecoOriginal(double precoOriginal) {
            this.precoOriginal = precoOriginal;
        }
    }
