package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMTypeFieldService {

	@RequestMapping(value = "/tfmtypeFieldList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtypeFieldList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.type_field_list","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("type_field_id", Jpo.DECIMAL);
		pResult.input("alias", Jpo.STRING);
		pResult.input("label", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("config", Jpo.STRING);
		pResult.input("status", Jpo.CHARACTER);
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

	@RequestMapping(value = "/tfmtypeFieldEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtypeFieldEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.type_field_edit","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("type_field_id", Jpo.DECIMAL);
		pResult.input("alias", Jpo.STRING);
		pResult.input("label", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("config", Jpo.STRING);
		pResult.input("status", Jpo.CHARACTER);
		pResult.input("user_modification_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/tfmtypeFieldRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtypeFieldRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.type_field_register","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("alias", Jpo.STRING);
		pResult.input("label", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("config", Jpo.STRING);
		pResult.input("status", Jpo.CHARACTER);
		pResult.input("user_registration_id", Jpo.DECIMAL);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/tfmtypeFieldOptionList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmtypeFieldOptionList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.type_field_option_list","TFM");
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}