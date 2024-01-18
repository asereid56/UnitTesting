import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    static Stack<Integer> stack;

    @BeforeAll
    static void initializeStack() {
        stack = new Stack<>();
    }

    @Test
    @DisplayName("Push To Stack")
    void testPush() {
        stack.push(1);
        assertEquals(1, stack.pop());

        stack.push(2);
        stack.push(3);
        assertEquals(2, stack.pop());
        assertEquals(3, stack.pop());

        assertTrue(stack.isEmpty());
        assertTrue(stack.getCurrentState().isEmpty());
    }

    @Test
    @DisplayName("Pop To Stack")
    void testPop() {
        stack.push(5);
        stack.push(10);

        assertEquals(10, stack.pop());
        assertEquals(5, stack.pop());

        assertTrue(stack.isEmpty());
        assertTrue(stack.getCurrentState().isEmpty());
    }

    @Test
    @DisplayName("Peek Stack")
    void testPeek() {
        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.peek());
        assertEquals(20, stack.peek());

        assertFalse(stack.isEmpty());
        assertFalse(stack.getCurrentState().isEmpty());
    }

    @Test
    @DisplayName("Check Stack is Empty?")
    void testIsEmpty() {
        assertTrue(stack.isEmpty());

        stack.push(10);
        assertTrue(!stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
        assertTrue(stack.getCurrentState().isEmpty());
    }
}
