package dominio;

public class Diretor extends Funcionario {
    private float bonificacao;

    public Diretor(String nome, float salario, float bonificacao) {
        super(nome, salario);
        this.bonificacao = bonificacao;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    public float calcularSalario(float bonificacao) {
        return super.getSalario() + bonificacao;
    }
}