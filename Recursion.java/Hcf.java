public class Hcf {
    public static void main(String[] args) {
      
     int hcf=HCF(10, 5, 1, 0);
          int lcm=50/hcf;
         System.out.print(lcm);

    }
    public static int HCF(int a,int b,int div,int hcf)
    {
        if(div>Math.max(a, b))return hcf;
        if(a%div==0 &&b%div==0){
            hcf=div;
        }
        div++;
        return HCF(a, b, div, hcf);
    }

}
