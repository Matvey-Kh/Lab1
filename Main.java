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
        int temp; // переменная для сортировки
        boolean foundProgression = false; // Значение, которое определеяет найдена прогрессия или нет

        //Проверка входных данных
        if (A >= MinNN && B >= MinNN && C >= MinNN && D >= MinNN) { 
            // Сортировка чисел по неубыванию
            // Большее ложим в переменную temp, присваиваем большему значение меньшего и затем меньшему значение большего (переставляем)
            // Делаем так для всех последовательных пар
            if (A > B) {
                temp = A; A = B; B = temp;
            }
            if (A > C) {
                temp = A; A = C; C = temp;
            }      
            if (A > D) {
                temp = A; A = D; D = temp;
            }
            if (B > C) {
                temp = B; B = C; C = temp;
            }
            if (B > D) {
                temp = B; B = D; D = temp;
            }
            if (C > D) {
                temp = C; C = D; D = temp;
            } 
            // Проверка наличия арифмитической прогрессии среди трёх чисел
            // Арифмитическая прогрессия существует тогда, когда разность между большим и средним числом равна разности среднего и меньшего
            // В данной задаче имеет смысл проверять 4 тройки: {C, B, A}, {D, C, B}, {D, C, A}, {D, B, A}
            //Тройка A B C
            if ((C - B == B - A) && A != B && A != C && B != C) { 
                out.println(A + " " + B + " " + C); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }     
            //Тройка B C D
            if ((D - C == C - B) && B != C && B != D && C != D) { 
                out.println(B + " " + C + " " + D); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            //Тройка A C D
            if ((D - C == C - A) && A != C && A != D && C != D) { 
                out.println(A + " " + C + " " + D); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
            //Тройка A B D
            if ((D - B == B - A) && A != B && A != D && B != D) { 
                out.println(A + " " + B + " " + D); // вывод прогрессии из трёх элементов в порядке возрастания
                foundProgression = true; // смена значения foundProgression с true на false (чтобы не выводилось "Здесь нет прогрессий!")
            }
        
            if (foundProgression == false) { // Сравние значения foundProgression c его изначальным
                out.print("Здесь нет арифмитических прогрессий!"); // вывод, в случае если прогрессий нет
            }

    }
    else {
        out.print("Данные должны быть в виде натуральных чисел!"); // вывод, в случае если хотя бы одно из чисел не натуральное
        }
    }
}