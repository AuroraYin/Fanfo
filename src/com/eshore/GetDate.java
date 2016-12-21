package com.eshore;
import java.io.InputStream;
import java.net.Socket;
public class GetDate {
	public static final int DEFAULT_PORT = 37;//NTP服务器端口
    public static final String DEFAULT_HOST = "time-nw.nist.gov";//NTP服务器地址
    public GetDate() {
    };
 
    public java.sql.Date  getCurrentTime()  throws Exception {
        long differenceBetweenEpochs = 2208988800L;
        InputStream raw = null;
        try {
            @SuppressWarnings("resource")
			Socket theSocket = new Socket(DEFAULT_HOST, DEFAULT_PORT);
            raw = theSocket.getInputStream();
            long secondsSince1900 = 0;
            for (int i = 0; i < 4; i++) {
                secondsSince1900 = (secondsSince1900 << 8) | raw.read();
            }
            if (raw != null)
                raw.close();
            long secondsSince1970 = secondsSince1900 - differenceBetweenEpochs;
            long msSince1970 = secondsSince1970 * 1000;
            java.sql.Date date=new java.sql.Date(msSince1970);
            return date;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
