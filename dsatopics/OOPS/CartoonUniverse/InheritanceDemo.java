
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Cartoon Universe Power System ===");

        CartoonCharacter doraemon = new Doraemon();
        CartoonCharacter bheem = new ChotaBheem();
        CartoonCharacter hattori = new NinjaHattori();
        CartoonCharacter motu = new MotuPatlu();

        doraemon.showInfo();
        bheem.showInfo();
        hattori.showInfo();
        motu.showInfo();

        System.out.println("\n--- Powers ---");
        doraemon.displayPower();
        bheem.displayPower();
        hattori.displayPower();
        motu.displayPower();

        System.out.println("\n--- Catch Phrases ---");
        doraemon.catchPhrase();
        bheem.catchPhrase();
        hattori.catchPhrase();
        motu.catchPhrase();

        System.out.println("\n--- Comparing Strength ---");
        bheem.compareStrength(doraemon);
        motu.compareStrength(hattori);

        System.out.println("\n--- Updating Strength ---");
        motu.setStrength(88);
        motu.showInfo();
    }
}
