package br.com.fiap.cineFiap.service;

import br.com.fiap.cineFiap.dao.FilmeDAO;
import br.com.fiap.cineFiap.models.Filme;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    private final FilmeDAO filmeDAO;
    public FilmeDAO(){this.filmeDAO = new FilmeDAO();};

    public void cadastrar(Filme filme){
        filmeDAO.cadastrar(filme);
    }
    public void alterar(Filme filme){
        filmeDAO.alterar(filme);
    }

    public Filme listarPorId(int id ){
        var sala = filmeDAO.buscarPorId(id);
        return sala;
    }

    public List<Filme> listarPorAno(int ano){
        var lista = filmeDAO.buscarPorAno(ano);
        return lista;
    }

    public void deletar(int id){
        filmeDAO.excluir(id);

    }

}
