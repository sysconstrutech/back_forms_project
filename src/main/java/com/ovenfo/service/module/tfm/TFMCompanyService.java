package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMCompanyService {

	@RequestMapping(value = "/gesempresaListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.empresa_listar","TFM");
		pResult.input("empresa_id", Jpo.DECIMAL);
		pResult.input("documento", Jpo.STRING);
		pResult.input("razon_social", Jpo.STRING);
		pResult.input("razon_comercial", Jpo.STRING);
		pResult.input("estado", Jpo.CHARACTER);
		pResult.input("fecha_registro_min", Jpo.DATE);
		pResult.input("fecha_registro_max", Jpo.DATE);
		pResult.input("fecha_modificacion_min", Jpo.DATE);
		pResult.input("fecha_modificacion_max", Jpo.DATE);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("tipo_documento", Jpo.DECIMAL);
		pResult.input("suspendido", Jpo.CHARACTER);
		pResult.input("abreviatura", Jpo.STRING);
		pResult.input("roles", Jpo.STRING);
		pResult.input("page", Jpo.INTEGER);
		pResult.input("size", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/gesempresaEditar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaEditar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.empresa_editar","TFM");
		pResult.input("empresa_id", Jpo.DECIMAL);
		pResult.input("documento", Jpo.STRING);
		pResult.input("razon_social", Jpo.STRING);
		pResult.input("razon_comercial", Jpo.STRING);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("tipo_documento", Jpo.DECIMAL);
		pResult.input("abreviatura", Jpo.STRING);
		pResult.input("estado", Jpo.INTEGER);
		pResult.input("suspendido", Jpo.INTEGER);
		pResult.input("direcciones", Jpo.XML);
		pResult.input("contactos", Jpo.XML);
		pResult.input("roles", Jpo.XML);
		pResult.input("configuraciones", Jpo.XML);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/gesempresaObtener", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaObtener(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.empresa_obtener","TFM");
		pResult.input("empresa_id", Jpo.INTEGER);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/gesempresaRegistrar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gesempresaRegistrar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.empresa_registrar","TFM");
		pResult.input("documento", Jpo.STRING);
		pResult.input("razon_social", Jpo.STRING);
		pResult.input("razon_comercial", Jpo.STRING);
		pResult.input("usuario_registro_id", Jpo.DECIMAL);
		pResult.input("usuario_modificacion_id", Jpo.DECIMAL);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("tipo_documento", Jpo.DECIMAL);
		pResult.input("abreviatura", Jpo.STRING);
		pResult.input("contactos", Jpo.XML);
		pResult.input("direcciones", Jpo.XML);
		pResult.input("roles", Jpo.XML);
		pResult.input("configuraciones", Jpo.XML);
		pResult.output("resp_estado", Jpo.INTEGER);
		pResult.output("resp_mensaje", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}