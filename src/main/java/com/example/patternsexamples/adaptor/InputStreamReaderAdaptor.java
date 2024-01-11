package com.example.patternsexamples.adaptor;

import java.io.InputStreamReader;

public class InputStreamReaderAdaptor implements StringReader{
    private MyInputStream myInputStream;

    public InputStreamReaderAdaptor(MyInputStream myInputStream) {
        this.myInputStream = myInputStream;
    }

    @Override
    public String read() {
        return new String(myInputStream.read());
    }
}
