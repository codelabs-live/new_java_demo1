package basic;

public class Users {
    private  String name, address, email;
    private  int age;
     public  Users(String name , String email , String address, int age){
        this.name = name;
        this.email= email;
        this.address=address;
        this.age= age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
