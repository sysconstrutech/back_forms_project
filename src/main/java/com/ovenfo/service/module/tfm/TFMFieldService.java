package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMFieldService {

	@RequestMapping(value = "/tfmfieldRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmfieldRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.field_register","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("page_id", Jpo.INTEGER);
		pResult.input("type_field_id", Jpo.DECIMAL);
		pResult.input("label", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("required", Jpo.CHARACTER);
		pResult.input("config", Jpo.STRING);
		pResult.input("status", Jpo.DECIMAL);
		pResult.input("user_registration_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/tfmfieldList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmfieldList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.field_list","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("field_id", Jpo.DECIMAL);
		pResult.input("page_id", Jpo.INTEGER);
		pResult.input("type_field_id", Jpo.DECIMAL);
		pResult.input("label", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("required", Jpo.CHARACTER);
		pResult.input("config", Jpo.STRING);
		pResult.input("status", Jpo.DECIMAL);
		pResult.input("user_registration_id", Jpo.DECIMAL);
		pResult.input("registration_date_from", Jpo.DATE);
		pResult.input("registration_date_to", Jpo.DATE);
		pResult.input("user_modification_id", Jpo.DECIMAL);
		pResult.input("modification_date_from", Jpo.DATE);
		pResult.input("modification_date_to", Jpo.DATE);
		pResult.input("pf_page", Jpo.INTEGER);
		pResult.input("pf_size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/tfmfieldEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmfieldEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.field_edit","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("field_id", Jpo.DECIMAL);
		pResult.input("page_id", Jpo.INTEGER);
		pResult.input("type_field_id", Jpo.DECIMAL);
		pResult.input("label", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("required", Jpo.CHARACTER);
		pResult.input("config", Jpo.STRING);
		pResult.input("status", Jpo.DECIMAL);
		pResult.input("user_modification_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}