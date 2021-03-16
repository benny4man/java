
package Week8HW810;

public class TrafficLightTest {
    public static void main(String[] args) {
    
        System.out.printf("%-10s%-10s%n","Color","Duration");
        
        for(TrafficLight light : TrafficLight.values()){
            System.out.printf("%-10s%s Seconds%n",light,light.getDuration());
        }
    }
}
