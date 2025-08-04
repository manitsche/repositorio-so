#!/bin/bash

sorteio=$((($RANDOM% 500) + 1))

echo ${sorteio}

read -p "Entre com a primira tentativa: " chute
qtd=1

while [ 1 ]; do

	if [[ $chute -eq $sorteio ]]; then
		# bloco verdadeiro
		echo "Parabéns, voce acertou com ${qtd} tentativas"
		exit 1
	else
		# bloco falso
		read -p "Entre com uma nova tentativa: " chute
		qtd=$((qtd+1))
	fi
done

echo "Isto nao deve aparecer"
