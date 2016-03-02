import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        tigerLexer lex = new tigerLexer(new ANTLRFileStream("/Users/jean-baptistedominguez/tiger.g", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        tigerParser g = new tigerParser(tokens, 49100, null);
        try {
            g.Prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}