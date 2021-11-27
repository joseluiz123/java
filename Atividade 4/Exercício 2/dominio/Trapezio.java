package dominio;
public class Trapezio implements Poligono {
	private float baseMenor, baseMaior, altura;
	public Trapezio(float baseMenor, float baseMaior, float altura) {
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.altura = altura;
	}
	public float getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(float baseMenor) {
		this.baseMenor = baseMenor;
	}
	public float getBaseMaior() {
		return baseMaior;
	}
	public void setBaseMaior(float baseMaior) {
		this.baseMaior = baseMaior;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float calcularArea() {
		return ((baseMaior + baseMenor) * altura)/2;
	}
}