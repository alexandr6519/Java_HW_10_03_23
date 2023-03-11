//Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.Arrays;

public class Task_02 {
    static void printList(ArrayList<Integer> list) {
        int size = list.size();
        if (size == 1) {
            System.out.printf("[%d]",list.get(0));
        } else if (size > 1) {
            System.out.printf("[%d", list.get(0));
            for (int i = 1; i < size; i++) {
                System.out.printf(", %d", list.get(i));
            }
            System.out.println("]");
        }
    }

    static void removeEvenNumbersFromList(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> listNumbers = new ArrayList<>(Arrays.asList(3, 8, 1, 9, 34, 25, 20, 97, 4, 25, 22));
        printList(listNumbers);
        removeEvenNumbersFromList(listNumbers);
        printList(listNumbers);
    }
}
