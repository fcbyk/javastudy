package grammar.question;
import java.util.Scanner;

public class simple {

    //练习1
    //需求：定义5个变量记录老师的信息并打印
    public static void question01(){
        //1.定义字符串类型的变量记录老师的姓名
        String name = "黑马谢广坤";
        //2.定义整数类型的变量记录老师的年龄
        int age = 18;
        //3.定义字符类型的变量记录老师的性别
        char gender = '男';
        //4.定义小数类型的变量记录老师的身高
        double height = 180.1;
        //5.定义布尔类型的变量记录老师的婚姻状况
        boolean flag = true;

        //输出5个变量的值
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(height);
        System.out.println(flag);
    }

    //练习2
    //需求：将（电影名称，主演，年份，评分）四个信息选择不同类型的变量，随后打印出来。
    public static void question02(){
        //1.定义字符串变量记录电影的名称
        String movie = "送初恋回家";
        //2.定义三个变量记录主演的名字
        String name1 = "刘鑫";
        String name2 = "张雨提";
        String name3 = "高媛";
        //3. 定义整数类型的变量记录年龄的年份
        int year = 2020;
        //4.定义小数类型的变量记录电影的评分
        double score = 9.0;

        //打印变量的信息
        System.out.println(movie);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(year);
        System.out.println(score);
    }

    //练习3
    //需求：选择其中一部手机，将（手机价格，手机品牌）两个信息选择不同类型的变量，随后打印出来。
    public static void question03(){
        //1.定义小数类型的变量记录手机的价格
        double price = 5299.0;

        //2.定义字符串类型的变量记录手机的品牌
        String brand = "华为";

        //输出变量记录的值
        System.out.println(price);
        System.out.println(brand);
    }

    //练习4：数值拆分
    //需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
    public static void question04(){
        //1.键盘录入一个三位数
        //导包 --- 创建对象 --- 接收数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();//123

        //2.获取这个三位数的个位、十位、百位并打印出来
        //公式：
        //针对于任意的一个数而言
        //个位： 数字 % 10
        int ones = number % 10;
        //十位： 数字 / 10 % 10
        int tens = number / 10 % 10;
        //百位： 数字 / 100 % 10
        int hundreds = number / 100  % 10;

        //输出结果
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);

        //公式：
        //获取任意一个数上每一位数。
        //个位：数字 % 10
        //十位：数字 / 10 % 10
        //百位：数字 / 100 % 10
        //千位：数字 / 1000 % 10
        //。。。以此类推。。。
    }

    //练习5：两只老虎
    //需求：
    //	动物园里有两只老虎，两只老虎的体重分别为通过键盘录入获得，
    //	请用程序实现判断两只老虎的体重是否相同。
    public static void question05(){
        //1.获取两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重");
        int weight2 = sc.nextInt();

        //2.利用三元运算符求出最终结果
        String result = weight1 == weight2 ? "相同" : "不相同";
        System.out.println(result);
    }

    //练习6：求三个数的最大值
    //需求：
    //	一座寺庙里住着三个和尚，已知他们的身高分别为150cm、210cm、165cm。
    //	请用程序实现获取这三个和尚的最高身高。
    public static void question06(){
        //1.定义三个变量记录和尚的身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        //2.利用三元运算符求出两个数中的较大值。
        int temp = height1 > height2 ? height1 : height2;

        //3.求出最终的结果
        int max = temp > height3 ? temp : height3;

        System.out.println(max);
    }
}
