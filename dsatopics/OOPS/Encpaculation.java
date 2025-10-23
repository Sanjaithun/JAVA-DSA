package dsatopics.OOPS;

public class Encpaculation {
    private String name;
    private String role;
    public Encpaculation(String name , String role) {
        this.name = name;
        this.role = role;
    }

    String getName(){
        return name;
    }
    String setName(String names){
        this.name = names;
        return "The Updated Name is: " + this.name;
    }
    String getRole(){
        return this.role;
    }
    
    public static void main(String[] args) {
        Encpaculation obj = new Encpaculation("Sanjaithun", "Admin");
        System.out.println(obj.getName());
        System.out.println(obj.setName("Pramoth"));
        System.out.println(obj.getRole());
    }
} 
