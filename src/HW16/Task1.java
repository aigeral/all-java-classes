package HW16;

public class Task1 {
    int sumArrayNumbers(int[]arr){
        int sum=0;
        for (int num:arr) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 tester=new Task1();
        int[] array={10,20,30,40};
        System.out.println(tester.sumArrayNumbers(array));


    }
}




