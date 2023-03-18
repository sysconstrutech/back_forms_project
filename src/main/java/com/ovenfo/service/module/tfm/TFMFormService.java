package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMFormService {

	@RequestMapping(value = "/tfmformRegister", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformRegister(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.form_register","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("name", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("url_form", Jpo.STRING);
		pResult.input("url_img", Jpo.STRING);
		pResult.input("url_data_studio", Jpo.STRING);
		pResult.input("url_data_source", Jpo.STRING);
		pResult.input("status", Jpo.INTEGER);
		pResult.input("company_id", Jpo.INTEGER);
		pResult.input("user_registration_id", Jpo.INTEGER);
		pResult.input("ref_page", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/tfmformList", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformList(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.form_list","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("form_id", Jpo.INTEGER);
		pResult.input("name", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("url_form", Jpo.STRING);
		pResult.input("url_img", Jpo.STRING);
		pResult.input("url_data_studio", Jpo.STRING);
		pResult.input("url_data_source", Jpo.STRING);
		pResult.input("status", Jpo.INTEGER);
		pResult.input("company_id", Jpo.INTEGER);
		pResult.input("user_registration_id", Jpo.INTEGER);
		pResult.input("registration_date_from", Jpo.DATETIME);
		pResult.input("registration_date_to", Jpo.DATETIME);
		pResult.input("user_modification_id", Jpo.INTEGER);
		pResult.input("modification_date_from", Jpo.DATETIME);
		pResult.input("modification_date_to", Jpo.DATETIME);
		pResult.input("pf_page", Jpo.INTEGER);
		pResult.input("pf_size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/tfmformEdit", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformEdit(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.form_edit","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("form_id", Jpo.INTEGER);
		pResult.input("name", Jpo.STRING);
		pResult.input("description", Jpo.STRING);
		pResult.input("url_form", Jpo.STRING);
		pResult.input("url_img", Jpo.STRING);
		pResult.input("url_data_studio", Jpo.STRING);
		pResult.input("url_data_source", Jpo.STRING);
		pResult.input("status", Jpo.INTEGER);
		pResult.input("company_id", Jpo.INTEGER);
		pResult.input("user_modification_id", Jpo.INTEGER);
		pResult.input("ref_page", Jpo.STRING);
		pResult.output("resp_new_id", Jpo.INTEGER);
		pResult.output("resp_result", Jpo.INTEGER);
		pResult.output("resp_message", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/tfmformGet", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object tfmformGet(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("tfm.form_get","TFM");
		pResult.input("pf_user_id", ppo.getData("_AUTH_USER", "usuario_id"), Jpo.INTEGER);
		pResult.input("form_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}