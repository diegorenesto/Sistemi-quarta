public class Arco {

    private int destinazione;
    private int costo;

    public Arco(int destinazione, int costo) {
        this.destinazione = destinazione;
        this.costo = costo;
    }

    public int getDestinazione() {
        return destinazione;
    }

    public int getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return String.format("Destinazione: %d, Costo: %d", destinazione, costo);
    }
}