// Name of the method must be same
// With the different parameters 
// If the parameters are same then the datatypes must be different
// Return type can be changed


public class MethodOverloading {
    int side = 10;
    int length,breadth;
    double radius;

    public void area()
    {
        int x = side*side;
        System.out.println("The area of the square is "+x);
    }
    public void area(int l,int b)
    {
        length = l;
        breadth = b;
        int x = length*breadth;
        System.out.println("The area of rectangle is "+x);
    }
    public double area(int r)
    {
        radius = r;
        double x = 3.14*radius*radius;
        return x;
    }
    public static void main(String[] args){
        MethodOverloading mo = new MethodOverloading();
        mo.area();
        mo.area(5,6);
        double y = mo.area(5);
        System.out.println("The area of circle is "+y);
    }
} 
