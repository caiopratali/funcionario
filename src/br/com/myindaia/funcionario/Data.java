package br.com.myindaia.funcionario;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public void data() {
		System.out.println("Criado em: " + getDia()+"/"+getMes()+"/"+getAno());
	}
	public int getDia(){
		return dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	}
