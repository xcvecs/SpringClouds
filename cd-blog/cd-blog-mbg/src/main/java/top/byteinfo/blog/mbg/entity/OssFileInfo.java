package top.byteinfo.blog.mbg.entity;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class OssFileInfo {
    private String id;

    private String filename;

    private String contentType;

    private String path;

    private String url;

    private String source;

    private Date createTime;

    private Date updateTime;

    private String tenantId;

    private Boolean isimg;
}