package seminars.fourth;

public class OrderProcessor {
    DeliveryService deliveryService;

    public OrderProcessor(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void processOrder(Order order){
        //Order process logic
        this.deliveryService.scheduleDelivery(order);
    }
}
