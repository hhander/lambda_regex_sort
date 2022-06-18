package lambdaDemo;

public class demo2 {
    public static void main(String[] args) {

        go(()-> System.out.println("跑得很快"));
        }



    public static void go(swim s)
    {
        System.out.println("开始");
        s.swimming();
    }
@FunctionalInterface
    interface swim
    {
        void swimming();
    }
}
