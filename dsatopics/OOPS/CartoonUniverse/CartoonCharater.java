package CartoonUniverse;

abstract  class CartoonCharater {
    
    protected String heroName;
    protected String heroPower;
    protected int heroStreangth;

    abstract void showDetailes();
    abstract void displayPower();
    abstract void displayStreangthLevel();
    abstract void displayHeroName();

}
