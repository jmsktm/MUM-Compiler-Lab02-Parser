#!/bin/bash

echo "########## DELETING FOLDERS ##########"
rm -r analysis/ lexer/ node/ parser/

echo "########## EXECUTING SABLECC ##########"
java -jar ~/sablecc/lib/sablecc.jar CP_parser.scc

echo "########## EXECUTING PARSERDRIVER ##########"
javac ParserDriver.java

echo "########## RUNNING TESTS #########"

java ParserDriver submission/folder2/error01.cp >> submission/folder3/output1.txt

java ParserDriver submission/folder2/error02.cp >> submission/folder3/output2.txt

java ParserDriver submission/folder2/error03.cp >> submission/folder3/output3.txt

java ParserDriver submission/folder2/error04.cp >> submission/folder3/output4.txt

java ParserDriver submission/folder2/error05.cp >> submission/folder3/output5.txt

java ParserDriver submission/folder2/error06.cp >> submission/folder3/output6.txt

echo "########## EXECUTION COMPLETE ##########"