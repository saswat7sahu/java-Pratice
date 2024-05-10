public class Printstar {

    public static void main(String[] args) {
        func2(4,0);
    }
    static void func2(int i,int j){
        if (i==0) {
            return ;
        }
        if (i<j) {
            func(i, j-1);
            System.out.print("* ");
        }
        else{
            func(i+1, 4);
            System.out.println();
        }
    }
    static void func(int i,int j){
        if (i==4) {
            return ;
        }
        if (i<j) {
            System.out.print("* ");
            func(i, j-1);
        }
        else{
            System.out.println();
            func(i+1, 4);
        }
    }
}
