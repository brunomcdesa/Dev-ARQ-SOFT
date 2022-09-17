
public class ControleRemoto {
	private Command[] onCommand;
	
	private static int slots = 4;
	
	
	public ControleRemoto() {
		this.onCommand = new Command[slots];
	} 
	
	
	public boolean addDevice(int slot, Command dispositivo) {
		if(this.onCommand[slot] == null) {
			this.onCommand[slot] = dispositivo;
			return true;
		}
		return false;
	}
	
	public void ligar(int slot) {
		if(this.onCommand != null) {
			this.onCommand[slot].executar();
		}
	};
	
	public void desligar(int slot) {
		if(this.onCommand != null) {
			this.onCommand[slot].desfazer();;
		}
	};
	
}
