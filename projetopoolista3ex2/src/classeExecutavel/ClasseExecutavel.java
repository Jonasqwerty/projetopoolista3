package classeExecutavel;

import model.Aluno;
import model.Curso;
import model.Disciplina;
import model.Endereco;
import model.Faculdade;
import model.Notas;

public class ClasseExecutavel {

	public static void main(String[] args) {
		Endereco enderecoFaculdade = new Endereco();
		enderecoFaculdade.setNomeRua("Rua dos Alfeneiros");
		enderecoFaculdade.setNumero(4);
		enderecoFaculdade.setBairro("Pedra Branca");
		enderecoFaculdade.setCidade("Bagé");
		enderecoFaculdade.setUf('R');
		enderecoFaculdade.setComplemento("Perto de uma pedra branca");
		enderecoFaculdade.setCep(35421);
		
		Endereco enderecoAluno = new Endereco();
		enderecoAluno.setNomeRua("Rua das Cocotinhas");
		enderecoAluno.setNumero(35);
		enderecoAluno.setBairro("Bairro das Quebradas");
		enderecoAluno.setCidade("Bagé");
		enderecoAluno.setUf('R');
		enderecoAluno.setComplemento("Perto de uma quadra");
		enderecoAluno.setCep(8794);
		
		Notas notas = new Notas(3,5,6);
		
		Aluno aluno = new Aluno("Alberto Nunes", 894546948, "bg016", enderecoAluno, notas);
		
		Disciplina disciplina = new Disciplina("POO", "arroz", aluno);
		
		Curso curso = new Curso("TADS", "queijo", disciplina);
		
		Faculdade faculdade = new Faculdade(9998877, "faculdade@mail.com", enderecoFaculdade, curso);
		
		System.out.println("Média: "+notas.calcularMedia());
		System.out.println("Situação: "+aluno.mostrarSituacao());

	}

}
