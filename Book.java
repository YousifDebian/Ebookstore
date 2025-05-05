package ebookstore;

public class Book {
    String ISBN;
    String title;
    String type;
    int page_count;
    float price;
    String pubcode;
    
    public Book(String id,String name,String typee,int pages,float pricee,String pubid){
        ISBN=id;
        title = name;
        type = typee;
        page_count = pages;
        price = pricee;
        pubcode = pubid;
    }
    
    public void displayInfo() {
        System.out.println("Book Information");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Type: "+ type);
        System.out.println("Pages: " + page_count);
        System.out.println("Price: " + price);
        System.out.println("Publisher Code: " + pubcode);
        System.out.println(" ");
    }
}