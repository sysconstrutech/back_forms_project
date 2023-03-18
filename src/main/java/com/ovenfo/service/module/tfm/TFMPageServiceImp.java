package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/tfm/TFMPageServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMPageServiceImp extends TFMPageService {

	@RequestMapping(value = "/tfmpageEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmpageEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmpageEdit(ppo, request);
	}

	@RequestMapping(value = "/tfmpageList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmpageList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmpageList(ppo, request);
	}

	@RequestMapping(value = "/tfmpageRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmpageRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmpageRegister(ppo, request);
	}

}