import java.util.Scanner;
public class Condicionalesfinal{
	public static void main(String[] args) {
		
/* Serie 1,2,3,4,5,6,7,8,9,10 ******************************************************************

		int i=0;

		System.out.println("Serie con for");
		for (i=1; i<=10; i++){
			if (i<10){
				System.out.print(i+", ");
			}else {
				System.out.print(i);
			}
		}

		i=1;
		System.out.println("");

		System.out.println("serie con while");
		while(i<=10){
			if (i<10){
			System.out.print(i+", ");
			
			}else {
				System.out.print(i);
			}
			i++;
		}

		i=1;
		System.out.println("");

		System.out.println("do while");
		do{
			if (i<10){
			System.out.print(i+", ");
			
			}else {
				System.out.print(i);
			} 
			i++;
		}while(i<=10);

		i=1;
*/
/* serie 1,99,2,98,3,97,4,96,5,95 *******************************************************************

		int a=1,b =99;

		System.out.println("Serie con for");

		for (int i=1;i<=5;i++){
			if (a<5 && b>=95) {
				System.out.print(a+", "+b+", ");
			}else{
				System.out.print(a+", "+b);
			}
			b--;
			a++;
		}
		System.out.println("");

		a=1;b =99;
		System.out.println("Serie con while");

		while(a<=5 && b>=95){
			if (a<5 && b>=95) {
				System.out.print(a+", "+b+", ");
			}else{
				System.out.print(a+", "+b);
			}
			b--;
			a++;
		}
		System.out.println("");

		a=1;
		b =99;
		System.out.println("Serie con do while");

		do{
			if (a<5 && b>=95) {
				System.out.print(a+", "+b+", ");
			}else{
				System.out.print(a+", "+b);
			}
			b--;
			a++;

		}while(a<=5 && b>=95);
		System.out.println("");

		*/


/* SERIE 0,1,1,2,3,5,8,13,21,34 ***********************************************************



Fibonnacci
int a=0, b=1, c=0;
for (int i=0;i<10;i++)
{
	System.out.print(a+", ");
	c=a+b;
	a=b;
	b=c;
}


*/

		int i=0;
		int	incre=1;

		System.out.println("Serie con for");
		for(int ig=0;ig<5;ig++){
		
			System.out.print(i+", ");
			incre=incre+i;
			i=i+incre;
			if(i<34){
				System.out.print(incre+", ");
			}else {
				System.out.println(incre);
			}
			
		}

		i=0;
		incre=1;
		System.out.println("Serie con while");
		while(i<35){
			System.out.print(i+", ");
			incre=incre+i;
			i=i+incre;
			if(i<34){
				System.out.print(incre+", ");
			}else {
				
				System.out.println(incre);
			}

		}

		i=0;
		incre=1;
		System.out.println("Serie con do while");
		do{
			System.out.print(i+", ");
			incre=incre+i;
			i=i+incre;
			if(i<34){
				System.out.print(incre+", ");
			}else {
				
				System.out.println(incre);
			}

		}while(i<35);


		
	}


}
