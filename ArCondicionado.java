
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
		System.out.println("A temperatura atual � de " + this.temperatura + " �C");
	} 
	public void setModo() {
		System.out.println("Modo atual � " + this.modo);
	}
	public void setVelocidade() {
		System.out.println("A velocidade est� em " + this.velocidade);
	}
	public void setSwing() {
		System.out.println("A rota��o est� em " + this.Swing);
	}
	public void DesligaAr () {
		System.out.println("O Ar condicionado est� Desligado!");
	}
	
}
