package api.struct;
import java.util.Scanner;
//String��ѧϰ

public class StudyString {

    //���õĹ��췽��
    public static void construction(){
        //public String()������һ���հ��ַ������󣬲������κ�����
        String s1 = new String();
        System.out.println("s1:" + s1);

        //public String(char[] chs)�������ַ���������ݣ��������ַ�������
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        //public String(byte[] bys)�������ֽ���������ݣ��������ַ�������
        byte[] bys = {97, 98, 99};
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        //String s = ��abc��;	ֱ�Ӹ�ֵ�ķ�ʽ�����ַ����������ݾ���abc
        String s4 = "abc";
        System.out.println("s4:" + s4);

        //�����ַ����������ַ�ʽ������
        //ͨ�����췽������
        //ͨ�� new �������ַ�������ÿһ�� new ��������һ���ڴ�ռ䣬��Ȼ������ͬ�����ǵ�ֵַ��ͬ
        //ֱ�Ӹ�ֵ��ʽ����
        //�ԡ�����ʽ�������ַ�����ֻҪ�ַ�������ͬ(˳��ʹ�Сд)�������ڳ�������г��ּ��Σ�JVM ��ֻ�Ὠ��һ�� String ���󣬲����ַ�������ά��
    }

    //equals()����
    public static void equalsTest(){
        //���췽���ķ�ʽ�õ�����
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        //ֱ�Ӹ�ֵ�ķ�ʽ�õ�����
        String s3 = "abc";
        String s4 = "abc";

        //�Ƚ��ַ��������ַ�Ƿ���ͬ
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("--------");

        //�Ƚ��ַ��������Ƿ���ͬ
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }

