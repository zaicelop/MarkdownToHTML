package MarkdownToHTML;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class requried reading Markdown files
 */
public class MDParser extends Handler {

    public MDParser() {

    }

    /**
     *
     */
    @Override
    public void handle() {
        System.out.println("Dimite mihi quonam ego sum optimus");
    }

    /**
     *
     * @param filePath path of the Markdown file
     * @return Separated strings
     */
    protected String[] parse(String filePath) {
        List<String> separatedStrings = new ArrayList<String>();
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
            if (temp != "")
                separatedStrings.add(temp);

        }
        catch (FileNotFoundException e) {
            e.getMessage();
        }
        catch (IOException e) {

        }

        return separatedStrings.toArray(new String[separatedStrings.size()]);
    }

    /**
     *
     * @param textCharacter ascii symbol
     * @return True if symbol is separator, else return False
     */
    protected boolean isSeparator(char textCharacter) {
        if (textCharacter == ' ' || textCharacter == '\n' || textCharacter == '\t' || textCharacter == '\r')
            return true;
        return false;
    }

}
