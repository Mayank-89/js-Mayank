import java.util.Scanner;
public class Main {
    private final ThreadLocal<Integer> n = ThreadLocal.withInitial(() -> 0);
    public Main(int n){
        this.n.set(n);
    }
    public  void printNos(int number) {
        if(number==0) return;
        printNos(number-1);
        System.out.print(number+" ");

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int input=sc.nextInt();
            Main obj=new Main(input);
            obj.printNos(obj.n.get());
        }else
            System.out.println("Invalid input please enter integer");

        System.out.println("Version 2");
        System.out.println("V3");

    }
}