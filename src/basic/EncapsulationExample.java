package basic;

public class EncapsulationExample {
    public static void main(String[] args) {

        String name = "Demo";
        int age=12;
        String add = "Mohali";
        String email = "Demo@gmail.com";
        String ph = "+911234567890";
        Users userData = new Users(name,email,add,age);
        System.out.println(userData.getName());
        System.out.println(userData.getAddress());
        System.out.println(userData.getEmail());
        System.out.println(userData.getAge());


        userData.setName("Example");
        userData.setAge(25);


        System.out.println(userData.getName());
        System.out.println(userData.getEmail());
        System.out.println(userData.getAddress());
        System.out.println(userData.getAge());


    }
}

