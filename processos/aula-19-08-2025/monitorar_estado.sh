#!/bin/bash

# programa que deseja abrir
# deve ser acessível pelo terminal

PROGRAM="gnome-text-editor" 
$PROGRAM &
PID=$!

STATUS_FILE="/proc/$PID/status"

# Verifica se o arquivo existe
if [ ! -f "$STATUS_FILE" ]; then
  echo "Processo com PID $PID não encontrado!"
  exit 1
fi

# Obtém o estado inicial
# "^" somente linhas que iniciam com "State"
OLD_STATE=$(grep "^State:" $STATUS_FILE)

echo $OLD_STATE

# Loop para monitorar alterações de estado
while true; do
  if [ ! -f "$STATUS_FILE" ]; then
    echo "Processo com PID $PID finalizado!"
    exit 1
  fi  
  NEW_STATE=$(grep "^State:" $STATUS_FILE)

  if [ "$NEW_STATE" != "$OLD_STATE" ]; then
    echo $(date '+%d/%m/%Y %H:%M:%S') " $NEW_STATE"
    OLD_STATE="$NEW_STATE"
  fi

  sleep 0.25  # Aguardar 0,25 segundos antes de verificar novamente
done