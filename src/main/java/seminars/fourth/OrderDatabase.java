package seminars.fourth;

import java.util.Collection;
import java.util.List;

public interface OrderDatabase {
    void store(Order order);

    List<Order> getOrderById(String id);

    Collection<Order> getAll();
}
