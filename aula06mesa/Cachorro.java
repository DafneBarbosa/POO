package aula06mesa;

// objetivo :
// identifique e modele a classe envolvida na instrução especificando seus atributos, responsabilidades com pelo menos dois construtores no diagrama de classe.
// exercício 1:
// imagine uma instituição que adota cachorros, e para a adoção é obrigatório que os cachorros registrados em no sistema possuam informações como: está apto ou não para a adoção, raça, ano aproximado de nascimento, peso, possuem chip ou não, estejam feridos ou não e atribuído o primeiro nome para eles na instituição.
// precisaremos saber a idade do cachorro e validar se ele possui um chip para localização.
// um cachorro pode ser encaminhado para adoção se não estiver ferido e pesar mais de 5 kg.

import java.time.LocalDate;

public class Cachorro {
        private String nome;
        private String raca;
        private double peso;
        private int anoNascimento;
        private boolean possuiChip;
        private boolean estaFerido;
        private boolean aptoParaAdocao;
        private int idade;

        public Cachorro() {
        }

        public Cachorro(String nome, String raca, double peso, int anoNascimento, boolean possuiChip, boolean estaFerido) {
                this.nome = nome;
                this.raca = raca;
                this.peso = peso;
                this.anoNascimento = anoNascimento;
                this.possuiChip = possuiChip;
                this.estaFerido = estaFerido;
                idade = LocalDate.now().getYear() - anoNascimento;
                aptoParaAdocao = !estaFerido && peso > 5;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }
        public void setRaca(String raca) {
                this.raca = raca;
        }
        public void setPeso(double peso) {
                this.peso = peso;
        }
        public void setPossuiChip(boolean possuiChip) {
                this.possuiChip = possuiChip;
        }
        public void setEstaFerido(boolean estaFerido) {
                this.estaFerido = estaFerido;
        }
        public void setAptoParaAdocao(boolean aptoParaAdocao) {
                this.aptoParaAdocao = aptoParaAdocao;
        }

        public String getRaca() {
                return raca;
        }
        public double getPeso() {
                return peso;
        }
        public int getAnoNascimento() {
                return anoNascimento;
        }
        public boolean getPossuiChip() {
                return possuiChip;
        }
        public boolean getEstaFerido() {
                return estaFerido;
        }
        public boolean getAptoParaAdocao() {
                return aptoParaAdocao;
        }

        @Override
        public String toString() {
                return "Cachorro { " +
                        "nome='" + nome + '\'' +
                        ", raca='" + raca + '\'' +
                        ", peso=" + peso +
                        ", anoNascimento=" + anoNascimento +
                        ", possuiChip=" + possuiChip +
                        ", estaFerido=" + estaFerido +
                        ", aptoParaAdocao=" + aptoParaAdocao +
                        ", idade=" + idade +
                        " }";
        }
}
