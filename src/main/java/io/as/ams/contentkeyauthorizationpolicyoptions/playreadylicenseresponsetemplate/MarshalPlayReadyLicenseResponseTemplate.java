package io.as.ams.contentkeyauthorizationpolicyoptions.playreadylicenseresponsetemplate;

import io.as.ams.contentkeyauthorizationpolicyoptions.util.MarshallingUtil;
import io.as.ams.contentkeyauthorizationpolicyoptions.util.XmlPrettyPrinter;

import javax.xml.bind.JAXBContext;

/**
 * Created by Rasheed on 2015-06-25.
 */
public class MarshalPlayReadyLicenseResponseTemplate {

    public static void marshal() throws Exception {
        final PlayReadyLicenseResponseTemplate playReadyLicenseResponseTemplate = new PlayReadyLicenseResponseTemplate();
        final PlayReadyLicenseTemplate playReadyLicenseTemplate = new PlayReadyLicenseTemplate();
        playReadyLicenseTemplate.setAllowTestDevices(false);
        playReadyLicenseTemplate.setLicenseType(PlayReadyLicenseType.NONPERSISTENT);
        playReadyLicenseTemplate.setContentKey(new ContentEncryptionKeyFromHeader());
        final ArrayOfPlayReadyLicenseTemplate arrayOfPlayReadyLicenseTemplate = new ArrayOfPlayReadyLicenseTemplate();
        arrayOfPlayReadyLicenseTemplate.getPlayReadyLicenseTemplate().add(playReadyLicenseTemplate);
        playReadyLicenseResponseTemplate.setLicenseTemplates(arrayOfPlayReadyLicenseTemplate);

        JAXBContext jaxbContext = JAXBContext.newInstance(PlayReadyLicenseResponseTemplate.class);
        final String playReadyLicenseResponseTemplateAsString = MarshallingUtil.asString(jaxbContext, new ObjectFactory().createPlayReadyLicenseResponseTemplate(playReadyLicenseResponseTemplate));

        System.out.println(XmlPrettyPrinter.format(playReadyLicenseResponseTemplateAsString));
    }
}
