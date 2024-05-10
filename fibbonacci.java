public class fibbonacci {

    public static void main(String[] args) {
        fibbonaci(0,1);
    }
    static void fibbonaci(int a,int b){
        int n=0;
        n=a+b;
        a=b;
        b=n;
        System.out.println(n);
        if(n<100){
            fibbonaci(a,b);
        }

    }
}