package grammar.question;
import java.util.Random;
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
}
