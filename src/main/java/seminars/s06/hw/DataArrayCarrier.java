package seminars.s06.hw;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class DataArrayCarrier{
    List<Integer> numbersFirstList;
    List<Integer> numbersSecondList;

    DataArrayCarrier(List<Integer> numbers, List<Integer> numbers2){
        this.numbersFirstList = numbers;
        this.numbersSecondList = numbers2;
    }

   }
