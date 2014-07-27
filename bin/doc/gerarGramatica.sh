#!/bin/bash

cp gramatica ..
cp sablecc.jar ..
cd ..
rm -rf compilador
java -jar sablecc.jar gramatica
rm gramatica
rm sablecc.jar
