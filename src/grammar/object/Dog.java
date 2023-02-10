package grammar.object;

public class Dog extends Animal{
    
    //Dog ：吼叫
    private String wang;

    //构造
    public Dog() {
    }

    //带参构造：带子类加父类所有的属性
    public Dog(String name, int age, String color,String wang) {
        //共性的属性交给父类赋值
        super(name,age,color);
        //独有的属性自己赋值
        this.wang = wang;
    }

    public String getWang() {
        return wang;
    }

    public void setWang(String wang) {
        this.wang = wang;
    }
}
