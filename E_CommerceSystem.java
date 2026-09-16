public class E_CommerceSystem {
    public static void main(String[] args) {
        System.out.println("----Electronic Products----  ");
        Electronic e= new Electronic();
        e.name="mobile";
        e.id=220;
        e.prise=20000;
        e.warranty="1year";
        e.item_detail();
        System.out.println();
System.out.println("----Cloathing Product---- ");
        Clothing c= new Clothing();
        c.name="T-shirt";
        c.id=101;
        c.prise=700;
        c.size="XL";
        c.item_detail();

        
    }
}
class product{
    int id;
    String name;
    double prise;
}
class Electronic extends product {
    String warranty;
    void item_detail(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Prise: "+prise);
        System.out.println("Warranty: "+warranty);
    }
}
class Clothing extends product{
    String size;
    void item_detail(){
         System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Prise: "+prise);
        System.out.println("Size: "+size);
    }

}
