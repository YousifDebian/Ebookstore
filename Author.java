package ebookstore;

public class Author extends Person { //Child for (Person)
    
    String authid;
    
    public Author(String authid,String f_name,String l_name){
        
        super(f_name,l_name);
        this.authid=authid;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Author Information");
        System.out.println("Author ID: "+authid);
        super.displayInfo();
        System.out.println(" ");
    }
}