package dictionary;

import java.io.*;


public class DictionaryCommandline {
    public DictionaryManagement listWord = new DictionaryManagement();

    public void showAllWords(){

        System.out.println("No  |English        |Vietnam ");
        //for(int i=0; i<listWord.numberWord; i++){
        //int i=1;
        System.out.println(  " |" + listWord.arrayWord.word.get(0).word_target + "        |" + listWord.arrayWord.word.get(0).word_explain);
        //}
    }

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
            while ((currentLine = bufferedReader.readLine()) != null ) {
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
    public void dictionaryAdvanced(){
        listWord.insertFromCommandline();
        showAllWords();
        listWord.dictionaryLookup();
    }
    /*public void dictionarySearcher(){
        Connection con = null;
        PreparedStatement preStmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loopTest", "root", "root");
            preStmt = con.prepareStatement("delete from userlogin where userN = ?");
            preStmt.setString(1, "loopUse3");
            preStmt.execute();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
        if (null != preStmt) {
            preStmt.close();
        }
        if (null != con) {
            con.close();
        }

        }
    }*/
    public String dictionarySearcher(String s){
        String abc = new String();
//        System.out.println("nhap tu can tim: ");
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();

        String filePath = "/Users/truongnguyen/Documents/dictionarydemo/src/dictionaries.txt";
        Reader reader;
        BufferedReader bufferedReader = null;
        //System.out.println("No  |English        |Vietnam ");
        try {
            //Opening the file
            reader = new FileReader(filePath);
            bufferedReader = new BufferedReader(reader);

            //Reading the file
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                if(currentLine.startsWith(s)) {
                    System.out.println(currentLine);
                    abc = currentLine;
                }
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
        return abc;
    }

}
