package mx.krlosyop.oracle.osb.pojo;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataSource;

public class DataSourceImpl implements DataSource {
    public DataSourceImpl() {
    }

    private byte[] data = new byte[0];
    private String contentType = "text/plain";
    private String name = null;

    public void setData(byte[] data) {
        this.data = data;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public InputStream getInputStream() {
        return new ByteArrayInputStream(data);
    }

    @Override
    public OutputStream getOutputStream() {
        return null;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public String getName() {
        return name;
    }
}
