package ex2;

import java.util.*;

/**
 * Мінімальне з N чисел (використовувати LinkedList):
 * 1. Введіть із клавіатури число N.
 * 2. Вважати N цілих чисел і заповнити ними список - метод getIntegerList.
 * 3. Знайти мінімальне число серед елементів списку – метод getMinimum.
 */

public class MinimumValue{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число  > 0:");
        int value = 0;
        try {
            value = (int) sc.nextDouble();

        }catch (InputMismatchException e){
            throw new InputMismatchException("Помилка! Допускається ціле число або число 'з плаваючою комою'. Програма завершує свою роботу(");
        }
        if (value >= 1 ) {
            List<Integer> list = new LinkedList<>();
            getIntegerList(list, value);
            int minimum = getMinimum(list);
            System.out.println("Мінімальне число: " + minimum);
        }else {
            throw new Exception("Помилка! Число має бути >= 1. Програма завершує свою роботу( ");
        }
    }

    public static void getIntegerList(List<Integer> list, int size) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= size; i++) {
            System.out.println("Введіть ціле число " + i + "/" + size);
            ((LinkedList<Integer>) list).addLast(sc.nextInt());
        }
    }

    public static int getMinimum(List<Integer> list){
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return ((LinkedList<Integer>) list).getFirst();
    }
}
