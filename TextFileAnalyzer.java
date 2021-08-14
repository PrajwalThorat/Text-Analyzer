
import java.nio.file.attribute.FileTime;


public class TextFileAnalyzer
{
    private String fileName;
    private FileTime dateTimeStamp;
    private int totalWords;
    private int totalCharacters;
    private String mostFrequentWord;
    private int longWords;
    private Word startPointer;
    private TextFileAnalyzer next;

    public void setFileName(String fileName)
    {
        this.fileName=fileName;
    }
    public String getFileName()
    {
        return fileName;
    }
    public void setDateTimeStamp(FileTime dateTimeStamp)
    {
        this.dateTimeStamp=dateTimeStamp;
    }
    public FileTime getDateTimeStamp()
    {
        return dateTimeStamp;
    }
    public void setTotalWords(int totalWords)
    {
        this.totalWords=totalWords;
    }
    public int getTotalWords()
    {
        return totalWords;
    }
    public void setTotalCharacters(int totalCharacters)
    {
        this.totalCharacters=totalCharacters;
    }
    public int getTotalCharacters()
    {
        return totalCharacters;
    }
    public void setMostFrequentWord(String mostFrequentWord)
    {
      this.mostFrequentWord=mostFrequentWord;
    }
    public String getMostFrequentWord()
    {
        return mostFrequentWord;
    }
    public void setLongWords(int longWords)
    {
        this.longWords=longWords;
    }
    public int getLongWords()
    {
      return longWords;
    } 
    public void setStartPointer(Word startPointer)
    {
        this.startPointer=startPointer;
    }
    public Word getStartPointer()
    {
        return startPointer;
    }

    public TextFileAnalyzer getNext() {
        return next;
    }
    public void setNext(TextFileAnalyzer next) {
        this.next = next;
    }
}
