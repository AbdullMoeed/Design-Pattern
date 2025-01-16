package org.example;

public class BadCode {

    public void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                }
            }
        }
    }

    public void processString(String str) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Processing string: " + str);
        }
    }

    public void calculateSum(String[] arr) {
        int sum = 0;
        for (String s : arr) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + s);
            }
        }
        System.out.println("Sum: " + sum);
    }

    public void printIterations(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Iteration: " + i);
        }
        System.out.println("Task complete.");
    }

    public static void main(String[] args) {
        BadCode badCode = new BadCode();

        int[] arr = {10, 20, 30, 40, 50, 20};
        badCode.findDuplicates(arr);

        String str = "badcode";
        badCode.processString(str);

        String[] numbers = {"10", "20", "NaN", "30"};
        badCode.calculateSum(numbers);

        badCode.printIterations(100);
    }
}
