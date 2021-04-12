package MarkdownToHTML;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class MDParser extends Handler {



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
     * @param filePath
     * @return
     * @throws Exception
     */
    private List<String> parse(String filePath) throws Exception {
        List<String> separatedStrings = new ArrayList<String>();
        File file = new File(filePath);
        Scanner textStream = new Scanner(file);

        String temp = "";
        String currentSymbol = textStream.next();
        while (currentSymbol != null) {
            if (isSeparator(Character.valueOf(currentSymbol.charAt(0)))) {
                separatedStrings.add(temp);
                temp = "";
            }
            else {
                temp += currentSymbol;
            }
            currentSymbol = textStream.next();
        }
        separatedStrings.add(temp);

        return separatedStrings;
    }

    /**
     *
     * @param textCharacter
     * @return
     */
    private boolean isSeparator(Character textCharacter) {
        if (Character.getNumericValue(textCharacter.charValue()) >= 0 &&
                Character.getNumericValue(textCharacter.charValue()) <= 32)
            return true;
        return false;
    }

}
