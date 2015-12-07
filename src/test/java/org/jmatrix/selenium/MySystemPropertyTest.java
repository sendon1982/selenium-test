package org.jmatrix.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;


@RunWith(PowerMockRunner.class)
@PrepareForTest({MySystemProperty.class})
public class MySystemPropertyTest {
    @Test
    public void test_SystemClass() throws Exception {
        PowerMockito.mockStatic(System.class);

        PowerMockito.when(System.getProperty("property")).thenReturn("my property");
        Assert.assertEquals("my property", new MySystemProperty().getSystemProperty());
    }
}
