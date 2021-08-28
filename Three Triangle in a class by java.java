class Triangle{
    double height;
    double weight;
}

class Main{     //Main named by it's project name
    public static void main (String[] args) {
        Triangle Tri_1 = new Triangle();
        Triangle Tri_2 = new Triangle();
        Triangle Tri_3 = new Triangle();
        
        double area;
        
        //works on first Triangle
        Tri_1.height = 10;
        Tri_1.weight = 15;
        area = 0.5 * Tri_1.height * Tri_1.weight;
        System.out.println("The area of 1st Triangle is: " + area); //75.0
        
        //second Triangle
        Tri_2.height = 122.5;
        Tri_2.weight = 150.13;
        area = 0.5 * Tri_2.height * Tri_2.weight;
        System.out.println("The area of 2nd Triangle is: " + area); //9195.4625
        
        //Third Triangle area
        Tri_3.height = 1000000000;
        Tri_3.weight = 999999999;
        area = 0.5 * Tri_3.height * Tri_3.weight;
        System.out.println(String.format("The area of 2nd Triangle is:  %,.2f", area)); //499,999,999,500,000,000.00
    }
        
}