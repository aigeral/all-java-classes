package HW16;

public class Task3 {
    private String strVowels(String str) {
        System.out.println(str.replaceAll("[^aeiou]", ""));
        return str;
    }

    public static void main(String[] args) {
        Task3 task3 = new Task3();
        System.out.println(task3.strVowels("volcano"));
    }
}
