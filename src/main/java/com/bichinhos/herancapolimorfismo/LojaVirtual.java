package com.bichinhos.herancapolimorfismo;


import com.bichinhos.herancapolimorfismo.entity.Cliente;
import com.bichinhos.herancapolimorfismo.entity.ItemPedido;
import com.bichinhos.herancapolimorfismo.service.pedido.impl.Pedido;
import com.bichinhos.herancapolimorfismo.service.pedido.impl.PedidoSimples;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;

@SpringBootApplication
public class LojaVirtual {
    public static void main(String[] args) {
        Cliente clienteEduardo = new Cliente(1, "Eduardo", "Rua das laranjeiras");
        ItemPedido itemPedidoS23Eduardo = new ItemPedido(1, "S23", 1, 2000.00);
        ItemPedido itemPedidoS24Eduardo = new ItemPedido(2, "S24", 1, 2000.00);
        Pedido pedidoSimples23Eduardo = new PedidoSimples(clienteEduardo, itemPedidoS23Eduardo, LocalDate.now(), 0.0, 1, 120.50);
        Pedido pedidoSimplespedidos24Eduardo = new PedidoSimples(clienteEduardo, itemPedidoS24Eduardo, LocalDate.now(), 0.0, 1, 120.50);

        System.out.println(pedidoSimples23Eduardo);
        pedidoSimples23Eduardo.obterCliente();
        pedidoSimples23Eduardo.obterItens();
        System.out.println(pedidoSimplespedidos24Eduardo);
    }

}
