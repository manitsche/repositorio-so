# Bash - Sistemas operacionais - Aula 27/05/2025

---

## Comandos vistos em aula:

```
mkdir Eduarda
```
Cria um diretório chamado 'Eduarda'.

```
echo $?
```
Exibe o código de retorno do último comando executado (0 = sucesso).

```
eject
```
Ejeta a mídia montada (como CD/DVD, se houver).

```
cd carlos
```
Navega para o diretório 'carlos'.

```
ls
```
Lista o conteúdo do diretório atual.

```
cd Eduarda
```
Entra no diretório 'Eduarda'.

```
mkdir carlos
```
Cria um diretório chamado 'carlos'.

```
echo "adm" > camila.txt
```
Cria o arquivo 'camila.txt' com o conteúdo 'adm'.

```
echo "marcos" >> camila.txt
```
Adiciona o texto 'marcos' ao final do arquivo 'camila.txt'.

```
cp camila.txt ../camila.csv
```
Copia o arquivo 'camila.txt' para o diretório anterior com o nome 'camila.csv'.

```
mkdir thiago
```
Cria o diretório 'thiago'.

```
cp camila.txt thiago/thiago.txt
```
Copia 'camila.txt' para dentro do diretório 'thiago' com o nome 'thiago.txt'.

```
cd thiago
```
Entra no diretório 'thiago'.

```
cd ..
```
Volta para o diretório anterior.

```
find ~ -name "camila.txt"
```
Procura pelo arquivo 'camila.txt' no diretório home.

```
mv camila.txt Camila.txt
```
Renomeia o arquivo para 'Camila.txt'.

```
find ~ -iname "camila.txt"
```
Busca por 'camila.txt' sem diferenciar maiúsculas de minúsculas.

```
find ~ -iname "camila.*"
```
Busca por qualquer arquivo que comece com 'camila.' no nome.

```
echo "eduardo" >> Camila.txt
```
Adiciona 'eduardo' ao final do arquivo 'Camila.txt'.

```
stat Camila.txt
```
Exibe informações detalhadas sobre o arquivo.

```
top
```
Mostra processos em tempo real no sistema.

```
chmod 666 Camila.txt
```
Concede permissões de leitura e escrita para todos os usuários.

```
ls -a Camila.txt
```
Lista o arquivo, incluindo ocultos (se fosse o caso).

```
ls -l Camila.txt
```
Mostra detalhes do arquivo em formato de lista longa.

```
cat /proc/cpuinfo
```
Mostra informações do processador.

```
cat /proc/cpuinfo | grep "model name"
```
Filtra o modelo do processador.

```
cat /proc/cpuinfo | grep "model name" | head -n 1
```
Mostra apenas a primeira linha do modelo da CPU.

```
cat thiago.txt | xargs -n 1 mkdir
```
Cria diretórios com base nas palavras listadas no arquivo 'thiago.txt'.

```
cat thiago.txt
```
Exibe o conteúdo do arquivo 'thiago.txt'.

```
history >> log_aula.txt
```
Salva o histórico da sessão no arquivo 'log_aula.txt'.

```
cat log_aula.txt
```
Exibe o conteúdo de 'log_aula.txt'.

```
clear
```
Limpa a tela do terminal.

```
mkdir d1 d2 d3 d4 d5
```
Cria múltiplos diretórios de uma vez.

```
rm -r Eduarda
```
Remove o diretório 'Eduarda' e seu conteúdo.

```
history >> comandos.txt
```
Salva o histórico de comandos no arquivo 'comandos.txt'.
