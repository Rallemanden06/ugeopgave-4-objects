// Opgave 2
public class Products {
    String name;
    double price;
    String[] tags;

    public Products(String name, double price, String[] tags){
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        for (String tag : tags){
            System.out.println("Tag: " + tag);
        }
    }

    public boolean hasTag(String tag){
        for (String t: tags){
            if (t.equals(tag)){
                return true;
            }
        }
        return false;
    }
}

