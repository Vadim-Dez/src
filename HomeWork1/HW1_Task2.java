package HomeWork1;

public class HW1_Task2 {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 8;


        int result1 = a + b / c;
        /*
        result1 = 5 + 2 / 8
        очередность выполнения действий:
        2/8 = 0,25
        5 + 0,25 = 5,25 (произойдет округление)
        result1 = 5.
        */
        System.out.println(result1);


        int result2 = (a + b) / c;
        /*
        result2 = (5+2) / 8
        очередность выполнения действий:
        5 + 2 = 7
        7 / 8 = 0,875 (произойдет округление)
        result2 = 0.
        */
        System.out.println(result2);


        int result3 = (a + b++) / c;
        /*
        result3 = (5+2++) / 8
        очередность выполнения действий:
        5 + 2 = 7
        b++ = b + 1 = (2+1 = 3) - пост/инкремент произошел после сложения a+b, следовательно новое значение b не используется
        7 / 8 = 0,875 (произойдет округление)
        result3 = 0.
        */
        System.out.println(result3);


        int result4 = (a + b++) / --c;
        /*
        result4 = (5 + 2++) / --8
        очередность выполнения действий:
        5 + 2 = 7;
        b++ = b + 1 = (2+1 = 3) - пост/инкремент произошел после сложения a+b, следовательно новое значение b не используется
        --c = c - 1 = (8-1 = 7) - пре/декремент, число меняется до того как произойдет деление
        7 / 7 = 1
        result4 = 1.
        */
        System.out.println(result4);


        int result5 = (a * b >> b++) / --c;
        /*
        result5 = (5 * 2 >> 2++) / --8
        очередность выполнения действий:
        5 * 2 = 10
        >> - сдвиг вправо числа 10 на 2 знака: 0000 1010 сдвиг на 2 вправо = 0000 0010 = 2
        b++ = b + 1 = (2+1 = 3) - пост/инкремент произошел после сложения a+b, следовательно новое значение b не используется
        --c = c - 1 = (8-1 = 7) - пре/декремент, число меняется до того как произойдет деление
        2 / 7 = 0,285 (произойдет округление)
        result5 = 0.
        */
        System.out.println(result5);


        int d = 7, e = 22, f = 68, g = 20;
        int result6 = (a + d > g ? f : e * b >> b++) / --c;
        /*
        result6 = (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        очередность выполнения действий:
        лев часть числителя:
        5 + 7 = 12
        12 > 20 - false, числителю будет присвоено значение после знака ":" (правая часть);
        правая часть числителя:
        22 * 2 = 44
        сдвиг вправо числа 44 на 2 знака: 0010 1100 >> 2 = 0000 1011 = 11;
        b++ = b + 1 = (2+1 = 3) - пост/инкремент произошел после сложения a+b, следовательно новое значение b не используется
        --c = c - 1 = (8-1 = 7) - пре/декремент, число меняется до того как произойдет деление
        11 / 7 = 1,571 (произойдет округление)
        result6 = 1.
        компилятор выдает результат = 0
        */
        System.out.println(result6);



        //int result7 = (a + d > g ? f >= f : e * b >> b++) / --c;
        /*
        Ошибка компиляции: java: bad operand types for binary operator '/'
        first type:  java.lang.Object&java.io.Serializable&java.lang.Comparable<? extends java.lang.Object&java.io.Serializable&java.lang.Comparable<?>>
        second type: int
        */



        int h = 6, i = 3, j = 12, k = 119;
        boolean result8 = h - b > i && j * j <= k;
        /*
        result6 = 6 - 2 > 3 && 12 * 12 <=119
        очередность выполнения действий:
        лев часть операнда:
        6 - 2 = 4
        4 > 3 - true
        правая часть операнда:
        12 * 12 = 144;
        144 <= 119 - false
        true && false = false
        result8 = false.
        */
        System.out.println(result8);


        boolean result9 = true && false;
        /*
        при использовании лог.оператора И (&&) дает результат true только когда оба операнда будут true, в остальных случаях - false
        result9 = false
        */
        System.out.println(result9);
    }
}
