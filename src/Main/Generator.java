package Main;

import java.util.Random;
import java.util.Scanner;

public class Generator{
    Random rand;
    public Scanner scan;

    public Generator(int debug){
        this.rand = new Random();
        if(debug == 1) this.scan = new Scanner(System.in);
    }

    public String generateheroId(String heroName, String heroGender, String heroRank){
        // three initial character (heroName[0], heroGender[0], heroRank[0])
        String id = "";


        String char1 = "" + heroName.toCharArray()[0];
        String char2 = "" + heroGender.toCharArray()[0];
        String char3 = "" + heroRank.toCharArray()[0];
        String num2 = "" + this.rand.nextInt(9);
        String num3 = "" + this.rand.nextInt(9);
        String num1 = "" + this.rand.nextInt(9);

        id += char1 + char2 + char3 + num1 + num2 + num3;
        return id;
    }

    public String generateRoadId(){
        // starts with R followed by three random numbers
        String id = "R";
        for(int i =0; i<3; i++) id += this.rand.nextInt(9);
        return id;
    }
    public String generateTownId(){
        // starts with R followed by three random numbers
        String id = "T";
        for(int i =0; i<3; i++) id += this.rand.nextInt(9);
        return id;
    }
    public String generatePlaceId(){
        // starts with R followed by three random numbers
        String id = "P";
        for(int i =0; i<3; i++) id += this.rand.nextInt(9);
        return id;
    }
    public String generateWorldId(){
        // starts with R followed by three random numbers
        String id = "W";
        for(int i =0; i<3; i++) id += this.rand.nextInt(9);
        return id;
    }

    public void test(){
        // String heroName;
        // String heroGender;
        // String heroRank;
        // String id;
        //
        // System.out.print("Enter name >> ");
        // heroName = scan.nextLine();
        // System.out.print("Enter gender >> ");
        // heroGender = scan.nextLine();
        // System.out.print("Enter rank >> ");
        // heroRank = scan.nextLine();
        //
        // id = generateheroId(heroName, heroGender, heroRank);
        // System.out.println("Your id is >> " + id);

        System.out.println("road id >> " + this.generateRoadId());
        System.out.println("town id >> " + this.generateTownId());
        System.out.println("place id >> " + this.generatePlaceId());
        System.out.println("world id >> " + this.generateWorldId());

    }

    // public static void main(String[] args) {
    //     Generator generate = new Generator(1);
    //     generate.test();
    // }
}
