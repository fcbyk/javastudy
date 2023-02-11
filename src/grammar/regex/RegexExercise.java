package grammar.regex;

public class RegexExercise {

    //��ϰ1
    //����
    //���д������ʽ��֤�û�������ֻ������Ƿ�����Ҫ��
    //���д������ʽ��֤�û������������Ƿ�����Ҫ��
    //���д������ʽ��֤�û�����ĵ绰�����Ƿ�����Ҫ��
    //��֤�ֻ����� 13112345678 13712345667 13945679027 139456790271
    //��֤�����绰���� 020-2324242 02122442 027-42424 0712-3242434
    //��֤������� 3232323@qq.com zhangsan@itcast.cnn  dlei0009@163.com dlei0009@pci.com.cn
    public static void Exercise01(){
        //�ĵ�:
        //����һ����ȷ�����ݣ�����������ȥд��
        //13112345678
        //�ֳ�������:
        //��һ����:1 ��ʾ�ֻ�����ֻ����1��ͷ
        //�ڶ�����:[3-9] ��ʾ�ֻ�����ڶ�λֻ����3-9֮���
        //��������:\\d{9} ��ʾ�������ֿ��Գ���9�Σ�Ҳֻ�ܳ���9��
        String regex1 = "1[3-9]\\d{9}";
        System.out.println("13112345678".matches(regex1));//true
        System.out.println("13712345667".matches(regex1));//true
        System.out.println("13945679027".matches(regex1));//true
        System.out.println("139456790271".matches(regex1));//false
        System.out.println("-----------------------------------");

        //�����绰����
        //020-2324242 02122442 027-42424 0712-3242434
        //˼·:
        //����д�����������ʱ����Ҫ����ȷ�����ݷ�Ϊ������
        //һ:����@\\d{2,3}
        //      0:��ʾ����һ������0��ͷ��
        //      \\d{2,3}:��ʾ���Ŵӵڶ�λ��ʼ��������������֣����Գ���2��3�Ρ�
        //��:- ?��ʾ�������մλ�һ��
        //��:���� ����ĵ�һλҲ�������տ�ͷ���ӵڶ�λ��ʼ��������������֣�������ܳ���:5-10λ
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));

        //�������
        //3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //˼·:
        //����д������������ʱ����Ҫ����ȷ�����ݷ�Ϊ������
        //��һ����:@����� \\w+
        //      �������ĸ�����»��ߣ����ٳ���һ�ξͿ�����
        //�ڶ�����:@ ֻ�ܳ���һ��
        //��������:
        //      3.1         .�����[\\w&&[^_]]{2,6}
        //                  �������ĸ�����֣��ܹ�����2-6��(��ʱ���ܳ����»���)
        //      3.2         . \\.
        //      3.3         ��д��ĸ��Сд��ĸ�����ԣ�ֻ�ܳ���2-3��[a-zA-Z]{2,3}
        //      ���ǿ��԰�3.2��3.3����һ�飬��һ����Գ���1�λ�������
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));


        //24Сʱ��������ʽ
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("23:11:11".matches(regex4));

        String regex5 = "([01]\\d 2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:11".matches(regex5));
    }

    //��ϰ2
    //����
    //���д������ʽ��֤�û����Ƿ�����Ҫ��Ҫ��:��Сд��ĸ�����֣��»���һ��4-16λ
    //���д������ʽ��֤���֤�����Ƿ�����Ҫ��
    //��Ҫ��:
    //18λ��ǰ17λ�������֣����һλ���������ֿ����Ǵ�д��Сд��x
    //����Ҫ��:
    //�������֤����ĸ�ʽ�ϸ�Ҫ��
    //	���֤����:
    //		41080119930228457x
    //		510801197609022309
    //		15040119810705387X
    //		130133197204039024
    //		430102197606046442
    public static void Exercise02(){
        //�û���Ҫ��:��Сд��ĸ�����֣��»���һ��4-16λ
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("lisi".matches(regex1));
        System.out.println("wangwu".matches(regex1));
        System.out.println("$123".matches(regex1));

        //���֤����ļ�У��:
        //18λ��ǰ17λ�������֣����һλ���������ֿ����Ǵ�д��Сд��x
        String regex2 = "[1-9]\\d{16}(\\d|x|x)";
        String regex3 = "[1-9]\\d{16}[\\dXx]";
        String regex5 = "[1-9]\\d{16}(\\d(?i)x)";

        System.out.println("41080119930228457x".matches(regex3));
        System.out.println("510801197609022309".matches(regex3));
        System.out.println("15040119810705387X".matches(regex3));
        System.out.println("130133197204039024".matches(regex3));
        System.out.println("430102197606046442".matches(regex3));

        //���Դ�Сд����д��ʽ
        //��ƥ���ʱ�����abc�Ĵ�Сд
        String regex4 = "a((?i)b)c";
        System.out.println("------------------------------");
        System.out.println("abc".matches(regex4));//true
        System.out.println("ABC".matches(regex4));//false
        System.out.println("aBc".matches(regex4));//true

        //���֤������ϸ�У��
        //��д�����С�ĵ�:
        //��һ��:������ȷ�����ݽ��в��
        //�ڶ���:��ÿһ���ֵĹ��ɣ�����д������ʽ
        //������:��ÿһ���ֵ�����ƴ����һ�𣬾������յĽ��
        //��д��ʱ��:������ȥ��д��

        //410801 1993 02 28 457x
        //ǰ��6λ:ʡ�ݣ��������ɳ�������Ϣ����һλ������0������5λ����������       [1-9]\\d{5}
        //���ǰ���: 18 19 20                                                (18|19|20)
        //��ĺ���: �������ֳ�������                                           \\d{2}
        //�·�: 01~ 09 10 11 12                                               (@[1-9]|1[0-2])
        //����: 01~09 10~19 20~29 30 31                                       (0[1-9]|[12]\\d|3[01])
        //������λ: �������ֳ���3�� ���һλ����������Ҳ�����Ǵ�дx����Сдx        \\d{3}[\\dXx]
        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(@[1-9]|1[0-2])(@[1-9]|[12]\\d|3[01])\\d{3}[\\dxXx]";

        System.out.println("41080119930228457x".matches(regex6));
        System.out.println("510801197609022309".matches(regex6));
        System.out.println("15040119810705387X".matches(regex6));
        System.out.println("130133197204039024".matches(regex6));
        System.out.println("430102197606046442".matches(regex6));
    }

    //��ϰ2
    //���ַ�������Ҫѧѧ�����̡̳̳̳̳̳�
    //�滻Ϊ����Ҫѧ���
    public static void Exercise03(){
        String str = "��Ҫѧѧ�����̳̳̳̳̳�";

        //����:���ظ������� �滻Ϊ ������
        //ѧѧ                ѧ
        //�����            ��
        //�̳̳̳̳̳�        ��
        //  (.)��ʾ���ظ����ݵĵ�һ���ַ�����һ��
        //  \\1��ʾ��һ�ַ��ٴγ���
        //  + ����һ��
        //  $1 ��ʾ��������ʽ�е�һ������ݣ����ó�����
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }



}
