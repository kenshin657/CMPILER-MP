import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

public class PogCCustomErrorListener extends BaseErrorListener {

    private String generateCustomErrorMessage(String msg, int line, int charPositionInLine, Object offendingSymbol) {
        String tmp = "";


        if(msg.contains("mismatched input")) {
            tmp = "PogC Syntax Error found at Line[" + line + "] CharacterPosition[" + charPositionInLine + "]: Please review if ";

        } else if (msg.contains("extraneous input")) {

        } else if (msg.contains("no viable alternative at")) {

        }
        else
            tmp = "PogC Syntax Error Caught";
        return tmp;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

        String err = generateCustomErrorMessage(msg, line, charPositionInLine, offendingSymbol);
        System.err.println(err);
    }
}
