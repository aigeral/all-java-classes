package Class23;

public class FinalKeyword {
     double gravity=9.8;
    final double PI=3.14;
    final double LightSpeed=299792458;
    void tryChanginGravity(){
        gravity=1.6;
    }
}
class Child extends FinalKeyword{
    @Override
    void tryChanginGravity() {
        super.tryChanginGravity();
    }
}
