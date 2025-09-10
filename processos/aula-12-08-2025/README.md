# Processos e troca de contexto - Sistemas operacionais - Aula 12/08/2025

Aula prática para demostrar a diferença de tempo de execução entre os processos.

**Atividade:** Verificação não eficiente e listagem de números primos

**Objetivo:**	Verificar o impacto no tempo de execução do acesso à saída pelo terminal

Basicamente, usar `system.out.println("")` deixa o código mais lento por conta da troca de contexto.

Resumo do porquê imprimir deixa o programa mais lento:

- `System.out.println("")` faz chamada ao sistema operacional → pausa o programa, o kernel assume o controle, escreve no terminal e devolve o controle.

- Troca de contexto → esse “vai e volta” entre processo e kernel custa tempo.

- Saída para o terminal é lenta → muito mais lenta que CPU/RAM, e cada linha impressa repete esse processo.

- Efeito acumulado → milhares de impressões tornam o programa I/O-bound (limitado pela velocidade de escrita), enquanto sem impressão ele é CPU-bound (limitado pelo cálculo).
