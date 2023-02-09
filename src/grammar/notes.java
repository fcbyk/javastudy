package grammar;

public class notes {

    //标识符
    //程序员自己有权利命名的单词称为是标识符
    //标识符只能由数字、字母（包括中文）、下划线_、美元符号$组成，不能含有其它符号
    //标识符不能以数字开头
    //关键字不能做标识符。
    //标识符是严格区分大小写的。大写A和小写a不一样
    //标识符理论上是没有长度限制的
    public static void identifier(){
        // k是一个变量名
        int k = 100;
    }

    //字面量
    //字面量就是数据，数据就是字面量，字面量可以分为很多种类
    //字面量是数据在程序中的书写格式
    //10 100 123  整型
    //1.34 3.14 2.0 浮点型
    //true false  布尔型
    //'a' '国'  字符型
    //"a" "abc"  "国" "中国" 字符串型
    public static void  literal(){
        //注意字符型和字符串型数据的字面量表示
        System.out.println("国");
        // 不属于字符型，因为使用双引号括起来了，所以它是字符串
        //System.out.println('ab');
        // 编译报错。ab是一个串，不是字符型，不能用单引号

        // 双引号包裹的都是字符串型
//        System.out.println('好');
        System.out.println("好");
        System.out.println("1");
        System.out.println("true");
        System.out.println("3.14");

        System.out.println(1); // 整数型
        System.out.println(3.14); // 浮点型
        System.out.println(true); // 布尔型
        System.out.println(false); // 布尔型

        //long，float，double的字面量需要在数字后面加L、F、D
        System.out.println(12343556546324L);
        System.out.println(342.32F);
        System.out.println(34356346345.23432D);
    }

    //变量与常量
    //变量是内存当中存储数据的最基本的单元，一个存储数据的盒子，盒子大小由数据类型决定
    //盒子中的数据是可变的，所以叫做变量
    public static void var(){
        //字面量内存无法重复利用
        // 以下虽然都是10，但是这3个10占用三块不同的内存空间
        System.out.println(10);
        System.out.println(10);
        System.out.println(10);

        //使用变量之后，内存空间就得到了复用
        // 定义/声明一个变量，起名i
        int i = 10;
        // 以下这3次访问都是访问的同一块内存空间
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);

        //声明 + 赋值
        //变量的三要素：数据类型、变量名、值  （值就是数据，就是字面量）
        int ii = 100;

        //ava中的变量必须先声明，再赋值才能访问（必须手动赋值）（没有值相当于这个空间没有开辟）
        int k;
        //System.out.println(k); //这样是不行的

        //可以在一行上声明多个变量
        // c变量赋值100，a,b变量只声明了没有赋值
        int a, b, c = 100;
        // 可以这样每个都赋值
        int aa = 10, bb = 20, cc = 100;

        //声明和赋值可以分开，也可以写一起
        int iii;
        i = 100; // 先声明再赋值
        int kkk = 200; // 声明的同时赋值

        //在同一个作用域当中，变量名不能重名，但可以重新赋值
        //作用域：出了大括号就不认识了

        //常量需要用final修饰
        // 常量声明（格式：final+数据类型+标识符）
        final int YOUTH_AGE;
        // 常量赋值
        YOUTH_AGE=18;
        // 声明和赋值（初始化）可以合拼在一条语句
        final int AGE=20;
    }

    //运算符
    public static void operator(){
        //算术运算符
        int a = 11;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );

        //关系运算符
        a = 10;
        b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        //逻辑运算符
        //异或：a⊕b = (¬a ∧ b) ∨ (a ∧¬b)
        //&& 短路与，作用和 & 相同，但是有短路效果
        //|| 短路或，作用和 | 相同，但是有短路效果
        boolean aa = true;
        boolean bb = false;
        boolean cc = true;
        System.out.println("a & b = " + (aa&bb));
        System.out.println("a | b = " + (aa|bb) );
        System.out.println("!a = " + !aa);
        System.out.println("a ^ b = " + (aa^bb) );
        System.out.println("a ^ c = " + (aa^cc) );

        //赋值运算符
        c = 10;
        c += 10 ; System.out.println("c += 10 = " + c );
        c -= 10 ; System.out.println("c -= 10 = " + c );
        c *= 10 ; System.out.println("c *= 10 = " + c );
        c /= 20 ; System.out.println("c /= 20 = " + c );
        c %= 3  ; System.out.println("c %= 3  = " + c );
    }

    //8种基本数据类型
    public static void dataType(){
        //1.定义byte类型的变量
        //数据类型 变量名 = 数据值;
        byte a = 10;
        System.out.println(a);

        //2.定义short类型的变量
        short b = 20;
        System.out.println(b);

        //3.定义int类型的变量
        int c = 30;
        System.out.println(c);

        //4.定义long类型的变量
        long d = 123456789123456789L;
        System.out.println(d);

        //5.定义float类型的变量
        float e = 10.1F;
        System.out.println(e);

        //6.定义double类型的变量
        double f = 20.3;
        System.out.println(f);

        //7.定义char类型的变量
        char g = 'a';
        System.out.println(g);

        //8.定义boolean类型的变量
        boolean h = true;
        System.out.println(h);
    }
}
