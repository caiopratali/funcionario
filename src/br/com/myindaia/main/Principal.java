package br.com.myindaia.main;

import br.com.myindaia.funcionario.Data;
import br.com.myindaia.funcionario.Funcionario;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("************************** Programa de Funcionarios **************************");
		System.out.println();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Caio");
		f1.setDepartamento("TI");
		/*f1.setData("23/06/1996");*/
		f1.setRg("49.738.123-0");
		f1.setSalario(1000);
		f1.aumentoSalaria(200);
		f1.mostra();
		
//CLASSE DATA
		Data um = new Data();
		um.setDia(23);
		um.setMes(06);
		um.setAno(1996);
		um.data();		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println();
//FUNCIONÁRIO 2

		/*Funcionario f2 = new Funcionario();
		f2.setNome("Caio");
		f2.setDepartamento("TI");
		f2.setData("23/06/1996");
		f2.setRg("49.738.123-0");
		f2.setSalario(1000);
		f2.aumentoSalaria(200);
		f2.mostra();*/
		
		Funcionario f2 = f1;
		
		if (f1 == f2) {
			System.out.println("Iguais");
			} else {
			System.out.println("Diferentes");
			}
		
	}

}
