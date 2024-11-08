import java.util.ArrayList;
import java.util.Scanner;

public class World {
    public String worldId;
    public String worldName;
    ArrayList<Town> townList;
    Scanner scan;
    Town currentTown;

    public World(String worldName, boolean debugMode){
        this.worldName = worldName;
        this.townList = new ArrayList<Town>();
        if(debugMode) this.scan = new Scanner(System.in);
    }

    public void addNewTown(Town current, String newTownName){
        Town newTown = new Town(newTownName);
        Road currentToNew = new Road(current, newTown, 0);
        Road newToCurrent = new Road(newTown, current, 0);
        this.currentTown.addRoad(currentToNew);
        newTown.addRoad(newToCurrent);
    }

    public void debugMakeNewVertex(){
        String townName;
        System.out.print("Enter vertex name >> ");
        townName = scan.nextLine();

        if(townList.size() == 0){
            Town newTown = new Town(townName);

            this.townList.add(newTown);
            this.currentTown = newTown;
        } else {
            addNewTown(this.currentTown, townName);
        }
    }

    public void debugTraverse(){
        if(this.currentTown == null) {
            System.out.println("No town bruh");
            return;
        } else if(this.townList.size() == 0){
            System.out.println("No town to go bruh");
            return;
        }
        int index;
        System.out.println("======[Traverse]======");
        System.out.println("current town : " + this.currentTown.getTownName());
        System.out.println("list of available traversal:");
        int n = 1;
        for(Road road : this.currentTown.getRoadList()){
            System.out.println("" + n + ". " + road.getDestin().getTownName());
            n++;
        }
        System.out.println("0. back");

        boolean notValid = true;
        while(notValid){
            System.out.print("Traverse to >> ");
            index = scan.nextInt() - 1;
            if(index < -1 || index > this.currentTown.getRoadList().size()){
                System.out.println("Select valid traverse option!");
            } else if(index == -1){
                return;
            } else {
                this.currentTown = this.currentTown.getRoadList()
                                        .get(index)
                                        .getDestin();
                notValid = false;
            }
        }

    }

    public void debugMenu(){
        boolean isRunning = true;
        int option;

        while(isRunning){
            System.out.println("======[Debug Mode]======");
            System.out.println("1. Make vertex");
            System.out.println("2. Delete vertex");
            System.out.println("3. Traverse");
            System.out.println("0. Exit");
            System.out.print("Enter option >> ");
            option = scan.nextInt();
            scan.nextLine();
            if(option == 1){
                debugMakeNewVertex();
            } else if(option == 2){

            } else if(option == 3){
                debugTraverse();
            } else if(option == 0){
                System.exit(0);
            } else {
                System.out.println("Enter valid option!");
            }
        }
    }

    public static void main(String[] args){
        World world = new World("New World", true);
        world.debugMenu();
    }

}
