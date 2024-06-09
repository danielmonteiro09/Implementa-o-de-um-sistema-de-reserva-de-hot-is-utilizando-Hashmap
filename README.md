O construtor HotelReservationSystem inicializa um HashMap vazio para armazenar as reservas.
O método addReservation adiciona uma nova reserva ao HashMap com o código de reserva como chave e os detalhes da reserva como valor.
O método getReservation recupera os detalhes de uma reserva com base no código de reserva.
O método removeReservation remove uma reserva do HashMap com base no código de reserva.
A classe Reservation representa os detalhes de uma reserva.
A função generateReservationCode gera um código de reserva único com base no tempo atual e um número aleatório.
O método handleCollision trata colisões entre reservas com o mesmo código. Se a reserva anterior foi cancelada, a nova reserva assume o código. Caso contrário, um novo código de reserva é gerado para a nova reserva.

Observações:

É importante notar que o tratamento de colisões pode ser mais complexo dependendo das necessidades específicas do sistema. Por exemplo, você pode querer implementar uma política de retry para lidar com colisões ou utilizar uma estrutura de dados mais avançada para evitar colisões.
Além disso, é importante garantir que o código de reserva seja único e não seja reutilizado em caso de cancelamento ou remoção de uma reserva.
Você pode também querer adicionar mais funcionalidades ao sistema, como a capacidade de atualizar os detalhes de uma reserva ou verificar a disponibilidade de quartos.
