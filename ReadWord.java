
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWord {
    private Word start;
    private BufferedReader bufferedReader;
    public ReadWord() throws IOException,FileNotFoundException
    {   
    }
    public Word create(String wordName)
    {
        Word word=new Word();
        word.setWordName(wordName);
        word.setWordCount(1);
        word.setNextNode(null);
        
        return word;

    }

    public Word addWordToList(String file) throws IOException,FileNotFoundException
    {   
        start=null;
        String fileName=new String("./data/daffodils.txt"+file);
        bufferedReader=new BufferedReader(new FileReader(fileName));
        Word temp=new Word();
        temp.setFileName(fileName);
        while(true)
        {
            Word word=new Word();
            
            int count=0;
            String line=bufferedReader.readLine();
            
            String newLine1=" ",newLine2=" ";
            if(line!=null)
            {
                newLine1=line.replaceAll("[^A-Za-z0-9 -]", "");
                newLine2=newLine1.replace("-"," ");
                String[] field=newLine2.split(" ");
               
                
                for(int i=0;i<field.length;i++)
                {
                    word=create(field[i].toUpperCase());
                     if(field[i].equals(""))
                        continue;

                    if(start==null)
                        start=word;
                    else
                    {
                        temp=start;
                        int flag=0;
                        while(temp.getNextNode()!=null)
                        {
                            count=temp.getWordCount();
                            if(temp.getWordName().equals(word.getWordName()))
                            {
                                temp.setWordCount(count+1);
                                flag=1;  
                                break;      
                            }
                            temp=temp.getNextNode();    
                        }
                        if(temp.getWordName().equals(word.getWordName()))
                            {
                                temp.setWordCount(count+1);//for the word followed by a word which is already occurred in list
                                flag=1;        
                            }

                                 if(flag==0) 
                                  temp.setNextNode(word);      
                     }    
                                  
                 }
             
            }

            else
            {
                break;
            }
            
        }
        return start;
    }

   




}
