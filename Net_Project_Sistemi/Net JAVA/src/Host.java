public class Host extends Dispositivo {
    String nomeHost;


    public Host(String id, String indirizzoIP, String nomeHost) {
        super(id, indirizzoIP);
        this.nomeHost = nomeHost;
    }

    public String getNomeHost() {
        return nomeHost;
    }

    public void inviaRichiesta(String dati, String destinatario) {
        System.out.println("Host " + nomeHost + " invia una richiesta a " + destinatario + ": " + dati);
    }
}