package javaapplication6;
class Student{
    int Roll;
    String Name;
    float Mark;
    
    Student(int R, String N, float M){
        Roll = R;
        Name = N;
        Mark = M;
    }
    Student(Student s){
        Roll = s.Roll;
        Name = s.Name;
        Mark = s.Mark;
    }
    void Display(){
        System.out.println("Roll is:"+Roll);
        System.out.println("Name is:"+Name);
        System.out.println("Mark is:"+Mark);
    }
}

public class JavaApplication6 {

    public static void main(String[] args) {
        Student s1 = new Student(165091,"Faysal",3.69f);
        System.out.println("Record of s1");
        s1.Display();
        
        System.out.println();
        Student s2 = new Student(s1);
        System.out.println("Record of S2");
        s2.Display();
        
        System.out.println("Both are same. That means the second constructor was copy");
    }
    
}
