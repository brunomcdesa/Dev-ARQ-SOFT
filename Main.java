
public class Main {
	public static void main(String[]args) {
		
		Luz luzCozinha = new Luz("Cozinha");
		LuzCommand commandLuzCozinha = new LuzCommand(luzCozinha);
		ArCommand commandAR = new ArCommand(new ArCondicionado(24.0, "Exaustão", 30.0, "rapida"));
		
		ControleRemoto controle = new ControleRemoto();
		
		
		controle.addDevice(0, commandAR);
		controle.ligar(0);
		controle.addDevice(1, commandLuzCozinha);
		controle.ligar(1);
		controle.desligar(0);
		controle.desligar(1);
		
		
		
		
	}
}
