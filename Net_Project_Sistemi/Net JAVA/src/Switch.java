public class Switch extends Dispositivo {

    String[] tabellaMAC;


    public Switch(String id, String indirizzoIP) {
        super(id, indirizzoIP);
        this.tabellaMAC = new String[10]; // massimo 10 dispositivi
    }

    public String[] getTabellaMAC() {
        return tabellaMAC;
    }

    public void setTabellaMAC(String[] tabellaMAC) {
        this.tabellaMAC = tabellaMAC;
    }

    public void instradaFrame(String dati, String destinatario) {
        System.out.println("Switch " + id + " instrada il frame verso " + destinatario);
    }
}