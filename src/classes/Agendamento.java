package classes;

public class Agendamento {
	
	private int id;
	private Cliente cliente;
	private Servico servico;
	private Double valor;
	private String data;
	private String hora;
	
	
	public Agendamento(int id, Cliente cliente, Servico servico, Double valor, String data, String hora) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.servico = servico;
		this.valor = valor;
		this.data = data;
		this.hora = hora;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Servico getServico() {
		return servico;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
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
	
	
	

}
