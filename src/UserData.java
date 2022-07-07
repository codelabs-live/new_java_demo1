public class UserData {
    private  String name;
    private int age;
    private String add;
    private String ph;
    public  UserData(String name, int age , String address, String ph){
        this.name = name;
        this.age = age;
        this.add = address;
        this.ph= ph;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public String getPh() {
        return ph;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }
}
