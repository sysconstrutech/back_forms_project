package com.ovenfo.service.module.tfm;

import javax.servlet.http.HttpServletRequest;
import ohSolutions.ohJpo.dao.JpoClass;
import ohSolutions.ohJpo.dao.Jpo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module/tfm/TFMBulkServiceImp")
@JpoClass(oauth2Enable = true)
public class TFMBulkServiceImp extends TFMBulkService {

	@RequestMapping(value = "/gescargaPlantillaDisponiblesListar", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaPlantillaDisponiblesListar(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gescargaPlantillaDisponiblesListar(ppo, request);
	}

	@RequestMapping(value = "/gescargaMasivaObtenerLista", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaMasivaObtenerLista(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gescargaMasivaObtenerLista(ppo, request);
	}

	@RequestMapping(value = "/gescargaMasivaObtenerConfiguracion", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaMasivaObtenerConfiguracion(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gescargaMasivaObtenerConfiguracion(ppo, request);
	}

	@RequestMapping(value = "/gescargaMasivaMaster", method = {RequestMethod.POST})
	@JpoClass(oauth2Enable = true)
	public Object gescargaMasivaMaster(Jpo ppo, HttpServletRequest request) throws Exception {
		return super.gescargaMasivaMaster(ppo, request);
	}

}