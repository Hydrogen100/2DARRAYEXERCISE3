
/**
 * Write a description of class exercises here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exercises
{
   public static void main(String args[]){
    int[][] intArray=new int[3][4];
    for(int i=0;i<3;i++){
    for(int j=0;j<4;j++){
    intArray[i][j]=(int)(8*Math.random()+1);
    }
    }
    
    for(int i=0;i<3;i++){
    for(int j=0;j<4;j++){
        if(j==3){
        System.out.println(intArray[i][j]+" ");
        }else{
        System.out.print(intArray[i][j]+" ");
        }
    }
    }
    }
    
}
