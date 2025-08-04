# Processos - Sistemas operacionais - Aula 29/07/2025

> SO é um conjunto de rotinas executadas pelo computador (Tanenbaum, 2016; Machado, 2014).

Funções principais:

Facilitar acesso aos recursos do sistema.

Compartilhar recursos entre usuários e processos.

---

**Processo:** É um programa em execução. É a base para sistemas operacionais multiprogramáveis e de tempo compartilhado.

---

Vários processos iniciam automaticamente, muitas vezes sem o usuário perceber.

Exemplos: atualizações, antivírus, Bluetooth/Wi-Fi, monitor de bateria, firewall, gerenciadores de janelas e notificações.

---

Uma única CPU executa múltiplos processos alternando entre eles (troca de contexto).

Cada processo possui um ID único.

Tipos de tempo de execução de um processo:

⦁	**Real:** também chamado de wall clock, tempo total.

⦁	**Usuário:** tempo efetivo na CPU.

---

⦁ Uma CPU de 1 núcleo com 3 processos (A, B e C).

⦁ O tempo real de execução é maior que o tempo de CPU de cada processo devido à alternância e ao compartilhamento.

⦁ Ilustra CPU Virtual, tempo compartilhado e troca de contexto.