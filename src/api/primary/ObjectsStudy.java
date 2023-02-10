package api.primary;
import grammar.object.Student;
import java.util.Objects;

public class ObjectsStudy {

    // 测试nonNull方法
    public static void method_01() {

        // 创建一个学生对象
        Student s1 = new Student("itheima" , 14) ;

        // 调用Objects类中的nonNull方法
        boolean result = Objects.nonNull(s1);

        // 输出结果
        System.out.println(result);

    }

    // 测试isNull方法
    public static void method_02() {

        // 创建一个学生对象
        Student s1 = new Student("itheima" , 14) ;

        // 调用Objects类中的isNull方法
        boolean result = Objects.isNull(s1);

        // 输出结果
        System.out.println(result);

    }

    // 测试equals方法
    public static void method_03() {

        // 创建两个学生对象
        Student s1 = new Student("itheima" , 14) ;
        Student s2 = new Student("itheima" , 14) ;

        // 调用Objects类中的equals方法，比较两个对象是否相等
        boolean result = Objects.equals(s1, s2);     // 如果Student没有重写Object类中的equals方法，此处比较的还是对象的地址值

        // 输出结果
        System.out.println(result);

    }

    // 测试toString方法
    public static void method_04() {

        // 创建一个学生对象
        Student s1 = new Student("itheima" , 14) ;

        // 调用Objects中的toString方法,获取s1对象的字符串表现形式
        String result = Objects.toString(s1);       // 如果Student没有重写Object类中的toString方法，此处还是返回的对象的地址值

        // 输出结果
        System.out.println(result);

    }

    // 演示requireNonNullElseGet
    public static void method_05() {

        // 创建一个学生对象
        Student s1 = new Student("itheima" , 14) ;

        // 调用Objects对象的requireNonNullElseGet方法,该方法的第二个参数是Supplier类型的，查看源码我们发现Supplier是一个函数式接口,
        // 那么我们就可以为其传递一个Lambda表达式，而在Supplier接口中所定义的方法是无参有返回值的方法，因此具体调用所传入的Lambda表达式如下所示
        Student student = Objects.requireNonNullElseGet(s1, () -> {
            return new Student("itcast", 14);
        });

        // 输出
        System.out.println(student);

    }

    // 演示requireNonNullElse
    public static void method_06() {

        // 创建一个学生对象
        Student s1 = new Student("itheima" , 14) ;

        // 调用Objects对象的requireNonNullElse方法
        Student student = Objects.requireNonNullElse(s1, new Student("itcast", 14));

        // 输出
        System.out.println(student);

    }

    // 演示requireNonNull
    public static void method_07() {

        // 创建一个学生对象
        Student s1 = new Student("itheima" , 14) ;

        // 调用Objects对象的requireNonNull方法
        Student student = Objects.requireNonNull(s1);

        // 输出
        System.out.println(student);

    }

}
