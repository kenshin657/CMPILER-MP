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

    private void getInput() {
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            System.out.print("Enter test file source: ");
            this.filePath = br.readLine();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }

    private void setInput() throws  Exception{
        this.input = (CharStream) new ANTLRFileStream(this.filePath);
    }

    public void parse() {
        pogCLexer lexer = new pogCLexer(this.input);
        TokenStream ts = new CommonTokenStream(lexer);
        pogCParser parser = new pogCParser(ts);

        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        pogCBaseListener listener = new pogCBaseListener();
        walker.walk(listener, tree);
    }

    public static void main(String[] args) throws Exception{
        Main main = new Main();
        main.getInput();
        main.setInput();
        main.parse();
    }
}
