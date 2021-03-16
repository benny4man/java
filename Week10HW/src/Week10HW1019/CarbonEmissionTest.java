package Week10HW1019;



public class CarbonEmissionTest {
    public static void main(String[] args){
        Car car1 = new Car("Buick","Verano","Black","Gasoline",15.6,25);
        Bicycle bike1 = new Bicycle("Schwinn","Red",27.5);
        Building building1 = new Building("House","Grey",4500,10649);
        
        CarbonFootprint[] objects = {car1,bike1,building1};
        
        for(CarbonFootprint currentObject : objects){
            System.out.println(currentObject);
            System.out.println(currentObject.getCarbonFootprint());
        }
    }

}
