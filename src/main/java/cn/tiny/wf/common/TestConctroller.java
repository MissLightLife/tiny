package cn.tiny.wf.common;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/test/",produces = {MediaType.TEXT_HTML_VALUE})
public class TestConctroller {
    @RequestMapping("bindCard")
    public String getHtml(HttpServletResponse response) throws Exception{
        StringBuilder stringBuilder=new StringBuilder();
       // stringBuilder.append("redirect:http://106.15.126.217:8088/drainage_we/h5/common/bindCard/bindCard?appId=JKSDHJDJKSH083&orderNo=ds_008&sign=dc801ec779004b9d247f9b006ccf621f&returnUrl=https://www.baidu.com");
        stringBuilder.append("redirect:https://www.baidu.com");
        //response.sendRedirect(stringBuilder.toString());
        return stringBuilder.toString();


    }
}
