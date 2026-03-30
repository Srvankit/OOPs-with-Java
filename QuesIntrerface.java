
interface Tax{
   double CalculateTax(double price);
}

class PurchaseDetails implements Tax{
    private String purchaseId;
    String paymentType;
    double taxPercentage;
    PurchaseDetails(String purchaseId, String paymentType, double taxPercentage){
        this.paymentType=paymentType;
        this.purchaseId=purchaseId;
        this.taxPercentage = taxPercentage;
    }
    public String getPurchaseId() {
        return purchaseId;
    }
    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public double getTaxPercentage() {
        return taxPercentage;
    }
    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    public double CalculateTax(double price){
        if (getPaymentType().equals("debit card")) {
        }
        return price;
    }
}

class Seller{
    double taxPercentage;
    Seller(String location){

    }
}

public class QuesIntrerface {
    
}
