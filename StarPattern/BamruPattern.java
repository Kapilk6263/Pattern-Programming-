public class BamruPattern {
    public static void main(String[] args) {
        int n=5;

      for(int i=n;i>=1;i--){
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
    }
}
