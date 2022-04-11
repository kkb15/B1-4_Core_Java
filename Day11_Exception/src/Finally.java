import java.util.Scanner;
public class Finally {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
						int a=sc.nextInt(),b=0;
						try {
						int c=a/b;
						System.out.println(c);
						}
						catch(Exception e) {
							System.out.println(e);
						}
						finally {
							System.out.println("Finally Keyword");
					
						sc.close();

					

				}

			}

		}

