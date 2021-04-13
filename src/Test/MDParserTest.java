package Test;

import MarkdownToHTML.MDParser;
import org.junit.Assert;
import org.junit.Test;

public class MDParserTest extends MDParser {

    @Test
    public void parseTest() {

        String[] expected = new String[] {
                "####", "Hello", "######Nothing", "here", "text", "text", "text",
                "text", "text", "text", "text", "text", "text", "text", "***hello***"
        };

        String[] actual = parse("./src/Test/MarkdownTestFiles/ParseTest1.md");

        Assert.assertArrayEquals(expected, actual);
    }

}