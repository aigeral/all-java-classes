package Class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {
        Integer integer=new Integer(10);
        int number=integer;//its autoboxing
        int number2=integer.intValue();//unboxing

        double d=12.3;
        Double wrapper=new Double(d);//boxing
        Double wrapperP=d;//autoboxing

        Float f=12f;
        ArrayList<Float> arrayList=new ArrayList<>();
        arrayList.add(12.0f);

        double fg=12f;
    }
}
