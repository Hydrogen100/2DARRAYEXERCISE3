
/**
 * Write a description of class exercise3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exercise3
{
   public static void main(String args[]){
    int[][] intArray2=new int[10][8];
    for(int i=0;i<10;i++){
        for(int j=0;j<8;j++){
            intArray2[i][j]=(int)(Math.random()*49)+50;
        }
    }
    removeEvens(intArray2);
    exercise2.printArray(intArray2);
    exercise3.findMode(intArray2);
    }
    
    public static void findSmallest(int[][] arrayInt){
        int smallest=arrayInt[0][0];
    for(int i=0;i<arrayInt.length;i++){
        for(int j=0;j<arrayInt[0].length;j++){
            if(arrayInt[i][j]<smallest){
            smallest=arrayInt[i][j];
            }
        }
    }
    System.out.println(smallest);
    }
    
    public static void findAverage(int[][] arrayInt){
    double sum=0;
    for(int i=0;i<arrayInt.length;i++){
        for(int j=0;j<arrayInt[0].length;j++){
            sum+=arrayInt[i][j];
        }
    }
    double average=sum/(arrayInt.length*arrayInt[0].length);
    System.out.println(average);
    }
    
    public static void findMode(int[][] arrayInt){
        int finalCount=0;
        int mode=0;
        for(int smallestInt=50;smallestInt<100;smallestInt++){
            int count=0;
    for(int i=0;i<arrayInt.length;i++){
    for(int j=0;j<arrayInt[0].length;j++){
    if(arrayInt[i][j]==smallestInt){
    count++;
    }
    }
    }
    if(count>finalCount){
    finalCount=count;
    mode=smallestInt;
    }
}
System.out.println(mode);
    }
    
    public static void removeEvens(int[][] arrayInt){
    for(int i=0;i<arrayInt.length;i++){
    for(int j=0;j<arrayInt[0].length;j++){
    if(arrayInt[i][j]%2==0){
    arrayInt[i][j]=11;
    }
    }
    }
    }
}
