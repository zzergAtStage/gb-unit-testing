package seminars.s06.hw;

import java.util.List;
import java.util.OptionalDouble;

public class DoubleResultComparator implements NumbersComparator{
    @Override
    public double getAverageOfList(List<Integer> numbers) {
        OptionalDouble average = numbers.stream()
                .mapToDouble(a -> a)
                .average();
        return average.isPresent() ? average.getAsDouble() : 0;
    }

    @Override
    public String compareTwoArrays(DataArrayCarrier data) {
        if (data.numbersFirstList.isEmpty() || data.numbersSecondList.isEmpty()) throw new IllegalArgumentException(
                "Не допустимо сравнение пустых экземпляров массивов");
        double average1 = getAverageOfList(data.numbersFirstList);
        double average2 = getAverageOfList(data.numbersSecondList);
        if (average1 == average2) return "Средние значения равны";
        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else {
            return  "Второй список имеет большее среднее значение";
        }
    }

}
