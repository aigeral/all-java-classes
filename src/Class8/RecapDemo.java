package Class8;

public class RecapDemo {
    public static void main(String[] args) {
        // 10 8 6 4 2
        int number=10;
        while(number>=2){
            System.out.println(number);
            number-=2;
        }
        System.out.println("********************");

        int num=2;
        do{
            System.out.println(num);
            num=num-2;
        }while(number>=2);
    }
}
