public class Human {

    // info stats
    public String fullName;
    public String firstName;
    public String lastName;
    public String gender;
    public int age;

    // wellbeing stats
    public float health = 50;
    public float stamina = 30;
    public float shinzu = 10;

    // overalls
    public int physicalOvr = this.getPhysicalOverall();
    public int movementOvr = this.getMovementOverall();
    public int mindOvr = this.getMindOverall();

    // attributes (0.0 - 100.0)
    // physical attributes
    public float strength = 5;
    public float endurance = 5;
    public float durability = 5;

    // Movement atributes
    public float agility = 5;
    public float mobility = 5;

    // mind attributes
    public float intelligence = 5;
    public float dexterity = 5;
    public float faith = 5;

    public Human(String firstName,
                String lastName,
                String gender,
                int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.fullName = firstName + " " + lastName;
    }

    // attribute getter
    public float getStrength(){
        return this.strength;
    }
    public float getEndurance(){
        return this.endurance;
    }
    public float getDurability(){
        return this.durability;
    }
    public float getAgility(){
        return this.agility;
    }
    public float getMobility(){
        return this.mobility;
    }
    public float getIntelligence(){
        return this.intelligence;
    }
    public float getDexterity(){
        return this.dexterity;
    }
    public float getFaith(){
        return this.faith;
    }

    // attrubute overall getter
    public int getPhysicalOverall(){
        float total = this.strength + this.endurance + this.durability;
        return (int) ((total / 100) * 100);
    }
    public int getMovementOverall(){
        float total = this.agility + this.mobility;
        return (int) ((total / 100) * 100);
    }
    public int getMindOverall(){
        float total = this.intelligence + this.dexterity + this.faith;
        return (int) ((total / 100) * 100);
    }

    // attribute setter
    public void setStrength(float strength){
        this.strength = strength;
    }
    public void setEndurance(float endurance){
        this.endurance = endurance;
    }
    public void setDurability(float durability){

        this.durability = durability;
    }
    public void setAgility(float agility){
        this.agility = agility;
    }
    public void setMobility(float mobility){
        this.mobility = mobility;
    }
    public void setIntelligence(float intelligence){
        this.intelligence = intelligence;
    }
    public void setDexterity(float dexterity){
        this.dexterity = dexterity;
    }
    public void setFaith(float faith){
        this.faith = faith;
    }

    public void showStat(){
        System.out.println("=========================");
        System.out.println("=     Player Status     =");
        System.out.println("=========================");
        System.out.println("# Info");
        System.out.println("Name   : " + this.fullName);
        System.out.println("Health : " + this.health);
        System.out.println("Shinzu : " + this.shinzu);
        System.out.println("# Attributes");
        System.out.println("Physical          " + "[ " + physicalOvr + " ]");
        System.out.println("+ Strength     : " + strength);
        System.out.println("+ Durability   : " + durability);
        System.out.println("+ Endurance    : " + endurance);
        System.out.println("Movement          " + "[ " + movementOvr + " ]");
        System.out.println("+ Intelligence : " + intelligence);
        System.out.println("+ Dexterity    : " + dexterity);
        System.out.println("+ faith        : " + faith);
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
