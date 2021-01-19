import java.math.BigDecimal;

public class Panini {

    Foods first;
    Foods second;

    public Panini(Foods first, Foods second) {
        this.first = first;
        this.second = second;
    }

    public boolean isVegetarian() {
        return first.isVegetarian && second.isVegetarian;
    }

    public double salt() {
        return BigDecimal.valueOf(0.2).add(BigDecimal.valueOf(first.salt)).add(BigDecimal.valueOf(second.salt))
                .doubleValue();
    }
}
