package io.as.ams.contentkeyauthorizationpolicyoptions.key;

import java.security.SecureRandom;
import java.security.Security;

/**
 * Created by Rasheed on 2015-06-24.
 */
public class SymmetricKey {

    public static final int KEY_BYTES = 16;

    private final byte[] secretKey;

    // SecureRandom is expensive to initialize (takes several milliseconds) –
    // consider keeping the instance around if you are generating many keys.
    private static SecureRandom random = new SecureRandom();

    private SymmetricKey(byte[] encoded)
    {
        this.secretKey = encoded;
    }

    public static SymmetricKey random()
    {
        byte[] key = new byte[KEY_BYTES];
        random.nextBytes(key);
        return new SymmetricKey(key);
    }

    public byte[] getKey()
    {
        return secretKey;
    }
}