package Odev.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("X",10,100,93,32);
        Fighter f2 = new Fighter("Y",15,95,86,27);
        Match ring = new Match(f1,f2,85,95);
        ring.run();
    }
}
