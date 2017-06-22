package com.lzt.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzt.dao.CaiNiaoDao;
import com.lzt.entity.CaiNiao;
import com.lzt.service.CaiNiaoService;

@Service("caiNiaoService")
public class CaiNiaoServiceImpll implements CaiNiaoService {
	
	@Autowired
	private CaiNiaoDao cainiaodao;

	public void insertCN(CaiNiao cn) {
		cainiaodao.save(cn);
	}

}
