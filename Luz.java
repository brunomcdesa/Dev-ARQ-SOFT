
public class Luz {
	String nome;

	public Luz(String nome) {
		this.nome = nome;
	}
	
	public void On() {
		System.out.println("A luz " + this.nome + " est� ligada!");
	}
	
	public void Off() {
		System.out.println("A luz " + this.nome + " est� desligada!");
	}

}
