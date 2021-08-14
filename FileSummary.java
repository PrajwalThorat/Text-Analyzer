import java.nio.file.attribute.FileTime;

public class FileSummary
{
    int index=0;
    private TextFileAnalyzer start;
    public FileSummary()
    {
       start=null;
    }

    public TextFileAnalyzer setSummary(int num,Word startPointerIndividualFile,String fileName,int totalWords,int totalCharacters,String mostFrequent,int numLongWords,FileTime lastAccesstime)
    {
       TextFileAnalyzer analyzer=new TextFileAnalyzer();
       analyzer.setFileName(fileName);
      analyzer.setDateTimeStamp(lastAccesstime);
      analyzer.setTotalWords(totalWords);
      analyzer.setTotalCharacters(totalCharacters);
      analyzer.setMostFrequentWord(mostFrequent);
      analyzer.setLongWords(numLongWords);
    
      analyzer.setStartPointer(startPointerIndividualFile);
      analyzer.setNext(null);
      

      if(start==null)
        start=analyzer;
        else
        {
            TextFileAnalyzer temp=start;
            while(temp.getNext()!=null)
            {
                temp=temp.getNext();
            }
            temp.setNext(analyzer);
        }
        index++;

        return start;
  
    }

    public void showLinkedFiles()
    {
    TextFileAnalyzer temp=start;
    while(temp!=null)
    {
        System.out.println("FileName : "+temp.getFileName()+"\nDate Time Stamp when the file was last accessed : "+temp.getDateTimeStamp()+"\nTotal Words :  "+temp.getTotalWords()+"\nTotal Characters :  "+temp.getTotalCharacters()+"\nMost Frequent Word : "+temp.getMostFrequentWord()+"\nNumber of long words whose length is greater than 15 : "+temp.getLongWords()+"\nStart Pointer : "+temp.getStartPointer());
        showWordList(temp);
        System.out.println();
        temp=temp.getNext();
    }

    }


    private void showWordList(TextFileAnalyzer temp)
    { 
        Word temp2=temp.getStartPointer();
        System.out.println("The words of file in alphabetical order are : ");
        while(temp2!=null)
        {    
         System.out.println(temp2.getWordName());
          temp2=temp2.getNextNode();
        }
    }


 
    

}
