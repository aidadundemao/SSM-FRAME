package com.itlinxi.Controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.itlinxi.constant.MessageConstant;
import com.itlinxi.entity.Result;
import com.itlinxi.pojo.Temp;
import com.itlinxi.service.TempService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempController {
    @Reference
    private TempService tempService;

    // esp8266 通过请求 发送数据
    @RequestMapping("/add")
    public Result add(@RequestBody Temp temp){
        try{
            tempService.add(temp);
        }catch (Exception e){
            return new
                    Result(false, MessageConstant.ADD_TEMP_FAIL);
        }
        return new
                Result(true, MessageConstant.ADD_TEMP_SUCCESS);
    }
}
