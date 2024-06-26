package entidades;

import java.util.List;

import enums.TipoDeBusca;

public interface Busca {

    // Método para realizar a busca de um caminho entre um nó inicial e um nó objetivo
    List<No> buscar(No inicial, No objetivo, TipoDeBusca tipo);

}
