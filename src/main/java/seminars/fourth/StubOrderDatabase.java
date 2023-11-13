package seminars.fourth;

import java.util.List;

public class StubOrderDatabase implements OrderDatabase {
    public void store(Order order) {
        // Просто заглушка, ничего не делает
    }

    @Override
    public List<Order> getOrderById(String id) {
        return null;
    }

    @Override
    public List<Order> getAll() {
        return null;
    }
}
