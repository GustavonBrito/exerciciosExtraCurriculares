package com.bichinhos.herancapolimorfismo.service.pedido;


import java.time.LocalDate;
import java.util.List;

public interface IPedidoServico {

    int obterId ();
    String obterCliente ();
    LocalDate obterDataPedido ();
    List<String> obterItens();
    Double calcularValorTotal ();
    LocalDate aplicarDesconto (double desconto);

}