    //�û���¼����
    //����������֪�û��������룬���ó���ʵ��ģ���û���¼���ܹ������λ��ᣬ��¼֮�󣬸�����Ӧ����ʾ
    public static void case01(){
        //1.������������������¼��ȷ���û���������
        String rightUsername = "itheima";
        String rightPassword = "1234qwer";

        //2.����¼���û���������
        //ctrl + alt + T ѡ�������ʽ
        for (int i = 0; i < 3; i++) {//0 1 2
            Scanner sc = new Scanner(System.in);
            System.out.println("�������û���");
            String username = sc.next();
            System.out.println("����������");
            String password = sc.next();

            //3.�жϱȽ�
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("��¼�ɹ�");
                //�����ȷ��ѭ������
                break;
            } else {
                //���һ�λ���
                if(i == 2){
                    System.out.println("�˻�" + username + "������������ϵ�������Ա�ٷ�С��㣺XXXXXXX");
                }else{
                    //�������һ�λ���
                    System.out.println("�û�����������󣬵�¼ʧ��,��ʣ��" + (2 - i) + "�λ���");//2 1 0
                }
            }
        }
    }

    //�����ַ�������
    //charAt()�������������ȡ��Ӧ���ַ�
    //length(): �᷵���ַ����ĳ���
    //�������󣺼���¼��һ���ַ�����ʹ�ó���ʵ���ڿ���̨�������ַ���
    public static void case02(String str){
        for (int i = 0; i < str.length(); i++) {
            //i ���α�ʾ�ַ�����ÿһ������
            //�����ķ�Χ��0 ~  ����-1
            //����������ȡ�ַ��������ÿһ���ַ�
            //ctrl + alt + V �Զ�������ߵĽ��ܱ���
            char c = str.charAt(i);
            System.out.println(c);
        }
    }

    //ͳ���ַ���������
    //��������ͳ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���(�����������ַ�)
    public static void case03(String str){

        //2.ͳ�� --- ������count
        //��ʱ��Ҫͳ�Ƶ���3������������Ҫ����3���������ֱ����ͳ��
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        //�õ�����ַ�������ÿһ���ַ�
        for (int i = 0; i < str.length(); i++) {
            //i ��ʾ�ַ����е�����
            //c ��ʾ�ַ����е�ÿһ���ַ�
            char c = str.charAt(i);

            //��c�����ж�
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            }else if(c >= 'A' && c <= 'Z'){
                bigCount++;
            }else if(c >= '0' && c <= '9'){
                numberCount++;
            }
        }

        //3.��ѭ������֮������������¼�ľ��Ƕ�Ӧ�ĸ���
        System.out.println("��д�ַ���:" + bigCount + "��");
        System.out.println("Сд�ַ���:" + smallCount + "��");
        System.out.println("�����ַ���:" + numberCount + "��");
    }

    //�ַ���ƴ�Ӱ���
    //����һ���������� int �����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷�����
    //���ڿ���̨�����������磬����Ϊ int[] arr = {1,2,3}; ��ִ�з������������Ϊ��[1, 2, 3]
    //���ã���һ���������ַ���
    public static String arrToString(int[] arr) {
        String s = "";
        //ƴ��������
        s = s + "["; //��ʱ�����ų���Ϊ0���ַ�������[����ƴ�ӣ�����һ���µ��ַ�����
        //���µ��ַ����ٸ�ֵ��s����ʱ����s��¼�ľ����µ��ַ���"["�ĵ�ֵַ
        //��������õ����������ÿһ��Ԫ�ز�����ƴ��
        //��ô����Ҫ�������飬�õ�ÿһ��Ԫ�ز���
        for (int i = 0; i < arr.length; i++) {
            //�����һ��ѭ��:i = 0 ��ȡ�ľ���0�����ϵ�Ԫ��
            //��ƴ�ӵ�ʱ��"[" + 1 + ", " ƴ�����֮�����һ���µ��ַ��� "[1, "
            //�ڶ���ѭ����i = 1 ��ȡ�ľ���1�����ϵ�Ԫ��
            //��ƴ�ӵ�ʱ�� ��ʱs���ǵ�һ��ѭ��������ƴ����ϵĽ����"[1, "
            //��ƴ�ӵ�ʱ��"[1, " + 2 + ", " ƴ�����֮�����һ���µ��ַ��� "[1, 2, "
            //...
            if(i == arr.length - 1){
                //��������һ��Ԫ�أ���ô����Ҫƴ�Ӷ��ſո�
                s = s + arr[i];
            }else{
                //����������һ��Ԫ�أ���Ҫƴ��Ԫ�غͶ��ſո�
                s = s + arr[i] + ", ";
            }
        }
        //��ѭ������֮����ƴ�����һ��������
        s = s + "]";
        return s;
    }

    //�ַ�����ת����
    //��������
    //����һ��������ʵ���ַ�����ת������¼��һ���ַ��������ø÷������ڿ���̨������
    //���磬����¼�� abc�������� cba
    public static String reverse(String str){//abc
        //����˼�룺���ű���������ƴ�ӾͿ�����
        //fori :���ű���  forr�����ű���
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //i ���α�ʾ�ַ��������ÿһ�����������ŵģ�
            //���ǾͿ����õ������ÿһ���ַ���ƴ��
            s = s + str.charAt(i);
        }
        return s;
    }

    //���ת��
    //��������
    //��2135��ɣ������ʰ����ǪҼ����ʰ��Ԫ
    //��789��ɣ������ʰ������Ǫ��۰�ʰ��Ԫ
    public static void case04(){
        //1.����¼��һ�����
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("��¼��һ�����");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("�����Ч");
            }
        }

        //����һ������������ʾǮ�Ĵ�д
        String moneyStr = "";
        String[] getCapitalNumber = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};

        //2.�õ�money�����ÿһλ����,��ת������
        while (true) {//2135
            //���������ȡ���ݣ���Ϊ�Ҳ������ݵĸ�λ
            int ge = money % 10;
            String capitalNumber = getCapitalNumber[ge];
            //��ת��֮��Ĵ�дƴ�ӵ�moneyStr����
            moneyStr = capitalNumber + moneyStr;
            //��һ��ѭ�� �� "��" + "" = "��"
            //�ڶ���ѭ�� �� "��" + "��" = "����"
            //ȥ���ոջ�ȡ������
            money = money / 10;

            //��������ϵ�ÿһλȫ����ȡ���ˣ���ômoney��¼�ľ���0����ʱѭ������
            if (money == 0) {
                break;
            }
        }

        //3.��ǰ�油0������7λ
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "��" + moneyStr;
        }
        //System.out.println(moneyStr);//�����㷡Ҽ����

        //4.���뵥λ
        //����һ�������ʾ��λ
        String[] arr = {"��","ʰ","��","Ǫ","��","ʰ","Ԫ"};
        //               ��    ��   ��   ��   Ҽ   ��   ��

        //����moneyStr�����εõ� ��    ��   ��   ��   Ҽ   ��   ��
        //Ȼ���arr�ĵ�λ�����ȥ

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            //�Ѵ�д���ֺ͵�λƴ�ӵ�result����
            result = result + c + arr[i];
        }

        //5.��ӡ���ս��
        System.out.println(result);
    }

    //�ֻ�������
    //substring()����
    //�������ַ�������ʽ�Ӽ��̽���һ���ֻ��ţ����м���λ��������
    //����Ч��Ϊ��131****9468
    public static void case05(){
        //1.����¼��һ���ֻ�����
        Scanner sc = new Scanner(System.in);
        System.out.println("�������ֻ�����");
        String phoneNumber = sc.next();//13112349408

        //2.��ȡ�ֻ������е�ǰ��λ
        String star = phoneNumber.substring(0, 3);

        //3.��ȡ�ֻ������е������λ
        //��ʱ����substring����������1�������ģ��������������ģ�1�������Ļ����
        //��Ϊ������Ҫ��ȡ��������Խ���ʹ��1�������ġ�
        String end = phoneNumber.substring(7);

        //4.ƴ��
        String result = star + "****" + end;

        System.out.println(result);
    }

    //���д��滻
    //����1������¼��һ�� �ַ���������ַ����а�����TMD������ʹ��***�滻
    public static void case06(){
        //1.����һ��������ʾ���˵Ļ�
        String talk = "��������ʲô����TMD";

        //2.����仰�е����дʽ����滻
        String result = talk.replace("TMD", "***");

        //3.��ӡ
        System.out.println(talk);
        System.out.println(result);
    }

    //����2�����Ҫ�滻�����дʱȽ϶���ô�죿
    public static void case07(){
        //ʵ�ʿ����У����дʻ��кܶ�ܶ�

        //1.�ȼ���¼��Ҫ˵�Ļ�
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ˵�Ļ�");
        String talk = sc.next();//��������ʲô����TMD,GDX,ctmd,ZZ

        //2.����һ�����������������д�
        String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};

        //3.��˵�Ļ������е����дʶ��滻Ϊ***

        for (int i = 0; i < arr.length; i++) {
            //i ����
            //arr[i] Ԫ�� --- ���д�
            talk = talk.replace(arr[i],"***");
        }

        //4.��ӡ���
        System.out.println(talk);//��������ʲô����***,***,***,***
    }

    //���֤��Ϣ�鿴
    //���֤��ÿһλ�����й̶��ĺ��壺
    //1��2λ��ʡ��
    //3��4λ������
    //5��6λ������
    //7-14λ�������ꡢ�¡���
    //15��16λ�����ڵ��ɳ���
    //17λ���Ա��������ԣ�ż��Ů�ԣ�
    //18λ��������Ϣ�루���������
    //Ҫ���ӡ���ݷ�ʽ���£�
    //������ϢΪ��
    //���������գ�XXXX��X��X��
    //�Ա�Ϊ����/Ů
    public static void case08(){
        //1.����һ���ַ�����¼���֤����
        String id = "321281202001011234";

        //2.��ȡ����������
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);


        System.out.println("������ϢΪ��");
        System.out.println("����������:" + year + "��" + month + "��" + day + "��");

        //3.��ȡ�Ա�
        char gender = id.charAt(16);//'3'  ---> 3
        //����ASCII������ת��
        //'0' --->  48
        //'1' --->  49
        //'2' --->  50
        //'3' --->  51
        //'4' --->  52
        //'5' --->  53
        //'6' --->  54
        //'7' --->  55
        //'8' --->  56
        //'9' --->  57

        int num = gender - 48;
        if(num % 2 == 0){
            System.out.println("�Ա�Ϊ:Ů");
        }else{
            System.out.println("�Ա�Ϊ:��");
        }
    }
}
