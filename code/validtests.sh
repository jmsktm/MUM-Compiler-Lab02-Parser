#!/bin/bash

echo "########## DELETING FOLDERS ##########"
rm -r analysis/ lexer/ node/ parser/

echo "########## EXECUTING SABLECC ##########"
java -jar ~/sablecc/lib/sablecc.jar CP_parser.scc

echo "########## EXECUTING PARSERDRIVER ##########"
javac ParserDriver.java

echo "########## RUNNING TESTS #########"

echo "java ParserDriver tests/in01.cp" > submission/folder1/output.txt
java ParserDriver tests/in01.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in02.cp" >> submission/folder1/output.txt
java ParserDriver tests/in02.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in03.cp" >> submission/folder1/output.txt
java ParserDriver tests/in03.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in04.cp" >> submission/folder1/output.txt
java ParserDriver tests/in04.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in05.cp" >> submission/folder1/output.txt
java ParserDriver tests/in05.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in06.cp" >> submission/folder1/output.txt
java ParserDriver tests/in06.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in07.cp" >> submission/folder1/output.txt
java ParserDriver tests/in07.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in08.cp" >> submission/folder1/output.txt
java ParserDriver tests/in08.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in09.cp" >> submission/folder1/output.txt
java ParserDriver tests/in09.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "java ParserDriver tests/in10.cp" >> submission/folder1/output.txt
java ParserDriver tests/in10.cp >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt
echo "" >> submission/folder1/output.txt

echo "########## EXECUTION COMPLETE ##########"
