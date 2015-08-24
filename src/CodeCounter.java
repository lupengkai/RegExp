import java.io.*;

/**
 * Created by tage on 15-8-12.
 */
public class CodeCounter {
    private static long normalLines = 0;
    private static long commentLines = 0;
    private static long whiteLines = 0;
    private static boolean comment = false;


    public static void main(String[] args) {
        File f = new File("/home/tage/Codes/TankWar");
        File[] codeFiles = f.listFiles();
        for (File child : codeFiles) {
            if(child.getName().matches(".*\\.java$")) {
                parse(child);

            }
        }

        System.out.println("normalLines :" + normalLines);
        System.out.println("commentLines :" + commentLines);
        System.out.println("whiteLines :" + whiteLines);

    }

    private static void parse(File f) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        try {
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("/*") && line.endsWith("*/")) {
                    commentLines ++;
                }
                else if (line.startsWith("/*") && !line.endsWith("*/")) {
                    commentLines ++;
                    comment = true;
                }
                else if (comment == true) {
                    commentLines ++;
                    if (line.endsWith("*/")) {
                        comment = false;
                    }
                }
                else if (line.matches("^[\\s&&[^\\n]]*$")) {
                    whiteLines ++;
                }
                else
                    normalLines ++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
