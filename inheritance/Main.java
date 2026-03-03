class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        BoxWeight box2 = new BoxWeight(6, 7, 8, 9);
        System.out.println(box2.l + " " + box2.w + " " + box2.h + " " + box2.weight);

        Box box3 = new BoxWeight(1, 2, 3, 4);
        System.out.println(box3.l + " " + box3.w + " " + box3.h); // box3.weight -> will give an error because the reference variable is of type Box and it doesn't have the weight variable.

    }
}