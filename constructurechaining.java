public class constructurechaining {
	
	
	int length,breadth;
	int height,volume;
	
	
	constructurechaining(){
		this(2);
	}
	
	constructurechaining(int length){
		this(length,8);
		System.out.println("this is my first constructure");
		
	}
    constructurechaining(int length , int breadth){
    	this(length,breadth,7);
    	System.out.println("hii myself sidhinath");
		
	}
    constructurechaining(int length , int breadth,int height){
    	this.length=length;
    	this.breadth = breadth;
    	this.height= height;
    	volume = length*breadth*height;
		System.out.println("hello class my name is sidhinath");
	}
    
     public void show() {
    	System.out.println("the length is "+length);
    	System.out.println("the breadth is "+breadth);
    	System.out.println("the height is "+height);
    	System.out.println("the volume is "+volume);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructurechaining c= new constructurechaining();
		c.show();

	}

}
