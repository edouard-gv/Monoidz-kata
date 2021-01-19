import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {

    @Test
    public void ifOneIsNotVegetarianThenThePaniniIsNot() {
        Panini panini = new Panini(Foods.CHEESE, Foods.HAM);
        assertFalse(panini.isVegetarian());
    }

    @Test
    public void ifAllIsVegetarianThenThePaniniIs() {
        Panini panini = new Panini(Foods.CHEESE, Foods.SALAD);
        assertTrue(panini.isVegetarian());
    }

    @Test
    public void saltOfPaniniWithNoSaltedComponentHasOnlyBreadSalt() {
        Panini panini = new Panini(Foods.CHEESE, Foods.SALAD);
        assertEquals(0.2, panini.salt());
    }

    @Test
    public void saltOfPaniniSaltedComponentIsAddedToBreadSalt() {
        Panini panini = new Panini(Foods.CHEESE, Foods.HAM);
        assertEquals(0.3, panini.salt());
    }
}
