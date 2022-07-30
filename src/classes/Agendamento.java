package classes;

import java.util.ArrayList;

public class Agendamento {
	
	private String nome;
	private String data;
	private String hora;
	private String barbeiro;
	
	public static ArrayList<Agendamento> agendamentos = new ArrayList<>();
	
	public static String listarAgendamento() {
		String txtRelatorio = "";
		
		for(int i = agendamentos.size() - 1; i >= 0; i--) {
			txtRelatorio += agendamentos.get(i) + "\n-----------";
		}
		return txtRelatorio;
	}
	
	
	
	public Agendamento(String data, String hora, String barbeiro) {
		this.data = data;
		this.hora = hora;
		this.barbeiro = barbeiro;
	}
	
	public Agendamento(String nome, String data, String hora, String barbeiro) {
		this.nome = nome;
		this.data = data;
		this.hora = hora;
		this.barbeiro = barbeiro;
	}
	
	public String toString() {
		return "\nNome: " + nome + "\nDia: " + data + "\nHora: " + hora + "\nBarbeiro: " + barbeiro;
	}

	public Agendamento() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getBarbeiro() {
		return barbeiro;
	}
	public void setBarbeiro(String barbeiro) {
		this.barbeiro = barbeiro;
	}
	
	
}
