import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Micha� on 2015-06-15.
 */
public class Main {

    public static void main(String args[]) {
        System.out.println("text");
        //System.out.println(inputStreamTest());
        //System.out.println(bufferedReaderTest());
        //System.out.println(streamTokenizerTest());
        //saveText("Ala ma kota.");
        List<String> aList = new ArrayList<String>(32);
        List<String> lList = new LinkedList<String>();
        aList.add("Kotek");
        lList.add("Piesek");
        System.out.println(aList);
        System.out.println(lList);
    }

    public static String inputStreamTest() {
        System.out.println("Wprowadz dowolny znak z klawiatury: ");
        try {
            char c = (char) System.in.read();
            String str = c + "";
            return str;
        } catch (Exception e) {
            return "error";
        }
    }

    public static String bufferedReaderTest() {
        BufferedReader brIn = new BufferedReader(new InputStreamReader(System.in));
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Wprowadz linie tekstu i nacisnij enter");
        try {
            return brIn.readLine();

        } catch (Exception e) {
            return "-1";
        }
    }

    public static String streamTokenizerTest() {
        StreamTokenizer streamTokenizer = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Wprowadz liczbe");
        try {
            streamTokenizer.nextToken();
            if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER)
                return streamTokenizer.toString();
            else
                return "-1";
        } catch (Exception e) {
            return "-1";
        }
    }

    public static void saveText(String text) {
        try {
            File file = new File("D:/text.txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("error");
        }
    }


}
