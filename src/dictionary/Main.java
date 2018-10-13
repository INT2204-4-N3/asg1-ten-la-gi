package dictionary;
import Graphics.DictionaryApplication;
public class Main  {
    public static void main(String[] args){
        DictionaryManagement test = new DictionaryManagement();
        DictionaryCommandline demoWord = new DictionaryCommandline();
//        test.insertFromCommandline();
//        demoWord.dictionaryBasic();

//        demoWord.dictionaryAdvanced();
        //    test.addWord();
        //           demoWord.insertFromFile();
//        test.removeWord();
        //      demoWord.showAllWords();
        //   demoWord.dictionarySearcher();


        // DictionaryApplication testGraphics = new DictionaryApplication();
        DictionaryApplication graphics;
        graphics = new DictionaryApplication();
        //graphics.dictionaryApplication();
        graphics.showTextAreaDemo();

//        Test test = new Test();
//        test.abc();

    }


}
