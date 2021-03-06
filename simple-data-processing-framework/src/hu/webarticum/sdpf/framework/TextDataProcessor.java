package hu.webarticum.sdpf.framework;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * Interface for character based data processors
 */
public interface TextDataProcessor extends DataProcessor {

    /**
     * Processes data coming from a Reader
     * 
     * @param inputReader   the reader of input data
     * @param outputWriter  a writer for output
     * @throws IOException
     */
    public void process(Reader inputReader, Writer outputWriter) throws IOException;
    
}
