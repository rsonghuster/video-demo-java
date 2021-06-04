package example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.StreamRequestHandler;
import com.aliyun.fc.runtime.FunctionInitializer;
import com.aliyun.fc.runtime.PojoRequestHandler;

/**
 * INIT
 *
 */
public class App implements PojoRequestHandler<SimpleRequest, SimpleResponse>, FunctionInitializer {
    private static String  NAS_ROOT = "/mnt/auto/";

    public void initialize(Context context) throws IOException {
        //TODO, If you don’t need it, you can ignore it
    }

    @Override
    public SimpleResponse handleRequest(SimpleRequest request, Context context) {
        String videoDir = NAS_ROOT + request.getExecutionName();
        // TODO
        // download video to NAS videoDir
        // DB operation
        // ....
        SimpleResponse resp = new SimpleResponse();
        resp.setVideoDir(videoDir);
        return resp;
    }
}
