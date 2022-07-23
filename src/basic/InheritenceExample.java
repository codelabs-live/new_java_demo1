package basic;

class BaseOne{
    String name;

    void display(){
        System.out.println("Base One ");
    }
}



class  ExampleOne extends BaseOne{
    @Override
    void display() {
        name= "Kamlesh";
        super.display();
        System.out.println("Example One");
    }
}

public class InheritenceExample extends BaseOne {

    @Override
    void display() {
        super.display();
        System.out.println("New Class");
    }

    public static void main(String[] args) {
        ExampleOne exampleOne = new ExampleOne();
        InheritenceExample newClass = new InheritenceExample();
        exampleOne.display();
        newClass.display();
    }
}


