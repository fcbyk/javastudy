package grammar.question;
import java.util.Random;
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

    //练习7：老丈人选女婿
    //需求：
    //	键盘录入女婿的酒量，如果大于2斤，老丈人给出回应，否则没有任何回应
    public static void question07(){
        //分析：
        //1.键盘录入女婿的酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();//5
        //2.对酒量进行一个判断即可
        if(wine > 2) {
            System.out.println("不错哟，小伙子！");
        }
    }

    //练习8：考试奖励
    //需求：
    //	键盘录入一个整数，表示小明的考试名次，如果名次为1，小红可以当小明的女朋友了。
    public static void question08(){
        //分析：
        //1.键盘录入一个整数，表示小明的考试名次
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的名次");
        int rank = sc.nextInt();
        //2.对小明的考试成绩进行判断即可
        if(rank == 1){
            System.out.println("小红成为了小明的女朋友");
        }
    }

    //练习9：吃饭
    //需求：
    //	    键盘录入一个整数，表示身上的钱。
    //      如果大于等于100块，就是网红餐厅。
    //      否则，就吃经济实惠的沙县小吃。
    public static void question09(){
        //分析：
        //1.键盘录入一个整数。表示身上的钱。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示身上的钱");
        int money = sc.nextInt();
        //2.对钱进行判断
        if(money >= 100){
            System.out.println("吃网红餐厅");
        }else{
            System.out.println("福建大酒店");
        }
    }

    //练习10：影院选座
    //需求：
    //	在实际开发中，电影院选座也会使用到if判断。
    //	假设某影院售卖了100张票，票的序号为1~100。
    //	其中奇数票号坐左侧，偶数票号坐右侧。
    //	键盘录入一个整数表示电影票的票号。
    //	根据不同情况，给出不同的提示：
    //  如果票号为奇数，那么打印坐左边。
    //	如果票号为偶数，那么打印坐右边。
    public static void question10(){
        //分析：
        //1.键盘录入票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票号");
        int ticket = sc.nextInt();
        if(ticket >= 1 && ticket <= 100){
            //合法
            //2.对票号进行判断
            if (ticket % 2 == 0) {
                //偶数
                System.out.println("坐右边");
            } else {
                //奇数
                System.out.println("坐左边");
            }
        }else{
            //票号不合法
            System.out.println("票号不合法");
        }
    }

    //练习11：考试奖励
    //需求：
    //	小明快要期末考试了，小明爸爸对他说，会根据他不同的考试成绩，送他不同的礼物，
    //假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出。
    //分析：
    //	①小明的考试成绩未知，可以使用键盘录入的方式获取值
    //	②由于奖励种类较多，属于多种判断，采用if...else...if格式实现
    //	③为每种判断设置对应的条件
    //	④为每种判断设置对应的奖励
    public static void question11(){
        //95~100 自行车一辆
        //90~94   游乐场玩一天
        //80 ~ 89 变形金刚一个
        //80 以下  胖揍一顿

        //1.键盘录入一个值表示小明的分数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = sc.nextInt();
        //2.对分数的有效性进行判断
        if(score >= 0 && score <= 100){
            //有效的分数
            //3.对小明的分数进行判断，不同情况执行不同的代码
            if(score >= 95 && score <= 100){
                System.out.println("送自行车一辆");
            }else if(score >= 90 && score <= 94){
                System.out.println("游乐场玩一天");
            }else if(score >= 80 && score <= 89){
                System.out.println("变形金刚一个");
            }else{
                System.out.println("胖揍一顿");
            }
        }else{
            //无效的分数
            System.out.println("分数不合法");
        }
    }

    //练习12：运动计划
    // 需求：键盘录入星期数，显示今天的减肥活动。
    //周一：跑步
    //周二：游泳
    //周三：慢走
    //周四：动感单车
    //周五：拳击
    //周六：爬山
    //周日：好好吃一顿
    public static void question12(){
        //1.键盘录入一个整数表示星期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示星期");
        int week = sc.nextInt();

        //2.书写一个switch语句去跟week进行匹配
        switch (week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入错误，没有这个星期");
                break;
        }
    }

    //练习13：休息日和工作日
    //需求：键盘录入星期数，输出工作日、休息日。
    //(1-5) 工作日，(6-7)休息日。
    public static void question13(){
        //分析：
        //1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int week = sc.nextInt();//3
        //2.利用switch进行匹配
        //----------------------------------------------------
        //利用case穿透简化代码
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }

        // ----------------------------------------------------
        //利用JDK12简化代码书写
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("没有这个星期");
        }
    }

    //练习14：for循环练习-输出数据
    //需求：在控制台输出1-5和5-1的数据
    public static void question14(){
        //需求：输出数据1-5
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
        System.out.println("--------");
        //需求：输出数据5-1
        for(int i=5; i>=1; i--) {
            System.out.println(i);
        }
    }

    //练习15：for循环练习-求和
    //需求：求1-5之间的数据和，并把求和结果在控制台输出
    public static void question15(){
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;
        //从1开始到5结束的数据，使用循环结构完成
        for(int i=1; i<=5; i++) {
            //将反复进行的事情写入循环结构内部
            // 此处反复进行的事情是将数据 i 加到用于保存最终求和的变量 sum 中
            sum = sum + i;
			/*
				sum += i;	sum = sum + i;
				第一次：sum = sum + i = 0 + 1 = 1;
				第二次：sum = sum + i = 1 + 2 = 3;
				第三次：sum = sum + i = 3 + 3 = 6;
				第四次：sum = sum + i = 6 + 4 = 10;
				第五次：sum = sum + i = 10 + 5 = 15;
			*/
        }
        //当循环执行完毕时，将最终数据打印出来
        System.out.println("1-5之间的数据和是：" + sum);
    }

    //练习16：for循环练习-求偶数和
    //需求：求1-100之间的偶数和，并把求和结果在控制台输出
    public static void question16(){
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;
        //对1-100的数据求和与1-5的数据求和几乎完全一样，仅仅是结束条件不同
        for(int i=1; i<=100; i++) {
            //对1-100的偶数求和，需要对求和操作添加限制条件，判断是否是偶数
            if(i%2 == 0) {
                //sum += i；
                sum = sum + i;
            }
        }
        //当循环执行完毕时，将最终数据打印出来
        System.out.println("1-100之间的偶数和是：" + sum);
    }

    //练习17：for循环练习-统计次数
    //需求：
    //	  键盘录入两个数字，表示一个范围。
    //    统计这个范围中。
    //    既能被3整除，又能被5整除数字有多少个？
    public static void question17(){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入起始数字");
        int start = in.nextInt();
        System.out.println("请输入截至数字");
        int end = in.nextInt();
        int count = 0 ;
        for (;start <= end;start ++){
            if (start % 3 == 0 && start % 5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

    //练习18：打印5次HelloWorld
    public static void question18(){
        int i = 1;
        while(i <= 5){
            System.out.println("HelloWorld");
            i++;
        }
        System.out.println(i);
    }

    //练习19：珠穆朗玛峰
    public static void question19(){
        //1.定义一个变量表示珠穆朗玛峰的高度
        int height = 8844430;
        //2.定义一个变量表示纸张的厚度
        double paper = 0.1;

        //定义一个计数器（变量），用来统计折叠的次数
        int count = 0;

        //3.循环折叠纸张
        //只有纸张的厚度 < 穆朗玛峰的高度 循环才继续，否则循环就停止
        //坑：只有判断为真，循环才会继续
        while(paper < height){
            //折叠纸张
            paper = paper * 2;
            count++;
        }

        //4.打印一下纸张折叠次数
        System.out.println(count);
    }

    //练习20：逢7过
    //需求：
    //	朋友聚会的时候可能会玩一个游戏：逢7过
    //	游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过：过
    //	需求：使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
    //举例：
    //	1 2 3 4 5 6 过 8 9 10 11 12 13 过 15 16 过 18 ...
    public static void question20(){
        for (int i = 1; i <= 100; i++) {
            //判断每一个数字，如果符合规则，就打印过，如果不符合规则就打印真实的数字
            if(i % 10 == 7 || i / 10 % 10 == 7  ||  i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }

    //练习21：平方根
    //需求：
    //	键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。结果只保留整数部分 ，小数部分将被舍去 。
    public static void question21(){
        //分析：
        //平方根   16的平方根4
        //         4的平方根2

        // 10
        // 1 * 1 = 1 < 10
        // 2 * 2 = 4 < 10
        // 3 * 3 = 9 < 10
        // 4 * 4 = 16 > 10
        //推断：10的平方根是在3~4之间。

        // 20
        // 1 * 1 = 1 < 20
        // 2 * 2 = 4 < 20
        // 3 * 3 = 9 < 20
        // 4 * 4 = 16 < 20
        // 5 * 5 = 25 > 20
        //推断：20的平方根是在4~5之间。

        //在代码当中
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        //如果小于的，那么继续往后判断
        //如果相等，那么当前数字就是平方根
        //如果大于的，那么前一个数字就是平方跟的整数部分

        //1.键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        //2.从1开始循环判断
        //开始：1 结束: number
        for (int i = 1; i <= number; i++) {
            //用i * i 再跟number进行比较
            if(i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                //一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行效率。
                break;
            }else if(i * i > number){
                System.out.println((i - 1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }
    }

    //练习22：判断是否为质数
    //需求：
    //	键盘录入一个正整数 x ，判断该整数是否为一个质数。
    public static void question22(){
        //质数：
        //如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数
        //7 = 1 * 7 质数
        //8 = 1 * 8  2 * 4 合数

        //分析：
        //1.键盘录入一个正整数
        //number
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();//9

        //定义一个变量，表示标记
        //标记着number是否为一个质数
        //true： 是一个质数
        //false : 不是一个质数

        //表示最初就认为number是一个质数
        boolean flag = true;

        //2.判断
        //写一个循环，从2开始判断，一直判断到number-1为止
        //看这个范围之内，有没有数字可以被number整除
        for (int i = 2; i < number; i++) {
            //i 依次表示这个范围之内的每一个数字
            //看number是否能被i整除就可以了
            if(number % i == 0){// 9 % 2 = 1
                flag = false;
                //System.out.println(number + "不是一个质数");
                break;
            }/*else{
                System.out.println(number + "是一个质数");
            }*/
        }

        //只有当这个循环结束了，表示这个范围之内所有的数字都判断完毕了
        //此时才能断定number是一个质数
        if(flag){
            System.out.println(number + "是一个质数");
        }else{
            System.out.println(number + "不是一个质数");
        }
    }

    //练习23：猜数字小游戏
    //需求：
    //	程序自动生成一个1-100之间的随机数，在代码中使用键盘录入去猜出这个数字是多少？
    //要求：
    //	使用循环猜，一直猜中为止。
    //思路分析：
    //1. 生成一个1-100之间的随机数
    //2. 使用键盘录入去猜出这个数字是多少
    //3. 把反复猜的代码写在循环中
    public static void question23(){
        //1.生成一个1-100之间的随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;// 0 ~ 99 + 1 --- 1 ~ 100
        System.out.println(number);

        //2.使用键盘录入去猜出这个数字是多少？
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数");
            int guessNumber = sc.nextInt();
            //3.比较
            if(guessNumber > number){
                System.out.println("您猜的数字大了");
            }else if(guessNumber < number){
                System.out.println("您猜的数字小了");
            }else{
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}
