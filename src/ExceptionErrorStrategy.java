import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;

import java.util.ArrayList;
import java.util.List;


public class ExceptionErrorStrategy extends DefaultErrorStrategy {
    public static ExceptionErrorStrategy INSTANCE = new ExceptionErrorStrategy();

    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        throw e;
    }

    @Override
    public void reportInputMismatch(Parser parser, InputMismatchException e) throws RecognitionException {
        Token t = parser.getCurrentToken();
        IntervalSet expecting = parser.getExpectedTokens();
        List<Integer> expecting_tokens = expecting.toList();

//        String msg = "<line: " + t.getLine() + "|position: " + t.getCharPositionInLine() + ">" + " Mismatched input at" + e.getOffendingToken().getText() + " "
//                + parser.getVocabulary().getLiteralName(expecting.get(0));
        //RecognitionException ex = new RecognitionException(msg, recognizer, recognizer.getInputStream(), recognizer.getContext());
        // ex.initCause(e);
        //throw ex;
    }

    @Override
    public void reportMissingToken(Parser parser) {
        beginErrorCondition(parser);

        Token t = parser.getCurrentToken();
        IntervalSet expecting = parser.getExpectedTokens();
        String msg = "<line: " + t.getLine() + "|position: " + t.getCharPositionInLine() + "> at '";
        msg += t.getText() + "' "  + "missing a token. Expecting a " + parser.getVocabulary().getLiteralName(expecting.get(0));
        System.out.println(msg);
    }

    @Override
    public void reportNoViableAlternative(Parser parser,
                                          NoViableAltException e)
            throws RecognitionException
    {
        String msg = "can't choose between alternatives"; // nonstandard msg
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }
}