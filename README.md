# Atividade_Socket-04---02

Monitoramento de Sensores em Tempo Real

Descrição: Desenvolver um sistema onde vários "sensores" (clientes) enviam leituras de dados (temperatura, umidade, etc.) para um servidor central. O servidor exibe essas leituras em tempo real. A perda ocasional de uma leitura não é crítica, pois novas leituras chegam constantemente.

Funcionalidades:

Servidor UDP: Recebe datagramas contendo leituras de sensores (ex: "Sensor1: 25.3C", "Sensor2: 60%RH"). Pode exibir as últimas leituras de cada sensor.
Cliente UDP (Sensor): Gera dados simulados (números aleatórios) e os envia para o servidor em intervalos regulares (ex: a cada segundo).
Atualização contínua: O servidor sempre mostra os dados mais recentes, mesmo que alguns pacotes intermediários tenham sido perdidos.
Por que UDP?

Ideal para fluxos contínuos de dados onde a informação mais recente é a mais relevante.
Baixa latência para atualizações rápidas.
Menos overhead para cada "sensor" enviar seus dados.
