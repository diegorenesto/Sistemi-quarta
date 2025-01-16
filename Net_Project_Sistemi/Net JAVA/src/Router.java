public class Router extends Dispositivo {

    String[] tabellaRouting;


    public Router(String id, String indirizzoIP) {
        super(id, indirizzoIP);
        this.tabellaRouting = new String[10];
    }

    public String[] getTabellaRouting() {
        return tabellaRouting;
    }

    public void setTabellaRouting(String[] tabellaRouting) {
        this.tabellaRouting = tabellaRouting;
    }

    public void instradaPacchetto(String dati, String destinatario) {
        System.out.println("Router " + id + " instrada i dati verso " + destinatario);
    }
}