import java.util.Objects;

public class Stock {

    public static final Stock NEUTRAL = new Stock(0);
    private int stock;

    public Stock(int stock) {
        this.stock = stock;
    }

    public Stock combine(Stock stock) {
        return new Stock(this.stock + stock.stock);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock1 = (Stock) o;
        return stock == stock1.stock;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stock);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stock=" + stock +
                '}';
    }
}
