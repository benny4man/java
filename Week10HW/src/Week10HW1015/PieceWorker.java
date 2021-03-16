package Week10HW1015;



public class PieceWorker extends Employee{
    private final double wage;
    private final double pieces;
    
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces){
        super(firstName, lastName, socialSecurityNumber);
        
        this.wage = wage;
        this.pieces = pieces;
    }
    
    @Override
    public double earnings(){
        double earnings = wage * pieces;
        return earnings;
    }
    
    public double getWage(){return wage;}
    
    public double getPieces(){return pieces;}
    
    @Override
    public String toString(){
        return String.format("pieceworker employee: %s%n%s: $%,.2f; %s: %,.2f", 
            super.toString(), "wage per piece", getWage(),                     
            "pieces produced", getPieces()); 
    }

}
