public class Bilancia {
    
    public int pesaBusta(Busta busta) {
        int sommaPeso = 0;
        for(Frutto frutto : busta.getContenuto()) {
            sommaPeso += frutto.getPesoInGrammi();
        }
        return sommaPeso;
    }
}
