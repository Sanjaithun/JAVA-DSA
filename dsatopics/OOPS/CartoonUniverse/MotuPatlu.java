
public class MotuPatlu extends CartoonCharacter {
    public MotuPatlu() {
        super("Motu Patlu", "Teamwork & Wit", 70);
    }

    @Override
    public void displayPower() {
        System.out.println(heroName + " rely on teamwork to solve any trouble in Furfuri Nagar!");
    }

    @Override
    public void catchPhrase() {
        System.out.println(heroName + " say: 'Idea Patlu!'");
    }
}
