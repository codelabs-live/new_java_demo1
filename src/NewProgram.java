

class  Example {
    void dis(){
        System.out.println( "Dis Example");
    }
}

class  Demo extends  Example{
    void display(){

    }
}

public class NewProgram extends Demo{
    @Override
    void dis() {
        System.out.println("Dis NewProgram");
        super.dis();
    }

    @Override
    void display() {
        super.display();
    }

    void  sum(){
      super.display();
      super.dis();
    }

    public static void main(String[] args) {
      NewProgram newProgram = new NewProgram();
      newProgram.dis();
    }
}