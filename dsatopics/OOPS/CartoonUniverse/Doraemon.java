
public class Doraemon extends CartoonCharacter {
    public Doraemon() {
        super("Doraemon", "Gadget Master", 85);
    }

    @Override
    public void displayPower() {
        System.out.println(heroName + " uses gadgets from his pocket to solve any problem!");
    }

    @Override
    public void catchPhrase() {
        System.out.println(heroName + " says: 'Nobita! I’ll help you with this gadget!'");
    }
}
