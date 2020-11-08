public class Program3 {
    public static void main(String[] args) {
        int z =30,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number between 1 to 10");
        int a = in.nextInt();
        int b = in.nextInt();
        if((a>0 && a<=10) && (b>0 && b<=10)) {
            z = a + b + z;
            System.out.println("total is :" + z);
        }
        else
        {
            System.out.println("You have to enter number between 1 to 10, Please try again!!");
        }


    }
}
