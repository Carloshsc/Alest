package Lista;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String args[]) {

		Pilha <Double> cal  = new Pilha();
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora: ");
		double n1 = ler.nextDouble();
		double n2 = ler.nextDouble();
		cal.push(n1);
		cal.push(n2);
		String op = ler.nextLine();
		System.out.println(op);
		if(op.equals("+")) {
			n1 = cal.top();
			cal.pop();
			n2 = cal.top();
			cal.pop();
			cal.push(n1+n2);
		}
		if(op.equals("-")) {
			n1 = cal.top();
			cal.pop();
			n2 = cal.top();
			cal.pop();
			cal.push(n1-n2);
		}
		if(op.equals("*")) {
			n1 = cal.top();
			cal.pop();
			n2 = cal.top();
			cal.pop();
			cal.push(n1*n2);
		}
		if(op.equals("/")) {
			n1 = cal.top();
			cal.pop();
			n2 = cal.top();
			cal.pop();
			cal.push(n1/n2);
		}
		while(!op.equals("=")) {
			n2 = ler.nextDouble();
			op = ler.nextLine();
			if(op.equals("+")) {
				n1 = cal.top();
				cal.pop();				
				cal.push(n1+n2);
			}
			if(op.equals("-")) {
				n1 = cal.top();
				cal.pop();				
				cal.push(n1-n2);
			}
			if(op.equals("*")) {
				n1 = cal.top();
				cal.pop();
				cal.push(n1*n2);
			}
			if(op.equals("/")) {
				n1 = cal.top();
				cal.pop();
				cal.push(n1/n2);
			}
			
		}
		System.out.println(cal.top());
	}
	
	
	
	

}
