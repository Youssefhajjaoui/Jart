
run: clean
	@javac -sourcepath . application/*.java geometrical_shapes/*.java Main.java -d build
	@java -cp build Main

clean:
	@rm -rf build