class ternaryOp
{   int y;
    public void show()
    {
        this.y=20;
        System.out.println("The value of y is: " + y);
    } 
    public static void main(String[] args) {
        int a = 10, b = 20;
        int max=(a>b)?a:b;
        System.out.println("The maximum value is: " + max);
        int c=50;
        int min=(a<c)?((a<b)?a:b):((b<c)?b:c);
        System.out.println("The minimum value is: " + min);
        System.out.println("The value of x is: " + x);
        x=20;
        System.out.println("The updated value of x is: " + x);
        ternaryOp obj = new ternaryOp();
        obj.show();
   
    }
   static int x=10;
}