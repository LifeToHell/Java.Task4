package task4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Задание
 * 
 * Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном
 * порядке и каждый из их узлов содержит одну цифру.
 * 1) Умножьте два числа и верните произведение в виде связанного списка.
 * 2) Сложите два числа и верните сумму в виде связанного списка.
 * Одно или два числа могут быть отрицательными.
 * 
 * Даны два Deque, цифры в обратном порядке.
 * [3,2,1,-] - пример Deque
 * [5,4,3]- пример второго Deque
 * 1) -123 * 345 = -42 435
 * Ответ всегда - связный список, в обычном порядке
 * [-,4,2,4,3,5] - пример ответа
 */
public class Deque_operation {

    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>(Arrays.asList("3", "2", "1", "-"));
        Deque<String> reversedDeque = new ArrayDeque<>();

        while (deque.peek() != null) {

            reversedDeque.offerLast(deque.pollLast());

        }
        System.out.println(reversedDeque);
        String result = "";
        while (!reversedDeque.isEmpty()) {
            Object o = reversedDeque.pollFirst();
            result += o.toString();
        }

        if (result.charAt(0) == '-') {
            result = "-" + result.substring(1).replaceAll("\\D", "");
        } else {
            result = result.replaceAll("\\D", "");
        }
        int num1 = Integer.parseInt(result);
        System.out.println(num1);
        Deque<String> deque2 = new ArrayDeque<>(Arrays.asList("5", "4", "3"));
        Deque<String> reversedDeque2 = new ArrayDeque<>();

        while (deque2.peek() != null) {

            reversedDeque2.offerLast(deque2.pollLast());

        }
        System.out.println(reversedDeque2);
        String result2 = "";
        while (!reversedDeque2.isEmpty()) {
            Object o = reversedDeque2.pollFirst();
            result2 += o.toString();
        }

        if (result2.charAt(0) == '-') {
            result2 = "-" + result2.substring(1).replaceAll("\\D", "");
        } else {
            result2 = result2.replaceAll("\\D", "");
        }
        int num2 = Integer.parseInt(result2);
        System.out.println(num2);
        int b = 0;
        b = num2 + num1;
        System.out.println(b);
        String w = Integer.toString(Math.abs(b)); 
        char[] charssum = w.toCharArray(); // 
        Deque<Character> dequressum = new ArrayDeque<>();
        if (b < 0) {
            dequressum.add('-');
        }
        for (char ch : charssum) {
            dequressum.add(ch);
        }
        System.out.println(dequressum);

        int c = 0;
        c = num2 * num1;
        System.out.println(c);
        String s = Integer.toString(Math.abs(c)); 
        char[] chars = s.toCharArray(); // 
        Deque<Character> dequres = new ArrayDeque<>();
        if (c < 0) {
            dequres.add('-');
        }
        for (char ch : chars) {
            dequres.add(ch);
        }
        System.out.println(dequres);

    }
}
