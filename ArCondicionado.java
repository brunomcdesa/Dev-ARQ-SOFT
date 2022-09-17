
public class ArCondicionado {
	double temperatura;
	String modo;
	double velocidade;
	String Swing;
	
	public ArCondicionado(double temperatura, String modo, double velocidade, String swing) {
		this.temperatura = temperatura;
		this.modo = modo;
		this.velocidade = velocidade;
		this.Swing = swing;
	}
	
	public void setTemperatura() {
		System.out.println("A temperatura atual é de " + this.temperatura + " ºC");
	} 
	public void setModo() {
		System.out.println("Modo atual é " + this.modo);
	}
	public void setVelocidade() {
		System.out.println("A velocidade está em " + this.velocidade);
	}
	public void setSwing() {
		System.out.println("A rotação está em " + this.Swing);
	}
	public void DesligaAr () {
		System.out.println("O Ar condicionado está Desligado!");
	}
	
}
