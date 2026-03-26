class AnimalMain {
    public static void main(String[] args) {
        Animal ani = new Dog("hello", "world", "hru");

        System.out.println(ani.name + " " + ani.type + " " + ani.sound);
    }
}