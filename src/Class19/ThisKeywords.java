package Class19;

public class ThisKeywords {
    int a,b;

    ThisKeywords(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void sum(int a,int b){
        System.out.println("Sum of local variables "+a+b);
    }


    public static void main(String[] args) {
        ThisKeywords obj=new ThisKeywords(10,20);
        obj.sum(100,200);







    }

}
