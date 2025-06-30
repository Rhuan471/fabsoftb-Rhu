package br.univille.projrhuan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projrhuan.entity.Medicamento;
import br.univille.projrhuan.service.MedicamentoService;

@Controller
@RequestMapping("/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoService service;

    @GetMapping
    public ModelAndView index() {
        List<Medicamento> medicamentos = service.getAll();
        return new ModelAndView("medicamento/index", "medicamentos", medicamentos);
    }

    @GetMapping("/novo")
    public ModelAndView novo() {
        return new ModelAndView("medicamento/form", "medicamento", new Medicamento());
    }

    @PostMapping(params = "form")
    public ModelAndView save(Medicamento medicamento) {
        service.save(medicamento);
        return new ModelAndView("redirect:/medicamentos");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable long id) {
        Medicamento medicamento = service.findById(id);
        return new ModelAndView("medicamento/form", "medicamento", medicamento);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable long id) {
        service.delete(id);
        return new ModelAndView("redirect:/medicamentos");
    }

    @GetMapping("/buscar")
    public ModelAndView buscar(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) String principioAtivo,
            @RequestParam(required = false) String codigoBarras) {

        List<Medicamento> resultados = null;

        if (nome != null && !nome.isEmpty()) {
            resultados = service.buscarPorNome(nome);
        } else if (principioAtivo != null && !principioAtivo.isEmpty()) {
            resultados = service.buscarPorPrincipioAtivo(principioAtivo);
        } else if (codigoBarras != null && !codigoBarras.isEmpty()) {
            resultados = service.buscarPorCodigoBarras(codigoBarras);
        } else {
            resultados = service.buscarDisponiveis();
        }

        return new ModelAndView("medicamento/busca", "resultados", resultados);
    }
}
