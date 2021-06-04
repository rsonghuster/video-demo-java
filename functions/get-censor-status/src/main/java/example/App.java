package example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.StreamRequestHandler;
import com.aliyun.fc.runtime.FunctionInitializer;
import com.aliyun.fc.runtime.PojoRequestHandler;
import java.util.*;

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
        SimpleResponse resp = new SimpleResponse();
        String videoDir = NAS_ROOT + request.getExecutionName();
        // TODO
        // 获取视频检查结果

        // for example
        Random r = new Random();
        if(r.nextInt(100) %2 == 0){
            resp.setCensorStatus("running");
        } else{
            resp.setCensorStatus("ok");
        }

        return resp;
    }
}
