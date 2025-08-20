# Processos - Sistemas operacionais - Aula 19/08/2025

## Término de processos

### Voluntário

⦁ **Saída normal:** Tarefa concluída normalmente (ex.: ls, fechar janela).

⦁ **Saída por erro:** Processo detecta erro e encerra, informando (ex.: diretório inexistente).

### Involuntário

⦁ **Erro fatal:** Falha grave (instrução ilegal, acesso inválido, divisão por zero).

⦁ **Sinalizado:** Erro tratado (ex.: exceções em Java).

⦁ **Não-sinalizado:** Processo é encerrado.

⦁ **Cancelamento por outro processo:** encerrado via chamada de sistema (kill, TerminateProcess).

### Exemplo (Linux)

Criar processo em background: `comando &`

Encerrar processo: `kill <PID>` (pai) ou `kill -9 <PID>` (pai + filhos)

## Hierarquia de processos

⦁ **Pai:** Cria outros processos.

⦁ **Filho:** Criado a partir de um pai, pode gerar novos filhos.

⦁ **Linux:** Hierarquia fixa; sinais podem ser enviados a grupos de processos.

⦁ **Windows:** Hierarquia mutável; relação pode ser transferida (via handle).

## Estados de processos

⦁ Pronto – carregado, mas aguardando CPU.

⦁ Execução – em uso da CPU.

⦁ Bloqueado – aguardando evento externo.

Transições: Espera por evento, troca de fatia de tempo, evento atendido → retorno ao estado anterior.

## Ciclo de vida melhorado

Ciclo de vida melhorado

Novo → criado e admitido.

Pronto → aguardando CPU.

Execução → em processamento.

Aguardando → esperando evento de I/O, timer ou recurso.

Finalizado → encerrado.

Estados no Linux (comando ps ou top):

R – executando

S – espera interrompível

D – espera não-interrompível

T/t – parado

Z – zumbi

X – morto (não deveria aparecer)
