package grammar.object;

public class Student {
    //��Ա����
    private String name;
    private int age;

    //���췽��
    public Student() {
        System.out.println("ѧ�����޲ι��췽��");
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

    //�ṩget/set����
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age<0 || age>120) {
            System.out.println("�������������");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    //��Ա����
    public void show() {
        System.out.println(name + "," + age);
    }

    public void study() {
        System.out.println("�ú�ѧϰ����������");
    }

    public void doHomework() {
        System.out.println("�������ã���н����");
    }
}
