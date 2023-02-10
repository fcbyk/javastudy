package grammar.object;

public class Person {
    protected String name;
    protected int age;
    protected char sex;

    public Person() {
        System.out.println("父类无参");
    }

    //测试子类调用super指针
    String test = "Person的test属性";

    protected void testMethod(){
        System.out.println("Person执行了testMethod()方法");
    }
}
