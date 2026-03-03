class BoxWeight extends Box {
    double weight;

    public BoxWeight () {
        this.weight = -1;
    }

    public BoxWeight (double l, double w, double h, double weight) {
        super(l, w, h); // loads the variables from the parent class - Box
        this.weight = weight;
    }

    public BoxWeight (BoxWeight old) {
        super(old); // or you can also use -> super(old.l, old.w, old.h);
        this.weight = old.weight;
    }
}