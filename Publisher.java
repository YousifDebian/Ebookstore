package ebookstore;

public class Publisher extends Person { //Child for (Person)
    
    String pubcode;
    String city;
    String phone;
    
    Publisher(String pubcode,String f_name,String l_name,String city,String phone){
        
        super(f_name, l_name);
        this.pubcode=pubcode;
        this.city=city;
        this.phone=phone;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("Publisher Information");
        System.out.println("Publisher code: "+pubcode);
        super.displayInfo();
        System.out.println("Publisher City: "+city);
        System.out.println("Publisher Phone: "+phone);
        System.out.println(" ");
    }
}