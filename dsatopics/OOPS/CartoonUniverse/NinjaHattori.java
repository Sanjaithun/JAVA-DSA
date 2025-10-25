public class NinjaHattori extends CartoonCharacter {
    public NinjaHattori() {
        super("Ninja Hattori", "Stealth & Speed", 80);
    }

    @Override
    public void displayPower() {
        System.out.println(heroName + " moves like the wind and disappears in a flash!");
    }

    @Override
    public void catchPhrase() {
        System.out.println(heroName + " says: 'Shinzo ni shimete!'");
    }
}
