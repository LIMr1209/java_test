public class expetion {
    public static void main(String[] args){
        String name [] = {"a","b"};
        try {
            //System.exit(1);
            //System.out.println(name[4]);

            //RuntimeException test_ex = new RuntimeException("抛出");
            //throw test_ex;
            expetion.thromesome();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
        }finally {
            System.out.println("完毕");
        }


    }
    public static void thromesome() throws RuntimeException{
        RuntimeException test_ex = new RuntimeException("抛出异常");
        throw test_ex;
    }
}
