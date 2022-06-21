package top.byteinfo.blog.mbg.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private Integer id;

    private String uuid;

    private Integer userAuthId;
}