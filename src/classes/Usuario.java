package classes;

public class Usuario extends Pessoa{	
	
	protected String nivelAcesso;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id, String nome, String telefone, String rg, String nivelAcesso) {
		super(id, nome, telefone, rg);
		this.nivelAcesso = nivelAcesso;
	}
	
	

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	
}
