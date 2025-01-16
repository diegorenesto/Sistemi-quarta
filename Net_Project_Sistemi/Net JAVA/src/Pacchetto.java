public class Pacchetto {

    String mittente;
    String destinatario;
    String dati;


    public Pacchetto(String mittente, String destinatario, String dati) {
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.dati = dati;
    }

    public String getMittente() {
        return mittente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getDati() {
        return dati;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void analizzaPacchetto() {
        System.out.println("Pacchetto da: " + mittente + ", a: " + destinatario + ", dati: " + dati);
    }
}
