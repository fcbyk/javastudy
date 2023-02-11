package grammar.basics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.lang.Integer;

public class Questions {

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

    //��ϰ7��������ѡŮ��
    //����
    //	����¼��Ů���ľ������������2������˸�����Ӧ������û���κλ�Ӧ
    public static void question07(){
        //������
        //1.����¼��Ů���ľ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ů���ľ���");
        int wine = sc.nextInt();//5
        //2.�Ծ�������һ���жϼ���
        if(wine > 2) {
            System.out.println("����Ӵ��С���ӣ�");
        }
    }

    //��ϰ8�����Խ���
    //����
    //	����¼��һ����������ʾС���Ŀ������Σ��������Ϊ1��С����Ե�С����Ů�����ˡ�
    public static void question08(){
        //������
        //1.����¼��һ����������ʾС���Ŀ�������
        Scanner sc = new Scanner(System.in);
        System.out.println("������С��������");
        int rank = sc.nextInt();
        //2.��С���Ŀ��Գɼ������жϼ���
        if(rank == 1){
            System.out.println("С���Ϊ��С����Ů����");
        }
    }

    //��ϰ9���Է�
    //����
    //	    ����¼��һ����������ʾ���ϵ�Ǯ��
    //      ������ڵ���100�飬�������������
    //      ���򣬾ͳԾ���ʵ�ݵ�ɳ��С�ԡ�
    public static void question09(){
        //������
        //1.����¼��һ����������ʾ���ϵ�Ǯ��
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��������ʾ���ϵ�Ǯ");
        int money = sc.nextInt();
        //2.��Ǯ�����ж�
        if(money >= 100){
            System.out.println("���������");
        }else{
            System.out.println("������Ƶ�");
        }
    }

    //��ϰ10��ӰԺѡ��
    //����
    //	��ʵ�ʿ����У���ӰԺѡ��Ҳ��ʹ�õ�if�жϡ�
    //	����ĳӰԺ������100��Ʊ��Ʊ�����Ϊ1~100��
    //	��������Ʊ������࣬ż��Ʊ�����Ҳࡣ
    //	����¼��һ��������ʾ��ӰƱ��Ʊ�š�
    //	���ݲ�ͬ�����������ͬ����ʾ��
    //  ���Ʊ��Ϊ��������ô��ӡ����ߡ�
    //	���Ʊ��Ϊż������ô��ӡ���ұߡ�
    public static void question10(){
        //������
        //1.����¼��Ʊ��
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ʊ��");
        int ticket = sc.nextInt();
        if(ticket >= 1 && ticket <= 100){
            //�Ϸ�
            //2.��Ʊ�Ž����ж�
            if (ticket % 2 == 0) {
                //ż��
                System.out.println("���ұ�");
            } else {
                //����
                System.out.println("�����");
            }
        }else{
            //Ʊ�Ų��Ϸ�
            System.out.println("Ʊ�Ų��Ϸ�");
        }
    }

    //��ϰ11�����Խ���
    //����
    //	С����Ҫ��ĩ�����ˣ�С���ְֶ���˵�����������ͬ�Ŀ��Գɼ���������ͬ�����
    //��������Կ���С���ĵ÷֣����ó���ʵ��С�����׸û��ʲô����������ڿ���̨�����
    //������
    //	��С���Ŀ��Գɼ�δ֪������ʹ�ü���¼��ķ�ʽ��ȡֵ
    //	�����ڽ�������϶࣬���ڶ����жϣ�����if...else...if��ʽʵ��
    //	��Ϊÿ���ж����ö�Ӧ������
    //	��Ϊÿ���ж����ö�Ӧ�Ľ���
    public static void question11(){
        //95~100 ���г�һ��
        //90~94   ���ֳ���һ��
        //80 ~ 89 ���ν��һ��
        //80 ����  ����һ��

        //1.����¼��һ��ֵ��ʾС���ķ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������С���ĳɼ�");
        int score = sc.nextInt();
        //2.�Է�������Ч�Խ����ж�
        if(score >= 0 && score <= 100){
            //��Ч�ķ���
            //3.��С���ķ��������жϣ���ͬ���ִ�в�ͬ�Ĵ���
            if(score >= 95 && score <= 100){
                System.out.println("�����г�һ��");
            }else if(score >= 90 && score <= 94){
                System.out.println("���ֳ���һ��");
            }else if(score >= 80 && score <= 89){
                System.out.println("���ν��һ��");
            }else{
                System.out.println("����һ��");
            }
        }else{
            //��Ч�ķ���
            System.out.println("�������Ϸ�");
        }
    }

