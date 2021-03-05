import java.util.Scanner;
public class loop{
    public static String test_switch(String a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int day = scanner.nextInt();
        switch(day) {
            case 1:System.out.println("今天是星期一");break;
            case 2:System.out.println("今天是星期二");break;
            case 7:System.out.println("今天是星期日");break;
            default: System.out.println("抱歉，请重新输入");
        }
        return a;
    }
    public static void test_for(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
    public static void test_while(){
        int a=1;
        int b=2;//初始化部分
        while(a<b){//a<b为循环条件
            a=a+2; //循环体
        }
        System.out.println(a+b);

    }
    public static  void main(String[] args){
        int a=3,b=5;
        if (a > b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
        loop.test_switch("111");
        loop.test_for();
        loop.test_while();
        loop.test_do();
    }
    public static void test_do(){
        int a=1;
        int b=4;//初始化部分
        do{
            a=a+2;
        }
        while(a<b);
        System.out.println(a+b);
    }


}
