import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;


public class StoreData {
 public static void main(String[] args) throws IOException,FileNotFoundException
    {
        Scanner scanner=new Scanner(System.in);
        ReadWord read=new ReadWord();
        FileSummary summary=new FileSummary();
        Operation operate; 
        System.out.println("Enter the number of files : ");
        int numOfFiles=scanner.nextInt();
        Word start=new Word();

        
        for(int index=0;index<numOfFiles;index++)
        {
        System.out.println("Enter the file name");
        String fileName=scanner.next();
        start=read.addWordToList(fileName);
        operate=new Operation(start);
        operate.sort();
        FileTime lastaccessTime=operate.DateTimestamp(fileName);
        int numWords=operate.countWords();
        int numCharacters=operate.countCharacters();
        String mostFrequent=operate.mostFrequentword();
        int longwords=operate.longWords();
        summary.setSummary(numOfFiles,start,fileName,numWords,numCharacters,mostFrequent,longwords,lastaccessTime);
        }

        summary.showLinkedFiles();
    

        
                  
           
   
   
    }

    
}

