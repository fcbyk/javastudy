package grammar.object;

public class Cat extends Animal{
    //��Ϊè����û�ж��е����ԡ�
    //���Դ�ʱ����Ҫд˽�еĳ�Ա����

    //�ղ�
    public Cat() {
    }

    //��Ҫ������͸��������е�����
    public Cat(String name, int age, String color) {
        super(name,age,color);
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "���" + getColor() + "��ɫ��è�����۾�����ͷ��" + something);
    }

    public void catchMouse(){
        System.out.println("èץ����");
    }
}
