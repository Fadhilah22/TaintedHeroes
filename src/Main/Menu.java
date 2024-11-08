import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static Scanner scan;
    public ArrayList<Human> characters;
    public Human selected;

    public Menu (){
        this.characters = new ArrayList<Human>();
        this.scan = new Scanner(System.in);
    }

    private int validateName(String name){
        // no numeric character
        // no longer than 20 character
        int found = 0;
        for(char c : name.toCharArray()){
            if(c >= '0' && c <= '9') found += 1;
        }

        if(found > 0) return 0;
        else return 1;
    }

    public Human addNewHuman(){
        Human newHuman;
        String firstName = new String();
        String lastName = new String();
        String gender = new String();
        int age = 0;

        System.out.println("========================");
        System.out.println("=   Create New Human   =");
        System.out.println("========================");

        int option = 0;

        boolean isRunning = true;
        while(isRunning){
            boolean notValid = true;
            // Enter firstname
            while(notValid){
                int valid = 0;
                System.out.print("Enter first name >> ");
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
            } notValid = true;

            // Enter lastName
            while (notValid){
                int valid = 0;
                System.out.print("Enter last name >> ");
                lastName = scan.nextLine();
                valid = validateName(lastName);
                if(valid == 1){
                    // for(int i = 0; i<firstName.length(); i++){
                    //     if(i == 0)
                    //         firstName.toCharArray()[i]
                    //             = Character.toUpperCase(firstName.
                    //                             toCharArray()[i]);
                    // }
                    notValid = false;
                }
            } notValid = true;

            // enter Gender
            while(notValid){
                int pick = 0;
                System.out.println("Pick gender");
                System.out.println("1. Male");
                System.out.println("2. Female");
                System.out.print("Choose (1/2) >> ");
                pick = scan.nextInt();
                scan.nextLine();
                if(pick == 1) { gender = "Male"; notValid = false; }
                else if (pick == 2) { gender = "Female"; notValid = false; }
                else System.out.println("Pick valid gender");
            } notValid = true;

            while(notValid) {
                int pick = 0;
                System.out.println("Pick age");
                System.out.println("1. 18");
                System.out.println("2. 26");
                System.out.println("3. 42");
                System.out.println("4. 62");
                System.out.print("Choose (1 | 2 | 3 | 4) >> ");
                pick = scan.nextInt();
                scan.nextLine();
                if(pick == 1) { age = 18; notValid = false; }
                else if (pick == 2){ age = 26; notValid = false; }
                else if (pick == 3){ age = 42; notValid = false; }
                else if (pick == 4){ age = 62; notValid = false; }
                else System.out.println("Pick valid age");
            } notValid = true;
            // printing hero info
            System.out.println("============= [Hero info] ==============");
            System.out.println("1. Fullname : " + firstName + " " + lastName);
            System.out.println("2. Gender   : " + gender);
            System.out.println("3. Age      : " + age);
            System.out.println("========================================");
            while(notValid){
                System.out.print("Do you want to summon this human ? [Y/n] ");
                String summon = scan.nextLine();
                // System.out.println(summon);
                if(summon.charAt(0) == 'Y' || summon.charAt(0) == 'y') { notValid=false; isRunning = false;}
                else if (summon.charAt(0) == 'N' || summon.charAt(0) == 'n')
                    { System.out.println("Remaking new human....."); notValid = false; }
                else System.out.println("enter valid option!");
            }
        }
        newHuman = new Human(firstName, lastName, gender, age);
        return newHuman;
    }

    public void addHumanToList(Human human){
        characters.add(human);
    }

    public void showCharacters(){
        if(characters.size() == 0) {System.out.println("No character"); return;}
        int option;
        boolean isRunning = true;
        while (isRunning) {
            int count = 1;
            System.out.println("==============[ Character List ]=============");
            System.out.printf("%-5s%-20s%-10s%-5s\n", "No", "Fullname", "Gender", "Age");
            for(Human human : characters){
                System.out.printf("%-5d%-20s%-10s%-5d\n", count, human.fullName, human.gender, human.age);
                count++;
            }
            System.out.println("1. Show character stats");
            System.out.println("2. Choose character");
            System.out.println("0. back");
            System.out.print("Enter option >> ");
            option = scan.nextInt();
            scan.nextLine();
            if(option == 1){
                showCharacterStats();
            } else if (option == 2){
                selectCharacter();
            } else if (option == 3){

            } else if(option == 0){
                return;
            } else System.out.println("Enter valid option !");
        }
    }

    public void showCharacterStats(){
        boolean notValid = true;
        while(notValid){
            int characterIndex;
            System.out.print("Select character no >> ");
            characterIndex = scan.nextInt();
            scan.nextLine();
            if(characterIndex > characters.size() || characterIndex <= 0){
                System.out.println("Select valid character no!");
            } else{
                Human selected = characters.get(characterIndex-1);
                System.out.println("=========[" + selected.fullName + "]=========");
                System.out.println(selected.gender + " " + selected.age);
                System.out.println("[Health: " + selected.health + "]"
                                 + "[Stamina: " + selected.stamina + "]"
                                 + "[Shinzu: " + selected.shinzu + "]");
                System.out.println();

            }
            notValid = false;
        }
    }

    public void selectCharacter(){
        boolean notValid = true;
        int characterIndex;
        System.out.print("Select your hero no >> ");
        characterIndex = scan.nextInt();
        scan.nextLine();
        if(characterIndex > characters.size() || characterIndex <= 0){
            System.out.println("Select valid no!");
        } else {
            this.selected = characters.get(characterIndex-1);
            notValid = false;
        }
    }

    public void debug(){
        Generator generate = new Generator(0);
        String id = generate.generateTownId();
        System.out.println("Id >> " + id);
    }

    public void mainMenu(){
        int option;
        boolean isRunning = true;
        while(isRunning){
            System.out.println("================================");
            System.out.println("==       Tainted Heroes       ==");
            System.out.println("================================");
            if(selected != null) System.out.println("[Selected Hero :" + selected.fullName + "]");
            System.out.println("1. Create New Hero");
            System.out.println("2. Select Hero");
            System.out.println("3. Play");
            System.out.println("4. Delete a Hero");
            System.out.println("0. Exit");
            System.out.print("Enter option >> ");
            option = scan.nextInt();
            scan.nextLine();
            if(option == 1){
                Human newHuman = addNewHuman();
                addHumanToList(newHuman);
            } else if (option == 2){
                showCharacters();
            } else if (option == 3){

            } else if (option == 4){

            } else if (option == 0){
                System.exit(1);
            } else {
                System.out.println("Enter valid option !");
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.debug();
    }
}
