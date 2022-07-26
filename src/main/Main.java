package main;

import classes.Servico;
import view.ViewAddServico;

public class Main {

	
	public static void main(String[] args) {
		
		Servico servico01 = new Servico("Degrade", 0.0);
		
		ViewAddServico telaServico = new ViewAddServico();
		telaServico.setVisible(true);
		
	}
}
