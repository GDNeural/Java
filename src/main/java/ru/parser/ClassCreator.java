package ru.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;


public class ClassCreator {
    public static void main(String[] args) throws Exception {
        System.out.println(classCreate("src\\main\\resources\\json\\first.json"));
        System.out.println(classCreate("src\\main\\resources\\json\\second.json"));
        System.out.println(classCreate("src\\main\\resources\\json\\third.json"));
    }

    public static BufferedReader getReaderForFile(String pathToFile) throws Exception {
        if (!Files.exists(Paths.get(pathToFile))) {
            throw new IOException("No such file or directory");
        } else {
            //Opening file, initiate read process
            File clientInfo = new File(pathToFile);
            FileReader fileReader = new FileReader(clientInfo);
            BufferedReader reader = new BufferedReader(fileReader);
            return reader;
        }
    }

    public static Object classCreate(String pathToFile) throws Exception {
        Map<String, String> clientInfo = ClientInformation.getClientInformation(getReaderForFile(pathToFile));
        String clientClass = ClientInformation.getClientClass(clientInfo);
        return ClientType.valueOf(clientClass).createClient(clientInfo);

             /*switch (clientClass) {
                case "INDIVIDUAL":
                    new Individual(clientInfo);
                    break;
                case "HOLDING":
                    new Holding(clientInfo);
                    break;
                case "LEGAL_ENTITY":
                    new LegalEntity(clientInfo);
                default:
                    System.out.println("None of the Class is Entered");
                    break;
            }
*/
    }
}
