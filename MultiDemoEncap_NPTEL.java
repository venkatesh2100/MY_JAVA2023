class circle{
    double x,y;
    double r;
double circumstance(){
    return 3.14*2*r;
}
double area(){
    return 3.14*r*r;
}    
}
class Box{
    double width;
    double height;
    double depth;
    double areaB(){
        double a;
        a=(width*depth+width*height+height*depth)*2;
        return a;
    }
    double volume(){
        double v;
        v=(width*depth*height);
        return v;
    }
}

public class MultiDemoEncap_NPTEL {
    public static void main(String[] args){
        circle c=new circle();
        Box b=new Box();
    c.x=3;c.y=4;c.r=5;
    b.width=3;b.height=4;b.depth=5;


    System.out.println("Area of the circle :"+c.area());
    System.out.println("Circumstance  of the circle:"+c.circumstance());
    System.out.println("Area of the Box:"+b.areaB());
    System.out.println("Volume of the Box:"+b.volume());
}
    
}
{
    public static void main(String[] args)
    {
        
    }
}