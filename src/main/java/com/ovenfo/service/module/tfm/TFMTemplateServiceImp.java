package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/tfm/TFMTemplateServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMTemplateServiceImp extends TFMTemplateService {

	@RequestMapping(value = "/tfmtemplateEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtemplateEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmtemplateEdit(ppo, request);
	}

	@RequestMapping(value = "/tfmtemplateList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtemplateList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmtemplateList(ppo, request);
	}

	@RequestMapping(value = "/tfmtemplateRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtemplateRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmtemplateRegister(ppo, request);
	}

}