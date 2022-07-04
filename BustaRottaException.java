public class BustaRottaException extends Exception{
    
    public BustaRottaException(Frutto frutto) {
        super("Attenzione! La busta si è rotta dopo aver inserito: " + frutto.getClass().getName() + " " + frutto.getTipo());
    }
}
