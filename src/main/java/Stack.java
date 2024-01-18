import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return items.remove(items.size() - 1);
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return items.get(items.size() - 1);
        }
    }
    public List<T> getCurrentState() {
        return new ArrayList<>(items);
    }
}

