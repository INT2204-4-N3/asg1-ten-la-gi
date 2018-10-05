package dictionary;
import org.junit.Test;

import java.util.Scanner;


public class DictionaryManagement {
    public Dictionary arrayWord = new Dictionary();
    public int numberWord ;
@Test
    public void insertFromCommandline(){

        Scanner wordtarget = new Scanner(System.in);
        Scanner wordearget = new Scanner(System.in);
        Scanner numberword = new Scanner(System.in);

        String wordTarget ;
        String wordExplain ;
                ;
        System.out.println("So tu moi: ");
        numberWord = numberword.nextInt();
        for(int i=0; i<numberWord; i++) {

            System.out.println("Nhap tu moi: ");

            wordTarget = wordtarget.nextLine();

            System.out.println("Nghia : ");
            wordExplain = wordearget.nextLine();

            Word addWord = new Word(wordTarget, wordExplain);
            arrayWord.word.add(addWord);

        }

    }
    @Test
    public void dictionaryLookup(){
        Scanner searchWord = new Scanner(System.in);
        String searchword;
        System.out.println("Nhap tu: ");
        searchword = searchWord.nextLine();
    }
    public void removeWord(){
        int n = keys.lastIndexOf(word);
        if (n>=0 && n<=keys.size()-1){
            keys.remove(n);
        }

        this.update();
    }


}
