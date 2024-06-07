package View;

import java.io.IOException;

import Controllers.MainController;
import Controllers.FormularioAvaliacaoController;
import Controllers.FormularioPropostaController;

class Main {
    public static void main(String[] args)  {
    	try {
			FormularioPropostaController.carregarFormularios();
			FormularioAvaliacaoController.carregarFormularios();
		} catch (IOException e) {
			e.printStackTrace();
		}
        MainController.menuPrincipal();
    }
}