package MarkdownToHTML;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class requried reading Markdown files
 */
public class MDReader extends Handler {

    public MDReader() {

    }

    /**
     *
     */
    @Override
    public Object handle(Object request) {
        System.out.println("Dimite mihi quonam ego sum optimus");
        return new Object();
    }

    /**
     *
     * @param filePath path of the Markdown file
     * @return Separated strings
     */
    protected String[] parse(String filePath) {
        List<String> separatedStrings = new ArrayList<>();
        File file = new File(filePath);

        try (FileReader textStream = new FileReader(file)){

            String temp = "";
            int currentSymbol;
            while ((currentSymbol = textStream.read()) != -1) {
                if (isSeparator((char)currentSymbol) && !temp.isEmpty()) {
                    separatedStrings.add(temp);
                    temp = "";
                }
                else if (!isSeparator((char)currentSymbol)){
                    temp += (char)currentSymbol;
                }
            }
            if (!temp.equals(""))
                separatedStrings.add(temp);

        }
        catch (IOException e) {
            System.out.println("Exception in MDParser.parse() method");
        }

        return separatedStrings.toArray(new String[separatedStrings.size()]);
    }

    /**
     *
     * @param textCharacter ascii symbol
     * @return True if symbol is separator, else return False
     */
    protected boolean isSeparator(char textCharacter) {
        return textCharacter == ' ' || textCharacter == '\n' || textCharacter == '\t' || textCharacter == '\r';
    }

}
