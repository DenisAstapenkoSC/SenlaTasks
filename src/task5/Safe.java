package task5;

import java.util.ArrayList;

public class Safe {
    static int cargoLevel = 0;
    private int safeVolumeLimit = 15;
    private ArrayList<Cargo> cargoList = new ArrayList<Cargo>();
    private static int maxPrice = 0;
    private ArrayList<Cargo> savedCargoInSafe = new ArrayList<>();
    private Cargo[][] cargoList2 = new Cargo[2000][100];


    public Safe(int volume) {
        this.safeVolumeLimit = volume;
    }


    public void add(Cargo cargo) {

        cargoList.add(cargo);

    }

/*    public void print() {

        for (int i = 0; i < cargoList.size(); i++) {

            this.cargoList.get(i).print();
        }

    }*/

    public void printSavedCargo() {
        System.out.println("The next things are stored in the safe: ");
        for (int i = 0; i < savedCargoInSafe.size(); i++) {
            System.out.print(savedCargoInSafe.get(i).getName() + " ");

        }
        System.out.println();
        System.out.println("Total cost is " + maxPrice);

    }

/*    public void printList() {
        for (int j = 0; j < cargoList2.length; j++) {
            for (int i = 0; i < cargoList2[j].length; i++) {

                if (cargoList2[j][i] == null) {
                    break;
                }
                System.out.print(cargoList2[j][i].getName());
                System.out.print(" ");
            }
            if (cargoList2[j][0] != null) {
                System.out.println();
            }

        }
    }*/

    public void findMaxCost() {

        for (int j = 0; j < cargoList2.length; j++) {
            int maxCost = 0;
            for (int i = 0; i < cargoList2[j].length; i++) {

                if (cargoList2[j][i] == null) {
                    break;
                }

                maxCost += cargoList2[j][i].getPrice();

            }
            if (maxPrice < maxCost) {
                maxPrice = maxCost;
            }
        }

    }

    public void saveCargoInTheSafe() {

        for (int j = 0; j < cargoList2.length; j++) {
            int maxCost = 0;
            for (int i = 0; i < cargoList2[j].length; i++) {

                if (cargoList2[j][i] == null) {
                    break;
                }

                maxCost += cargoList2[j][i].getPrice();

            }
            if (maxPrice == maxCost) {
                for (int k = 0; k < cargoList2[j].length; k++) {

                    if (cargoList2[j][k] == null) {
                        break;
                    } else {

                        this.savedCargoInSafe.add(cargoList2[j][k]);
                    }
                }
                return;
            }
        }

    }

    public void closeTheSafe() {

        permutate(cargoList);
        findMaxCost();
        saveCargoInTheSafe();

    }


    public void permutate(ArrayList<Cargo> arr) {
        permuteIteration(arr, 0);

    }

    private void permuteIteration(ArrayList<Cargo> arr, int index) {

        int limit = this.safeVolumeLimit;
        int sumCargoValume;
        if (index >= arr.size() - 1) {
            sumCargoValume = 0;

            for (int i = 0; i < arr.size(); i++) {

                if (sumCargoValume + arr.get(i).getVolume() <= limit) {

                    this.cargoList2[cargoLevel][i] = arr.get(i);

                    sumCargoValume += arr.get(i).getVolume();

                } else {
                    break;
                }
            }
            return;
        }

        for (int i = index; i < arr.size(); i++) {


            Cargo temp = arr.get(index);
            arr.set(index, arr.get(i));
            arr.set(i, temp);

            cargoLevel++;

            permuteIteration(arr, index + 1);

            temp = arr.get(index);
            arr.set(index, arr.get(i));
            arr.set(i, temp);
        }
    }
}
