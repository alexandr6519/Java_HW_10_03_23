//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
import java.util.ArrayList;

public class Task_03 {
    static ArrayList<Integer> getListRandomNumbers(int n) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        for (int i = 1; i < n; i++) {
             resultList.add((int)(Math.random()*((20) + 1)));
        }
        return resultList;
    }

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

    static int getMinimumFromList(ArrayList<Integer> listNumbers) {
        int min = listNumbers.get(0);
        for (int i = 1; i < listNumbers.size(); i++) {
             if (listNumbers.get(i) < min) {
                min = listNumbers.get(i);
             }
        }
        return min;
    }

    static int getMaxmumFromList(ArrayList<Integer> listNumbers) {
        int max = listNumbers.get(0);
        for (int i = 1; i < listNumbers.size(); i++) {
             if (listNumbers.get(i) > max) {
                max = listNumbers.get(i);
             }
        }
        return max;
    }
    static double getAverageElementsList(ArrayList<Integer> listNumbers) {
        int size = listNumbers.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
             sum += listNumbers.get(i);
        }
        return (double)sum / (double) size;
    }
    public static void main(String[] args) {
        int n =30;
        ArrayList<Integer> listNumbers = getListRandomNumbers(n);
        System.out.printf("The  list of %d random numbers (from 0 to 20) is: \n", n);
        printList(listNumbers);
        System.out.printf("The minimum element of list is: %d \n", getMinimumFromList(listNumbers));
        System.out.printf("The maximum element of list is: %d \n", getMaxmumFromList(listNumbers));
        System.out.printf("The average of elements of list is: %.2f \n", getAverageElementsList(listNumbers));
    }
}
