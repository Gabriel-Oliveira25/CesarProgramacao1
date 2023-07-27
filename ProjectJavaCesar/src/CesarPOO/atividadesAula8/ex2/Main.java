package cesarPOO.atividadesAula8.ex2;

public class Main {
    public static void main(String[] args){
        Lampada l1 = new Lampada(true);
        Lampada l2 = new Lampada(true, 45);
        Lampada l3 = new Lampada();
        
        l1.getWatts();
        l2.getWatts();
        l3.getWatts();
        
    }
}
