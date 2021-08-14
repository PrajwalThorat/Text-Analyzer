
public class Word
{
    private Word nextNode;
    private String wordName;
    private int wordCount;
    private String fileName;
    
    public void setFileName(String fileName)
    {
        this.fileName=fileName;
    }
    public String getFileName()
    {
        return fileName;
    }

    public String getWordName() {
        return wordName;
    }
    public void setWordName(String wordName) {
        this.wordName = wordName;
    }
    public int getWordCount() {
        return wordCount;
    }
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
    public Word getNextNode() {
        return nextNode;
    }
    public void setNextNode(Word nextNode) {
        this.nextNode = nextNode;
    }
    

}

