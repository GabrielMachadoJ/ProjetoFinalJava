package classes;

abstract public class Pessoa {
	
	protected Integer id;
	protected String nome;
	protected String telefone;
	protected String rg;
	
	
	public Pessoa(Integer id, String nome, String telefone, String rg) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
	}


	public Pessoa() {
		
	}
	
	

}
