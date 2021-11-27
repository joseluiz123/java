package dominio;
public class Circulo implements Poligono {
	private float raio;
	public Circulo(float raio) {
		this.raio = raio;
	}
	public float getRaio() {
		return raio;
	}
	public void setRaio(float raio) {
		this.raio = raio;
	}
	public float calcularArea() {
		return (float)Math.PI * (float)Math.pow(raio, 2);
	}
}