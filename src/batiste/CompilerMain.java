package batiste;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import batiste.Lexer;
import batiste.Context;
import batiste.Parser;
import batiste.util.ConcreteVisitor;
import java_cup.runtime.SimpleSymbolFactory;
import java_cup.runtime.SymbolFactory;

public class CompilerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("tu veux utiliser exampleBatiste.txt [1] ou ton propre fichier [2] ?");
		
		String fileIn = null, fileOut = null;
		int choix = 0;
		while (choix != 1 && choix != 2) {
			choix = sc.nextInt();	
			sc.nextLine();
		}
		if (choix == 1) {
			System.out.println("tentative de générer hello.svg");
			fileIn = "exampleBatiste.txt";
			fileOut = "hello.svg";
			
		}
		if (choix == 2) {
			System.out.println("Veuillez saisir le chemin de votre fichier d'entrée :");
			fileIn = sc.nextLine();
			System.out.println("Vous avez saisi : " + fileIn);
			System.out.println("Veuillez saisir le nom du fichier svg à générer :");
			fileOut = sc.nextLine();
			System.out.println("Vous avez saisi : " + fileOut);
			fileOut += ".svg";
			System.out.println("tentative de générer " +fileOut);
			
		}
		
		sc.close();
		
		
		
		SymbolFactory csf = new SimpleSymbolFactory ();
    	Lexer l = null;
		try {
			l = new Lexer(new FileReader(fileIn));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	l.setSymbolFactory(csf);
    	Parser p = new Parser(l, csf);
		Context context = new Context();
		p.setContext(context);
    	try {
			p.parse();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	PrintWriter writer1 =null;
		try {
			writer1 = new PrintWriter(new File(fileOut));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  
        ConcreteVisitor cv = new ConcreteVisitor(writer1); 
        cv.visitNode(context.getRacine());
        writer1.flush();  
        writer1.close();
        System.out.println("tout s'est bien passé, ouvrez votre fichier svg avec un navigateur");
	}

}
