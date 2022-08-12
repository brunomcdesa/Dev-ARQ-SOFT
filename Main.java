import java.io.File;
import java.util.ArrayList;

public class Main {
	public static void main( String[] args) {
		GerenciadorDeArquivos gr = new GerenciadorDeArquivos();
		File f = gr.openFile();
		System.out.println("Arquivo selecionado: " + f);
		ArrayList<String> lista = gr.readFile(f);
		for(String item : lista) {
			System.out.println("--- " + item );
		}
		
	}
}
