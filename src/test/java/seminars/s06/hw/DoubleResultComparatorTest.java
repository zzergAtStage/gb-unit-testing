package seminars.s06.hw;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class DoubleResultComparatorTest {
    private DataArrayCarrier dataArrayCarrierMock;
    DoubleResultComparator doubleResultComparator;
    DoubleResultComparator doubleResultComparatorMock;

    private  final double CANONICAL_RESULT = 3.4;
    private List<Integer> list1;
    private List<Integer> list2;
    private List<Integer> list3Stub;

    //Создаем stub для имитации поведения dataCarrier

    @BeforeEach
    void setUp() {
        dataArrayCarrierMock = mock(DataArrayCarrier.class);
        doubleResultComparatorMock = mock(DoubleResultComparator.class);
        doubleResultComparator = new DoubleResultComparator();
        list1 = new ArrayList<>(Arrays.asList(1,2,3,5,6));
        list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6));
        list3Stub = new ArrayList<>(Arrays.asList(5,12,8,8,21));


    }

    @AfterEach
    void tearDown() {
        list1 = null;
        list2 = null;
        dataArrayCarrierMock = null;
        doubleResultComparator = null;
    }

    @Test
    void getAverageOfList_compareWithDefaultValue() {
        double averageTestValue = doubleResultComparator.getAverageOfList(list1);
        assertEquals(CANONICAL_RESULT,averageTestValue, "Результат работы не равен дефолтному значению");
    }
    @Test
    void getAverageOfList_compareTwoArraysCalculation() {
        assertEquals(doubleResultComparator.getAverageOfList(list1)
                , doubleResultComparator.getAverageOfList(list2));
    }
    @Test
    void doubleResultComparatorTest_behaviorWithStub(){
        //проверяет обработку вызова метода compareTwoArrays с использованием заглушки и мока
        DataArrayCarrier dataCarrierStub = new DataCarrierStub();

        doubleResultComparatorMock.compareTwoArrays(dataCarrierStub);
        verify(doubleResultComparatorMock, times(1)).compareTwoArrays(dataCarrierStub);
    }
    @Test
    void compareTwoArrays_FirstIsLarger() {
    //В методе используются интеграционные тесты для метода getAverageOfList
        dataArrayCarrierMock.numbersFirstList = list3Stub;
        dataArrayCarrierMock.numbersSecondList = list1;
        String result = doubleResultComparator.compareTwoArrays(dataArrayCarrierMock);
        assertEquals("Первый список имеет большее среднее значение",result);
    }

    @Test
    void compareTwoArrays_SecondIsLarger() {
        dataArrayCarrierMock.numbersFirstList = list1;
        dataArrayCarrierMock.numbersSecondList = list3Stub;
        String result = doubleResultComparator.compareTwoArrays(dataArrayCarrierMock);
        assertEquals("Второй список имеет большее среднее значение",result);
    }

    @Test
    void compareTwoArrays_BothAreTheSame() {
        dataArrayCarrierMock.numbersFirstList = list1;
        dataArrayCarrierMock.numbersSecondList = list2;
        String result = doubleResultComparator.compareTwoArrays(dataArrayCarrierMock);
        assertEquals("Средние значения равны",result);
    }

}