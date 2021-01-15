import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.util.Collections;
import java.util.List;

public class PogCCustomErrorListener extends BaseErrorListener {

    Parser p;
    Main app;
    public PogCCustomErrorListener(Parser p, Main app) {
        this.p = p;
        this.app = app;
    }

    private String generateCustomErrorMessage(String msg, int line, int pos, String offendingSymbol, String expected) {
        String tmp;
        //System.out.println(expected);
        if(msg.contains("mismatched input")) {
            tmp = "line: " + line + "|pos: " + pos + "| Unexpected symbol: '";
            tmp += offendingSymbol + "' "  + "Expected symbol: " + expected;

        } else if (msg.contains("extraneous input")) {
            tmp = "line: " + line + "|pos: " + pos + " Invalid token at '";
            tmp += offendingSymbol;

        } else if (msg.contains("no viable alternative at")) {

            tmp = "line: " + line + "|pos: " + pos + "| Syntax Error at '" + offendingSymbol +"' "  + "Expected token: " + expected;
        }
        else if(msg.contains("missing ")){
            tmp = "line: " + line + "|pos: " + pos + " " + msg;
        }else {
            tmp = "line: " + line + "|pos: " + pos + "| Syntax Error at '";
            tmp += offendingSymbol + "' ";

        }
        return tmp;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
//        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
//        Collections.reverse(stack);
        String expected = "";
        if(e != null){
            expected = this.p.getVocabulary().getLiteralName(e.getExpectedTokens().toList().get(0));
        }
        String tmp = generateCustomErrorMessage(msg, line, charPositionInLine, this.p.getCurrentToken().getText(), expected);
//        System.err.println(tmp);
       // app.setError_messages("line: " + line + ":" + "charPositionInLine" + msg);
        System.err.println(tmp);
     //  System.err.println(msg);

    }
}
