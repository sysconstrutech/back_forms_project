package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/tfm/TFMCompanyServiceImp")
@JpoClass(oauth2Enable = true)
public class TFMCompanyServiceImp extends TFMCompanyService {

	@RequestMapping(value = "/gesempresaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gesempresaListar(ppo, request);
	}

	@RequestMapping(value = "/gesempresaEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gesempresaEditar(ppo, request);
	}

	@RequestMapping(value = "/gesempresaObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gesempresaObtener(ppo, request);
	}

	@RequestMapping(value = "/gesempresaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gesempresaRegistrar(ppo, request);
	}

}