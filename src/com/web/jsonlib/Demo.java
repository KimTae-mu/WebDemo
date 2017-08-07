package com.web.jsonlib;

import com.web.domain.Province;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Taeyeon-Serenity on 2017/7/23.
 */
public class Demo {
    @Test
    //数组
    public void f1(){
        String[] arr={"aaa","bb","cc"};
        JSONArray json=JSONArray.fromObject(arr);
        System.out.println(json);
    }

    @Test
    //集合
    public void f2(){
        List<String> list=new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        JSONArray json=JSONArray.fromObject(list);
        System.out.println(json);
    }

    @Test
    //bean对象
    public void f3(){
        Province pro = new Province();
        pro.setName("北京");
        pro.setProvinceid(1);

        JSONObject json = JSONObject.fromObject(pro);
        System.out.println(json);
    }

    @Test
    //map
    public void f4(){
        Map<String,Object> map=new HashMap<>();
        map.put("username","tom");
        map.put("age","18");

        JSONObject json=JSONObject.fromObject(map);
        System.out.println(json);
    }

    @Test
    public void f5(){
        List<Province> list=new ArrayList<>();
        list.add(new Province(1,"北京"));
        list.add(new Province(2,"南京"));
        list.add(new Province(3,"东京"));
        list.add(new Province(4,"西京"));

        JSONArray json=JSONArray.fromObject(list);
        System.out.println(json);
    }
}
