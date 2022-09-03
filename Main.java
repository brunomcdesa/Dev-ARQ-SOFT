
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author julianacostasilva
 */
public class ArquivosDeTexto {

    public static void main(String[] args) {
    	
        System.out.println("Hello World!");
        GerenciadorDeArquivo gr = new GerenciadorDeArquivo();
        File f = gr.openFile();
        System.out.println("Arquivo selecionado: " + f);
        ArrayList<String> linhas = gr.lerArquivo(f);
        
        ArrayList<ClientePF> clientes = new ArrayList<ClientePF>();
      
        System.out.println("Cliente ou conta?");
        
        ClientePF c1 = new ClientePF();
        
        for(String item : linhas){
        	String[] vetorItem = item.split(",");
        	c1.setNome(vetorItem[0]);
        	c1.setEmail(vetorItem[1]);
        	c1.setTelefone(vetorItem[2]);
        	c1.setCpf(vetorItem[3]);
        	c1.setNascimento(vetorItem[4]);
        	
            //System.out.println("\n"+c1.toString());
            clientes.add(c1);
            System.out.println(clientes);
        }
    }
}
