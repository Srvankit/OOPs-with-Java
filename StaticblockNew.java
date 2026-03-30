
public class StaticblockNew {
    String ProductName;
    int Productid;
    static String productcompany;
    static int counter;

    static{ 
        productcompany= "My New Company";
        counter= 0;
        counter++;
    }

    StaticblockNew(String ProductName, int Productid){
        this.ProductName=ProductName;
        this.Productid= Productid;
    }

    public void show(){
        System.out.println("the product name is "+ProductName);
        System.out.println("the product id is "+Productid);
        System.out.println("the name of the product company is "+StaticblockNew.productcompany);
        System.out.println("the value of the counter is "+StaticblockNew.counter);
    }
    public static void main(String[] args){
        StaticblockNew s= new StaticblockNew("laptop", 1001);
        s.show();
        StaticblockNew s1= new StaticblockNew("tv", 1002);
        s1.show();
    }
}
