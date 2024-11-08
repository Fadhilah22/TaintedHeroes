import java.util.ArrayList;

public class Place{
    Generator generate;
    private String id;
    public String name;
    public ArrayList<Human> humanList;

    public Place(String name){
        this.generate = new Generator(0);
        this.id = generate.generatePlaceId();
        this.name = name;
        this.humanList = new ArrayList<Human>();
    }

    // getter
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Human> getHumanList(){
        return this.humanList;
    }
    // setter
    public void setName(String name){
        this.name = name;
    }

}
