import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Дз массивы. Задача 1");
        int [] weight = new int [3];
        weight [0] = 1;
        weight [1] = 2;
        weight [2] = 3;


        double[] array = {1.57, 7.654, 9.986};


        int [] numbers = {6, 4, 8};


        // Задача 2
        System.out.println("Дз массивы. Задача 2");
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i != weight.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length -1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length -1) {
                System.out.print(", ");
            }
        }

        // Задача 3
        System.out.println("\nДз массивы. Задача 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        // Задача 4
        System.out.println("\nДз массивы. Задача 4");
        for (int i = 0; i < weight.length; i++) {
            if(weight[i] % 2 != 0) {
                weight[i] +=1;}
        }
        System.out.println(Arrays.toString(weight));

    }
}