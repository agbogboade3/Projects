import java.io.File;
public class DirectoryCrawler{
  public static void printFiles(File someFile, int numSpaces){
    //print file name
    for(int i = 0;i < numSpaces;i++){
    System.out.print("  ");
    } 
    System.out.println(someFile.getName());//Our base case, in which case, it just gets the file name
    //check whether file is in directory
    if(someFile.isDirectory()){ //Our recursive case
      //if directory, get files in the directory 
      File[] children = someFile.listFiles();
      //repeat for each file in the directory
      for(int i = 0; i<children.length; i++){
        printFiles(children[i], numSpaces + 1);//Our recursive step. Think incrementing or decrementing.
      }
   } 
  }
  public static void main(String[]args){
    
    File start = new File("C:/Users/Arinade/Documents/Java_2018/Data Structures");
    printFiles(start,0);
  }
}