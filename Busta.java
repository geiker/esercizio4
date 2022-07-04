import java.util.ArrayList;
import java.util.List;

public class Busta {
    private int pesoMassimo = 350;
    private List<Frutto> contenuto = new ArrayList<>();

    public void aggiungiFrutto(Frutto frutto) throws BustaRottaException {
        contenuto.add(frutto);
        int pesoAttuale = 0;
        for(Frutto fruttoInBusta : contenuto) {
            pesoAttuale += fruttoInBusta.getPesoInGrammi();
        }

        if(pesoAttuale > pesoMassimo) {
            contenuto.clear();
            throw new BustaRottaException(frutto);
        }
    }

    public List<Frutto> getContenuto() {
        return this.contenuto;
    }

}
