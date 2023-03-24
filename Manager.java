package listas;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Manager {

	public void paresFile(List<Integer> pares) throws IOException {
			File listaPares = new File("pares.txt");
			FileWriter escritor = new FileWriter(listaPares);
			escritor.write("Los números pares de la serie Fibonacci del 0 hasta pasando del 1,000,000 son: \n");
			for (int i = 0; i < 11; i++) {
	            int temp = pares.get(i);
				escritor.write(temp + ", ");
	        }
			escritor.close();
		}
		
	public void imparesFile(List<Integer> impares) throws IOException {
			File listaImpares = new File("impares.txt");
			PrintWriter escritor = new PrintWriter(listaImpares);
			escritor.println("Los números impares de la serie Fibonacci hasta 1,000,000 son: \n");
			for (int i = 0; i < 21; i++) {
	            int temp = impares.get(i);
				escritor.write(temp + ", ");
	        }
			escritor.close();
		}
	
	public void ejecutar() throws IOException {
	Manager files = new Manager();
	Splitter uno= new Splitter();
	Fibonacci dos=new Fibonacci();
	files.paresFile(uno.pares(dos.crearLista()));
	files.imparesFile(uno.impares(dos.crearLista()));
	
}}

