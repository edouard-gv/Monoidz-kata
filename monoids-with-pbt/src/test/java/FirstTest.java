import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FirstTest {
    @Test
    public void theTotalStockIsTheSumOfEachStocks() {
        assertEquals(new Stock(50), new Stock(20).combine(new Stock(30)));
    }

    private static Stock forAnyStock() {
        return new Stock((int) (Math.random() * 100)); // stock from 0 to 100
    }

    @Test
    public void closureOfOperation() {
        final Stock a = forAnyStock();
        final Stock b = forAnyStock();
        assertTrue(a.combine(b) instanceof Stock);
    }

    @Test
    public void neutralElement() {
        final Stock a = forAnyStock();
        assertEquals(a, a.combine(Stock.NEUTRAL)); // combine right
        assertEquals(a, Stock.NEUTRAL.combine(a)); // combine left
    }

    @Test
    public void associativity() {
        final Stock a = forAnyStock();
        final Stock b = forAnyStock();
        final Stock c = forAnyStock();
        assertEquals(a.combine(b).combine(c), a.combine(b.combine(c)));
    }
}
