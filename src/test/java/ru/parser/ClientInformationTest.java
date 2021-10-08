package ru.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ClientInformationTest {
    private String PathToFile;
    private Map<String, String> clientInformation = new HashMap<String, String>();
    private String clientClass;
    String[] Files  = new String[] {"src\\main\\resources\\json\\third.json"};

    @Test
    public void getClientInformation() throws Exception{

    }

    @Test
    public void getClientClass() {
    }
}