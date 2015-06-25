package io.as.ams.contentkeyauthorizationpolicyoptions.tokenrestrictiontemplate;

import io.as.ams.contentkeyauthorizationpolicyoptions.key.SymmetricKey;
import io.as.ams.contentkeyauthorizationpolicyoptions.util.MarshallingUtil;
import io.as.ams.contentkeyauthorizationpolicyoptions.util.XmlPrettyPrinter;

import javax.xml.bind.JAXBContext;

/**
 * Created by Rasheed on 2015-06-25.
 */
public class MarshalTokenRestrictionTemplate {

    public static void marshal() throws Exception {
        final TokenRestrictionTemplate tokenRestrictionTemplate = new TokenRestrictionTemplate();
        tokenRestrictionTemplate.setAudience("urn:test");
        tokenRestrictionTemplate.setIssuer("http://testacs.com/");
        tokenRestrictionTemplate.setTokenType(TokenType.SWT);

        final SymmetricKey primarySymmetricKey = SymmetricKey.random();
        final SymmetricVerificationKey primaryTokenVerificationKey = new SymmetricVerificationKey();
        primaryTokenVerificationKey.setKeyValue(primarySymmetricKey.getKey());
        tokenRestrictionTemplate.setPrimaryVerificationKey(primaryTokenVerificationKey);

        final SymmetricKey alternativeSymmetricKey = SymmetricKey.random();
        final SymmetricVerificationKey alternativeTokenVerificationKey = new SymmetricVerificationKey();
        alternativeTokenVerificationKey.setKeyValue(alternativeSymmetricKey.getKey());

        final ArrayOfTokenVerificationKey arrayOfTokenVerificationKey = new ArrayOfTokenVerificationKey();
        arrayOfTokenVerificationKey.getTokenVerificationKey().add(alternativeTokenVerificationKey);
        tokenRestrictionTemplate.setAlternateVerificationKeys(new ObjectFactory().createArrayOfTokenVerificationKey(arrayOfTokenVerificationKey));

        final TokenClaim tokenClaim = new TokenClaim();
        tokenClaim.setClaimType("urn:microsoft:azure:mediaservices:contentkeyidentifier");
        tokenClaim.setClaimValue(new ObjectFactory().createTokenClaimClaimValue(null));
        final ArrayOfTokenClaim arrayOfTokenClaim = new ArrayOfTokenClaim();
        arrayOfTokenClaim.getTokenClaim().add(tokenClaim);
        tokenRestrictionTemplate.setRequiredClaims(new ObjectFactory().createArrayOfTokenClaim(arrayOfTokenClaim));

        JAXBContext jaxbContext = JAXBContext.newInstance(TokenRestrictionTemplate.class);
        String tokenRestrictionTemplateAsString = MarshallingUtil.asString(jaxbContext, new ObjectFactory().createTokenRestrictionTemplate((tokenRestrictionTemplate)));

        System.out.println(XmlPrettyPrinter.format(tokenRestrictionTemplateAsString));
    }
}
