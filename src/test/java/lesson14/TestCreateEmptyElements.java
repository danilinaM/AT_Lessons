package lesson14;

import org.junit.jupiter.api.Test;

import static lesson14.XMLUtils.createEmptyElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCreateEmptyElements {

    @Test
    public void basicPositiveCheck(){
        String tag = "body";
        String expectedResult  = "<body></body>";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }

    @Test
    public void tagWithAngleBrackets(){
        String tag = "<body>";
        String expectedResult  = "<<body>></<body>>";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }

    @Test
    public void tagWithSpaces(){
        String tag = " bo dy ";
        String expectedResult  = "< bo dy ></ bo dy >";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }

    @Test
    public void tagWithOneSymbol(){
        String tag = "b";
        String expectedResult  = "<b></b>";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }

    @Test
    public void onlySpaceInTag(){
        String tag = " ";
        String expectedResult  = "< ></ >";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }

    @Test
    public void nullAsStringInTag(){
        String tag = "null";
        String expectedResult  = "<null></null>";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }

    @Test
    public void emptyTag(){
        String tag = "";
        String expectedResult  = "<invalid/>";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }

    @Test
    public void nullInTag(){
        String tag = null;
        String expectedResult  = "<invalid/>";
        String result = createEmptyElement(tag);
        assertEquals(expectedResult,result,"Результат не совпадает");
    }
}
