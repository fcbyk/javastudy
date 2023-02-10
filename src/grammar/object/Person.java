package grammar.object;

public class Person {
    protected String name;
    protected int age;
    protected char sex;

    public Person() {
        System.out.println("�����޲�");
    }

    //�����������superָ��
    String test = "Person��test����";

    protected void testMethod(){
        System.out.println("Personִ����testMethod()����");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //������
   /* public void keepPet(Dog dog, String something) {
        System.out.println("����Ϊ" + age + "���" + name + "����һֻ" + dog.getColor() + "��ɫ��" + dog.getAge() + "��Ĺ�");
        dog.eat(something);
    }

    //����è
    public void keepPet(Cat cat, String something) {
        System.out.println("����Ϊ" + age + "���" + name + "����һֻ" + cat.getColor() + "��ɫ��" + cat.getAge() + "���è");
        cat.eat(something);
    }*/


    //��Ҫһ���������ܽ������еĶ������è��������
    //�������βΣ�����д��Щ��ĸ��� Animal
    public void keepPet(Animal a, String something) {
        if(a instanceof Dog d){
            System.out.println("����Ϊ" + age + "���" + name + "����һֻ" + a.getColor() + "��ɫ��" + a.getAge() + "��Ĺ�");
            d.eat(something);
        }else if(a instanceof Cat c){
            System.out.println("����Ϊ" + age + "���" + name + "����һֻ" + c.getColor() + "��ɫ��" + c.getAge() + "���è");
            c.eat(something);
        }else{
            System.out.println("û�����ֶ���");
        }
    }
}
