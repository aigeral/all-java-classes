package HW20;

public class UserClass {
    //Write program: userClass  that has a constructor
    // that initializes instance variable name and
    // mobile number. Create a subclass  userInfo that
    // will have user address variable and it also being
    // initialized through constructor call.
    // Print users name, mobile number and address
    // in userDetails method. Test your code.
    String name,mobileNumber;
    UserClass(String name,String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }
    public void userInfo(){
        System.out.println("User name is "+name+" Mobile number is "+mobileNumber);
    }
}
class SubClass extends UserClass{
    String adress;
    SubClass(String name,String MobileNumber,String adress){
        super(name,MobileNumber);
        this.adress=adress;
    }

void UserDetails() {
    System.out.println("Name " + name);
    System.out.println("Mobile number " + mobileNumber);
    System.out.println("adress " + adress);
}
}
