package grammar.object;

public class Dog extends Animal{
    
    //Dog �����
    private String wang;

    //����
    public Dog() {
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
}
