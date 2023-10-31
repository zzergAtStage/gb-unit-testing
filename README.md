# Unit testing
GB unit testing course materials
## Seminar 01 JUnit basics  

* Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.   
Solution: [HoweWork01 calculator](https://github.com/zzergAtStage/gb-unit-testing/blob/5307a04a8b13f4f0d48348cbd31ed101b615d87f/src/main/java/seminars/first/calculator/Calculator.java#L23)   
[HoweWork01 calculatorTest](https://github.com/zzergAtStage/gb-unit-testing/blob/5307a04a8b13f4f0d48348cbd31ed101b615d87f/src/test/java/seminars/first/calculator/CalculatorTest.java#L78)


* Задание 2. (необязательное) *
Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop:
Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов.  
Solution: [HoweWork01 asterisk quiz](https://github.com/zzergAtStage/gb-unit-testing/tree/tests-assertion-homework01-asterisk) 
