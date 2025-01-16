public class Protocollo {

    String nome;
    String versione;

    public Protocollo(String nome, String versione) {
        this.nome = nome;
        this.versione = versione;
    }

    public String getNome() {
        return nome;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public void processaDati(String dati) {
        System.out.println("Protocollo " + nome + " versione " + versione + " processa dati: " + dati);
    }
}