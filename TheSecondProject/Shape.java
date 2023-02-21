package TheSecondProject;

public interface Shape {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    // Test your code.

      void calculateArea();
      void calculatePerimiter();
}
class Circle implements Shape{
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area=Math.PI*radius*radius;
        System.out.println("The area of the circle is "+area);
    }

    @Override
    public void calculatePerimiter() {
        double perimeter=2*Math.PI*radius;
        System.out.println("The perimeter of Circle "+ perimeter);
    }
}

class Square implements Shape{

   double side;
   Square (double side){
       this.side=side;
    }


    @Override
    public void calculateArea() {
       double area=side*side;
        System.out.println("The area of the Square "+area);

    }

    @Override
    public void calculatePerimiter() {
       double perimeter= 4*side;
        System.out.println("The perimeter of Square "+perimeter);

    }


    public static void main(String[] args) {
       Circle circle=new Circle(4);
       circle.calculateArea();
       circle.calculatePerimiter();

       Square square=new Square(5);
       square.calculateArea();
       square.calculatePerimiter();

    }

    }


