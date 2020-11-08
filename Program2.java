public class Program2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter integer value");
        int a = in.nextInt();
        System.out.println("value entered is "+a );

        System.out.println("Enter float value");
        float b = in.nextFloat();
        System.out.println("value entered is "+b );

        System.out.println("Enter short value");
        short c = in.nextShort();
        System.out.println("value entered is "+c );

        System.out.println("Enter double value");
        double d = in.nextDouble();
        System.out.println("value entered is "+d );

        System.out.println("Enter long value");
        long e = in.nextLong();
        System.out.println("value entered is "+e );

        System.out.println("Enter string value");
        String f = in.nextLine()+in.nextLine();
        System.out.println("value entered is "+f);

        System.out.println("Enter character value");
        char g = in.nextLine().charAt(0);
        System.out.println("value entered is "+g);


    }
}

