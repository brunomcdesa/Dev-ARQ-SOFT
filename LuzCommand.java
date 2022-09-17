
public class LuzCommand implements Command {
	public Luz luz;
	
	public LuzCommand(Luz luz) {
		this.luz = luz;
	}

	@Override
	public void executar() {
		luz.On();
		
	}

	@Override
	public void desfazer() {
		luz.Off();
		
	}
	

}
