package io.as.ams.contentkeyauthorizationpolicyoptions.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/**
 * Created by Rasheed on 2015-06-25.
 */
public class MarshallUtil {

    public static String asString(JAXBContext pContext, Object pObject) throws JAXBException {
        StringWriter sw = new StringWriter();

        Marshaller marshaller = pContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        marshaller.marshal(pObject, sw);

        return sw.toString();
    }
}
