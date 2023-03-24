package listas;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
	int serie=1346270;
	int num1=0;
	int num2=1;
	int suma=1;
	List<Integer> fibonacci =new ArrayList<>();
	public List<Integer> crearLista () {
		fibonacci.add(num1);
		for(int i=1; i<32; i++) {
			fibonacci.add(suma);
			suma=num1+num2;
			num1=num2;
			num2=suma;
	}
		
	return(fibonacci);	
	
	}

}
