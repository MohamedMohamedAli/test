package helperv4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Dac6HelperV4 {

    public Dac6HelperV4(){
    }

    public static <T> T unmarshallDac6Arrangement(byte[] payload) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{eu.taxud.dac6.v4.DAC6Arrangement.class});
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        Schema schema = schemaFactory.newSchema(new Source[]{loadStreamSource("/DAC6/IsoTypes_v1.01.xsd"), loadStreamSource("/DAC6/Dac6XML_v4.04.xsd")});
        jaxbUnmarshaller.setSchema(schema);
        return (T) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(payload));
    }

    private static StreamSource loadStreamSource(String s) {
        InputStream stream = Dac6HelperV4.class.getResourceAsStream(s);
        if (stream == null) {
            throw new RuntimeException("Impossibile trovare " + s);
        } else {
            return new StreamSource(stream);
        }
    }

    public static <T> byte[] marshall(Object o, Class<T> clazz) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(new Class[]{clazz});
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        marshaller.marshal(o, baos);
        return baos.toByteArray();
    }
}
