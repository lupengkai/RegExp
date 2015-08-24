import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by tage on 15-8-12.
 */
public class EmailSpider {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/tage/Documents/EmailTest.txt"));
            String line = "";
            try {
                while ((line=br.readLine()) != null) {
                    parse(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void parse(String line) {
        Pattern p = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w[.-]]+");
        Matcher m = p.matcher(line);
        while (m.find()) {
            System.out.println(m.group());

        }
    }

}
