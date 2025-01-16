public class Dispositivo {

    String id;
    String indirizzoIP;


    public Dispositivo(String id, String indirizzoIP) {
        this.id = id;
        this.indirizzoIP = indirizzoIP;
    }

    public String getId() {
        return id;
    }

    public String getIndirizzoIP() {
        return indirizzoIP;
    }

    public void connetti() {
        System.out.println("Dispositivo " + id + " connesso alla rete");
    }


    public void trasmettiDati(String dati, String destinatario) {
        System.out.println("Trasmissione dati da " + indirizzoIP + " a " + destinatario + ": " + dati);
    }


    public void riceviDati(String dati, String mittente) {
        System.out.println("Dati ricevuti da " + mittente + ": " + dati);
    }
}