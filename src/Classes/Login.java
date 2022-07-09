package Classes;
//
//public class Login {
//    String email;
//    String pass;
//    public Login(String email , String pass){
//        this.email = email;
//        this.pass = pass;
//    }
//
//  public   boolean check(){
//
//        if(email.equals("kamlesh@whlinks.in") && pass.equals("12345")){
////            System.out.println("Done");
//            return  true;
//        }else {
////            System.out.println("Error");
//            return false;
//        }
//    }
//
//
//
//}


public class Login {
    String email, pass;
   public Login(String email, String pass){
       this.email= email;
       this.pass = pass;
   }

  public boolean check(){
       if(email.equals("Kamlesh@whlinks.in") && pass.equals("12345")){
           return true;
       }else {
           return false;
       }
   }
}

