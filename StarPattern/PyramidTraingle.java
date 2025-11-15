public class PyramidTraingle {
     public static void main(String[] args) {
      
        
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
     
    int n=5;
    for(int i=1;i<=n;i++){
        //space 
        for(int j=1;j<=5-i;j++ ){
            System.out.print(" ");
        }
        //star 
        for(int k=1;k<=i;k++){
           System.out.print("* ");
        }
        System.out.println();
    }

        System.out.println("Next pattern");

//     *
//    * *
//   *   *
//  *     *
// * * * * * 
    
    for(int i=1;i<=n;i++){

        //space 
        for(int j=1;j<=5-i;j++ ){
            System.out.print(" ");
        }  
                
        //star 
        for(int k=1;k<=i;k++){
            if(i==5||k==1||k==i)
           System.out.print("* ");
           else 
           System.out.print("  ");
        }
        System.out.println();
    } 


    
}
} 