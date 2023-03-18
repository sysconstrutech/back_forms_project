package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.Jpo;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Procedure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ohSolutions.ohRest.util.bean.Response;

@JpoClass(source = "dsinland", oauth2Enable = true)
public class TFMBulkService {

	@RequestMapping(value = "/gescargaPlantillaDisponiblesListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaPlantillaDisponiblesListar(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.carga_plantilla_disponibles_listar","TFM");
		pResult.input("ids", Jpo.STRING);
		pResult.input("id", Jpo.STRING);
		pResult.input("usuario_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/gescargaMasivaObtenerLista", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaMasivaObtenerLista(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.carga_masiva_obtener_lista","TFM");
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("tipo_busqueda", Jpo.STRING);
		pResult.input("extras", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/gescargaMasivaObtenerConfiguracion", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaMasivaObtenerConfiguracion(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.carga_masiva_obtener_configuracion","TFM");
		pResult.input("usuario_id", Jpo.DECIMAL);
		pResult.input("unidad_negocio_id", Jpo.DECIMAL);
		pResult.input("busqueda_array", Jpo.STRING);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

	@RequestMapping(value = "/gescargaMasivaMaster", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaMasivaMaster(Jpo ppo, HttpServletRequest request) throws Exception {
		Procedure pResult = ppo.procedure("ges.carga_masiva_master","TFM");
		pResult.input("stored", Jpo.STRING);
		pResult.input("unidad_negocio", Jpo.DECIMAL);
		pResult.input("carga_id", Jpo.STRING);
		pResult.input("json_data", Jpo.STRING);
		pResult.input("usuario_carga_id", Jpo.DECIMAL);
		Object ohb_response = pResult.executeL();
		ppo.commit();
		return new Response(ohb_response);
	}

}