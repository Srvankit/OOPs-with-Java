
public class practice{
    int l,w;
    int area; // instance variable
    int perimeter; // instance variable

    practice(int a, int n){
        System.out.println("the area will be "+a*n);
        System.out.println("the perimeter will be "+2*(a+n));
        a=l;
        n=w;
    }

    public void show(){
        System.out.println();
        System.out.println();
    }
    public static void main(String[] args){
       practice p1= new practice(2, 03);
        practice p2= new practice(4, 06); 
        
        // We can also create a object without using any reference variable directly like - new DemoConstructor(); 
        
        // d.x=45;
        // d.name="ankit";
        // System.out.println("this roll no. is "+d.x);
        //  System.out.println("this roll no. is "+d.name);
        p1.show();
         p2.show();
    }
}