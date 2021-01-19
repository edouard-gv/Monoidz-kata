public class Panini {

    private Food food;

    public Panini(Food first, Food second) {
        food = Food.BREAD.and(first).and(second);
    }

    public boolean isVegetarian() {
        return food.isVegetarian;
    }

    public double salt() {
        return food.salt;
    }
}
