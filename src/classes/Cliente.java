package classes;

import java.util.ArrayList;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	
	
	public static ArrayList<Cliente> clientes = new ArrayList<>();
	
	
	public static String listarClientes() {
		String txtRelatorio = "";
		
		for(int i = clientes.size() - 1; i >= 0; i--) {
			txtRelatorio += clientes.get(i) + "\n-----------";
		}
		return txtRelatorio;
	}
	
	
	
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nE-mail: " + email + "\nTelefone: " + telefone;
	}


	public Cliente() {
	}
	
	public Cliente(String nome) {
	}

	public Cliente(String nome, String cpf, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
