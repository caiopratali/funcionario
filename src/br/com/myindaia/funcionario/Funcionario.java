package br.com.myindaia.funcionario;


public class Funcionario  {
	private String nome;
	private String departamento;
	public Data data;
	private String rg;
	private double salario;
	private static int identificador = 0;
	
	public Funcionario(){
		identificador++;
	}
	
	public static int getIdentificador(){
		return identificador;
	}
	
	public void aumentoSalaria(double valor) {
		double aumento = this.salario + valor;
		this.salario = aumento;
	}
	
	public double calculoAnual() {
		return this.salario * 12;
	}
	
	public void mostra(){
		System.out.println("Nome: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		/*System.out.println("Data: " + this.getData());*/
		System.out.println("RG: " + this.getRg());
		System.out.println("Salario: " + getSalario());
		System.out.println("Total recebido no ano: " + this.calculoAnual());
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	/*public String getData() {
		return data;
	}*/
	
	public String getRg() {
		return rg;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	/*public void setData(String data) {
		this.data = data;
	}*/
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
