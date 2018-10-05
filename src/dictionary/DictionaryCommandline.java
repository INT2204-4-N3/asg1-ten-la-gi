package dictionary;
import org.junit.Test;

import java.io.*;

public class DictionaryCommandline {
    public DictionaryManagement listWord = new DictionaryManagement();
    @Test
    public void showAllWords(){

        System.out.println("No  |English        |Vietnam ");
        for(int i=0; i<listWord.numberWord; i++){
            System.out.println(i+1 + " |" + listWord.arrayWord.word.get(i).word_target + "        |" + listWord.arrayWord.word.get(i).word_explain);
        }
    }
    @Test
    public void dictionaryBasic(){

        listWord.insertFromCommandline();
        showAllWords();
    }
    public void insertFromFile(){
        String filePath = "/Users/truongnguyen/Documents/dictionarydemo/src/dictionaries.txt";
        Reader reader;
        BufferedReader bufferedReader = null;
        System.out.println("No  |English        |Vietnam ");
        try {
            //Opening the file
            reader = new FileReader(filePath);
            bufferedReader = new BufferedReader(reader);

            //Reading the file
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file " + filePath + "is not found !");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Problem occurs when reading file !");
            e.printStackTrace();
        } finally {
            //Closing the file
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Problem occurs when closing file !");
                    e.printStackTrace();
                }
            }
        }
        /*try{

            InputStream is = new FileInputStream("/Users/truongnguyen/Documents/dictionarydemo/src/dictionaries.txt");
            int size = is.available();

            for(int i=0; i< size; i++){
                System.out.print((char)is.read() + "  ");
            }
            is.close();
        }catch(IOException e){
            System.out.print("Exception");
        }
        */
    }
    @Test
    public void dictionaryAdvanced(){
        listWord.insertFromCommandline();
        showAllWords();
        listWord.dictionaryLookup();
    }


}
