// SimpleRequest.java
package example;

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
}