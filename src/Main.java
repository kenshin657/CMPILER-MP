import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.TreeViewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private String filePath;
    private CharStream input;



    public void parse() {
        CharStream cs = null;
        try {
            cs = CharStreams.fromFileName("src/input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        PogCLexer lexer = new PogCLexer(cs);
        TokenStream ts = new CommonTokenStream(lexer);
        PogCParser parser = new PogCParser(ts);

        parser.removeErrorListeners();
        parser.addErrorListener(new PogCCustomErrorListener(parser));

        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        PogCBaseListener listener = new PogCBaseListener();
        walker.walk(listener, tree);
    }

    public static void main(String[] args) throws Exception{
        Main main = new Main();
//        main.getInput();
//        main.setInput();
        main.parse();
    }
}
