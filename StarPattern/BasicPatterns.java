public class BasicPatterns {
    public static void main(String[] args) {
        
 int n=5;

        //  * 
        //  * * 
        //  * * * 
        //  * * * * 
        //  * * * * * 

        // for(int i=0;i<n;i++){
        //   for(int j=0;j<=i;j++){
        //     System.out.print("* ");
        //   }
        //   System.out.println();
        // }


         System.out.println("Next pattern");


                    
// *         
// * *
// *   *
// *     *
// * * * * *
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
            if(i==5 || j==1 || j==i )
            System.out.print("* ");
            else 
            System.out.print("  ");
          }
          System.out.println();
        }
        
         System.out.println("Next pattern");

// * * * * *
// * *   * *
// *   *   *
// * *   * *
// * * * * *

        for(int i=1;i<=n;i++){
          for(int j=1;j<=n;j++){
            if(i==5 || j==1 || j==i ||i==1 || j==5 ||i+j==6 )
            System.out.print("* ");
            else 
            System.out.print("  ");
          }
          System.out.println();
        }
        
        System.out.println("Next pattern");


//     *
//    * *
//   * * *
//  * * * *
// * * * * *
        for(int i=1;i<=n;i++){
          //space 
          for(int j=1;j<=5-i;j++){
            System.out.print(" ");
          } 

          //star print 
          for(int k=1;k<=i;k++){
            System.out.print("* ");
          } 
         System.out.println();
        }
    }
}
