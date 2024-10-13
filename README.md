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
"Данные должны быть в виде натуральных чисел!",
"x y z" (где x, y, z - числа арифмитической прогрессии, таких строк может быть несколько),
"Здесь нет прогрессий!"

|          | Тип    |
|----------|--------|
| Строка 1 | Строка |

### 3. Выбор структуры данных

В данной задаче необходимы переменные для хранения четырёх чисел (int): `A`, `B`, `C`, `D`.
Ещё я задал переменную (int) MinNN (Minimal Natural Number) для возможности выбора с какой цифры считать натуральныве числа (0 или 1)
И переменная (boolean) foundProgression для удобства вывода ответа

### 4. Алгоритм

#### Алгоритм выполнения программы:



#### Блок-схема



### 5. Программа



### 6. Анализ правильности решения

