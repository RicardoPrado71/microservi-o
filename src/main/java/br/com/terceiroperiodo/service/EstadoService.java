package br.com.terceiroperiodo.service;

import br.com.terceiroperiodo.model.Estado;
import br.com.terceiroperiodo.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    EstadoRepository estadoRepository;

    public Estado save(Estado estado){
       return estadoRepository.save(estado);
    }

    public List<Estado> buscarTodos(){
       return estadoRepository.findAll();
    }

    public Optional<Estado> buscarPorId(Long id){
         return estadoRepository.findById(id);
    }
    public Estado atualizar(Estado estado){
        return estadoRepository.save(estado);
    }
    public List<Estado> buscarPorNome(String nome){
        return estadoRepository.findByNome(nome);
    }
    public void deleteById(Long id){
        estadoRepository.deleteById(id);
    }
}
