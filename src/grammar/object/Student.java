package grammar.object;

public class Student extends Person{
    //��Ա����
    private String id;
    private String address;

    //���췽��
    public Student() {
        // �������ҵ��ֵܺ�ţ�ư����ҿ��Ե����������췽����Student(String name, int age, char sex)
        this("���",21,'��');
        System.out.println("ѧ�����޲ι��췽��");
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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