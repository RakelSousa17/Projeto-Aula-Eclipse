package view;

import model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Rakel");
		System.out.println(pessoa.getNome());
		
		pessoa.setEndereco("Avenida Esperantina");
		System.out.println(pessoa.getEndereco());
		
		pessoa.setBairro("Parque das Paineiras");
		System.out.println(pessoa.getBairro());
		
		pessoa.setCep(26395458);
		System.out.println(pessoa.getCep());
		
		pessoa.setCidade("S�o Paulo");
		System.out.println(pessoa.getCidade());
		
		pessoa.setEstado("S�o Paulo");
		System.out.println(pessoa.getEstado());
	}
	
}