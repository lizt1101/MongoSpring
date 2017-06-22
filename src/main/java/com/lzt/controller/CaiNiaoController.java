package com.lzt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lzt.entity.CaiNiao;
import com.lzt.service.CaiNiaoService;
import com.lzt.vo.ResultVo;

@Controller
public class CaiNiaoController {
	
	@Autowired
	private CaiNiaoService caiNiaoService;
	
	@RequestMapping(value={"/cainiao.lzt"},method=RequestMethod.POST)
	@ResponseBody
	public String Cainiao(@RequestBody String param,HttpServletResponse response, HttpServletRequest request){
		ResultVo<Object> result= new ResultVo<Object>();
		CaiNiao cainiao = JSON.parseObject(param, CaiNiao.class);
		caiNiaoService.insertCN(cainiao);
		return JSON.toJSONString(result);
	}
	

}
