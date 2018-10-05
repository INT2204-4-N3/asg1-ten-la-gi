package dictionary;

public class Main {
    public static void main(String[] abc){
        DictionaryManagement test = new DictionaryManagement();
        DictionaryCommandline demoWord = new DictionaryCommandline();
        //test.insertFromCommandline();
        //demoWord.dictionaryBasic();
        //demoWord.insertFromFile();
        demoWord.dictionaryAdvanced();
    }
}
