package grammar.object;
import java.util.StringJoiner;

//Cloneable
//���һ���ӿ�����û�г��󷽷�
//��ʾ��ǰ�Ľӿ���һ������Խӿ�
//����Cloneable��ʾһ��ʵ���ˣ���ô��ǰ��Ķ���Ϳ��Ա��˽�
//���û��ʵ�֣���ǰ��Ķ���Ͳ��ܿ�¡
public class User implements Cloneable {
    private String id;
    private String username;//�û���
    private String password;//����
    private String email;//����
    private char gender;//�Ա�
    private int age;//����
    private String path;
    private int[] data;

    //�ղι��췽��
    public User() {
    }

    //��ȫ�������Ĺ���
    public User(String username, String password, String email, char gender, int age) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = String.valueOf(id);
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //get��set

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println(username + "�ڳԷ�");
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "��ɫ���Ϊ��" + id + "���û���Ϊ��" + username + "����Ϊ��" + password + ", ��ϷͼƬΪ:" + path + ", ����:" + arrToString();
    }


    public String arrToString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //���ø����е�clone����
        //�൱����Java�����ǿ�¡һ�����󣬲��ѿ�¡֮��Ķ��󷵻س�ȥ��

        //�Ȱѱ���¡�����е������ȡ����
        int[] data = this.data;
        //�����µ�����
        int[] newData =new int[data.length];
        //���������е�����
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //���ø����еķ�����¡����
        User u=(User)super.clone();
        //��Ϊ�����еĿ�¡������ǳ��¡���滻��¡���������е������ֵַ
        u.data =newData;
        return u;
    }

}
