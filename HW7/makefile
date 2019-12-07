JCC = javac

JFLAGS = -g

default: Gradebook.class Main.class Student.class

Main.class: Main.java
	$(JCC) $(JFLAGS) Main.java

Gradebook.class: Gradebook.java
	$(JCC) $(JFLAGS) Gradebook.java

Student.class: Student.java
	$(JCC) $(JFLAGS) Student.java
clean: 
	$(RM) *.class