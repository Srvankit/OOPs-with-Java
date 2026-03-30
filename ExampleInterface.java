

interface AddNumbers{
    void number(); // by default it's abstract method that why there wont be any implementation     inside it. So abstract  is an optional keyword here
}
interface CountCharacters{
    void character(String str);

}
class Sample implements AddNumbers, CountCharacters{

    @Override
    public void character(String str) {
        // TODO Auto-generated method stub
        System.out.println("the number of characters are "+str.length());
    }

    @Override
    public void number() {
        // TODO Auto-generated method stub
        int sum =0;
      for(int i=1; i<=100;i++){
      sum = sum +i;
      }
      System.out.println(sum);
    }

}
public class ExampleInterface {
    public static void main(String[] args) {
      Sample s = new Sample();
      s.character("ankit");
      s.number();

      AddNumbers a = new Sample();
      CountCharacters c = new Sample();
      a.number();
      c.character("ankityadav   "); // Dynamic Polymorphism
    }
}
// "implements" keyword is used
// used in abstraction(for hiding internal implementation of methods)