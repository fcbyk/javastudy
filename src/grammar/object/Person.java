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
}
