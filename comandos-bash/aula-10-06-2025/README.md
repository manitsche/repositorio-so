# Bash - Sistemas operacionais - Aula 10/06/2025

---

## Comandos vistos em aula:

```
echo $PATH
```
Exibe o conteúdo da variável de ambiente PATH (diretórios onde o sistema busca executáveis).

```
printenv
```
Exibe todas as variáveis de ambiente do sistema.

```
numero_int=8
```
Cria uma variável chamada 'numero_int' e atribui a ela o valor 8.

```
echo $numero_int
```
Exibe o valor armazenado na variável 'numero_int'.

```
numero_pi=3.141565
```
Cria uma variável 'numero_pi' com valor de ponto flutuante.

```
echo $numero_int $numero_pi
```
Exibe os valores de duas variáveis ao mesmo tempo.

```
aluno=carlos
```
Atribui a string 'carlos' à variável 'aluno'.

```
echo $aluno
```
Exibe o conteúdo da variável 'aluno'.

```
alunos=(carlos eduardo thiago)
```
Cria um array com três nomes.

```
echo ${alunos[0]}
```
Exibe o primeiro elemento do array 'alunos'.

```
echo ${alunos[1]}
```
Exibe o segundo elemento do array 'alunos'.

```
conceito[carlos]=C
```
Declara um valor para uma chave em um array associativo (requer declaração com `declare -A`).

```
conceito[rarinaldo]=B
```
Adiciona outro valor ao array associativo.

```
conceito[edmar]=D
```
Adiciona mais um valor ao array associativo.

```
num1=10
```
Cria a variável num1 e atribui o valor 10.

```
num2=20
```
Cria a variável num2 e atribui o valor 20.

```
echo $num1 $num2
```
Exibe os valores de num1 e num2.

```
echo $((num1 + num2))
```
Soma num1 com num2 e exibe o resultado.

```
echo $((num1 - num2))
```
Subtrai num2 de num1.

```
echo $((num1 * num2))
```
Multiplica num1 por num2.

```
echo $((num1++))
```
Exibe num1 e incrementa seu valor em 1 (pós-incremento).

```
echo $num1
```
Exibe o valor atual da variável num1.

```
echo $((++num1))
```
Incrementa num1 em 1 antes de exibir (pré-incremento).

```
bc
```
Calculadora de precisão arbitrária interativa em terminal.

```
echo $(bc -l <<< 7 / 2)
```
Calcula 7 dividido por 2 com precisão decimal usando `bc`.

```
echo $(bc -l <<< '7/2')
```
Mesma operação acima com a expressão em string.

```
echo $((5 == 5))
```
Compara dois valores (retorna 1 para verdadeiro, 0 para falso).

```
read -p "Digite seu nome: " porta
```
Solicita entrada do usuário e armazena na variável 'porta'.

```
read -p "Digite seu ano de nascimento " ano_nasc
```
Solicita o ano de nascimento do usuário e armazena em 'ano_nasc'.

```
idade=$((2025 - ano_nasc))
```
Calcula a idade subtraindo o ano de nascimento de 2025.

```
echo $idade
```
Exibe o valor da variável 'idade'.

```
read -p "Digite seu ano de nascimento " ano_nasc; idade=$((2025 - ano_nasc)); echo $idade
```
Executa leitura do ano e mostra a idade diretamente.

```
touch meuprimeiroscript.sh
```
Cria um novo arquivo vazio chamado 'meuprimeiroscript.sh'.

```
ls -ogl
```
Lista arquivos com informações detalhadas e dono simplificado.

```
chmod +x meuprimeiroscript.sh
```
Concede permissão de execução ao script.

```
./meuprimeiroscript.sh
```
Executa o script criado.

```
echo $nascimento
```
Exibe o valor da variável 'nascimento'.

```
source meuprimeiroscript.sh
```
Executa o script no contexto atual do shell (importa variáveis).

```
touch qualeonumero.sh
```
Cria outro script chamado 'qualeonumero.sh'.

```
chmod +x qualeonumero.sh
```
Concede permissão de execução ao script 'qualeonumero.sh'.

```
./qualeonumero.sh
```
Executa o script 'qualeonumero.sh'.
