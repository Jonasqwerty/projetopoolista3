package model;

public class Funcionario {
	
	private String nome;
	private String setor;
	private long ramal;
	private int  matricula;
	private String cargo;
	private Endereco endereco;
	
	
	public Funcionario() {}
	
	public Funcionario(String nome, String setor, long ramal, int matricula, String cargo, Endereco enderecoFuncionario) {
		this.nome = nome;
		this.setor = setor;
		this.ramal = ramal;
		this.matricula = matricula;
		this.cargo = cargo;
		this.endereco = enderecoFuncionario;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public long getRamal() {
		return ramal;
	}


	public void setRamal(long ramal) {
		this.ramal = ramal;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}
