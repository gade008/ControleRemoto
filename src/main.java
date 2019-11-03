
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
	reader = new BufferedReader(new InputStreamReader(System.in));
        ControleRemoto c = new ControleRemoto();
        Controle ct = new Controle();
        System.out.println("\t\tControle");
        System.out.println("1 Ligar");
        System.out.println("2 Aumentar volume");
        System.out.println("3 Diminuir volume");
        System.out.println("6 Desligar");
        System.out.println("Opção:");
        String reply = reader.readLine();
        int op = Integer.parseInt(reply);
        switch (op){
            case 1:
                if (c.isLigado()) {
                    System.out.println("Controle já está ligado!");
                }else{
                    c.setLigado(true);
                }
                break;
            case 2:
                if (c.isLigado()) {
                   ct.aumentarVolume();
                }else{
                    System.out.println("Controle está desligado!");
                }
                break;
            case 3:
                if (c.isLigado()) {
                   ct.diminuirVolume();
                }else{
                    System.out.println("Controle está desligado!");
                }
     
        }
    }
}
