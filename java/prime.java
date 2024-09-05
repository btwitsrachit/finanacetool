import java.util.Scanner;

class staticmethod{
    static int a,b;
    public void getData()
    {
            Scanner obj = new Scanner(System.in);
            System.out.println("enter the 2nos.");
            a=obj.nextInt();
            b=obj.nextInt();    
           

    }
    public static int nonPrime()
    {
        int sum=0;
        for(int n=a;n<=b;n++){
            int prime=1;
            for (int i=2;i<=n/2;i++){
                if(n%i==0)
                {
                    prime=0;
                    break;
                }
            }
            if(prime==0){
                System.out.println(n+"");
                sum+=n;
            }
        }


    }
    public static void printSum(int s)
    {
        System.out.println("non prime sum:"+s);


    }
    public static void main(String[] args) {
       staticmethod obj= new staticmethod();
        obj.getData();
        int sum= nonPrime();
        printSum(sum);

    }
}

