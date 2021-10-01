package dominio;

public class Vendedor extends Funcionario {
    private float comissao;

    public Vendedor(String nome, float salario, float comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float calcularSalario(float comissao) {
        return super.getSalario() + comissao;
    }
}