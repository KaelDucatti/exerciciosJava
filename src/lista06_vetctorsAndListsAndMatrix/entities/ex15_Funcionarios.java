package lista06_vetctorsAndListsAndMatrix.entities;

public class ex15_Funcionarios {
        private Integer id;
        private String nome;
        private Double salario;

        public ex15_Funcionarios(Integer id, String nome, Double salario) {
            this.id = id;
            this.nome = nome;
            this.salario = salario;
        }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void salarioIncremento(double porcentagem) {
            this.salario += salario * (porcentagem/100);
    }

    public String toString() {
            return id +
                    ", "
                    + nome
                    + ", "
                    + String.format("%.2f", salario);
    }
}
