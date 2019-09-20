package tuto;

import org.junit.Test;
import tuto.SimpleClass;

import static org.junit.Assert.*;

public class SimpleClassTest {

    @Test
    public void addition() {
        SimpleClass sc = new SimpleClass();
        assertEquals(4, sc.addition(2, 2));
    }
}
