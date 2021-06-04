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
 * censor split video
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
        List<String> jobIds = new ArrayList<String>();
        for(String  splitkey :  request.getSplitKeys())  {
            System.out.println(splitkey + " to censor ...");
            // todo
            // for example
            jobIds.add("job_id_split_xxx_1.mov");
        }
        resp.setJobIds(jobIds);

        return resp;
    }
}
