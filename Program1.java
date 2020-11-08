ublic class Program1 {
    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of a :");
        a = in.nextInt();
        System.out.print("Enter value of b : ");
        b = in.nextInt();

        System.out.println("Before Swapping");
        System.out.println("a = " + a + "   b = " + b);
        Program1 p1=new Program1();
        p1.swapwiththirdvar(a,b);
        p1.swapwithoutthirdvar(a,b);
    }
        void swapwiththirdvar(int a,int b){
        int result = b;
        b = a;
        a = result;

        System.out.println("After swapping");
        System.out.println("a = " + a + "   b = " + b);
    }
        void swapwithoutthirdvar(int a,int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping");
        System.out.println("a = " + a + "   b = " + b);

    }


    }

