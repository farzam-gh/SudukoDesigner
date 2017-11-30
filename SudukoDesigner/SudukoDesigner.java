import java.util.*;

public class SudukoDesigner {
   public int r;
   public int c;
    int counter=0;
    int number=0;
    int limit=50;
   public int [][] suduko;  
                      
   public SudukoDesigner(int max)
   {
       r=c=max;
       suduko=new int[r][c]; 
   }
   
   public int produceNumber(int max)
    {
      
        if (counter<limit) {
            
        Random rnd = new Random();
        number = rnd.nextInt(r)+1;
        
        }else if (counter>=limit){
         
             number=0;
                       
        }
        System.out.format("number is : %d\t counter is: %d\n",number,counter);
         return number;
             
    }
    public int createSudukoElement(int row,int col)
    {
       
        boolean repeatr=true;
        boolean repeatc=true;
        int n=produceNumber(r);
        while(repeatr || repeatc){
            
            
            System.out.format("n = %d\n",n);
        do {
            repeatr=false;
            for (int j = 0; j <= col; j++) {
                
                if (n==suduko[row][j]) {
                    if (counter<limit){
                       counter++;
                    n=produceNumber(r);
                    repeatr=true;
                    break;
                                    }
                                       }
                                           }
            } while (counter<limit && repeatr);
           
        do {
            repeatc=false;
            for (int i = 0; i <= row; i++) {
                if (n==suduko[i][col]) {
                    if (counter<limit){
                        counter++;
                    n=produceNumber(r);
                    repeatc=repeatr=true;
                    break;
                                    }
                                        }
                                           }
            } while (counter<limit && repeatc);
        }   
        counter=0;
        return n;
    }
    
    public int[][] createSuduko(int row,int col)
    {
        for (int i = 0; i <=row; i++) {
            for (int j = 0; j <=col; j++) {
                suduko[i][j]=createSudukoElement(i,j);
                if (suduko[i][j]==0) {
                    i--;
                    break;
                    
                }
                System.out.format("Element %d,%d= %d\n",i,j,suduko[i][j]);
                                          }
                                      }
        return suduko;
    }
    public void showSuduko(int max)
    {
      for(int i=0;i<=max-1;i++){
          for (int j = 0; j <=max-1; j++) {
              
              System.out.format(" %d\t",suduko[i][j]);
                           
                   }
                System.out.format("\n\n");
    }
      
    }
}
