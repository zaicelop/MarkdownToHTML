package Test;

import MarkdownToHTML.MDParser;
import org.junit.Assert;
import org.junit.Test;

public class MDParserTest extends MDParser {

    @Test
    public void parseFirstTest() {

        String[] expected = new String[] {
                "####", "Hello", "######Nothing", "here", "text", "text", "text",
                "text", "text", "text", "text", "text", "text", "text", "***hello***"
        };

        String[] actual = parse("src/Test/MarkdownTestFiles/ParseTest1.md");

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void parseSecondTest() {

        String[] expected = new String[] {
                "###################", "Test", "TEST", "![Test]", "(Test/TEST/TESt/TESTimage.test)",
                "![Test](Test/TEST/TESt/TESTimage.test)", "[Test]", "**_asdj_**", "test", "test",
                "TEST", "TEST", "TEST", "TEST", "TEST"
        };

        String[] actual = parse("src/Test/MarkdownTestFiles/ParseTest2.md");

        Assert.assertArrayEquals(expected, actual);
    }

}