 package mainpackage;
	
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.util.Scanner;
	
	
	public class MyFile {
		
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				Scanner reader = new Scanner(System.in);
				System.out.println("1- write\n2- read");
				int operation = scanner.nextInt();
				switch( operation ) {
				case 1: 
					System.out.println("Enter what you save to file:");
					String data = reader.nextLine();
					fileWriterOn(data);
					break;
				case 2:	
					fileReaderOn();
					break;
				}
				
			}
			static void fileReaderOn() {
				try {
				FileReader fileReader = new FileReader("test.txt");
				int c;
				
				while ( ( c = fileReader.read()) != -1) {
					System.out.print((char) c);
			
				}
				}catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
				
			}
			static void fileWriterOn(String str) {
				try {
					/* we use true to append data and not missing */
					FileWriter	fileWriter = new FileWriter("test.txt" , true );
					fileWriter.write(str);
					fileWriter.close();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		
		}
