package grammar.object;

public class Student {
    //成员变量
    private String id;
    private String name;
    private int age;
    private String address;

    //构造方法
    public Student() {
        System.out.println("学生类无参构造方法");
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Student(int age,String name) {
        this.name = name;
        this.age = age;
    }

    //提供get/set方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age<0 || age>120) {
            System.out.println("你给的年龄有误");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //成员方法
    public void show() {
        System.out.println(name + "," + age);
    }

    public void study() {
        System.out.println("好好学习，天天向上");
    }

    public void doHomework() {
        System.out.println("键盘敲烂，月薪过万");
    }
}