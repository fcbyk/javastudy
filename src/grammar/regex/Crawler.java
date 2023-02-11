package grammar.regex;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Pattern����ʾ������ʽ
//Matcher���ı�ƥ���������ð���������ʽ�Ĺ���ȥ��ȡ�ַ�������ͷ��ʼ��ȡ��
//�ڴ���ȥ�ҷ���ƥ�������Ӵ�

public class Crawler {
    /* �������ı����밴��Ҫ����ȡ���ݡ�
        Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��
        ��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨
        Ҫ��:�ҳ��������е�JavaXX
    */
    public static void localCrawler1(){
        String str = "Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��" +
                "��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨";

        //1.��ȡ������ʽ�Ķ���
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //2.��ȡ�ı�ƥ�����Ķ���
        //����mȥ��ȡstr���ҷ���p������Ӵ�
        Matcher m = p.matcher(str);

        //3.����ѭ����ȡ
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }

    //�������Ľ���
    private static void method1(String str) {
        //Pattern:��ʾ������ʽ
        //Matcher: �ı�ƥ���������ð���������ʽ�Ĺ���ȥ��ȡ�ַ�������ͷ��ʼ��ȡ��
        //          �ڴ���ȥ�ҷ���ƥ�������Ӵ���

        //��ȡ������ʽ�Ķ���
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //��ȡ�ı�ƥ�����Ķ���
        //m:�ı�ƥ�����Ķ���
        //str:��
        //p:����
        //mҪ��str���ҷ���p�����С��
        Matcher m = p.matcher(str);

        //�����ı�ƥ������ͷ��ʼ��ȡ��Ѱ���Ƿ������������Ӵ�
        //���û�У���������false
        //����У�����true���ڵײ��¼�Ӵ�����ʼ�����ͽ�������+1
        // 0,4
        boolean b = m.find();

        //�����ײ�����find������¼�����������ַ����Ľ�ȡ
        // substring(��ʼ��������������);��ͷ����β
        // (0,4)���ǲ�����4����
        // ��ѽ�ȡ��С�����з��ء�
        String s1 = m.group();
        System.out.println(s1);


        //�ڶ����ڵ���find��ʱ�򣬻������ȡ���������
        //��ȡ���ڶ�������Ҫ����Ӵ����������������true
        //���ѵڶ����Ӵ�����ʼ�����ͽ�������+1�����м�¼
        b = m.find();

        //�ڶ��ε���group������ʱ�򣬻����find������¼�������ٴν�ȡ�Ӵ�
        String s2 = m.group();
        System.out.println(s2);
    }

    /*
        ����:�������ı��е������绰�����䣬�ֻ��ţ����߶���ȡ������
        ���������ԱѧϰJava��
        �ֻ���:18512516758��18512508907������ϵ����:boniu@itcast.cn��
        �����绰:01036517895��010-98951256����:bozai@itcast.cn��
        ���ߵ绰:400-618-9090 ��400-618-4000��4006184000��4006189090

        �ֻ��ŵ�������ʽ:1[3-9]\d{9}
        �����������ʽ:\w+@[\w&&[^_]]{2,6}(\.[a-zA-Z]{2,3}){1,2}�����绰��������ʽ:��\d{2,3}-?[1-9]\d{4,9}
        ���ߵ绰��������ʽ:400-?[1-9]\\d{2}-?[1-9]\\d{3}
    */
    public static void localCrawler2(){
        String s = "���������ԱѧϰJava��" +
                "�绰:18512516758��18512508907" + "������ϵ����:boniu@itcast.cn��" +
                "�����绰:01036517895��010-98951256" + "����:bozai@itcast.cn��" +
                "���ߵ绰:400-618-9090 ��400-618-4000��4006184000��4006189090";

        System.out.println("400-618-9090");

        String regex = "(1[3-9]\\d{9})|(\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2})" +
                "|(0\\d{2,3}-?[1-9]\\d{4,9})" +
                "(400-?[1-9]\\d{2}-?[1-9]\\d{3})";

        //1.��ȡ������ʽ�Ķ���
        Pattern p = Pattern.compile(regex);

        //2.��ȡ�ı�ƥ�����Ķ���
        //����mȥ��ȡs���ᰴ��p�Ĺ����������С��
        Matcher m = p.matcher(s);
        //3.����ѭ����ȡÿһ������ while(m.find()){
        String str = m.group();
        System.out.println(str);
    }

    /*
        �������ı�����Ҫ����ȡ���ݡ�
            Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��
            ��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨


        ����1:��ȡ�汾��Ϊ8��11.17��Java�ı�������ֻҪJava������ʾ�汾�š�
        ����2:��ȡ�汾��Ϊ8��11��17��Java�ı�����ȷ��ȡ���Ϊ:Java8 Java11 Java17 Java17
        ����3:��ȡ���˰汾��Ϊ8��11.17��Java�ı���
    */
    public static void localCrawler3(){
        String s = "Java�Դ�95�����������������˺ܶ�汾��Ŀǰ��ҵ���õ�������Java8��Java11��" +
                "��Ϊ�������ǳ���֧�ְ汾����һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨";

        //1.����������ʽ
        //?���Ϊǰ�������Java
        //=��ʾ��Java����Ҫ���������
        //�����ڻ�ȡ��ʱ��ֻ��ȡǰ�벿��
        //����1:
        String regex1 = "((?i)Java)(?=8|11|17)";
        //����2:
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";
        //����3:
        String regex4 = "((?i)Java)(?!8|11|17)";

        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }

    /*
        ֻд+��*��ʾ̰��ƥ��

        +? ��̰��ƥ��
        *? ��̰��ƥ��

        ̰����ȡ:����ȡ���ݵ�ʱ�򾡿��ܵĶ��ȡ����
        ��̰����ȡ:����ȡ���ݵ�ʱ�򾡿��ܵ��ٻ�ȡ����

        ab+:
        ̰����ȡ:abbbbbbbbbbbb
        ��̰����ȡ:ab
    */
    public static void localCrawler4(){
        String s = "Java�Դ�95������������abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "�����˺ܶ��ľ��Ŀǰ��ҵ���õ�������]ava8��]ava11����Ϊ�������ǳ���֧�ְ�ľ��" +
                "��һ������֧�ְ汾��Java17��������δ������Java17Ҳ���𽥵�����ʷ��̨";

        String regex = "ab+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());
        }
    }

    /* ����:
        ������:https://www.soba8.com/shenfenzheng/
        �����е����֤���붼��ȡ������
    */
    public static void webCrawler1() throws IOException {
        //����һ��URL����
        URL url = new URL("https://www.soba8.com/shenfenzheng/");
        //�����������ַ
        //ϸ��:��֤�����ǳ�ͨ
        URLConnection conn = url.openConnection();//����һ������ȥ��ȡ�����е�����
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //��ȡ������ʽ�Ķ���pattern
        String regex = "[1-9]\\d{17}";
        Pattern pattern = Pattern.compile(regex);//�ڶ�ȡ��ʱ��ÿ�ζ�һ����
        while ((line = br.readLine()) != null) {
            //�����ı�ƥ�����Ķ���matcher����pattern�Ĺ���ȥ��ȡ��ǰ����һ����Ϣ
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        br.close();
    }

}
