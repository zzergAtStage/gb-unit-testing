package seminars.s06.hw;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataArrayCarrierTest {

    private DataArrayCarrier dataArrayCarrier;
    private List<Integer> list1;
    private List<Integer> list2;

    @BeforeEach
    void setUp() {
        list1 = new ArrayList<>(Arrays.asList(1,2,3,5,6));
        list2 = new ArrayList<>(Arrays.asList(1,2,3,5,6));

        dataArrayCarrier = new DataArrayCarrier(list1, list2);
    }
    @AfterEach
    void tearDown(){
        dataArrayCarrier = null;
        list1 = null;
        list2 = null;
    }

    @Test
    void testDataArrayCarrier_elementsNotNull(){
        DataArrayCarrier dataArrayCarrier1 = new DataArrayCarrier(list1,list2);
        assertNotNull(dataArrayCarrier1.numbersFirstList);
        assertNotNull(dataArrayCarrier1.numbersSecondList);
    }
    @Test
    @DisplayName("Check class constructor")
    void setDataArrayCarrier_isNotNull(){
        DataArrayCarrier dataArrayCarrierTest = new DataArrayCarrier(new ArrayList<>(Arrays.asList(1,2,3,5,6))
                , new ArrayList<>(Arrays.asList(1,2,3,5,6)));
        assertNotNull(dataArrayCarrierTest);
    }

    @Test
    void getNumbersFirstList() {
        assertArrayEquals(list1.toArray(),dataArrayCarrier.getNumbersFirstList().toArray());
    }

    @Test
    void getNumbersSecondList() {
        assertArrayEquals(list2.toArray(),dataArrayCarrier.getNumbersSecondList().toArray());
    }
}