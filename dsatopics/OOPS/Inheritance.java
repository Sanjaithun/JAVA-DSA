package dsatopics.OOPS;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("This is the Cartoon Charaters");

        Doramon obj = new Doramon();
        obj.gethero();
        Doramon obj1 = new Chotabeem();
        obj1.gethero();
        Doramon obj2 = new Motupatlu();
        obj2.gethero();
        Doramon obj3 = new Ninjahatori();
        obj3.gethero();

    }
}

class Doramon{

    private String Hero = "Kmichi";
    private int age = 10;

    void gethero(){
        System.out.println("The hero name is : "+this.Hero);
    }
    void sethero(String NewHero){
        this.Hero = NewHero;
        System.out.println("The new hero updated is : " + this.Hero);
    }
    void getage(){
        System.out.println("The age of the hero is : " + this.age);
    }
    void setAge(int newage){
        this.age = newage;
        System.out.println("The new age means updated age is : " + this.age);
    }
}

class Chotabeem extends Doramon{

    private String Hero = "beem";
    private int age = 11;

    void gethero(){
        System.out.println("The hero name is : "+this.Hero);
    }
    void sethero(String NewHero){
        this.Hero = NewHero;
        System.out.println("The new hero updated is : " + this.Hero);
    }
    void getage(){
        System.out.println("The age of the hero is : " + this.age);
    }
    void setAge(int newage){
        this.age = newage;
        System.out.println("The new age means updated age is : " + this.age);
    }

}

class Ninjahatori extends Chotabeem{

    private String Hero = "Nobita";
    private int age = 15;

    void gethero(){
        System.out.println("The hero name is : "+this.Hero);
    }
    void sethero(String NewHero){
        this.Hero = NewHero;
        System.out.println("The new hero updated is : " + this.Hero);
    }
    void getage(){
        System.out.println("The age of the hero is : " + this.age);
    }
    void setAge(int newage){
        this.age = newage;
        System.out.println("The new age means updated age is : " + this.age);
    }

}

class Motupatlu extends Ninjahatori{
    
    private String Hero = "Patlu";
    private int age = 12;

    void gethero(){
        System.out.println("The hero name is : "+this.Hero);
    }
    void sethero(String NewHero){
        this.Hero = NewHero;
        System.out.println("The new hero updated is : " + this.Hero);
    }
    void getage(){
        System.out.println("The age of the hero is : " + this.age);
    }
    void setAge(int newage){
        this.age = newage;
        System.out.println("The new age means updated age is : " + this.age);
    }
}
