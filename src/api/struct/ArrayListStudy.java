package api.struct;
import grammar.object.Student;
import grammar.object.User;
import java.util.ArrayList;

//ArrayList����ѧϰ

public class ArrayListStudy {

    //ArrayList�洢�ַ���������
    //����һ���洢�ַ����ļ��ϣ��洢3���ַ���Ԫ�أ�ʹ�ó���ʵ���ڿ���̨�����ü���
    public static void listfor(){
        //1.�������϶���
        ArrayList<String> list = new ArrayList<>();

        //2.���Ԫ��
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //3.����
        //��ݼ�: list.fori �������
        //list.forr ���ű���
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            //i ���α�ʾ���������ÿһ������
            if(i == list.size() - 1){
                //�������
                System.out.print(list.get(i));
            }else{
                //���������
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print("]");
    }

    //ArrayList�洢ѧ�����󲢱���
    //����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
    public static void studentfor(){
        //1.�������϶��������洢����
        ArrayList<Student> list = new ArrayList<>();

        //2.����ѧ������
        Student s1 = new Student("zhangsan",16);
        Student s2 = new Student("lisi",15);
        Student s3 = new Student("wangwu",18);

        //3.��ѧ��������ӵ�������
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.����
        for (int i = 0; i < list.size(); i++) {
            //i ���α�ʾ�����е�ÿһ������
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }

    //�����û�������
    //����
    //1��main�����ж���һ�����ϣ����������û�����
    //�û�����Ϊ��id��username��password
    //2��Ҫ�󣺶���һ������������id���Ҷ�Ӧ��ѧ����Ϣ��
    //������ڣ���������
    //��������ڣ�����-1
    public static void indexSearch(){
        //1.�������϶���
        ArrayList<User> list = new ArrayList<>();

        //2.�����û�����
        User u1 = new User("heima001", "zhangsan", "123456");
        User u2 = new User("heima002", "lisi", "1234");
        User u3 = new User("heima003", "wangwu", "1234qwer");

        //3.���û�������ӵ����ϵ���
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.���÷�����ͨ��id��ȡ��Ӧ������
        int index = getIndex(list, "heima001");

        System.out.println(index);

        //��չ�����÷�������ѯid�Ƿ����
        boolean result = contains(list, "heima001");
        System.out.println(result);
    }

    public static int getIndex(ArrayList<User> list, String id) {
        //�������ϵõ�ÿһ��Ԫ��
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if(uid.equals(id)){
                return i;
            }
        }
        //��Ϊֻ�е������������е�Ԫ�ض��Ƚ����ˣ����ܶ϶�id�ǲ����ڵġ�
        return -1;
    }

    public static boolean contains(ArrayList<User> list, String id){
        //ѭ���������ϣ��õ����������ÿһ��Ԫ��
        //�ٽ����ж�

        for (int i = 0; i < list.size(); i++) {
            //i ����  list.get(i); Ԫ��
            User u = list.get(i);
            //�ж�id�Ƿ���ڣ���������˭��˭�Ƚ�
            //��Ҫ���û����������id�ó����ٽ��бȽϡ�
            String uid = u.getId();
            if(id.equals(uid)){
                return true;//return �ؼ��֣����þ��ǽ���������
            }
        }
        //ֻ�е������������е�Ԫ��ȫ���Ƚ���ϲ�����Ϊ�ǲ����ڵġ�
        return false;
    }
}

