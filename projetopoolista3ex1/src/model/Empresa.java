package model;

public class Empresa {
	
	private long telefone;
	private String email;
	private boolean matriz;
	private Endereco endereco;
	private Funcionario funcionario;
	private Cliente cliente;
	
	public Empresa() {}
	
	public Empresa(long telefone, String email, boolean matriz, Endereco endereco, Funcionario funcionario, Cliente cliente) {
		this.telefone = telefone;
		this.email = email;
		this.matriz = matriz;
		this.endereco = endereco;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isMatriz() {
		return matriz;
	}

	public void setMatriz(boolean matriz) {
		this.matriz = matriz;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
