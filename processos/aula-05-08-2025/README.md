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

~~~
time ls
~~~

~~~
sleep 2
~~~

~~~
sleep 5 ; echo "Olá"
~~~

~~~
sleep 5 ; echo "Olá") &
~~~

~~~
(sleep 5 ; echo "Olá") &
~~~

~~~
gnome-text-editor
~~~

~~~
gnome-text-editor &
~~~

~~~
kill -9 24628
~~~

~~~
ps | grep gnome-text-editor &
~~~

~~~
ps | grep gnome-text-editor
~~~

~~~
gnome-text-editor &
~~~

~~~
ps | grep gnome-text-editor 
~~~
~~~
systemd-analyze blame
~~~

~~~
top
~~~

~~~
top -h
~~~
