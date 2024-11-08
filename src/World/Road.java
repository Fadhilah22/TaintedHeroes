
public class Road {
    Generator generate;
    private String id;
    private Town origin;
    private Town destin;
    private int distance;

    public Road(Town origin, Town destin, int distance){
        this.generate = new Generator(0);
        this.id = generate.generateRoadId();
        this.origin = origin;
        this.destin = destin;
        this.distance = distance;
    }

    // getter
    public String getId(){
        return this.id;
    }
    public Town getOrigin() {
        return this.origin;
    }
    public Town getDestin() {
        return this.destin;
    }
    public int getDistance() {
        return this.distance;
    }

    // setter
    public void setOrigin(Town origin) {
        this.origin = origin;
    }
    public void setDestin(Town destin) {
        this.destin = destin;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }

    public static void main(String[] args) {

    }
}
