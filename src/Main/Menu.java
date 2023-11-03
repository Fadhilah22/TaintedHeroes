import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Character;

public class Menu {
    public static Scanner scan;
    public ArrayList<Human> characters;

    public Menu (){
        this.characters = new ArrayList<Human>();
        this.scan = new Scanner(System.in);
    }

    private int validateName(String name){
        // no numeric character
        // no longer than 20 character
        int found = 0;
        for(char c : name.toCharArray){
            if(c >= '0' && c <= '9') found += 1;
        }

        if(found > 0) return 0;
        else return 1;
    }

    public void addNewHero(){
        String firstName = new String();
        String lastName = new String();
        String gender = new Gender();
        int age = 0;

        System.out.println("========================");
        System.out.println("=   Create New Hero    =");
        System.out.println("========================");

        int option;
        boolean isRunning = true;
        while(isRunning){
            boolean notValid = true;
            // Enter firstname
            while(notValid){
                int valid;
                System.out.println("Enter first name >> ");
                firstName = scan.nextLine();
                valid = validateName(firstName);
                if(valid == 1){
                    // for(int i = 0; i<firstName.length(); i++){
                    //     if(i == 0)
                    //         firstName.toCharArray()[i]
                    //             = Character.toUpperCase(firstName.
                    //                             toCharArray()[i]);
                    // }
                    notValid = false;
                }
            }
            notValid = false;
            // CHECKPOINTS

        }
    }

    public void mainMenu(){
        int option;
        boolean isRunning = true;
        while(isRunning){
            System.out.println("================================");
            System.out.println("==       Tainted Heroes       ==");
            System.out.println("================================");
            System.out.println("1. Create New Hero");
            System.out.println("2. Show Hero List");
            System.out.println("3. Delete a Hero");
            System.out.print("Enter option >> ");
            option = scan.nextInt();
            if(option == 1){
                addNewHero();
            } else if (option == 2){

            } else if (option == 3){

            } else if (option == 0){

            } else {
                System.out.println("Enter valid option !");
            }
        }
    }

    public static void main(String[] args) {

    }
}
