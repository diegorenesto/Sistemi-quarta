public class Firewall {

    String[] regole;


    public Firewall() {
        this.regole = new String[10];
    }

    public String[] getRegole() {
        return regole;
    }

    public boolean filtraPacchetto(Pacchetto pacchetto) {
        System.out.println("Firewall controlla il pacchetto da " + pacchetto.mittente + " a " + pacchetto.destinatario);
        return true; // permette tutti i pacchetti
    }
}