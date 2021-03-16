
package Week8HW810;


public enum TrafficLight {
    
    GREEN(120),
    YELLOW(45),
    RED(60);
    
    private final int duration;
    
    TrafficLight(int duration){
        this.duration = duration;
    }
    
    public int getDuration(){
        return duration;
    }
}
