package task5;

public class Cargo {

    private String name = "someName";
    private int volume = 0;
    private int price = 0;
    private double value = 0.0;

    public Cargo(String name, int volume, int price) {
        this.name = name;
        this.volume = volume;
        this.price = price;
        this.value = (double)this.price/(double)this.volume;

    }

    public Cargo() {
    }

    public int getVolume() {
        return volume;
    }
    public String getName() {
        return name;
    }


    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


    public double getValue() {
        return value;
    }


    public void print () {

        System.out.println(name);
    }


}
