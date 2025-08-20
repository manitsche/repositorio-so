#!/bin/bash

(sleep 12 && echo "Sleep1") &
(sleep 12 && echo "Sleep2") &
wait