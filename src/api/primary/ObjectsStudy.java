package api.primary;
import grammar.object.Student;
import java.util.Objects;

public class ObjectsStudy {

    // ����nonNull����
    public static void method_01() {

        // ����һ��ѧ������
        Student s1 = new Student("itheima" , 14) ;

        // ����Objects���е�nonNull����
        boolean result = Objects.nonNull(s1);

        // ������
        System.out.println(result);

    }

    // ����isNull����
    public static void method_02() {

        // ����һ��ѧ������
        Student s1 = new Student("itheima" , 14) ;

        // ����Objects���е�isNull����
        boolean result = Objects.isNull(s1);

        // ������
        System.out.println(result);

    }

    // ����equals����
    public static void method_03() {

        // ��������ѧ������
        Student s1 = new Student("itheima" , 14) ;
        Student s2 = new Student("itheima" , 14) ;

        // ����Objects���е�equals�������Ƚ����������Ƿ����
        boolean result = Objects.equals(s1, s2);     // ���Studentû����дObject���е�equals�������˴��ȽϵĻ��Ƕ���ĵ�ֵַ

        // ������
        System.out.println(result);

    }

    // ����toString����
    public static void method_04() {

        // ����һ��ѧ������
        Student s1 = new Student("itheima" , 14) ;

        // ����Objects�е�toString����,��ȡs1������ַ���������ʽ
        String result = Objects.toString(s1);       // ���Studentû����дObject���е�toString�������˴����Ƿ��صĶ���ĵ�ֵַ

        // ������
        System.out.println(result);

    }

    // ��ʾrequireNonNullElseGet
    public static void method_05() {

        // ����һ��ѧ������
        Student s1 = new Student("itheima" , 14) ;

        // ����Objects�����requireNonNullElseGet����,�÷����ĵڶ���������Supplier���͵ģ��鿴Դ�����Ƿ���Supplier��һ������ʽ�ӿ�,
        // ��ô���ǾͿ���Ϊ�䴫��һ��Lambda���ʽ������Supplier�ӿ���������ķ������޲��з���ֵ�ķ�������˾�������������Lambda���ʽ������ʾ
        Student student = Objects.requireNonNullElseGet(s1, () -> {
            return new Student("itcast", 14);
        });

        // ���
        System.out.println(student);

    }

    // ��ʾrequireNonNullElse
    public static void method_06() {

        // ����һ��ѧ������
        Student s1 = new Student("itheima" , 14) ;

        // ����Objects�����requireNonNullElse����
        Student student = Objects.requireNonNullElse(s1, new Student("itcast", 14));

        // ���
        System.out.println(student);

    }

    // ��ʾrequireNonNull
    public static void method_07() {

        // ����һ��ѧ������
        Student s1 = new Student("itheima" , 14) ;

        // ����Objects�����requireNonNull����
        Student student = Objects.requireNonNull(s1);

        // ���
        System.out.println(student);

    }

}
