# Seminar 04 homework

## Задание 1. Ответьте письменно на вопросы:

1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?  
> Тестовые заглушки позволяют предопределить поведение зависимостей для тестируемых модулей, получить заведомо известные входные данные и объекты.


4) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?  
> Для подобного тестирования метода больше всего подходит фреймворк Mockito и его метод проверки verify: <br> <p>вызов метода у замоканного объекта ```mockObject.someMethod("expectedArgument1", 42)```</p>
> верификация <br> ```verify(mockObject).someMethod("expectedArgument1", 42)```
> 

4) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?  
> STUB или двойник класса/метода позволяет однозначно вернуть определенное значение или сгенерировать исключение
5) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?  
> Скорее всего это будет Mockito - поскольку он позволяет не только имитировать вызов к некому API Но и вернуть тесту предопределенные значения, ожидаемые в ответ на определенные параметры вызова: 
> <br> ```SomeExternalApi apiMock = mock(SomeExternalApi.class);
> // Настройка поведения мока для возвращения предопределенных данных
 when(apiMock.getData(/* ожидаемые аргументы */)).thenReturn(/* возвращаемые данные */);```   
## Задание 2.  
У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.

[Solution]()