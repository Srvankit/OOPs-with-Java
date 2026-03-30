
public class ConstructorsChaining {


    int length;
    int breadth;
    int height;
    int volume;

    ConstructorsChaining(int length){
        this(length, 8);
        System.out.println("this is my first constructor");
    }
    ConstructorsChaining(int length, int breadth){
        this(length,breadth,7);
        System.out.println("my name is amit");
    }
    ConstructorsChaining(int length, int breadth, int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        volume=length*breadth*height;
        System.out.println("hello class my name is ankit yadav");
    }

    public void show(){
        System.out.println("the length is " +length);
        System.out.println("the breadth is " +breadth);
        System.out.println("the height is " +height);
        System.out.println("the volume is " +volume);
    }
    public static void main(String[] args){
        ConstructorsChaining c= new ConstructorsChaining(2);
        c.show();
    }
}
// calling of one particular constructor from another constructor in the same class is called constructor chaining.
// all the above constructor can be cslled with single object.