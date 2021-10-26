package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidateBracketsTest {

    @Test public void testValidater(){
        ValidateBrackets validateBrackets=new ValidateBrackets();
        boolean test =validateBrackets.validateBrackets("()[[Extra Characters]]");
        boolean test1 =validateBrackets.validateBrackets("{}{Code[}[Fellows](())");

        assertFalse(test1);
        assertTrue(test);
    }
    @Test public void testValidaterEmpty(){
        ValidateBrackets validateBrackets=new ValidateBrackets();
        boolean test =validateBrackets.validateBrackets("");

        assertTrue(test);
    }
    @Test public void testValidaterOneBraket(){
        ValidateBrackets validateBrackets=new ValidateBrackets();
        boolean test =validateBrackets.validateBrackets("{");
        boolean test1 =validateBrackets.validateBrackets("[");
        boolean test2 =validateBrackets.validateBrackets("[}");
        boolean test3 =validateBrackets.validateBrackets("[]");

        assertFalse(test);
        assertFalse(test1);
        assertFalse(test2);
        assertTrue(test3);
    }
}
