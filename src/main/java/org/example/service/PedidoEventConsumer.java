package org.example.service;



import org.example.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PedidoEventConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void handlePedidoEvent(String pedidoEvent) {
        // Lógica para processar o evento recebido do PetFriends_Pedidos
        System.out.println("Recebido evento de pedido: " + pedidoEvent);

        // Adicione aqui a lógica para processar a mensagem recebida
        // Pode ser uma atualização do inventário, por exemplo.
    }
}
