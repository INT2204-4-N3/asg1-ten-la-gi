package dictionary;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class DictionaryManagement {
    public Dictionary arrayWord = new Dictionary();
    public int numberWord ;

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

    public void dictionaryLookup(){
        Scanner searchWord = new Scanner(System.in);
        String searchword;
        System.out.println("Nhap tu: ");
        searchword = searchWord.nextLine();
    }
    public void addWord(){
        String FILENAME = "/Users/truongnguyen/Documents/dictionarydemo/src/dictionaries.txt";

        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILENAME, true);
            bw = new BufferedWriter(fw);
            String addword;
            Scanner Content = new Scanner(System.in);
            addword = Content.nextLine();

            bw.write(addword);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    /*public void removeWord(){
        String text = "/Users/truongnguyen/Documents/dictionarydemo/src/dictionaries.txt";
        text = text.replace("[Forwarding newSession on session null to remote]", " ");

    }*/


}
