package grammar.object;

public class Teacher extends Person{
    // 工资
    private double salary ;

    // 特有方法
    public void teach(){
        System.out.println("老师在认真教技术！");
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
        System.out.println("Teacher重写了testMethod");
    }
}
