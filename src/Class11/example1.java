package Class11;

public class example1 {
    public static void main (String [] args) {
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        // write a loop to print all the elements from this 2D array
        for (int i = 0; i < matrix.length; i++) {
            //matrix[i].length the size of each 1D array
            for (int j = 0; j < matrix[i].length; j++) {
                    System.out.println(matrix[i][j] + " ");
                }
                System.out.println();
            }



        }
    }

