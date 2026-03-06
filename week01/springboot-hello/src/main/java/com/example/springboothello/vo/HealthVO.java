package com.example.springboothello.vo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HealthVO {
    private String appName;
    private String version;
    private String time;
    private String status;

    // 构造方法（自动填充时间）
    public HealthVO() {
        this.appName = "springboot-hello";
        this.version = "1.0.0";
        this.time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.status = "UP";
    }

    // getter/setter
    public String getAppName() { return appName; }
    public void setAppName(String appName) { this.appName = appName; }
    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}