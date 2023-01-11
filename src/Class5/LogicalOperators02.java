package Class5;

public class LogicalOperators02 {
    public static void main(String[] args) {
        /* if the score in all the subject are greater  than 90 print brilliant student
        otherwise print you need to work hard
         */
        double math=92.5;
        double history=91.5;
        double science=93.5;

        if(math>90&&history>90&&science>90){
            System.out.println("You are a brilliant student");
        }else{
            System.out.println("You need work harder");
        }





    }
}