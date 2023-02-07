package Class17;

public class Student {
    String id;
    String name;
    int age;
    double weight;

    Student(String StId,String Stname,int StAge,double StWeight){
       id=StId;
       name=Stname;
       age=StAge;
       weight=StWeight;
    }
    void printInfo(){
        System.out.println("Id "+id+" Name "+name+" age "+age+" weight "+weight);
    }
}
