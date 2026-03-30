
class product{
    String product_name = "IPhone";
    public void show(){
        System.out.println("The product name is "+product_name);
    }
}

class productId extends product{
    int productid = 1001;
    public void display(){
        System.out.println("this is my product id "+productid);
    }
}

class productwarranty extends productId{
    int warranty = 2;
    public void demo(){
        System.out.println("the years of warranty is "+warranty);
    }
}

public class multi_levelinheritence {
    public static void main(String[] args) {
        productwarranty w = new productwarranty();
        w.demo();
        w.display();
        w.show();
    }
}
// We can't call the methods demo and display with the object of class product because productifd and productwarranty becomes the child of the product class.