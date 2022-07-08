package Classes;

public class ClassAndMethod {
String name ;
    ClassAndMethod(String name){
//        System.out.println(name);
        this.name =name;
    }
void display(){
//        String nm;
    System.out.println(name);
}
    public static void main(String[] args) {
        ClassAndMethod obj = new ClassAndMethod("Kamlesh");
        obj.display();
//        new ClassAndMethod("Kamlesh");
    }
}