    //��ϰ12���˶��ƻ�
    // ���󣺼���¼������������ʾ����ļ��ʻ��
    //��һ���ܲ�
    //�ܶ�����Ӿ
    //����������
    //���ģ����е���
    //���壺ȭ��
    //��������ɽ
    //���գ��úó�һ��
    public static void question12(){
        //1.����¼��һ��������ʾ����
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��������ʾ����");
        int week = sc.nextInt();

        //2.��дһ��switch���ȥ��week����ƥ��
        switch (week){
            case 1:
                System.out.println("�ܲ�");
                break;
            case 2:
                System.out.println("��Ӿ");
                break;
            case 3:
                System.out.println("����");
                break;
            case 4:
                System.out.println("���е���");
                break;
            case 5:
                System.out.println("ȭ��");
                break;
            case 6:
                System.out.println("��ɽ");
                break;
            case 7:
                System.out.println("�úó�һ��");
                break;
            default:
                System.out.println("�������û���������");
                break;
        }
    }

    //��ϰ13����Ϣ�պ͹�����
    //���󣺼���¼������������������ա���Ϣ�ա�
    //(1-5) �����գ�(6-7)��Ϣ�ա�
    public static void question13(){
        //������
        //1.����¼��������
        Scanner sc = new Scanner(System.in);
        System.out.println("����������");
        int week = sc.nextInt();//3
        //2.����switch����ƥ��
        //----------------------------------------------------
        //����case��͸�򻯴���
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("������");
                break;
            case 6:
            case 7:
                System.out.println("��Ϣ��");
                break;
            default:
                System.out.println("û���������");
                break;
        }

