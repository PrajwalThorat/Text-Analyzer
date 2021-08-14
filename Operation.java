import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class Operation {

ReadWord word;
Word start;
String file;
public Operation(Word start) throws IOException, FileNotFoundException{
    word=new ReadWord();
    this.start=start;
}
public void sort()
    {  
        
        Word curr=start;
        if(start==null)
        {
            return;
        }
        else{
            while(curr!=null)
            {
                Word temp=curr.getNextNode();
                while(temp!=null)
                {
                    int compare=curr.getWordName().compareTo(temp.getWordName());
                    if(compare>0)
                    {
                    String str=curr.getWordName();
                    int count=curr.getWordCount();
                    curr.setWordName(temp.getWordName());
                    temp.setWordName(str);
                    curr.setWordCount(temp.getWordCount());
                    temp.setWordCount(count);
                    }
                    temp=temp.getNextNode();
                }
                curr=curr.getNextNode();
            }
        }
        
    }


    public String mostFrequentword()
    {
        
        Word temp=start;
        int mostFrequentWordCount=temp.getWordCount();
        String mostFrequentword=" ";
        while(temp!=null)
        {
            if(temp.getWordName().length()<=15)
            {
            if(temp.getWordCount()>mostFrequentWordCount)
            {
            mostFrequentWordCount=temp.getWordCount();
            mostFrequentword=temp.getWordName();
            }
            temp=temp.getNextNode();
            }
        }
        return mostFrequentword;

    }

    public FileTime DateTimestamp(String file)throws IOException
        {
        this.file=file;
        String fileName=new String("./data/"+file);
        File myfile = new File(fileName);
        Path path = myfile.toPath();

        BasicFileAttributes attributes = Files.readAttributes(path,
                BasicFileAttributes.class);

        FileTime format=attributes.lastAccessTime(); 
        return format; 
    }

    public int longWords()
    {
        
        Word temp=start;
        int count=0;
        while(temp!=null)
        {
            if(temp.getWordName().length()>15)
              count++;
              temp=temp.getNextNode();

        }
        return count;
    }

    public int countWords()
    {
        
      Word temp=start;
      int countWords=0;
      while(temp!=null)
      {
          countWords++;
          temp=temp.getNextNode();
      }
      return countWords;
    }

    public int countCharacters()
    {
        
        Word temp=start;
        int countCharacters=0;
        while(temp!=null)
        {  
          countCharacters=countCharacters+temp.getWordName().length();
          temp=temp.getNextNode();
        }
        return countCharacters;

    }
   
    
}

