#!/bin/bash

cp gramatica sablecc.jar ..
cd ..
rm -rf compilador
java -jar sablecc.jar gramatica
rm gramatica sablecc.jar
