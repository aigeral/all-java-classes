package HW16;

public class Task2 {
    public String reversedString(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();

    }

    public static void main(String[] args) {

        Task2 task2 = new Task2();
        System.out.println(task2.reversedString("Google"));

    }

}

