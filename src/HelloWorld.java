package test;

public class HelloWorld{
 public static void test(){
  System.out.println("Hello World!");
  System.out.println(maxDigit(23765));
 }
 public static int maxDigit(int n){
  int c=0,d;
  while(n>0){
   d=n%10;
   if(d>c){
    c=d;
   }
   n/=10;
  }
  return c;
 }
 static void pascal(int n) {
  int pas[];
  pas = new int[n];
  pas[0] = 1;
  System.out.println(pas[0]);
  for (int i = 2; i <= n; i++) {
   /* 由存储在pas中的原来内容生成新内容*/
   pas[i - 1] =1;
   for (int j = i- 2;j > 0; j--)
    pas[j] = pas[j] + pas[j - 1 ];
   for (int j = 0; j < i; j++)
    System.out.print(pas[j] +"  ");
   System.out.println();
  }
 }


 public static void test(int s){
  System.out.println(s+1);
 }
 public static void test(String s){
  System.out.println(s+"11");
 }
 public static void main(String[] args) {
  HelloWorld.test();
  pascal(4);
 }

}