        // ----------------------------------------------------
        //����JDK12�򻯴�����д
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("������");
            case 6, 7 -> System.out.println("��Ϣ��");
            default -> System.out.println("û���������");
        }
    }

    //��ϰ14��forѭ����ϰ-�������
    //�����ڿ���̨���1-5��5-1������
    public static void question14(){
        //�����������1-5
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
        System.out.println("--------");
        //�����������5-1
        for(int i=5; i>=1; i--) {
            System.out.println(i);
        }
    }

    //��ϰ15��forѭ����ϰ-���
    //������1-5֮������ݺͣ�������ͽ���ڿ���̨���
    public static void question15(){
        //��͵����ս�����뱣����������Ҫ����һ�����������ڱ�����͵Ľ������ʼֵΪ0
        int sum = 0;
        //��1��ʼ��5���������ݣ�ʹ��ѭ���ṹ���
        for(int i=1; i<=5; i++) {
            //���������е�����д��ѭ���ṹ�ڲ�
            // �˴��������е������ǽ����� i �ӵ����ڱ���������͵ı��� sum ��
            sum = sum + i;
			/*
				sum += i;	sum = sum + i;
				��һ�Σ�sum = sum + i = 0 + 1 = 1;
				�ڶ��Σ�sum = sum + i = 1 + 2 = 3;
				�����Σ�sum = sum + i = 3 + 3 = 6;
				���ĴΣ�sum = sum + i = 6 + 4 = 10;
				����Σ�sum = sum + i = 10 + 5 = 15;
			*/
        }
        //��ѭ��ִ�����ʱ�����������ݴ�ӡ����
        System.out.println("1-5֮������ݺ��ǣ�" + sum);
    }

    //��ϰ16��forѭ����ϰ-��ż����
    //������1-100֮���ż���ͣ�������ͽ���ڿ���̨���
    public static void question16(){
        //��͵����ս�����뱣����������Ҫ����һ�����������ڱ�����͵Ľ������ʼֵΪ0
        int sum = 0;
        //��1-100�����������1-5��������ͼ�����ȫһ���������ǽ���������ͬ
        for(int i=1; i<=100; i++) {
            //��1-100��ż����ͣ���Ҫ����Ͳ�����������������ж��Ƿ���ż��
            if(i%2 == 0) {
                //sum += i��
                sum = sum + i;
            }
        }
        //��ѭ��ִ�����ʱ�����������ݴ�ӡ����
        System.out.println("1-100֮���ż�����ǣ�" + sum);
    }

    //��ϰ17��forѭ����ϰ-ͳ�ƴ���
    //����
    //	  ����¼���������֣���ʾһ����Χ��
    //    ͳ�������Χ�С�
    //    ���ܱ�3���������ܱ�5���������ж��ٸ���
    public static void question17(){
        Scanner in = new Scanner(System.in);
        System.out.println("��������ʼ����");
        int start = in.nextInt();
        System.out.println("�������������");
        int end = in.nextInt();
        int count = 0 ;
        for (;start <= end;start ++){
            if (start % 3 == 0 && start % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

    //��ϰ18����ӡ5��HelloWorld
    public static void question18(){
        int i = 1;
        while(i <= 5){
            System.out.println("HelloWorld");
            i++;
        }
        System.out.println(i);
    }

    //��ϰ19�����������
    public static void question19(){
        //1.����һ��������ʾ���������ĸ߶�
        int height = 8844430;
        //2.����һ��������ʾֽ�ŵĺ��
        double paper = 0.1;

        //����һ����������������������ͳ���۵��Ĵ���
        int count = 0;

        //3.ѭ���۵�ֽ��
        //ֻ��ֽ�ŵĺ�� < �������ĸ߶� ѭ���ż���������ѭ����ֹͣ
        //�ӣ�ֻ���ж�Ϊ�棬ѭ���Ż����
        while(paper < height){
            //�۵�ֽ��
            paper = paper * 2;
            count++;
        }

        //4.��ӡһ��ֽ���۵�����
        System.out.println(count);
    }

    //��ϰ20����7��
    //����
    //	���Ѿۻ��ʱ����ܻ���һ����Ϸ����7��
    //	��Ϸ���򣺴�����һ�����ֿ�ʼ����������Ҫ���������ǰ���7������7�ı���ʱ��Ҫ˵������
    //	����ʹ�ó����ڿ���̨��ӡ��1-100֮���������߱ع����������
    //������
    //	1 2 3 4 5 6 �� 8 9 10 11 12 13 �� 15 16 �� 18 ...
    public static void question20(){
        for (int i = 1; i <= 100; i++) {
            //�ж�ÿһ�����֣�������Ϲ��򣬾ʹ�ӡ������������Ϲ���ʹ�ӡ��ʵ������
            if(i % 10 == 7 || i / 10 % 10 == 7  ||  i % 7 == 0){
                System.out.println("��");
                continue;
            }
            System.out.println(i);
        }
    }

    //��ϰ21��ƽ����
    //����
    //	����¼��һ�����ڵ���2������ x �����㲢���� x �� ƽ���� �����ֻ������������ ��С�����ֽ�����ȥ ��
    public static void question21(){
        //������
        //ƽ����   16��ƽ����4
        //         4��ƽ����2

        // 10
        // 1 * 1 = 1 < 10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10
        //�ƶϣ�10��ƽ��������3~4֮�䡣

        // 20
        // 1 * 1 = 1 < 20
        // 2 * 2 = 4 < 20
        // 3 * 3 = 9 < 20
        // 4 * 4 = 16 < 20
        // 5 * 5 = 25 > 20
        //�ƶϣ�20��ƽ��������4~5֮�䡣

        //�ڴ��뵱��
        //��1��ʼѭ�����������ֵ�ƽ����ԭ�������ֽ��бȽ�
        //���С�ڵģ���ô���������ж�
        //�����ȣ���ô��ǰ���־���ƽ����
        //������ڵģ���ôǰһ�����־���ƽ��������������

        //1.����¼��һ������
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        int number = sc.nextInt();
        //2.��1��ʼѭ���ж�
        //��ʼ��1 ����: number
        for (int i = 1; i <= number; i++) {
            //��i * i �ٸ�number���бȽ�
            if(i * i == number){
                System.out.println(i + "����" + number + "��ƽ����");
                //һ���ҵ��ˣ�ѭ���Ϳ���ֹͣ�ˣ���������־Ͳ���Ҫ�����ˣ���ߴ��������Ч�ʡ�
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + "����" + number + "ƽ��������������");
                break;
            }
        }
    }

    //��ϰ22���ж��Ƿ�Ϊ����
    //����
    //	����¼��һ�������� x ���жϸ������Ƿ�Ϊһ��������
    public static void question22(){
        //������
        //���һ������ֻ�ܱ�1�ͱ�����������ô��������������������������������
        //7 = 1 * 7 ����
        //8 = 1 * 8  2 * 4 ����

        //������
        //1.����¼��һ��������
        //number
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��������");
        int number = sc.nextInt();//9

        //����һ����������ʾ���
        //�����number�Ƿ�Ϊһ������
        //true�� ��һ������
        //false : ����һ������

        //��ʾ�������Ϊnumber��һ������
        boolean flag = true;

        //2.�ж�
        //дһ��ѭ������2��ʼ�жϣ�һֱ�жϵ�number-1Ϊֹ
        //�������Χ֮�ڣ���û�����ֿ��Ա�number����
        for (int i = 2; i < number; i++) {
            //i ���α�ʾ�����Χ֮�ڵ�ÿһ������
            //��number�Ƿ��ܱ�i�����Ϳ�����
            if(number % i == 0){// 9 % 2 = 1
                flag = false;
                //System.out.println(number + "����һ������");
                break;
            }/*else{
                System.out.println(number + "��һ������");
            }*/
        }

        //ֻ�е����ѭ�������ˣ���ʾ�����Χ֮�����е����ֶ��ж������
        //��ʱ���ܶ϶�number��һ������
        if(flag){
            System.out.println(number + "��һ������");
        }else{
            System.out.println(number + "����һ������");
        }
    }

    //��ϰ23��������С��Ϸ
    //����
    //	�����Զ�����һ��1-100֮�����������ڴ�����ʹ�ü���¼��ȥ�³���������Ƕ��٣�
    //Ҫ��
    //	ʹ��ѭ���£�һֱ����Ϊֹ��
    //˼·������
    //1. ����һ��1-100֮��������
    //2. ʹ�ü���¼��ȥ�³���������Ƕ���
    //3. �ѷ����µĴ���д��ѭ����
    public static void question23(){
        //1.����һ��1-100֮��������
        Random r = new Random();
        int number = r.nextInt(100) + 1;// 0 ~ 99 + 1 --- 1 ~ 100
        System.out.println(number);

        //2.ʹ�ü���¼��ȥ�³���������Ƕ��٣�
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("������һ������");
            int guessNumber = sc.nextInt();
            //3.�Ƚ�
            if(guessNumber > number){
                System.out.println("���µ����ִ���");
            }else if(guessNumber < number){
                System.out.println("���µ�����С��");
            }else{
                System.out.println("��ϲ�㣬������");
                break;
            }
        }
    }

    //��ϰ24�����
    //���󣺶���һ�����飬�洢1,2,3,4,5
    //��������õ�ÿһ��Ԫ�أ��������������е����ݺ�
    public static void question24(){
        /*����һ�����飬�洢1,2,3,4,5
        ��������õ�ÿһ��Ԫ�أ��������������е����ݺ�*/

        //������
        //1.����һ�����飬���������1,2,3,4,5
        int[] arr = {1,2,3,4,5};

        //��ͱ���
        int sum = 0;
        //2.��������õ�ÿһ�����ݣ��ۼ����
        for (int i = 0; i < arr.length; i++) {
            //i ���α�ʾ���������ÿһ������
            //arr[i] ���α�ʾ���������ÿһ��Ԫ��
            sum = sum + arr[i];
        }

        //��ѭ������֮��sum��ֵ�����ۼ�֮��Ľ��
        System.out.println(sum);
    }

    //��ϰ25��ͳ�Ƹ���
    //���󣺶���һ�����飬�洢1,2,3,4,5,6,7,8,9,10
    //��������õ�ÿһ��Ԫ�أ�ͳ����������һ���ж��ٸ��ܱ�3����������
    public static void question25(){
        //������
        //1.����һ������ �洢1,2,3,4,5,6,7,8,9,10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //����һ������������ͳ�ƴ���
        int count = 0;
        //2.��������õ�ÿһ��Ԫ��
        for (int i = 0; i < arr.length; i++) {
            //i ��ʾ���������ÿһ������
            //arr[i] ��ʾ���������ÿһ��Ԫ��
            //3.�жϵ�ǰ��Ԫ���Ƿ�Ϊ3�ı������������ôͳ�Ʊ�������Ҫ����һ�Ρ�
            if(arr[i] % 3 == 0){
                // System.out.println(arr[i]);
                count++;
            }
        }
        //��ѭ������֮�󣬾ͱ�ʾ�����������е����ֶ��ж�����ˣ�ֱ�Ӵ�ӡcount����
        System.out.println("�������ܱ�3������������" + count + "��");
    }

    //��ϰ26���仯����
    //����
    //����һ�����飬�洢1,2,3,4,5,6,7,8,9,10
    //��������õ�ÿһ��Ԫ�ء�
    //Ҫ��
    //1��������������򽫵�ǰ������������
    //2�������ż�����򽫵�ǰ���ֱ�ɶ���֮һ
    public static void question26(){
        //������
        //1.����һ�����飬��1,2,3,4,5,6,7,8,9,10
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.��������õ�ÿһ��Ԫ��
        for (int i = 0; i < arr.length; i++) {
            //i ���α�ʾ���������ÿһ������
            //arr[i] ���α�ʾ���������ÿһ��Ԫ��
            //3.��ÿһ��Ԫ�ؽ����ж�
            if(arr[i] % 2 == 0){
                //ż�� ��ɶ���֮һ
                arr[i] = arr[i] / 2;
            }else{
                //���� ��������
                arr[i] = arr[i] * 2;
            }
        }

        //��������
        //һ��ѭ������ֻ��һ�����顣
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //��ϰ27������ֵ
    //�����������е����ֵ
    public static void question27(){
        //�������������ֵ��33,5,22,44,55

        //��չ���⣺
        //1.���������ֵ��˼·���Լ���дһ������С��
        //2.ΪʲômaxҪ��¼Ϊarr[0],Ĭ��ֵ����Ϊ0��
        //����д0
        //max�ĳ�ʼ��ֵһ��Ҫ�������е�ֵ��
        //3.ѭ���п�ʼ����һ����0��
        //ѭ���Ŀ�ʼ�������Ϊ0����ô��һ��ѭ����ʱ�����Լ����Լ�����һ�£��Խ��û���κ�Ӱ�죬����Ч��ƫ��
        //Ϊ�����Ч�ʣ�����һ��ѭ���Ĵ�����ѭ����ʼ��������д1.

        //1.�������������洢5��ֵ
        int[] arr = {33,5,22,44,55};
        //2.����һ������max�����洢���ֵ
        //��ʱ��Ϊ0����������������
        int max = arr[0];
        //3.ѭ����ȡ�����е�ÿһ��Ԫ��
        //����ÿһ��Ԫ�ظ�max���бȽ�
        for (int i = 1; i < arr.length; i++) {
            //i ����  arr[i] Ԫ��
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //4.��ѭ������֮��max��¼�ľ��������е����ֵ
        System.out.println(max);//55
    }

    //��ϰ28��ͳ�Ƹ���
    //��������10��1~100֮���������������顣
    //1������������ݵĺ�
    //2�����������ݵ�ƽ����
    //3��ͳ���ж��ٸ����ݱ�ƽ��ֵС
    public static void question28(){
        //������
        //1.��������
        int[] arr = new int[10];
        //2.����������뵽���鵱��
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            //ÿѭ��һ�Σ��ͻ�����һ���µ������
            int number = r.nextInt(100) + 1;
            //�����ɵ��������ӵ����鵱��
            //������[����] = ����;
            arr[i] = number;
        }

        // 1������������ݵĺ�
        //������ͱ���
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //ѭ���õ�ÿһ��Ԫ��
            //����Ԫ���ۼӵ�sum����
            sum = sum + arr[i];
        }
        System.out.println("�������������ݵĺ�Ϊ��" + sum);

        //2�����������ݵ�ƽ����
        int avg = sum / arr.length;
        System.out.println("������ƽ����Ϊ��" + avg);

        //3��ͳ���ж��ٸ����ݱ�ƽ��ֵС
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }

        //��ѭ������֮�󣬾ͱ�ʾ���Ѿ��ҵ������еı�ƽ����С������
        System.out.println("�������У�һ����" + count + "�����ݣ���ƽ����С");

        //�������飬��֤��
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //��ϰ29����������
    //���󣺶���һ�����飬����1,2,3,4,5������Ҫ�󽻻�������Ӧ��Ԫ�ء�
    //����ǰ��1,2,3,4,5
    //������5,2,3,4,1
    public static void question29(){
        //1.��������洢����
        int[] arr = {1,2,3,4,5};
        //2.����ѭ��ȥ��������
        for(int i = 0,j = arr.length - 1; i < j; i++,j--){
            //��������i�ͱ���jָ���Ԫ��
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //��ѭ������֮����ô�����е����ݾ�ʵ����ͷβ����
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //��ϰ30����������
    //���󣺶���һ�����飬����1~5��Ҫ������������������ݵ�˳��
    public static void question30(){
        //1.��������洢1~5
        int[] arr = {1, 2, 3, 4, 5};
        //2.ѭ���������飬��0������ʼ�������ݵ�˳��
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //����һ���������
            int randomIndex = r.nextInt(arr.length);
            //�����������ָ���Ԫ�� �� i ָ���Ԫ�ؽ��н���
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //��ѭ������֮����ô���������е������Ѿ�����˳����
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //��ϰ31���㷨С��1
    // ����¼��һЩ1~10��֮�������������ӵ������С�ֱ���������������ݺͳ���200Ϊֹ
    public static void question31(){
        /*
            ����¼��һЩ1~10��֮�������������ӵ������С�ֱ���������������ݺͳ���200Ϊֹ��
        */
        //1.����һ�����������������
        ArrayList<Integer> list = new ArrayList<>();
        //2.����¼��������ӵ�������
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("������һ������");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);//�Ȱ��쳣�����Ƚ��й���
            if (num < 1 || num > 100){
                System.out.println("��ǰ���ֲ���1~100�ķ�Χ���У�����������");
                continue;
            }
            //��ӵ�������//ϸ��:
            //num:������������
            //���������������Integer
            //��������ݵ�ʱ�򴥷����Զ�װ��
            list.add(num);
            //ͳ�Ƽ��������е����ݺ�
            int sum = getSum(list);
            //��sum�����ж�
            if(sum > 200){
                System.out.println("���������е����ݺ��Ѿ�����Ҫ��");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //i :����
            //list.get(i);
            int num = list.get(i);
            sum = sum + num;//+=
        }
        return sum;
    }

    //��ϰ32���㷨С��2
    //�Լ�ʵ��parseInt������Ч�������ַ�����ʽ������ת��������
    //Ҫ��:�ַ�����ֻ�������ֲ����������ַ�����һλ�����10λ�ղ��ܿ�ͷ
    public static void question32(){
        //1.����һ���ַ���
        String str = "123";
        //2.У���ַ���
        //ϰ��:���Ȱ��쳣���ݽ��й��ˣ�ʣ�����������������ݡ�
        if (!str.matches("[1-9]\\d{0,9}")) {
            //���������
            System.out.println("���ݸ�ʽ����");
        } else {
            //��ȷ������
            System.out.println("���ݸ�ʽ��ȷ");
            //3.����һ��������ʾ���յĽ��
            int number = 0;
            //4.�����ַ����õ������ÿһ���ַ�
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';//��ÿһλ���ַŵ�number����
                number = number * 10 + c;
            }
            System.out.println(number);
            System.out.println(number + 1);
        }
    }

    //��ϰ33���㷨С��3
    //����һ�������Լ�ʵ��toBinaryString������Ч������һ��ʮ��������ת���ַ�����ʾ�Ķ�����
    public static String tobinarystring(int number) {//6
        //�����߼�:
        //���ϵ�ȥ����2���õ�������һֱ����Ϊ�վͽ�����
        //����Ҫ����������ƴ������

        //����һ��StringBuilder����ƴ������
        StringBuilder sb = new StringBuilder();
        //����ѭ�����ϵĳ���2��ȡ����
        while (true) {
            if (number == 0) {
                break;
            }
            //��ȡ���� %
            int remaindar = number % 2;//����ƴ��
            sb.insert(0, remaindar);
            //����2 /
            number = number / 2;
        }
        return sb.toString();
    }

    //��ϰ34���㷨С��4
    //��ʹ�ô���ʵ�ּ�������˶����죬��JDK7��JDK8���ַ�ʽ���
    public static void question34() throws ParseException {
        //��ʹ�ô���ʵ�ּ�������˶����죬��JDK7��JDK8���ַ�ʽ���
        //JDK7
        //����:ֻҪ��ʱ����м�������жϣ�����Ҫ�Ȼ�ȡ��ǰʱ��ĺ���ֵ
        //1.������������յĺ���ֵ
        String birthday = "2000��1��1��";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        //2.��ȡ��ǰʱ��ĺ���ֵ
        long todayTime = System.currentTimeMillis();
        //3.������������
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2000, 1, 1);
        LocalDate ld2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }

    //��ϰ35���㷨С��5
    //�ж������һ����������껹��ƽ��Ҫ��:��JDK7��JDK8���ַ�ʽ
    //�ж���ʾ:������29��������һ����366��������
    public static void question35(){
        //jdk7
        //���ǿ��԰�ʱ������Ϊ2000��3��1��
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);
        //�·ݵķ�Χ:0~11
        //�ٰ�������ǰ��һ��
        c.add(Calendar.DAY_OF_MONTH, -1);
        //����ǰ��ʱ����28�Ż���29��?
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //jdk8
        //�·ݵķ�Χ:1~12
        //�趨ʱ��Ϊ2000���3��1��
        LocalDate ld = LocalDate.of(2001, 3, 1);
        //��ʱ����ǰ��һ��
        LocalDate ld2 = ld.minusDays(1);
        //��ȡ��һ����һ�����еļ���
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //true:����
        //false:ƽ��
        System.out.println(ld.isLeapYear());
    }

}
