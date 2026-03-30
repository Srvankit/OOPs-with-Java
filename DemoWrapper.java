public class DemoWrapper {
    public static void main(String[] args) {
        int a =10;
        Integer WrapperObject = a;
        System.out.println(WrapperObject);
        // java converts int into Integer and this is called "autoboxing".

        Integer anotherObject =20;
        int a1 = anotherObject;
        System.out.println(a1);
        // java automatically converts Integer into int. This is called "unboxing".
    }
}
// wrapper class are used to convert primitve datatype into objects.
// it help while working with collections
// primitve wrapper meaning:
//  int -> Integer
//  char -> Character
//  double - Double
//  long -> Long 
//  short-> Short
//  byte -> Byte
//  boolean -> Boolean

//  Collection:-
//  It is a framework which is used to store data(group of objects).
//  -> It is an interface
//  -> java.util.Collection
//  -> method like add(), remove(), size()
//  -> Classes -> ArrayList, hashset, etc.
