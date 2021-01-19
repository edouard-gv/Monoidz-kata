public enum Foods {
    SALAD(true, 0), CHEESE(true, 0), HAM(false, 0.1);

    public boolean isVegetarian;
    public double salt;

    Foods(boolean isVegetarian, double salt) {
        this.isVegetarian = isVegetarian;
        this.salt = salt;
    }
}
