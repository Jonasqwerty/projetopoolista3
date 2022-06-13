package classeExecutavel;

import javax.swing.JOptionPane;

import model.Cliente;
import model.Empresa;
import model.Endereco;
import model.Funcionario;

public class classeExecutavel {
	
	public static void main(String[] args) {
		
		Endereco enderecoCliente = new Endereco();
		enderecoCliente.setNomeRua("Rua das Cocotinhas");
		enderecoCliente.setNumero(456);
		enderecoCliente.setBairro("Bairro da Quebrada");
		enderecoCliente.setCidade("Bagé");
		enderecoCliente.setUf('r');
		enderecoCliente.setComplemento("Próximo ao Campo");
		enderecoCliente.setCep(98234);
		
		Cliente cliente = new Cliente("Aphonso Davies",923488932,999887,enderecoCliente);
		
		Endereco enderecoFuncionario = new Endereco();
		enderecoFuncionario.setNomeRua("Rua das tia");
		enderecoFuncionario.setNumero(456);
		enderecoFuncionario.setBairro("Tricolor");
		enderecoFuncionario.setCidade("Bagé");
		enderecoFuncionario.setUf('r');
		enderecoFuncionario.setComplemento("Próximo ao Campo");
		enderecoFuncionario.setCep(98234);
			
		Funcionario funcionario = new Funcionario("Alexandre Pato","Atendimento",123,1,"Atendente",enderecoFuncionario);
		
		Endereco enderecoEmpresa = new Endereco();
		enderecoEmpresa.setNomeRua("Rua São José");
		enderecoEmpresa.setNumero(634);
		enderecoEmpresa.setBairro("Bairro Alvinegro");
		enderecoEmpresa.setCidade("Bagé");
		enderecoEmpresa.setUf('r');
		enderecoEmpresa.setComplemento("Bem Longe");
		enderecoEmpresa.setCep(7854);
		
		Empresa empresa = new Empresa(9998877,"empresa@mail.com",true,enderecoEmpresa,funcionario,cliente);	
		
		System.out.println("-------Empresa------- ");
		System.out.println("Telefone: "+empresa.getTelefone());
		System.out.println("Email: "+empresa.getEmail());
		System.out.println("Matriz: "+empresa.isMatriz());
		System.out.println("Endereço: "+empresa.getEndereco().getNomeRua()+", Número "+empresa.getEndereco().getNumero()+", "+empresa.getEndereco().getBairro()+", Complemento: "+empresa.getEndereco().getComplemento()+", Cidade: "+empresa.getEndereco().getCidade()+", CEP: "+empresa.getEndereco().getCep()+".");
		System.out.println("\n-----Funcionário-----");
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Setor: "+funcionario.getSetor());
		System.out.println("Ramal: "+funcionario.getRamal());
		System.out.println("Matricula: "+funcionario.getMatricula());
		System.out.println("Cargo: "+funcionario.getCargo());
		System.out.println("Endereço: "+funcionario.getEndereco().getNomeRua()+", "+funcionario.getEndereco().getBairro()+", Número "+funcionario.getEndereco().getNumero()+", Complemento: "+funcionario.getEndereco().getComplemento()+", Cidade: "+funcionario.getEndereco().getCidade()+".");
		System.out.println("\n-------Cliente-------");
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("CPF: "+cliente.getCpf());
		System.out.println("Telefone: "+cliente.getTelefone());
		System.out.println("Endereço: "+cliente.getEndereco().getCidade()+", "+cliente.getEndereco().getBairro()+", "+cliente.getEndereco().getNomeRua()+", CEP:"+cliente.getEndereco().getCep()+", N�mero: "+cliente.getEndereco().getNumero()+", "+cliente.getEndereco().getComplemento()+".");

	}
}
