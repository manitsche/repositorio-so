# Processos - Sistemas operacionais - Aula  05/08/2025

⦁ **Escalonador:** Determina a ordem de execução dos processos, principalmente durante a troca de contexto.

⦁ Processos que criam processos

## Tempo de execução

Real (wall clock): Tempo total decorrido.

Usuário: Tempo que o processo ficou na CPU.

Exemplos:

Processo A: real = x1+y1+z1+x2; usuário = x1+x2

Processo B: real = x1+y1+z1+x2+y2; usuário = y1+y2

Processo C: real = x1+y1+z1+x2+y2+z2; usuário = z1+z2

## Comando time

Exibe o tempo de execução de um processo.

Sintaxe: time comando

Saída:

⦁	**real:** Tempo total (wall clock)

⦁	**user:** Tempo na CPU

⦁	**sys:** Tempo gasto pelo sistema para executar o processo

## Criação de processos

Ocorre em:

⦁	Início do sistema

⦁	Chamadas de sistema por outros processos

⦁	Requisições do usuário

⦁	Início de tarefas em lote

Chamadas de sistema:

⦁	Linux: fork()

⦁	Windows: CreateProcess()

## Caractere &

Executa um comando em background (faz fork).

Cria um processo bash filho.

Sintaxe: (comando) &

Exemplo: 

~~~
(sleep 5; echo "Hello World") &
~~~

## Início do Sistema

⦁	**Daemons:** Processos em background. Não interagem com o usuário (ex.: bluetooth, atualizações)

⦁	**Foregrounds:** Processos que interagem com o usuário (login, tela inicial)

Curiosidade: daemons = “espíritos” no SO.

---

## Comandos vistos em aula:

| Comando                              | Função                                                          | Observação                                                      |
|--------------------------------------|-----------------------------------------------------------------|----------------------------------------------------------------|
| `time ls`                             | Executa `ls` e mede o tempo (real, user, sys)                   | Mede desempenho do comando                                     |
| `sleep 2`                             | Suspende o terminal por 2 segundos                              | Útil para atrasos em scripts                                   |
| `sleep 5 ; echo "Olá"`                | Aguarda 5s e depois exibe "Olá"                                 | `;` executa comandos em sequência                             |
| `(sleep 5 ; echo "Olá") &`            | Aguarda 5s, exibe "Olá" e roda em background                    | `&` permite usar o terminal enquanto executa                   |
| `gnome-text-editor`                   | Abre o editor de texto do GNOME                                 | Bloqueia o terminal até fechar                                 |
| `gnome-text-editor &`                 | Abre o editor em background                                    | Terminal fica livre                                            |
| `kill -9 24628`                       | Mata o processo de PID 24628                                    | `-9` envia SIGKILL (imediato, sem salvar dados)                |
| `ps | grep gnome-text-editor`         | Lista processos filtrando por `gnome-text-editor`               | Útil para encontrar PIDs para matar processos                  |
| `ps | grep gnome-text-editor &`       | Executa o comando acima em background                          | Incomum rodar `ps` em background                              |
| `systemd-analyze blame`               | Mostra processos do boot ordenados por tempo de carregamento    | Diagnóstico de inicialização lenta                             |
| `top`                                 | Monitor de processos em tempo real                              | Use `M` (%MEM), `P` (%CPU), `T` (tempo), `Q` (sair)            |
| `top -h`                              | Exibe ajuda do comando `top`                                    | Mostra opções e parâmetros disponíveis                        |
