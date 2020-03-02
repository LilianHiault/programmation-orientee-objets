JAVAC=javac
ARGS=-Xlint:all
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: $(classes)

clean :
	rm -f build/*.class

build/%.class : javac -d build -Xlint:all src/*.java
