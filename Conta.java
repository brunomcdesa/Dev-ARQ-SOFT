public class Conta extends ClientePF {
	private String tipo;
	private String agencia;
    private String numero;
   
    public Conta() {
    	
    }
    public Conta(String cpf, String tipo,String agencia, String CPF, String Numero) {
    	super(cpf);
    	this.tipo = tipo;
    	this.agencia = agencia;
    	this.numero = Numero;
    }
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
    
}
