package HWClass8;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i <= 3) {
                System.out.println("*");
                System.out.println("");
            } else if (i == 4 || i == 6) {
                System.out.println("**");
            } else if (i == 5 || i == 7) {
                System.out.println("*");
            }
        }
    }
}



