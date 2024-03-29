import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;

public class Server {
    /**
     * @param args
     */
    public static void main(String[] args) {
        final int PORT = 4321;  
        ServerSocket serverSocket;  

        //operação de bidding 
        try {
            serverSocket = new ServerSocket(PORT); 
            System.out.println("Servidor disponivel na porta " + PORT);     
        } catch (BindException e) {
            System.out.println("A porta " + PORT + " ja esta em uso. Altere a configuracao em...");
            return;  
        }  catch (IOException e) { 
            e.printStackTrace(); 
            return;
        }

        //accent = esperar uma conexao do cliente 
        try { 
            System.out.println("Aguardando um cliente...");
            serverSocket.accept(); 
        } catch (IOException e) { 
            e.printStackTrace(); 

        }  

        try { 
        serverSocket.close();
        } catch(IOException e){ 
            e.printStackTrace();
        }
       

        System.out.println("fim");
    }
    
}