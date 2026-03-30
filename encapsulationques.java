
public class encapsulationques {
    private int moveiId;
    private int noofseats;
    private double costperticket;

     public int getMovieId(){
        return moveiId;
    }
    public void setMovieId(int age, int moveiId){
        this.moveiId=moveiId;
    }
    public double getCostperTicket(){
        return costperticket;
    }
    public void setCostperTicket(double costperticket){
        this.costperticket=costperticket;
    }

    encapsulationques(int moveiId, int noofseats){
        this.moveiId=moveiId;
        this.noofseats=noofseats;
    }
    
    double calculatetotalAmount(){
        double totalamount, x=0.0;
        if (moveiId==111) {
            setCostperTicket(7);
        }
        else if (moveiId==112) {
            setCostperTicket(8);
        }
        else{
            if (moveiId==13) {
                setCostperTicket(8.5);
            }
            else{
                System.out.println("invalid id");
            }
        }

        totalamount = noofseats*costperticket;
        x=totalamount+(totalamount*0.02);
        return x;
    }
    public static void main(String[] args) {
        encapsulationques en= new encapsulationques(112,3);
        double y= en.calculatetotalAmount();
        int z=(int) Math.round(y);
        System.out.println("the total amount is "+z);

    }
}
