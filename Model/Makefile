all:
	mkdir -p bin
	javac -d bin -cp /usr/share/java/commons-lang3.jar:/usr/share/java/junit.jar:. */*.java
	cd bin && java -cp /usr/share/java/junit.jar:. junit.textui.TestRunner Test

clean:
	rm *.class
