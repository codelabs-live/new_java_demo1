//public class NewProgram {
//    public static void main(String[] args) {
////        int a  =3;
////        switch (a){
////            case 6:
////                System.out.println(a);
////                break;
////            case 10:
////                System.out.println(a);
////                break;
////            default:
////                System.out.println("Error");
////        }
//
//
//        for(int i =0;i<=10;i++){
//            System.out.println(i+" Done");
//        }
//
//    }
//}

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