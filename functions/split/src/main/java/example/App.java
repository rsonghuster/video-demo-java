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
 * SPLIT VIDEO
 *
 */
public class App implements PojoRequestHandler<SimpleRequest, SimpleResponse>, FunctionInitializer {
    private static String  NAS_ROOT = "/mnt/auto/";
    private static String  FFMPEG_BIN = "/code/ffmpeg";
    private static int MAX_SPLIT_NUM = 100;

    public void initialize(Context context) throws IOException {
        //TODO, If you don’t need it, you can ignore it
    }

    @Override
    public SimpleResponse handleRequest(SimpleRequest request, Context context) {
        List<String> splitKeys = new ArrayList<String>();
        // split video to splits in  NAS videoDir
        // ....
        // for example
        splitKeys.add(request.getVideoDir() + "/split_xxx_1.mov");

        SimpleResponse resp = new SimpleResponse();
        resp.setSplitKeys(splitKeys);
        return resp;
    }
}
