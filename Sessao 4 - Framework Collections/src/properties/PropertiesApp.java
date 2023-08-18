package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws IOException {
        Properties sites = new Properties();
        sites.loadFromXML(new FileInputStream("C:\\Users\\Pichau\\Desktop\\AmbienteDev\\Programação\\UDEMY\\Java-Lambdas-Streams-InterfacesGraficas\\Sessao 4 - Framework Collections\\src\\properties\\sites.xml"));
        System.out.println(sites.getProperty("1"));
    }
}
