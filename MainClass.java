class Triangle{
    double width;
    double height;
    
    void area(){
        System.out.println("Area is: " + 0.5 * height * width);
    }
}
public class MainClass {
    public static void main(String[] args) {
        Triangle Tri1 = new Triangle();
        Triangle Tri2 = new Triangle();
        Triangle Tri3 = new Triangle();
        
        Tri1.height = 10;
        Tri1.width = 15;
        
        Tri2.height = 6;
        Tri2.width = 3;
        
        Tri3.height = 30;
        Tri3.width = 25;
        
        Tri1.area();
        Tri2.area();
        Tri3.area();
    }
    
}
