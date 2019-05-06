package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jk.util.HttpClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 业精于勤荒于嬉,行成于思毁于随
 *
 * @Date 2019/5/6 9:42
 * @Created by wuzhuang
 */
@RestController
public class TestController {

    @RequestMapping("test01")

		

		//dev分支写的代码

			12413424
		
		
		//dev分支写的代码

			11122
		
		
		//主分支写的代码
		
		
		//主分支写的代码2

		
		
		//主分支写的代码2
		
		
		
		
		
		
        //dev分支进行修改代码
	publiuc void
       //代码写的不错wqwqwqwqwqwqwqwqwqwqwqwqwqwqwwqwqw
        Map<String, Object> params = new HashMap<>();

        params.put("cityname", cityName);
        params.put("key", "a00edacd6dedf1509dbffa2c3809824e");


        String result = HttpClient.sendGet("http://www.baidu.com", params);


        JSONObject jsonObject = JSON.parseObject(result);
        JSONObject result1 = jsonObject.getJSONObject("result");
        JSONObject today = result1.getJSONObject("today");
        String temperature = today.getString("temperature");
        return temperature;
    }
    

	 @Select("select * from t_permission")
    public List<Tree> getTree();
	
	//另一个用户修改了代码 进行提交
  
	
}
