package top.byteinfo.blog.mbg.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tag {
    private Integer id;

    private String tagName;

    private Date createTime;

    private Date updateTime;
}