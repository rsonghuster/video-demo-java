// SimpleRequest.java
package example;
import java.util.*;

public class SimpleRequest {
    private String ossBucketName;
    private String videokey;
    private String outputPrefix;
    private int segmentTimeSeconds;
    private String executionName;
    public void setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
    }
    public String getOssBucketName() {
        return ossBucketName;
    }
    public void setVideoKey(String videokey) {
        this.videokey = videokey;
    }
    public String getVideoKey() {
        return videokey;
    }

    public void setOutputPrefix(String output_prefix) {
        this.outputPrefix = outputPrefix;
    }
    public String getOutputPrefix() {
        return outputPrefix;
    }

    public void setSegmentTimeSeconds(int segmentTimeSeconds) {
        this.segmentTimeSeconds = segmentTimeSeconds;
    }
    public int getSegmentTimeSeconds() {
        return segmentTimeSeconds;
    }

    public void setExecutionName(String executionName) {
        this.executionName = executionName;
    }
    public String getExecutionName() {
        return executionName;
    }


    private List<String> jobIds;
    public List<String> getJobIds() {
        return jobIds;
    }
    public void setJobIds(List<String> jobIds ) {
        this.jobIds = jobIds;
    }

    private List<String> splitKeys;
    public List<String> getSplitKeys() {
        return splitKeys;
    }
    public void setSplitKeys(List<String> splitKeys ) {
        this.splitKeys = splitKeys;
    }

    private String videoDir;
    public String getVideoDir() {
        return videoDir;
    }
    public void setVideoDir(String videoDir ) {
        this.videoDir = videoDir;
    }

    private String censorStatus;
    public String getCensorStatus() {
        return censorStatus;
    }
    public void setCensorStatus(String censorStatus ) {
        this.censorStatus = censorStatus;
    }
}