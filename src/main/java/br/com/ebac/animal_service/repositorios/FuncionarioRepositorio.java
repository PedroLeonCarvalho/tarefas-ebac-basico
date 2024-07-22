package br.com.ebac.animal_service.repositorios;

import br.com.ebac.animal_service.DTOs.FuncionariosAnimaisDTO;
import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, String> {

    @Query("SELECT f.nome, COUNT(a.cpfFuncionarioRecebedor) " +
            "FROM Funcionario f " +
            "LEFT JOIN Animal a ON f.cpf = a.cpfFuncionarioRecebedor " +
            "WHERE a.dataEntrada BETWEEN :startDate AND :endDate " +
            "GROUP BY f.nome " +
            "ORDER BY COUNT(a.cpfFuncionarioRecebedor) ASC")

    List<Object[]> listarFuncionariosPorNumeroDeAnimaisResgatados(
            @Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate);
}







