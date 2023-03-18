package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/tfm/TFMTypeFieldServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMTypeFieldServiceImp extends TFMTypeFieldService {

	@RequestMapping(value = "/tfmtypeFieldList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtypeFieldList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmtypeFieldList(ppo, request);
	}

	@RequestMapping(value = "/tfmtypeFieldEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtypeFieldEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmtypeFieldEdit(ppo, request);
	}

	@RequestMapping(value = "/tfmtypeFieldRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtypeFieldRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmtypeFieldRegister(ppo, request);
	}

}