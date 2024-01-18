import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    void initializeCart() {
        cart = new ShoppingCart();
    }

    @Test
    @DisplayName("Add Item To Cart")
    void testAddItem() {
        cart.addItem("Apple", 10.0);
        assertEquals(1, cart.getItemCount());
        assertEquals(10.0, cart.calculateTotal());

        cart.addItem("Orange", 15.0);
        assertEquals(2, cart.getItemCount());
        assertEquals(25.0, cart.calculateTotal());
    }

    @Test
    @DisplayName("Remove Item from Cart")
    void testRemoveItem() {
        cart.addItem("Apple", 10.0);
        cart.addItem("Orange", 15.0);

        cart.removeItem("Apple");
        assertEquals(1, cart.getItemCount());
        assertEquals(15.0, cart.calculateTotal());

        cart.removeItem("Orange");
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.calculateTotal());
    }

    @Test
    @DisplayName("Calculate Total Price")
    void testCalculateTotal() {
        cart.addItem("Apple", 10.0);
        cart.addItem("Orange", 15.0);

        assertEquals(25.0, cart.calculateTotal());
    }

    @Test
    @DisplayName("Check out")
    void testCheckout() {
        cart.addItem("Apple", 10.0);
        cart.addItem("Orange", 15.0);

        assertEquals(2, cart.getItemCount());
        assertEquals(25.0, cart.calculateTotal());

        cart.checkout();

        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.calculateTotal());
    }

    @Test
    @DisplayName("Get Item Size")
    void testGetItemCount() {
        cart.addItem("Apple", 10.0);
        cart.addItem("Orange", 15.0);

        assertEquals(2, cart.getItemCount());

        cart.removeItem("Apple");
        assertEquals(1, cart.getItemCount());
    }
}
