package br.com.ebac.animal_service.controllers;

import br.com.ebac.animal_service.DTOs.FuncionariosAnimaisDTO;
import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.Funcionario;
import br.com.ebac.animal_service.repositorios.AnimalRepositorio;
import br.com.ebac.animal_service.repositorios.FuncionarioRepositorio;
import br.com.ebac.animal_service.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping ("/funcionarios")
public class FuncionarioController {

    @Autowired
private FuncionarioRepositorio funcionarioRepositorio;
    @Autowired
private FuncionarioService funcionarioService;




    @GetMapping
    public List<Funcionario> findAll () {
    return funcionarioRepositorio.findAll();

    }

    @PostMapping("/listar-por-resgates")
    public ResponseEntity<List<FuncionariosAnimaisDTO>> listarFuncionariosPorResgates(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate)  {

        List<FuncionariosAnimaisDTO> funcionarios = funcionarioService.listarFuncionariosPorNumeroDeAnimaisResgatados(
                startDate, endDate);

        return ResponseEntity.ok(funcionarios);
    }
}


