
/**
 * Write a description of class exercise2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exercise2
{
    public static void main(String args[]){
    int[][] intArray=new int[][]{
    {0,1,2,3},
    {4,5,6,7},
    {8,9,0,1}
    };
    printArray(intArray);
    
}
public static void printArray(int[][] arrayInt){
for(int i=0;i<arrayInt.length;i++){
    for(int j=0;j<arrayInt[0].length;j++){
        if(j==3){
        System.out.println(arrayInt[i][j]+" ");
    }else{
    System.out.print(arrayInt[i][j]+" ");
    }
    }
    
    
}
}
}