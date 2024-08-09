package com.praxis.proyectoHospitalPost.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.praxis.proyectoHospitalPost.model.dto.Paciente;
import com.praxis.proyectoHospitalPost.service.PacienteServicio;

@Controller
public class PacienteControlador {
	
	@Autowired
	private PacienteServicio pacienteServicio;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String init(Model model) {
		List<Paciente> pacientes = pacienteServicio.listarPacientes();
		model.addAttribute("pacientes", pacientes);
		return "pacientesIndex";
	}
	
	@RequestMapping(value = "/filtrarPacientes", method=RequestMethod.POST)
	public ModelAndView filtrarPacientes(@RequestParam String txtIdentificador) {
		ModelAndView modelAndView = new ModelAndView();
		Long identificador = Long.parseLong(txtIdentificador);
		if (!txtIdentificador.equals("") || txtIdentificador.equals(null)) {
			if (!(identificador > Integer.MAX_VALUE)) {
				Optional<Paciente> paciente = pacienteServicio.buscarPacientePorId(Integer.parseInt(txtIdentificador));
				modelAndView.addObject("paciente", paciente);
			} else {
				modelAndView.addObject("mensaje", "El identificador es un número demasiado grande");
			}			
		} else {
			modelAndView.addObject("mensaje", "El identificador no puede ser vacío");
		}
		modelAndView.setViewName("pacientesIndex");
		return modelAndView;
		
	}

}
