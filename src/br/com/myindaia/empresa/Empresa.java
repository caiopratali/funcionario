package br.com.myindaia.empresa;

import br.com.myindaia.funcionario.Funcionario;

public class Empresa {
	public Funcionario[] empregados;
	private String nome;
	private String cnpj;
	private int espaco;
	
	 public void adiciona(Funcionario f) {
		this.empregados[this.espaco] = f;
		this.espaco++;
	 }
		
		public void mostraEmpregados() {
			for (int i = 0; i < this.espaco; i++) {
			System.out.println("Posição: " + i);
			this.empregados[i].mostra();
			System.out.println();
			}
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
					
}
