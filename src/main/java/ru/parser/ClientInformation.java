package ru.parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class ClientInformation {

    public static Map<String, String> getClientInformation(BufferedReader reader) throws IOException {
        //Iter through strings
        Map<String, String> clientInformation = new HashMap<String, String>();
        String nextString = reader.readLine();
        while (nextString != null) {
            String[] partOfString = nextString.split(":");
            //Add splited element to Map
            if (partOfString.length == 2) {
                partOfString[0] = partOfString[0].replaceAll("\"", "");
                partOfString[0] = partOfString[0].trim();
                partOfString[1] = partOfString[1].trim();
                partOfString[1] = partOfString[1].replaceAll("\",", "");
                clientInformation.put(partOfString[0], partOfString[1]);
            }
            nextString = reader.readLine();
        }
        return clientInformation;
    }

    public static String getClientClass(Map<String, String> clientInformation) throws Exception {
        try {
            String clientClass = clientInformation.get("clientType");
            clientClass = clientClass.substring(1, clientClass.length() - 1);
            return clientClass;
        } catch (Exception e) {
            throw new NoSuchElementException("No \"clientType\" key found in " + clientInformation);
        }
    }
}
