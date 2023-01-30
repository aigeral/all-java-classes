package Class15;

public class Task {
    //Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

    //return type String
    //name of the method CreateEmail
    //parameter=>String firstName String lastName


    String createEmail (String firstName, String lastName,String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }




static public void main (String []args){
        Task task=new Task();
    System.out.println(task.createEmail("Jon","snow","gmail"));
}

}