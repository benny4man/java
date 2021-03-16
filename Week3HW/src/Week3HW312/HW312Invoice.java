
package Week3HW312;


public class HW312Invoice {
    private String partNum;
    private String partDesc;
    private int quant;
    private double pricePerItem;
    
    public HW312Invoice(String partNum, String partDesc, int quant, double pricePerItem) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        
        if (quant > 0){
            this.quant = quant;
        }
        if (pricePerItem > 0.0){
            this.pricePerItem = pricePerItem;
        }
    }
    public void setPartNum(String PartNum){
        this.partNum = PartNum;
    }
    
    public String getPartNum(){
        return partNum;
    }
    
    public void setPartDesc(String PartDesc){
        this.partDesc = PartDesc;
    }
    
    public String getPartDesc(){
        return partDesc;
    }
    
    public void setQuant(int quant){
        this.quant = quant;
    }
    
    public int getQuant(){
        return quant;
    }
    
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    
    public double getPricePerItem(){
        return pricePerItem;
    }
    
    public double getInvoiceAmount(){
        double total = quant * pricePerItem;
        return total;
    }
}
