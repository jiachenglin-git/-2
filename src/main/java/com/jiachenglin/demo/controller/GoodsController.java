package com.jiachenglin.demo.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiachenglin.demo.utils.PageUtils;

@Controller
public class GoodsController {
	//dingyidsa
	@Resource
	private RedisTemplate<Object, Object> redisTemplate;
	
	//查询方法
	@RequestMapping("list")
	public String findList(Model model) {
		BoundListOperations<Object, Object> boundListOps = redisTemplate.boundListOps("goodsList");
		Map<String, Long> pageUtils = PageUtils.pageUtils(boundListOps.size(), 4);
		List<Object> range = boundListOps.range(pageUtils.get("start"), pageUtils.get("end"));
		model.addAttribute("goodsList", range);
		return "list";
	}
}
