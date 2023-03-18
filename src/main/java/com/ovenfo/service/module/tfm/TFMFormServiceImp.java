package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/tfm/TFMFormServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMFormServiceImp extends TFMFormService {

	@RequestMapping(value = "/tfmformRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmformRegister(ppo, request);
	}

	@RequestMapping(value = "/tfmformList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmformList(ppo, request);
	}

	@RequestMapping(value = "/tfmformEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmformEdit(ppo, request);
	}

	@RequestMapping(value = "/tfmformGet", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformGet(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmformGet(ppo, request);
	}

}