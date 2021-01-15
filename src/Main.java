import javafx.fxml.FXML;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.io.IOException;


public class Main extends Application {

    @FXML
    private TextArea editor;
    @FXML
    private TextArea error_messages;
    @FXML
    private Button btnParse;

    public void parse() {
        CharStream input = null;
        input = CharStreams.fromString(editor.getText());

        error_messages.clear();
        PogCLexer lexer = new PogCLexer(input);
        TokenStream ts = new CommonTokenStream(lexer);
        PogCParser parser = new PogCParser(ts);
        error_messages.clear();
        parser.removeErrorListeners();
        parser.addErrorListener(new PogCCustomErrorListener(parser, this));

        ParseTree tree = parser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        PogCBaseListener listener = new PogCBaseListener();
        walker.walk(listener, tree);
    }
    public void setError_messages(String error){
        error_messages.appendText(error + "\n");
    }

    @Override
    public void start(Stage primaryStage){

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("View.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        primaryStage.setScene(new Scene(root, 900, 600));
        FXMLLoader loader = new FXMLLoader();
        loader.setController(this);
        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);

    }

}
