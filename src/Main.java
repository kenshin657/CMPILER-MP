import org.antlr.runtime.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.server.ExportException;

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
}
