import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PogCCustomErrorListener extends BaseErrorListener {

    Parser p;
    public PogCCustomErrorListener(Parser p) {
        this.p = p;
    }

    private String generateCustomErrorMessage(String msg, int line, int pos, String offendingSymbol, String expected) {
        String tmp;
        //System.out.println(expected);
        if(msg.contains("mismatched input")) {
            tmp = "<line: " + line + "|pos: " + pos + "> Syntax Error at '";
            tmp += offendingSymbol + "' "  + "Expecting symbol: " + expected;

        } else if (msg.contains("extraneous input")) {
            tmp = "<line: " + line + "|pos: " + pos + "> Syntax Error at '";
            tmp += offendingSymbol + "' "  + "Expecting symbol: " + expected;
        } else if (msg.contains("no viable alternative at")) {
            tmp = "<line: " + line + "|pos: " + pos + "> Syntax Error at '" + "' "  + "Expecting symbol: " ;
        }
        else if(msg.contains("missing")){
            tmp = "<line: " + line + "|pos: " + pos + "> Syntax Error at '" + offendingSymbol + "' "  + "Expecting symbol: " + expected;
        }else
            tmp = "<line: " + line + "|pos: " + pos + "> Syntax Error at '";
            tmp += offendingSymbol + "' ";


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

        String str_expecting_tokens = msg.split("expecting ")[1].split("}")[0];
        str_expecting_tokens = str_expecting_tokens.replace("{", "");
        String tmp = generateCustomErrorMessage(msg, line, charPositionInLine, this.p.getCurrentToken().getText(), str_expecting_tokens);

        System.err.println(tmp);

    }
}
