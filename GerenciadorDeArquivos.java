import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class GerenciadorDeArquivos {

	public File openFile() {
		JFileChooser chooser = new JFileChooser();
		JOptionPane.showMessageDialog(null, "Escolha o seu arquivo.");
		int chooserReturn = chooser.showOpenDialog(null);
	//	System.out.println("Valor de retorno: " + chooserReturn);
		
		if(chooserReturn == JFileChooser.CANCEL_OPTION || chooserReturn == JFileChooser.ERROR_OPTION) {
			JOptionPane.showMessageDialog(null, "Arquivo não selecionado. Tente novamente");
		}else {
			File file = chooser.getSelectedFile();
			return file;
		}
		return null;
	}
	
	public ArrayList<String> readFile(File file) {
		BufferedReader br = null;
		ArrayList<String> linhas = new ArrayList<String>();
		try {
				br = new BufferedReader(new FileReader(file));
			while(br.ready()) {
				linhas .add(br.readLine());
			//	String linha = br.readLine();
			// linhs.add(linha);
			}
		}catch(FileNotFoundException ex) {
			System.out.println("ERRO: " + ex);
		}catch (IOException e) {
			System.out.println("ERRO: " + e);
		}
		return linhas;
	}
}
