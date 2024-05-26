package com.bichinhos.herancapolimorfismo;


import com.bichinhos.herancapolimorfismo.entity.Cliente;
import com.bichinhos.herancapolimorfismo.entity.ItemPedido;
import com.bichinhos.herancapolimorfismo.service.pedido.impl.PedidoServico;
import com.bichinhos.herancapolimorfismo.service.pedido.impl.PedidoSimplesServico;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LojaVirtual {
    public static void main(String[] args) {
        Cliente clienteEduardo = new Cliente(1, "Eduardo", "Rua das laranjeiras");
        ItemPedido itemPedidoS23Eduardo = new ItemPedido(1, "S23", 1, 2000.00);
        ItemPedido itemPedidoS24Eduardo = new ItemPedido(2, "S24", 1, 2000.00);
        PedidoServico pedidoServicoSimples23Eduardo = new PedidoSimplesServico(clienteEduardo, itemPedidoS23Eduardo, LocalDate.now(), 0.0, 1, 120.50);
        PedidoServico pedidoServicoSimples24Eduardo = new PedidoSimplesServico(clienteEduardo, itemPedidoS24Eduardo, LocalDate.now(), 0.0, 1, 120.50);

        pedidoServicoSimples23Eduardo.obterId();
        pedidoServicoSimples23Eduardo.obterCliente();
        pedidoServicoSimples23Eduardo.obterItens();
        pedidoServicoSimples23Eduardo.obterDataPedido();
    }
}
