import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
<<<<<<< HEAD
        tigerLexer lex = new tigerLexer(new ANTLRFileStream("C:\\Users\\Etienne DEGEORGE\\Documents\\cours\\2A\\CPL\\Git\\grammaire\\output\\__Test___input.txt", "UTF8"));
=======
        tigerLexer lex = new tigerLexer(new ANTLRFileStream("/Users/jean-baptistedominguez/PCL/grammaire/output/__Test___input.txt", "UTF8"));
>>>>>>> 2db0b05a71a7ac5ea9086138d9027dc896cda632
        CommonTokenStream tokens = new CommonTokenStream(lex);

        tigerParser g = new tigerParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}