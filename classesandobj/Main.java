class Main {
    public static void main(String[] args) {

        Cars car1 = new Cars("Toyota", "Camry", 2000000);

        System.out.println(car1.brand);
        System.out.println(car1.name);
        System.out.println(car1.price);

        car1.changeName("Corolla");
        System.out.println(car1.name);

        car1.sentence();
    }
}

class Cars {
    String brand;
    String name;
    int price;

    void changeName(String newName) {
        this.name = newName;
    }

    void sentence() {
        System.out.println("This is a " + this.brand + " " + this.name + " and it costs " + this.price);
    }

    Cars(String brand, String name, int price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

}