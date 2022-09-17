
public class ArCommand implements Command {
	public ArCondicionado ar;
	
	public ArCommand(ArCondicionado arcond) {
		this.ar = arcond;
	}

	@Override
	public void executar() {
		ar.setModo();
		ar.setSwing();
		ar.setTemperatura();
		ar.setVelocidade();

	}

	@Override
	public void desfazer() {
		ar.DesligaAr();
		
	}
}
