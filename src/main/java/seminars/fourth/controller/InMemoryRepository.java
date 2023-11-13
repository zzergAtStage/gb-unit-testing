package seminars.fourth.controller;

import seminars.fourth.Order;
import seminars.fourth.OrderDatabase;

import java.util.*;

public class InMemoryRepository implements OrderDatabase {

    private Map<String, Order> orderMap;

    public InMemoryRepository() {
        this.orderMap = new HashMap<>();
        orderMap.put("1", new Order());
        orderMap.put("2", new Order());
    }

    public InMemoryRepository(Map<String, Order> orderMap) {
        this.orderMap = orderMap;
    }

    @Override
    public void store(Order order) {

    }

    @Override
    public List<Order> getOrderById(String id) {
        return new ArrayList<>(Arrays.asList(orderMap.get(id)));
    }

    @Override
    public List<Order> getAll() {
        return new ArrayList<>(orderMap.values());
    }
}
