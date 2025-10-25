
public abstract class CartoonCharacter {
    protected String heroName;
    protected String powerType;
    protected int strengthLevel;

    public CartoonCharacter(String heroName, String powerType, int strengthLevel) {
        this.heroName = heroName;
        this.powerType = powerType;
        this.strengthLevel = strengthLevel;
    }

    public void showInfo() {
        System.out.println("Name: " + heroName + " | Power: " + powerType + " | Strength: " + strengthLevel);
    }

    public void setStrength(int newStrength) {
        if (newStrength >= 0 && newStrength <= 100) {
            this.strengthLevel = newStrength;
            System.out.println(heroName + "'s strength updated to " + strengthLevel);
        } else {
            System.out.println("Invalid strength value! It must be between 0 and 100.");
        }
    }

    public int getStrength() {
        return strengthLevel;
    }

    public void compareStrength(CartoonCharacter other) {
        if (this.strengthLevel > other.strengthLevel)
            System.out.println(this.heroName + " is stronger than " + other.heroName);
        else if (this.strengthLevel < other.strengthLevel)
            System.out.println(other.heroName + " is stronger than " + this.heroName);
        else
            System.out.println(this.heroName + " and " + other.heroName + " have equal strength!");
    }

    public abstract void displayPower();
    public abstract void catchPhrase();
}
