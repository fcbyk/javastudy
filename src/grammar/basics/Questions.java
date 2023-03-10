package grammar.basics;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.lang.Integer;

public class Questions {

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

    //练习24：求和
    //需求：定义一个数组，存储1,2,3,4,5
    //遍历数组得到每一个元素，求数组里面所有的数据和
    public static void question24(){
        /*定义一个数组，存储1,2,3,4,5
        遍历数组得到每一个元素，求数组里面所有的数据和*/

        //分析：
        //1.定义一个数组，并添加数据1,2,3,4,5
        int[] arr = {1,2,3,4,5};

        //求和变量
        int sum = 0;
        //2.遍历数组得到每一个数据，累加求和
        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素
            sum = sum + arr[i];
        }

        //当循环结束之后，sum的值就是累加之后的结果
        System.out.println(sum);
    }

    //练习25：统计个数
    //需求：定义一个数组，存储1,2,3,4,5,6,7,8,9,10
    //遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字
    public static void question25(){
        //分析：
        //1.定义一个数组 存储1,2,3,4,5,6,7,8,9,10
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //定义一个变量，用来统计次数
        int count = 0;
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i 表示数组里面的每一个索引
            //arr[i] 表示数组里面的每一个元素
            //3.判断当前的元素是否为3的倍数，如果是那么统计变量就需要自增一次。
            if(arr[i] % 3 == 0){
                // System.out.println(arr[i]);
                count++;
            }
        }
        //当循环结束之后，就表示数组里面所有的数字都判断完毕了，直接打印count即可
        System.out.println("数组中能被3整除的数字有" + count + "个");
    }

    //练习26：变化数据
    //需求：
    //定义一个数组，存储1,2,3,4,5,6,7,8,9,10
    //遍历数组得到每一个元素。
    //要求：
    //1，如果是奇数，则将当前数字扩大两倍
    //2，如果是偶数，则将当前数字变成二分之一
    public static void question26(){
        //分析：
        //1.定义一个数组，存1,2,3,4,5,6,7,8,9,10
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组得到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //i 依次表示数组里面的每一个索引
            //arr[i] 依次表示数组里面的每一个元素
            //3.对每一个元素进行判断
            if(arr[i] % 2 == 0){
                //偶数 变成二分之一
                arr[i] = arr[i] / 2;
            }else{
                //奇数 扩大两倍
                arr[i] = arr[i] * 2;
            }
        }

        //遍历数组
        //一个循环尽量只做一件事情。
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //练习27：求最值
    //需求：求数组中的最大值
    public static void question27(){
        //定义数组求最大值：33,5,22,44,55

        //扩展问题：
        //1.根据求最大值的思路，自己改写一下求最小智
        //2.为什么max要记录为arr[0],默认值不能为0吗？
        //不能写0
        //max的初始化值一定要是数组中的值。
        //3.循环中开始条件一定是0吗？
        //循环的开始条件如果为0，那么第一次循环的时候是自己跟自己比了一下，对结果没有任何影响，但是效率偏低
        //为了提高效率，减少一次循环的次数，循环开始条件可以写1.

        //1.定义数组用来存储5个值
        int[] arr = {33,5,22,44,55};
        //2.定义一个变量max用来存储最大值
        //临时认为0索引的数据是最大的
        int max = arr[0];
        //3.循环获取数组中的每一个元素
        //拿着每一个元素跟max进行比较
        for (int i = 1; i < arr.length; i++) {
            //i 索引  arr[i] 元素
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //4.当循环结束之后，max记录的就是数组中的最大值
        System.out.println(max);//55
    }

    //练习28：统计个数
    //需求：生成10个1~100之间的随机数存入数组。
    //1）求出所有数据的和
    //2）求所有数据的平均数
    //3）统计有多少个数据比平均值小
    public static void question28(){
        //分析：
        //1.定义数组
        int[] arr = new int[10];
        //2.把随机数存入到数组当中
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            //每循环一次，就会生成一个新的随机数
            int number = r.nextInt(100) + 1;
            //把生成的随机数添加的数组当中
            //数组名[索引] = 数据;
            arr[i] = number;
        }

        // 1）求出所有数据的和
        //定义求和变量
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //循环得到每一个元素
            //并把元素累加到sum当中
            sum = sum + arr[i];
        }
        System.out.println("数组中所有数据的和为：" + sum);

        //2）求所有数据的平均数
        int avg = sum / arr.length;
        System.out.println("数组中平均数为：" + avg);

        //3）统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }

        //当循环结束之后，就表示我已经找到了所有的比平均数小的数据
        System.out.println("在数组中，一共有" + count + "个数据，比平均数小");

        //遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //练习29：交换数据
    //需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
    //交换前：1,2,3,4,5
    //交换后：5,2,3,4,1
    public static void question29(){
        //1.定义数组存储数据
        int[] arr = {1,2,3,4,5};
        //2.利用循环去交换数据
        for(int i = 0,j = arr.length - 1; i < j; i++,j--){
            //交换变量i和变量j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //当循环结束之后，那么数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //练习30：打乱数据
    //需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
    public static void question30(){
        //1.定义数组存储1~5
        int[] arr = {1, 2, 3, 4, 5};
        //2.循环遍历数组，从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着随机索引指向的元素 跟 i 指向的元素进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //当循环结束之后，那么数组中所有的数据已经打乱顺序了
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //练习31：算法小题1
    // 键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止
    public static void question31(){
        /*
            键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */
        //1.创建一个集合用来添加整数
        ArrayList<Integer> list = new ArrayList<>();
        //2.键盘录入数据添加到集合中
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);//先把异常数据先进行过滤
            if (num < 1 || num > 100){
                System.out.println("当前数字不在1~100的范围当中，请重新输入");
                continue;
            }
            //添加到集合中//细节:
            //num:基本数据类型
            //集合里面的数据是Integer
            //在添加数据的时候触发了自动装箱
            list.add(num);
            //统计集合中所有的数据和
            int sum = getSum(list);
            //对sum进行判断
            if(sum > 200){
                System.out.println("集合中所有的数据和已经满足要求");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //i :索引
            //list.get(i);
            int num = list.get(i);
            sum = sum + num;//+=
        }
        return sum;
    }

    //练习32：算法小题2
    //自己实现parseInt方法的效果，将字符串形式的数据转成整数。
    //要求:字符串中只能是数字不能有其他字符最少一位，最多10位日不能开头
    public static void question32(){
        //1.定义一个字符串
        String str = "123";
        //2.校验字符串
        //习惯:会先把异常数据进行过滤，剩下来就是正常的数据。
        if (!str.matches("[1-9]\\d{0,9}")) {
            //错误的数据
            System.out.println("数据格式有误");
        } else {
            //正确的数据
            System.out.println("数据格式正确");
            //3.定义一个变量表示最终的结果
            int number = 0;
            //4.遍历字符串得到里面的每一个字符
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';//把每一位数字放到number当中
                number = number * 10 + c;
            }
            System.out.println(number);
            System.out.println(number + 1);
        }
    }

    //练习33：算法小题3
    //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
    public static String tobinarystring(int number) {//6
        //核心逻辑:
        //不断的去除以2，得到余数，一直到商为日就结束。
        //还需要把余数倒着拼接起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        //利用循环不断的除以2获取余数
        while (true) {
            if (number == 0) {
                break;
            }
            //获取余数 %
            int remaindar = number % 2;//倒着拼接
            sb.insert(0, remaindar);
            //除以2 /
            number = number / 2;
        }
        return sb.toString();
    }

    //练习34：算法小题4
    //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
    public static void question34() throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK7
        //规则:只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
        //1.计算出生年月日的毫秒值
        String birthday = "2000年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(birthday);
        long birthdayTime = date.getTime();
        //2.获取当前时间的毫秒值
        long todayTime = System.currentTimeMillis();
        //3.计算间隔多少天
        long time = todayTime - birthdayTime;
        System.out.println(time / 1000 / 60 / 60 / 24);

        //JDK8
        LocalDate ld1 = LocalDate.of(2000, 1, 1);
        LocalDate ld2 = LocalDate.now();
        long days = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(days);
    }

    //练习35：算法小题5
    //判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式
    //判断提示:二月有29天是闰年一年有366天是闰年
    public static void question35(){
        //jdk7
        //我们可以把时间设置为2000年3月1日
        Calendar c = Calendar.getInstance();
        c.set(2000, 2, 1);
        //月份的范围:0~11
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        //看当前的时间是28号还是29号?
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        //jdk8
        //月份的范围:1~12
        //设定时间为2000年的3月1日
        LocalDate ld = LocalDate.of(2001, 3, 1);
        //把时间往前减一天
        LocalDate ld2 = ld.minusDays(1);
        //获取这一天是一个月中的几号
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //true:闰年
        //false:平年
        System.out.println(ld.isLeapYear());
    }

}
