
public class ChotaBheem extends CartoonCharacter {
    public ChotaBheem() {
        super("Chota Bheem", "Super Strength", 90);
    }

    @Override
    public void displayPower() {
        System.out.println(heroName + " uses his immense strength to defeat villains!");
    }

    @Override
    public void catchPhrase() {
        System.out.println(heroName + " says: 'For Dholakpur!'");
    }
}
