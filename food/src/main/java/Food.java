import java.math.BigDecimal;

public class Food {
    public static Food SALAD = new Food(true, 0);
    public static Food CHEESE = new Food(true, 0);
    public static Food HAM = new Food(false, 0.1);
    public static Food BREAD = new Food(true, 0.2);

    public boolean isVegetarian;
    public double salt;

    private Food(boolean isVegetarian, double salt) {
        this.isVegetarian = isVegetarian;
        this.salt = salt;
    }

    Food and(Food other) {
        return new Food(this.isVegetarian && other.isVegetarian, BigDecimal.valueOf(this.salt).add(BigDecimal.valueOf(other.salt)).doubleValue());
    }

}
