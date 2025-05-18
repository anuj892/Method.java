public class Main {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*2;
        }
        return z;
    }
    public static void main(String[] args) {
        //c=logic(a,b);
        int a=5;
        int b=4;
        int c;
        c=logic(a,b);
        System.out.println(c);
      //  c1=logic(a,b);
        int a1=3;
        int b1=5;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);
    }
}
