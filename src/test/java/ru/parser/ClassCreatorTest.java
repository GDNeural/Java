package ru.parser;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.IOException;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ClassCreatorTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void nullFileExceptionCheck() throws Exception {
        exception.expect(IOException.class);
        exception.expectMessage("No such file or directory");
        ClassCreator.classCreate("src\\test\\resources\\none.json");
    }

    @Test
    public void noClientTypeFieldCheck() throws Exception {
        exception.expect(NoSuchElementException.class);
        exception.expectMessage("No \"clientType\" key found in ");
        ClassCreator.classCreate("src\\test\\resources\\invalid.json");
    }

    @Test
    public void classCreateTest() throws Exception {
        Holding expected = holding();
        Holding actual = (Holding) ClassCreator.classCreate("src\\main\\resources\\json\\third.json");
        assertEquals(actual, expected);
    }

    private Holding holding() throws Exception {
        return new Holding(ClientInformation.getClientInformation(ClassCreator.getReaderForFile("src\\test\\resources\\test.json")));
    }
}