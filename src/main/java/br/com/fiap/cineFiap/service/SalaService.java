package br.com.fiap.cineFiap.service;

import br.com.fiap.cineFiap.dao.SalaDAO;
import br.com.fiap.cineFiap.models.Sala;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SalaService{
    private final SalaDAO salaDAO;

    public SalaService(){
        this.salaDAO = new SalaDAO();
    }

    public List<Sala> listar(){
        System.out.println("Teste se entra na Service");
        return salaDAO.listar();
    }

    public Sala listarPorId(Long id){

        var sala = salaDAO.buscarPorId(id);
        if (sala.getDataExclusao() != null){
            throw new IllegalArgumentException(
                    "Id procurado foi excluido logicamente");
        }
        return sala;
    }
}



