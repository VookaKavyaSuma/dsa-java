abstract class Shape{
    
    int dim1,dim2;

    Shape(int dim1,int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void printArea();
}

class Rectangle extends Shape{
    Rectangle(int length,int breadth){
        super(length,breadth);
    }
    void printArea(){
        int area = dim1*dim2;
        System.out.println("Area of the Rectangle is : " + area);
    }
}
class Triangle extends Rectangle{
    Triangle(int length,int breadth){
        super(length,breadth);
    }
    void printArea(){
        double area = 0.5*dim1*dim2;
        System.out.println("Area of the Triangle is : " + area);
    }
}
public class Abstract {
    public static void main(String[] args){
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(10,20);
        r.printArea();
        t.printArea();
    }
}
