package grammar.object;

public class Teacher extends Person{
    // ����
    private double salary ;

    // ���з���
    public void teach(){
        System.out.println("��ʦ������̼�����");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void superTest(){
        System.out.println(super.test);
        super.testMethod();
        this.testMethod();
        testMethod();
    }

    @Override
    public void testMethod() {
        System.out.println("Teacher��д��testMethod");
    }
}
