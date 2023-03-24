package listas;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Splitter {
	public List<Integer> pares(List<Integer>lista) {
		List<Integer> pares =new ArrayList<>();
		int j=32;
		for(int i=0;i<j;i++) {
			if (lista.get(i)%2==0) {
				pares.add(lista.get(i));
		}else {continue;}
		}
		return (pares);
	}
	public List<Integer> impares(List<Integer>lista) {
		List<Integer> impares =new ArrayList<>();
		int j=32;
		for(int i=0;i<j;i++) {
			if (lista.get(i)%2!=0) {
				impares.add(lista.get(i));}
		else {continue;}
		}
	return (impares);
	}
	
}
