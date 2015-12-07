package org.jmatrix.selenium;

import java.io.IOException;

public class MySystemProperty {
    public String getSystemProperty() throws IOException {
        return System.getProperty("property");
    }
}

