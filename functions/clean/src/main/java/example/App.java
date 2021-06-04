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
        System.out.println("clean nas res in " +  request.getVideoDir());
        // todo

        System.out.println("clean oss res in " +  request.getOutputPrefix());
        // todo

        return new SimpleResponse();
    }
}
