import java.util.Scanner;
class Shape
{
    protected int a;
    protected int b;
    Shape(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
}
class Rectangle extends Shape
{
    Rectangle(int a,int b)
    {
        super(a,b);
    }
    public void printArea()
    {
        System.out.println("Area of the rectangle= "+(a*b));
    }
}
class Triangle extends Shape
{
    Triangle(int a,int b)
    {
        super(a,b);
    }
    public void printArea()
    {
        System.out.println("Area of the triangle= "+(0.5*a*b));
    }
}
class Circle extends Shape
{
    Circle(int a,int b)
    {
        super(a,b);
    }
    public void printArea()
    {
        System.out.println("Area of the Circle= "+(3.14*a*a));
    }
}
class Main
{
    public static void main(String arg[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=scanner.nextInt();
        System.out.println("Enter the value of b:");
        int b=scanner.nextInt();
        Shape s=new Shape(a,b);
        Rectangle r=new Rectangle(a,b);
        r.printArea();
        Triangle t=new Triangle(a,b);
        t.printArea();
        Circle c=new Circle(a,b);
        c.printArea();
    }
}