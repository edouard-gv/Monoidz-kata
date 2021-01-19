import java.util.Objects;

public class Stock {

    public static final Stock NEUTRAL = new Stock(0);
    private int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public Stock combine(Stock stock) {
        return new Stock(this.quantity + stock.quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock1 = (Stock) o;
        return quantity == stock1.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stock=" + quantity +
                '}';
    }
}
