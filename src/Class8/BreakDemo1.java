package Class8;

public class BreakDemo1 {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=75;

        while (summer){
            if(temp<=100){
                System.out.println("I love summer");
            }else{
                System.out.println("Its very hot");
                break;
            }
            temp+=5;

        }
    }
}
