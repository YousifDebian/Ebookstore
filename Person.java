package ebookstore;

public class Person { // Parent Class for (Author-Publisher)
    String f_name;
    String l_name;
    
    public Person (String f_name, String l_name){
        this.f_name=f_name;
        this.l_name=l_name;
    }
    
    public void displayInfo() { //Overridden method in (Author-Publisher)
        System.out.println("Name: " + f_name + " " + l_name);
    }
}
