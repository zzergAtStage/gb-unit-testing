package seminars.s06.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataCarrierStub extends DataArrayCarrier{
    List<Integer> list1Stub;
    List<Integer> list2Stub;
    DataCarrierStub(){
        super();
        list1Stub = new ArrayList<>(Arrays.asList(2,4,6,8,21));
        list2Stub = new ArrayList<>(Arrays.asList(2,6,10,8,21,6,4));
    }
}