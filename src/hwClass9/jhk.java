package hwClass9;

public class jhk {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];


            }

            //System.out.println();

        }    System.out.print("The sum of all numbers is "+sum+" ");
    }
}

