package Class8;

public class ContinueKeyword {
    public static void main(String[] args) {


        for (int i=0; i<10; i++){
            if(i%3==0) {
                continue; //skip
            }else{
                System.out.println(i);

            }
            System.out.println("Hello Java");
        }
    }
}
