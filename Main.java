import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int A = in.nextInt(); // Ввод натурального числа
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int MinNN = 1;
        boolean foundProgression = false;

        //Проверка входных данных
        if (A >= MinNN & B >= MinNN & C >= MinNN & D >= MinNN) { 
            // Проверка наличия арифмитической прогрессии среди трёх чисел
            // Арифмитическая прогрессия существует тогда, когда разности между двумя модулями пар чисел равны
            // В данной задаче сушествует всего 4 варианта комбинаций четырёх чисел по 3, а именно {A, B, C}, {A, C, D}, {B, C, D}, {A, B, D}
            // Проверяем тройку (A, B, C)
            if ((Math.abs(A - B) == Math.abs(A - C)) || (Math.abs(B - C) == Math.abs(B - A)) || (Math.abs(C - A) == Math.abs(C - B))) { // Здесь существуют пары () 
                int min = Math.min(A, Math.min(B, C));
                int max = Math.max(A, Math.max(B, C));
                int mid = A + B + C - min - max;
                out.println(min + " " + mid + " " + max);
                foundProgression = true;
            }
            else {}

            // Проверяем тройку (A, C, D)
            if ((Math.abs(A - C) == Math.abs(A - D)) || (Math.abs(C - A) == Math.abs(C - D)) || (Math.abs(D - A) == Math.abs(D - C))) {
                int min = Math.min(A, Math.min(C, D));
                int max = Math.max(A, Math.max(C, D));
                int mid = A + C + D - min - max;
                out.println(min + " " + mid + " " + max);
                foundProgression = true;
            }
            else {}

            // Проверяем тройку (B, C, D)
            if ((Math.abs(B - C) == Math.abs(B - D)) || (Math.abs(C - B) == Math.abs(C - D)) || (Math.abs(D - B) == Math.abs(D - C))) {
                int min = Math.min(B, Math.min(C, D));
                int max = Math.max(B, Math.max(C, D));
                int mid = B + C + D - min - max;
                out.println(min + " " + mid + " " + max);
                foundProgression = true;
            }
            else {}

            // Проверяем тройку (A, B, D)
            if ((Math.abs(A - B) == Math.abs(A - D)) || (Math.abs(B - A) == Math.abs(B - D)) || (Math.abs(D - A) == Math.abs(D - B))) {
                int min = Math.min(A, Math.min(B, D));
                int max = Math.max(A, Math.max(B, D));
                int mid = A + B + D - min - max;
                out.println(min + " " + mid + " " + max);
                foundProgression = true;
            }
            else {}

            if (foundProgression == false) {
                out.print("Здесь нет прогрессий!");
            }
            else {}
    }
    else {
        out.print("Данные должны быть в виде натуральных чисел!");
    }
}
}