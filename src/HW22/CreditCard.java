package HW22;

public class  CreditCard {
    //Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX.
    // In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
     int balance;
     double interest;
     void CalculateInterest (int balance,double interest){
         this.balance=balance;
         this.interest=interest;
         System.out.println((balance*interest)*3);

     }
}

class Visa extends CreditCard{

}
class AX extends CreditCard{
    void CalculateInterest(int balance,double interest){
        System.out.println((balance*interest)*7.5);

    }

    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        Visa visa = new Visa();
        visa.CalculateInterest(150000, 0.02);
        AX ax = new AX();
        ax.CalculateInterest(150000, 0.02);

    }

}
