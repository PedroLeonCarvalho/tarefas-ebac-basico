package br.com.ebac.animal_service.service;

import br.com.ebac.animal_service.DTOs.FuncionariosAnimaisDTO;
import br.com.ebac.animal_service.repositorios.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepositorio funcionarioRepositorio;
    FuncionariosAnimaisDTO dto = new FuncionariosAnimaisDTO();


    public List<FuncionariosAnimaisDTO> listarFuncionariosPorNumeroDeAnimaisResgatados(LocalDate startDate, LocalDate endDate) {

        List<Object[]> resultados = funcionarioRepositorio.listarFuncionariosPorNumeroDeAnimaisResgatados(startDate, endDate);

        return resultados.stream()
                .map(resultado -> new FuncionariosAnimaisDTO((String) resultado[0], (Long) resultado[1]))
                .collect(Collectors.toList());
    }

}