package crawls;

import storage.FileWriteRead;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataAnime {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://animehay.club/");
            List<String> list= new ArrayList<>();
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name-movie\">(.*?)</div>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
                list.add(m.group(1));
            }
            new FileWriteRead().writeFile(list,"src/crawls/anime.dat");
// close scanner
            scanner.close();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
