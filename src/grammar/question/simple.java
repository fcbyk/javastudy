package grammar.question;
import java.util.Scanner;

public class simple {

    //��ϰ1
    //���󣺶���5��������¼��ʦ����Ϣ����ӡ
    public static void question01(){
        //1.�����ַ������͵ı�����¼��ʦ������
        String name = "����л����";
        //2.�����������͵ı�����¼��ʦ������
        int age = 18;
        //3.�����ַ����͵ı�����¼��ʦ���Ա�
        char gender = '��';
        //4.����С�����͵ı�����¼��ʦ�����
        double height = 180.1;
        //5.���岼�����͵ı�����¼��ʦ�Ļ���״��
        boolean flag = true;

        //���5��������ֵ
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag);
    }

    //��ϰ2
    //���󣺽�����Ӱ���ƣ����ݣ���ݣ����֣��ĸ���Ϣѡ��ͬ���͵ı���������ӡ������
    public static void question02(){
        //1.�����ַ���������¼��Ӱ������
        String movie = "�ͳ����ؼ�";
        //2.��������������¼���ݵ�����
        String name1 = "����";
        String name2 = "������";
        String name3 = "����";
        //3. �����������͵ı�����¼��������
        int year = 2020;
        //4.����С�����͵ı�����¼��Ӱ������
        double score = 9.0;

        //��ӡ��������Ϣ
        System.out.println(movie);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(year);
        System.out.println(score);
    }

    //��ϰ3
    //����ѡ������һ���ֻ��������ֻ��۸��ֻ�Ʒ�ƣ�������Ϣѡ��ͬ���͵ı���������ӡ������
    public static void question03(){
        //1.����С�����͵ı�����¼�ֻ��ļ۸�
        double price = 5299.0;

        //2.�����ַ������͵ı�����¼�ֻ���Ʒ��
        String brand = "��Ϊ";

        //���������¼��ֵ
        System.out.println(price);
        System.out.println(brand);
    }

    //��ϰ4����ֵ���
    //���󣺼���¼��һ����λ����������Ϊ��λ��ʮλ����λ�󣬴�ӡ�ڿ���̨
    public static void question04(){
        //1.����¼��һ����λ��
        //���� --- �������� --- ��������
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ����λ��");
        int number = sc.nextInt();//123

        //2.��ȡ�����λ���ĸ�λ��ʮλ����λ����ӡ����
        //��ʽ��
        //����������һ��������
        //��λ�� ���� % 10
        int ones = number % 10;
        //ʮλ�� ���� / 10 % 10
        int tens = number / 10 % 10;
        //��λ�� ���� / 100 % 10
        int hundreds = number / 100  % 10;

        //������
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);

        //��ʽ��
        //��ȡ����һ������ÿһλ����
        //��λ������ % 10
        //ʮλ������ / 10 % 10
        //��λ������ / 100 % 10
        //ǧλ������ / 1000 % 10
        //�������Դ����ơ�����
    }

    //��ϰ5����ֻ�ϻ�
    //����
    //	����԰������ֻ�ϻ�����ֻ�ϻ������طֱ�Ϊͨ������¼���ã�
    //	���ó���ʵ���ж���ֻ�ϻ��������Ƿ���ͬ��
    public static void question05(){
        //1.��ȡ��ֻ�ϻ�������
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һֻ�ϻ�������");
        int weight1 = sc.nextInt();
        System.out.println("������ڶ�ֻ�ϻ�������");
        int weight2 = sc.nextInt();

        //2.������Ԫ�����������ս��
        String result = weight1 == weight2 ? "��ͬ" : "����ͬ";
        System.out.println(result);
    }

    //��ϰ6���������������ֵ
    //����
    //	һ��������ס���������У���֪���ǵ���߷ֱ�Ϊ150cm��210cm��165cm��
    //	���ó���ʵ�ֻ�ȡ���������е������ߡ�
    public static void question06(){
        //1.��������������¼���е����
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        //2.������Ԫ���������������еĽϴ�ֵ��
        int temp = height1 > height2 ? height1 : height2;

        //3.������յĽ��
        int max = temp > height3 ? temp : height3;

        System.out.println(max);
    }
}
