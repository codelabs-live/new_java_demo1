package basic;

public class MethodExample {

    void display(String s) {
        System.out.println(s);
    }
    void display(String s, int a) {
        System.out.println(s);
    }

    String name(String fName, String lName) {
        return fName+" "+lName;
    }

    String nm(String s , int a ){
        return "asdf";
    }
    public static void main(String[] args) {
       MethodExample newClass = new MethodExample();
        newClass.display("Kamlesh");
        String name = newClass.name("Example","Demo");
        System.out.println(name);
        System.out.println(newClass.name("Example","Demo"));
        newClass.nm("Kamlesh", 56);

    }
}

