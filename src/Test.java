import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by tage on 15-8-6.
 */
public class Test {
    public static void main(String[] args) {
/*
        System.out.println("abc".matches("..."));
        p("d3456d".replaceAll("\\d","-"));
        Pattern p = Pattern.compile("[a-z]{3}");
        Matcher m = p.matcher("fgh");
        p(m.matches());
        p("adf".matches("[a-z]{3}"));
*/
        // . * + ?

/*
        p("aaaa".matches("a?"));
        p("aaa".matches("a*"));
        p("".matches("a?"));
        p("".matches("a*"));
        p("".matches("a+"));
        p("aa".matches("a+"));
        p("5642498".matches("\\d{3,100}"));
        p("192.168.1.1".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
        p("192".matches("[0-2][1-9][0-2]"));

*/

/*
        p("a".matches("[anc]"));
        p("a".matches("[^a]"));
        p("A".matches("[a-zA-z]"));
        p("A".matches("[a-z]|[A-Z]"));
        p("A".matches("[[a-z]A-Z]"));
        p("t".matches("[[a-z]&&[fgt]]"));
*/
/*
        p(" \t\r\f".matches("\\s{4}"));
        p("58y_".matches("\\w{4}"));
        p(" ".matches("\\s"));
        p("cba888&^%".matches("[a-z]{1,3}\\d+[^&%]+"));//注意[]里的顺序
        p("\\".matches("\\\\"));
*/

        //Boundary
        //^ $ \b

/*
        p("Hello World".matches("^H.*"));
        p("Hello World".matches(".*ld$"));
        p("Hello World".matches("^H[a-z]{1,3}o\\b.*ld$"));
        p("HelloWorld".matches("^H[a-z]{1,3}o\\b.*ld$"));
        p("Hello World".matches(".*ld$"));
        p("Hello World".matches(".*ld$"));
        //空白行
        p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));

*/

/*
        Pattern p = Pattern.compile("\\d{3,5}");
        String s = "123-5620-235-00";
        Matcher m = p.matcher(s);

        p(m.matches());
        p(m.reset());
        p(m.find());
        p(m.start() + "-" + m.end());
        p(m.find());
        p(m.start() + "-" + m.end());

        p(m.find());
        p(m.start() + "-" + m.end());

        p(m.find());

        p(m.lookingAt());
*/

/*
        Pattern p = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("java Java jaVa java JAVA ilovejava fsdfffa");

        int i = 0;
        StringBuffer buf = new StringBuffer();

        while (m.find()) {
            i++;
            if (i%2 == 0) {
                m.appendReplacement(buf,"java");
            }
            else
                m.appendReplacement(buf,"JAVA");
        }

        m.appendTail(buf);

        p(buf);
*/
/*
        Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
        String s = "123aa-34345bb-234cc-00";
        Matcher m = p.matcher(s);
        while (m.find()) {
            p(m.group(1));
            p(m.group(2));
        }
*/


/*
        //Greedy Reluctant?
        Pattern p = Pattern.compile(".{3,10}?[0-9]");
        String s = "aaaaa3bbb8";
        Matcher m = p.matcher(s);
        if (m.find()) {
            p(m.start() + "-" + m.end());
        }
        else
            p("Not Found");
*/

/*
        // non-capturing
        Pattern p = Pattern.compile(".{3}(?=a)");//444
        String s = "444a66b";
        Matcher m = p.matcher(s);
        while (m.find()) {
            p(m.group());
        }
*/

/*
        //back reference
        Pattern p = Pattern.compile("(\\d(\\d))\\2");
        String s = "122";
        Matcher m = p.matcher(s);
        p(m.matches());
*/
        //flag 简写
        //Pattern p = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
        p("JAVA".matches("(?i)JAVA"));


    }

    public static void p(Object o) {
        System.out.println(o);
    }

}


