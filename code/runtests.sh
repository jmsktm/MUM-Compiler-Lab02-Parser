#!/bin/bash

echo "########## DELETING FOLDERS ##########"
rm -r analysis/ lexer/ node/ parser/

echo "########## EXECUTING SABLECC ##########"
java -jar ~/sablecc/lib/sablecc.jar CP_parser.scc

echo "########## EXECUTING PARSERDRIVER ##########"
javac ParserDriver.java

echo "########## RUNNING TESTS #########"

echo "java ParserDriver tests/in01.cp > output.txt" > output.txt
java ParserDriver tests/in01.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in02.cp >> output.txt" >> output.txt
java ParserDriver tests/in02.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in03.cp >> output.txt" >> output.txt
java ParserDriver tests/in03.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in04.cp >> output.txt" >> output.txt
java ParserDriver tests/in04.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in05.cp >> output.txt" >> output.txt
java ParserDriver tests/in05.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in06.cp >> output.txt" >> output.txt
java ParserDriver tests/in06.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in07.cp >> output.txt" >> output.txt
java ParserDriver tests/in07.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in08.cp >> output.txt" >> output.txt
java ParserDriver tests/in08.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in09.cp >> output.txt" >> output.txt
java ParserDriver tests/in09.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "java ParserDriver tests/in10.cp >> output.txt" >> output.txt
java ParserDriver tests/in10.cp >> output.txt
echo "" >> output.txt
echo "" >> output.txt
echo "" >> output.txt

echo "########## EXECUTION COMPLETE ##########"
