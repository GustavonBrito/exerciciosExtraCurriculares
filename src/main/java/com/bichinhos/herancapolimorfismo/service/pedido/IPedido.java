package com.bichinhos.herancapolimorfismo.service.pedido;


import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface IPedido {

    int obterId ();
    String obterCliente ();
    Date obterDataPedido ();
    List<String> obterItens();
    Double calcularValorTotal ();
    Date aplicarDesconto (double desconto);

}
