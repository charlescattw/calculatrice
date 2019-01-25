package fr.charles.calculatrice;

import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static calculatrice Calcul = new calculatrice();

	public static void main(String[] args) {

		double nb1 = 0;
		double nb2 = 0;
		double resultatAdd = 0;
		boolean ctrl1 = false;

		do {

			System.out.println(
					"saisir le sigle de l'opérateur (+,-,*,/,%) un autre caractère sort de la l'application calculatrice...");
			String ope = scanner.nextLine();

			if (ope == "+" || ope == "-" || ope == "/" || ope == "*" || ope == "%") {

				ctrl1 = true;

				switch (ope) {
				case "+":
					// appeler le getter du constructeur calculatrice de l'addition.
					System.out.println("veuillez entrer un premier nombre décimal svp :");
					nb1 = scanner.nextDouble();
					System.out.println("veuillez entrer un deuxième nombre décimal svp :");
					nb2 = scanner.nextDouble();
					resultatAdd = Calcul.addition(nb1, nb2);
					System.out.println("l'opération de " + nb1 + "+" + nb2 + resultatAdd);
					break;
				case "-":
					// appeler le getter du constructeur calcultrice de l'addition.
					System.out.println("veuillez entrer un premier nombre décimal svp :");
					nb1 = scanner.nextDouble();
					System.out.println("veuillez entrer un deuxième nombre décimal svp :");
					nb2 = scanner.nextDouble();
					resultatAdd = Calcul.soustraction(nb1, nb2);
					System.out.println("l'opération de " + nb1 + "+" + nb2 + resultatAdd);
					break;
				case "*":
					// appeler le getter du constructeur calcultrice de l'addition.
					System.out.println("veuillez entrer un premier nombre décimal svp :");
					nb1 = scanner.nextDouble();
					System.out.println("veuillez entrer un deuxième nombre décimal svp :");
					nb2 = scanner.nextDouble();
					resultatAdd = Calcul.multiplication(nb1, nb2);
					System.out.println("l'opération de " + nb1 + "+" + nb2 + resultatAdd);
					break;
				case "/":
					// appeler le getter du constructeur calcultrice de l'addition.
					System.out.println("veuillez entrer un premier nombre décimal svp :");
					nb1 = scanner.nextDouble();
					System.out.println("veuillez entrer un deuxième nombre décimal svp :");
					nb2 = scanner.nextDouble();
					resultatAdd = Calcul.division(nb1, nb2);
					System.out.println("l'opération de " + nb1 + "+" + nb2 + resultatAdd);
					break;
				case "%":
					// appeler le getter du constructeur calcultrice de l'addition.
					System.out.println("veuillez entrer un premier nombre décimal svp :");
					nb1 = scanner.nextDouble();
					System.out.println("veuillez entrer un deuxième nombre décimal svp :");
					nb2 = scanner.nextDouble();
					resultatAdd = Calcul.modulo(nb1, nb2);
					System.out.println("l'opération de " + nb1 + "+" + nb2 + resultatAdd);
					break;
				}

			} else {
				System.out.println("entrer un caractère compatible ( *, /, -, +, % )");
			}
		} while (ctrl1 = true);

		System.out.println("afin de réaliser une addition... avec le signe +...");

		scanner.close();
	}

}
