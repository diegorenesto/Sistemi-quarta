public class Main {
    public static void main(String[] args) {


        Host host1 = new Host("1", "192.168.0.1", "Host1");
        Host host2 = new Host("2", "192.168.0.2", "Host2");
        Router router = new Router("R1", "192.168.0.254");
        Switch switch1 = new Switch("S1", "192.168.0.253");
        Firewall firewall = new Firewall();



        // connessione dispostivi
        host1.connetti();
        host2.connetti();
        router.connetti();
        switch1.connetti();

        // creazione pacchetto
        Pacchetto pacchetto = new Pacchetto(host1.indirizzoIP, host2.indirizzoIP, "Ciao, come stai?");


        pacchetto.analizzaPacchetto();

        if (firewall.filtraPacchetto(pacchetto)) {
            router.instradaPacchetto(pacchetto.dati, pacchetto.destinatario);
            switch1.instradaFrame(pacchetto.dati, pacchetto.destinatario);
            host2.riceviDati(pacchetto.dati, pacchetto.mittente);
//            System.out.println("Pacchetto inviato con successo");
        } else {
            System.out.println("Il pacchetto è stato bloccato dal firewall");
        }
    }
}