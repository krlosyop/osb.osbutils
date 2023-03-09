package mx.krlosyop.oracle.osb;

import java.io.IOException;

import java.io.UnsupportedEncodingException;

import java.util.Base64;

import javax.activation.DataSource;

import mx.krlosyop.oracle.osb.pojo.DataSourceImpl;

public class OSBUtils {
    public OSBUtils() {
    }

    public static String encodeStringToBase64(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }

    public static String decodeBase64ToString(String input) throws UnsupportedEncodingException {
        return new String(Base64.getMimeDecoder().decode(input), "UTF-8");
    }

    public static DataSource decodeBase64ToStream(String base64File, String fileName,
                                                  String contentType) throws IOException {
        byte[] decodedBytes = Base64.getDecoder().decode(base64File);

        DataSourceImpl customDataSource = new DataSourceImpl();
        customDataSource.setData(decodedBytes);
        customDataSource.setName(fileName);
        customDataSource.setContentType(contentType);

        return customDataSource;
    }
}
