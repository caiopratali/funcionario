package br.com.myindaia.main;

import br.com.myindaia.empresa.Empresa;
import br.com.myindaia.funcionario.Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		empresa.setNome("viiBlue");
		empresa.setCnpj("777777777777");
		
		System.out.println("********************************************* Bem vindo a " + empresa.getNome()+" *********************************************");
		
		System.out.println();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Pedro");
		f1.setDepartamento("TI");
		f1.setRg("11111111-1");
		f1.setSalario(1000);
		empresa.adiciona(f1);
		Funcionario f2 = new Funcionario();
		f2.setNome("Joao");
		f2.setDepartamento("TI");
		f2.setRg("11111111-0");
		f2.setSalario(1700);
		empresa.adiciona(f2);
		
		/*empresa.empregados[0].mostra();
		System.out.println();
		empresa.empregados[1].mostra();*/
		
		empresa.mostraEmpregados();
		System.out.println(Funcionario.getIdentificador());
		
		
	}
}
