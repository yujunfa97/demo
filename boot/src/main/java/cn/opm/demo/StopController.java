package cn.opm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName StopController
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2019/12/31 15:16
 * @Version 1.0
 * @Blame OPM Team
 */
@RestController
@RequestMapping("/")
public class StopController {
    private StopDemo stopDemo;

    @GetMapping
    public String tmp () {
        return "stop";
    }

    public void setStopDemo(StopDemo stopDemo) {
        this.stopDemo = stopDemo;
    }
}
