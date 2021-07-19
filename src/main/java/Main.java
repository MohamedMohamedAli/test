import helperv4.Dac6HelperV4;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        byte[] xml2 = Files.readAllBytes(Paths.get("v404.xml"));
        eu.taxud.dac6.v4.DAC6Arrangement arr = Dac6HelperV4.unmarshallDac6Arrangement(xml2);
        byte[] xml = Dac6HelperV4.marshall(arr, eu.taxud.dac6.v4.DAC6Arrangement.class);
        System.out.println();
    }
}
