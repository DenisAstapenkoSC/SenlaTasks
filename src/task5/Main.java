package task5;

public class Main {


    public static void main(String[] args) {



        Cargo cup = new Cargo("cup", 7, 2 );
        Cargo plate = new Cargo("plate", 10, 1 );
        Cargo key = new Cargo("key", 4, 15 );
        Cargo coin1 = new Cargo("coin1", 1, 2 );
        Cargo coin2 = new Cargo("coin2", 2, 5 );
        Cargo coin3 = new Cargo("coin3", 3, 2 );

        Safe safe = new Safe(10);
        safe.add(cup);
        safe.add(plate);
        safe.add(key);
        safe.add(coin1);
        safe.add(coin2);
        safe.add(coin3);

        safe.closeTheSafe();
        //safe.print();

        //safe.printList();
        safe.printSavedCargo();
    }
}
