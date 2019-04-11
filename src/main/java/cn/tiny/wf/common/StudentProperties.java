package cn.tiny.wf.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tiny
 * @date 2018/12/19 16:32
 */
@Data
@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {

    private String name;
    private String age;
}
