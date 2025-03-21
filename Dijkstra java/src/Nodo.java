import java.util.ArrayList;
import java.util.Scanner;

public class Nodo {

    private String hostName;
    private int posizione;

    public Nodo(String hostName, int posizione) {
        this.hostName = hostName;
        this.posizione = posizione;
    }

    public String getHostName() {
        return hostName;
    }

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    @Override
    public String toString() {
        return String.format("HostName: %s, Posizione: %d", hostName, posizione);
    }

    public void dijkstra(Nodo nodoPartenza, ArrayList<Arco> archi) {
        Scanner sc = new Scanner(System.in);
        int destinazione, costo = 0;

        System.out.println("Dove ti trovi: " + nodoPartenza.getPosizione());
        System.out.println("Dove vuoi andare?");
        archi.forEach(a -> System.out.println(a.toString()));
        destinazione = sc.nextInt();
        nodoPartenza.setPosizione(destinazione);

        System.out.println(nodoPartenza.toString());
        for (Arco a : archi) {
            if (a.getDestinazione() == destinazione) {
                costo += a.getCosto();
            }
        }

        System.out.println("Costo: " + costo);
    }
}