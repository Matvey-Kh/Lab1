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
            // Сравнение всех модулей разности пар элементов и проверка на отличие элементов тройки друг от друга
            if (((Math.abs(A - B) == Math.abs(A - C)) || (Math.abs(B - C) == Math.abs(B - A)) || (Math.abs(C - A) == Math.abs(C - B))) & A != B & A != C & B != C) { 
                int min = Math.min(A, Math.min(B, C)); // находение минимального элемента прогресии
                int max = Math.max(A, Math.max(B, C)); // находение максимального элемента прогресии
                int mid = A + B + C - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            // Проверяем тройку (A, C, D)
            // Сравнение всех модулей разности пар элементов и проверка на отличие элементов тройки друг от друга
            if (((Math.abs(A - C) == Math.abs(A - D)) || (Math.abs(C - A) == Math.abs(C - D)) || (Math.abs(D - A) == Math.abs(D - C))) & A != C & A != D & C != D) {
                int min = Math.min(A, Math.min(C, D)); // находение минимального элемента прогресии
                int max = Math.max(A, Math.max(C, D)); // находение максимального элемента прогресии
                int mid = A + C + D - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            // Проверяем тройку (B, C, D)
            // Сравнение всех модулей разности пар элементов и проверка на отличие элементов тройки друг от друга
            if (((Math.abs(B - C) == Math.abs(B - D)) || (Math.abs(C - B) == Math.abs(C - D)) || (Math.abs(D - B) == Math.abs(D - C))) & B != C & B != D & C != D) {
                int min = Math.min(B, Math.min(C, D)); // находение минимального элемента прогресии
                int max = Math.max(B, Math.max(C, D)); // находение максимального элемента прогресии
                int mid = B + C + D - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            // Проверяем тройку (A, B, D)
            // Сравнение всех модулей разности пар элементов и проверка на отличие элементов тройки друг от друга
            if (((Math.abs(A - B) == Math.abs(A - D)) || (Math.abs(B - A) == Math.abs(B - D)) || (Math.abs(D - A) == Math.abs(D - B))) & A != B & A != D & B != D) {
                int min = Math.min(A, Math.min(B, D)); // находение минимального элемента прогресии
                int max = Math.max(A, Math.max(B, D)); // находение максимального элемента прогресии
                int mid = A + B + D - min - max; // вычиселние среднего элемента прогрессии
                out.println(min + " " + mid + " " + max); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            else {}

            if (foundProgression == false) { // Сравние значения foundProgression c его изначальным
                out.print("Здесь нет арифмитических прогрессий!"); // вывод, в случае если прогрессий нет
            }
            else {}
    }
    else {
        out.print("Данные должны быть в виде натуральных чисел!"); // вывод, в случае если хотя бы одно из чисел не натуральное
        }
    }
}