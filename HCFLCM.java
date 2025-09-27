class HCFLCM{
    public static void main(String[] args) {
        int HCF=0;
        int LCM=0;
        int a=120;
        int b=200;
        int c=Math.max(a, b);
        System.out.println(c);
        for(int i=1;i<=b;i++)
        {
            if(a%i==0&&b%i==0)HCF=i;
        }
        System.out.println("HCF= "+HCF);
        LCM=a*b/HCF;
        System.out.println("LCM= "+LCM);


    }
}