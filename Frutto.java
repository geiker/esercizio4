public abstract class Frutto {
    private String tipo;
    private int pesoInGrammi;
    
    public Frutto(String tipo, int pesoInGrammi) {
        this.tipo = tipo;
        this.pesoInGrammi = pesoInGrammi;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPesoInGrammi() {
        return this.pesoInGrammi;
    }

}
