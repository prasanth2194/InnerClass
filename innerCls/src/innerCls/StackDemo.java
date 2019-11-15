package innerCls;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack st=new Stack();
		int element,pos=0;
		while(true){
			System.out.println("|========================|");
			System.out.println("|==STACK OPERATION MENU==|");
			System.out.println("|========================|");
			System.out.println("|===1)PUSH AN ELEMENT====|");
			System.out.println("|===2)POP AN ELEMENT=====|");
			System.out.println("|===3)SEARCH AN ELEMENT==|");
			System.out.println("|===4)EXIT===============|");
			System.out.println("|========================|");
			System.out.println("|===ENTER YOUR CHOICE====|");
			int choice =sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("ENTER YOUR ELEMENT");
				element =sc.nextInt();
				st.push(element);
				System.out.println("STACK ELEMENTS ARE"+st);
				break;
			case 2:
				st.pop();
				System.out.println("STACK ELEMENTS ARE"+st);
				break;
			case 3:
				System.out.println("ENTER SEARCH ELEMENT");
				element =sc.nextInt();
				pos = st.search(element);
				System.out.println("STACK ELEMENTS ARE"+pos);
				break;
			case 4:
				System.exit(0);
				break;
			default:
					System.out.println("SELECT BETWEEN 1-4");
					break;
				
				
						
			}
		}

	}

}
