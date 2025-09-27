class Loops {

    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
            

                if ((i % 2) != 0) {
             
                    a++;//odd  
                     System.out.print(a+" ");       
                }                                                        
                 else 
                {
                    System.out.print(a+" ");
                     a--;//even  
                }
            }
            a = a + 5;   
            System.out.println();
        }
    }

}

/*
 * loops ---------
 */
/*
 * while
 * do while
 * for()
 * for(each)
 */

/*

        1            //5           
      1 2 3           //4     
    1 2 3 4 5         //3
  1 2 3 4 5 6 7      //2
1 2 3 4 5 6 7 8 9    //1
  1 2 3 4 5 6 7
    1 2 3 4 5
     1 2 3
      1 2
       1
       
       
     i=1;i<=5   
     j=1;j<=i

     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5                   


       
       int i=1;i<=5
       int j=1;j<=5
    
     1   2   3   4   5
     10  9   8   7   6
     11  12  13  14  15
     20  19  18  17  16     
     21  22  23  24  25   




     */
