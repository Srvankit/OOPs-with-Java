
public class method_overload {

    public static void main(int x){
        System.out.println("this is our first method " +x);
    }

    public static void main(float y){
        System.out.println("this is our second method " +y);
    }

    public static void main(String s){
        System.out.println("this is our third method " +s);
    }
    public static void main(String[] args){
        System.out.println("this is our main method");
        main(35);
        main(3.6f);
        main("ankit");
    }
}

