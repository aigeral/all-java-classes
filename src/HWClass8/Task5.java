package HWClass8;

public class Task5 {
    public static void main(String[] args) {
        for (int i=5;i>0;i--){
            for(int j=1;j<=5;j++){
                if(i==4 && j<2||i==3&& j<3|| i==2 && j<4 || i==1 && j<5) {
                    System.out.print("");
                    continue;
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
