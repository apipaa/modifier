
package contructor;

public class Contructor {
    public String username;
    public String password;
    
    public Contructor(String username, String password){
        this.username = username;
        this.password = password;
    }
    
}

class DemoConstructor{
    public static void main(String[] args) {
        Contructor petani = new Contructor("petanikode", "kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }
}