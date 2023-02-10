package grammar.object;

public class Dog extends Animal{

    //Dog �����
    private String wang;

    //����
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    //���ι��죺������Ӹ������е�����
    public Dog(String name, int age, String color,String wang) {
        //���Ե����Խ������ำֵ
        super(name,age,color);
        //���е������Լ���ֵ
        this.wang = wang;
    }

    public String getWang() {
        return wang;
    }

    public void setWang(String wang) {
        this.wang = wang;
    }

    //��Ϊ
    //eat(String something)(something��ʾ�ԵĶ���)
    //����lookHome����(�޲���)
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "���" + getColor() + "��ɫ�Ĺ���ֻǰ�������ı�ס" + something + "�ͳ�");
    }

    public void lookHome(){
        System.out.println("���ڿ���");
    }
}
