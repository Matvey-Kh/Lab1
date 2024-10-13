## Отчет по лабораторной работе № 1

#### № группы: `ПМ-2401`

#### Выполнил: `Худяков Матвей Иванович`

#### Вариант: `28`

### Cодержание:

- [Постановка задачи](#1-постановка-задачи)
- [Входные и выходные данные](#2-входные-и-выходные-данные)
- [Выбор структуры данных](#3-выбор-структуры-данных)
- [Алгоритм](#4-алгоритм)
- [Программа](#5-программа)
- [Анализ правильности решения](#6-анализ-правильности-решения)

### 1. Постановка задачи
- Условие задачи
>Даны четыре натуральных числа A, B, C, D. Проверить, образуют ли хотя
>бы 3 из них арифметическую прогрессию, и если да, то вывести прогрессии
>по возрастанию.
- Что нужно сделать
>Найти все возможные комбинации троек из четырёх чисел
>Проверить попарную разность элементов троек
>В случае нахождения трёх чисел, которые состовляют арифметическую прогрессию, вывести их по возрастанию
>Иначе, вывести "Здесь нет прогрессий!"

### 2. Входные и выходные данные

#### Данные на вход
На вход программа должна получать 4 целых числа по условию задачи

|             | Тип         | min значение    | max значение     |
|-------------|-------------|-----------------|------------------|
| A (Число 1) | Целое число | -2<sup>63</sup> | 2<sup>63</sup>-1 |
| B (Число 2) | Целое число | -2<sup>63</sup> | 2<sup>63</sup>-1 |
| С (Число 3) | Целое число | -2<sup>63</sup> | 2<sup>63</sup>-1 |
| D (Число 4) | Целое число | -2<sup>63</sup> | 2<sup>63</sup>-1 |

#### Данные на выход

Программа выводит одну из сторок:  
«Данные должны быть в виде натуральных чисел!» ИЛИ
«x y z» (где x, y, z - числа арифмитической прогрессии, таких строк может быть несколько) ИЛИ
«Здесь нет прогрессий!»

|          | Тип    |
|----------|--------|
| Строка 1 | Строка |

### 3. Выбор структуры данных

В данной задаче необходимы переменные для хранения четырёх чисел (int): `A`, `B`, `C`, `D`.
Ещё я задал переменную (int) MinNN (Minimal Natural Number) для возможности выбора с какой цифры считать натуральныве числа (0 или 1)
И переменная (boolean) foundProgression для удобства вывода ответа

|                   | название переменной | Тип (в Java) | 
|-------------------|---------------------|--------------|
| Число A (Число 1) | `A`                 | `int`        |
| Число B (Число 2) | `B`                 | `int`        | 
| Число C (Число 3) | `C`                 | `int`        | 
| Число D (Число 4) | `D`                 | `int`        | 
| Число MinNN       | `MinNN`             | `int`        |
| foundProgression  | `foundProgression`  | `boolean`    |

### 4. Алгоритм

#### Алгоритм выполнения программы:

1. **Ввод данных:**  
   Программа считывает четыре целых числа и записывает в соответствующие переменные (`A`, `B`, `C`, `D`).

2. **Сравнение чисел с минимальным натуральным числом:**  
   Программа проверяет, являются ли числа натуральными (>= MinNN). 
   Если хотя бы одно из чисел не натральное выводит: `"Данные должны быть в виде натуральных чисел!"`.
   В противном случае продолжает выполение программы.

3. **Сравнение всех вариантов модулей разности пар чисел из трёх чисел, замена значения `foundProgression` и вывод:**  
   Сравнивает модули разности, и если находятся такие равные по модулю разности, то ищет минимальный и максимальный из трёх элементов,
   а затем вычисляет средний и выводит их в порядке возрастания. Также заничение переменной `foundProgression` меняется с `false` на `true`.

4. **Проверка значения переменной foundProgression:**  
   Если значение переменной равно `false`, то выведете на экран: `"Здесь нет прогрессий!"`.
   В противном случае ничего не вывдедет.

5. **Вывод результата:**
    Если среди заданных чисел есть хотя бы 3 числа образующие арифмитическую прогрессию, то эти 3 числа будут выведены в порядке возрастания на 3-ем этапе.

#### Блок-схема

```mermaid
graph TD
    A([Начало]) --> B[/Ввести: A, B, C, D/]
    B --> C{A, B, C, D - натуральные?}
    C -- Нет --> D[/Вывод: Данные должны быть в виде натуральных чисел!/]
    C -- Да --> L[/Проверка троек/]
    L -- Проверка троек --> H{Является ли A, B, C арифмитической прогрессией}
    L -- Проверка троек --> I{Является ли A, C, D арифмитической прогрессией}
    L -- Проверка троек --> J{Является ли B, C, D арифмитической прогрессией}
    L -- Проверка троек --> K{Является ли A, B, D арифмитической прогрессией}


    Z([Конец])

```

### 5. Программа


```java
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int A = in.nextInt(); // Ввод натурального числа
        int B = in.nextInt(); // Ввод натурального числа
        int C = in.nextInt(); // Ввод натурального числа
        int D = in.nextInt(); // Ввод натурального числа
        int MinNN = 1; // Минимальное натуральное число
        boolean foundProgression = false; // Значение, которое определеяет найдена прогрессия или нет

        //Проверка входных данных
        if (A >= MinNN & B >= MinNN & C >= MinNN & D >= MinNN) { 
            // Проверка наличия арифмитической прогрессии среди трёх чисел
            // Арифмитическая прогрессия существует тогда, когда разности между двумя модулями пар чисел равны
            // В данной задаче сушествует всего 4 варианта комбинаций четырёх чисел по 3, а именно {A, B, C}, {A, C, D}, {B, C, D}, {A, B, D}
            // Проверяем тройку (A, B, C)
            if ((Math.abs(A - B) == Math.abs(A - C)) || (Math.abs(B - C) == Math.abs(B - A)) || (Math.abs(C - A) == Math.abs(C - B))) { // Сравнение всех модулей разности пар элементов 
                int min = Math.min(A, Math.min(B, C)); // находение минимального элемента прогресии
                int max = Math.max(A, Math.max(B, C)); // находение максимального элемента прогресии
                int mid = A + B + C - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            // Проверяем тройку (A, C, D)
            if ((Math.abs(A - C) == Math.abs(A - D)) || (Math.abs(C - A) == Math.abs(C - D)) || (Math.abs(D - A) == Math.abs(D - C))) {
                int min = Math.min(A, Math.min(C, D)); // находение минимального элемента прогресии
                int max = Math.max(A, Math.max(C, D)); // находение максимального элемента прогресии
                int mid = A + C + D - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            // Проверяем тройку (B, C, D)
            if ((Math.abs(B - C) == Math.abs(B - D)) || (Math.abs(C - B) == Math.abs(C - D)) || (Math.abs(D - B) == Math.abs(D - C))) {
                int min = Math.min(B, Math.min(C, D)); // находение минимального элемента прогресии
                int max = Math.max(B, Math.max(C, D)); // находение максимального элемента прогресии
                int mid = B + C + D - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            // Проверяем тройку (A, B, D)
            if ((Math.abs(A - B) == Math.abs(A - D)) || (Math.abs(B - A) == Math.abs(B - D)) || (Math.abs(D - A) == Math.abs(D - B))) {
                int min = Math.min(A, Math.min(B, D)); // находение минимального элемента прогресии
                int max = Math.max(A, Math.max(B, D)); // находение максимального элемента прогресии
                int mid = A + B + D - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            if (foundProgression == false) { // Сравние значения foundProgression c его изначальным
                out.print("Здесь нет прогрессий!"); // вывод, в случае если прогрессий нет
            }
            else {}
    }
    else {
        out.print("Данные должны быть в виде натуральных чисел!"); // вывод, в случае если хотя бы одно из чисел не натуральное
        }
    }
}
```

### 6. Анализ правильности решения

