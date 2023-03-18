package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/tfm/TFMFieldServiceImp")
@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMFieldServiceImp extends TFMFieldService {

	@RequestMapping(value = "/tfmfieldRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmfieldRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmfieldRegister(ppo, request);
	}

	@RequestMapping(value = "/tfmfieldList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmfieldList(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmfieldList(ppo, request);
	}

	@RequestMapping(value = "/tfmfieldEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmfieldEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.tfmfieldEdit(ppo, request);
	}

}