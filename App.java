public class App {
    public static void main(String[] args) throws Exception {
        Frutto valencia = new Arancia("Valencia", 50);
        Frutto kiwi2 = new Kiwi("Verde", 30);
        Frutto arancia3 = new Arancia("Washington", 40);
        Frutto arancia4 = new Arancia("Sanguinello", 50);
        Frutto kiwi3 = new Kiwi("Estivo", 30);
        Frutto kiwi4 = new Kiwi("Estivo", 50);
        Frutto kiwi5 = new Kiwi("Abate", 50);
        Frutto arancia5 = new Arancia("Navelina", 50);
        Frutto kiwi6 = new Kiwi("Abate", 50);

        Busta busta1 = new Busta();
        try {
            busta1.aggiungiFrutto(valencia);
            busta1.aggiungiFrutto(kiwi2);
            busta1.aggiungiFrutto(arancia3);
            busta1.aggiungiFrutto(arancia4);
            busta1.aggiungiFrutto(kiwi3);
            busta1.aggiungiFrutto(kiwi4);
            busta1.aggiungiFrutto(kiwi5);
            busta1.aggiungiFrutto(arancia5);
            busta1.aggiungiFrutto(kiwi6);
        } catch (Exception e) {
            System.err.println(e);
        }
 
        Busta busta2 = new Busta();
        try {
            busta2.aggiungiFrutto(valencia);
            busta2.aggiungiFrutto(kiwi2);
            busta2.aggiungiFrutto(arancia3);
            busta2.aggiungiFrutto(arancia4);
            busta2.aggiungiFrutto(kiwi3);
            busta2.aggiungiFrutto(kiwi4);
            busta2.aggiungiFrutto(kiwi5);
            busta2.aggiungiFrutto(arancia5);    
        } catch (Exception e) {
            System.err.println(e);
        }
        
        Bilancia bilancia = new Bilancia();
        System.out.println("La busta di frutta pesa: " + bilancia.pesaBusta(busta2) + "g");
    }
}
