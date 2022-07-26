package classes;

import java.util.ArrayList;

public class Servico {
	
	private Integer id;
	private String corte;
	private Double valor;
	
	public static ArrayList<Servico> servicos = new ArrayList<>();
	
	public Servico(String corte, Double valor) {
		this.corte = corte;
		this.valor = valor;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getCorte() {
		return corte;
	}



	public void setCorte(String corte) {
		this.corte = corte;
	}



	public Double getValor() {
		return valor;
	}



	public void setValor(Double valor) {
		this.valor = valor;
	}



	@Override
	public String toString() {
		return "Corte= " + corte + " Valor= " + valor;
	}
	
	public static String listarMovimentacoes() {
		String txtServico = "";
		
		for (Servico servico : servicos) {
			txtServico += servico + "\n";
		}
		
		return txtServico;
	}
	
	



	
	

}
