package HW20;

public class Shape {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code
    int radius;
    Shape(int r){
        this.radius=r;
    }
}
class Circle extends Shape{

    double area;
    double p;
    Circle(int radius,double p){
        super(radius);
        this.p=p;
    }

    void areOfCircle(){
        double areaOfCircle= this.area=p*radius*radius;
        System.out.println("Area of circle = "+ areaOfCircle);
    }

}
