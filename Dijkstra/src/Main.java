import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String risposta;


        Nodo nodo1 = new Nodo("Nodo1", 1);
        Nodo nodo2 = new Nodo("Nodo2", 2);
        Nodo nodo3 = new Nodo("Nodo3", 3);

        Arco arco1 = new Arco(2, 5);
        Arco arco2 = new Arco(3, 8);
        Arco arco3 = new Arco(1, 10);

        ArrayList<Arco> archi = new ArrayList();
        archi.add(arco1);
        archi.add(arco2);
        archi.add(arco3);

        System.out.println("Inserisci un nodo di partenza: ");
        int scelta = sc.nextInt();
        Nodo nodoPartenza = switch (scelta) {
            case 1 -> nodo1;
            case 2 -> nodo2;
            case 3 -> nodo3;
            default -> null;
        };


        do {
            nodoPartenza.dijkstra(nodoPartenza, archi);
            System.out.println("Continuare? (S/N)");
            risposta = sc.next();

        } while (risposta.equals("S"));

    }
}