package com.cpd.hotel_system.hotel_management_service_api.util;

import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;

@Service
public class BytecodeHandler {
    public Blob stringToBlob(String string) throws SQLException {
        byte[] bytes = string.getBytes(StandardCharsets.UTF_16);
        return new SerialBlob(bytes);
    }

    public String blobToString(Blob blob) throws SQLException {
        return new String(blob.getBytes(1, (int) blob.length()), StandardCharsets.UTF_16);
    }
}
