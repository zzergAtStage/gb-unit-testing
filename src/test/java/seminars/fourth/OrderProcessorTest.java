package seminars.fourth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class OrderProcessorTest {

    private DeliveryService deliveryServiceMock;
    private OrderProcessor orderProcessor;
    private Order order;
    @BeforeEach
    void setUp() {
        deliveryServiceMock = mock(DeliveryService.class);
        orderProcessor = new OrderProcessor(deliveryServiceMock);
        order = new Order();
    }

    @Test
    void testProcessOrder_ScheduleDelivery() {
        orderProcessor.processOrder(order);
        verify(deliveryServiceMock).scheduleDelivery(order);
    }
}