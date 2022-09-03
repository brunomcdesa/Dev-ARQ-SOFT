
public class ClientePF {
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	private String nascimento;
	
	public ClientePF() {}
	public ClientePF(String cpf) {
		this.cpf = cpf;
	}
	public ClientePF(String nome, String email, String telefone, String cpf, String nascimento) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n"
			+ "Email: " + this.email + "\n"
			+ "CPF: " + this.cpf + "\n"
			+ "Telefone: " + this.telefone + "\n"
			+ "Nascimento: " + this.nascimento + "\n" ;
	}

}
