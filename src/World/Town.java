import java.util.ArrayList;

public class Town {
    Generator generate;
    public String id;
    public String townName;
    public ArrayList<Road> roadList;

    public Town(String townName) {
        this.generate = new Generator(0);
        this.id = generate.generateTownId();
        this.townName = townName;
        this.roadList = new ArrayList<Road>();
    }

    // getter
    public String getId(){
        return this.id;
    }
    public String getTownName(){
        return this.townName;
    }
    public ArrayList<Road> getRoadList(){
        return this.roadList;
    }
    // setter
    public void setTownName(String townName){
        this.townName = townName;
    }

    public void addRoad(Road newRoad){
        this.roadList.add(newRoad);
    }

    public static void main(String[] args) {

    }
}
