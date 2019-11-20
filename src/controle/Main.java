package controle;

import java.util.Scanner;

public class Main {

	public static void ligaDesliga(Controle t) {
		if (t instanceof Radio) {
			((Radio)t).setStatus();
			System.out.print("\nStatus Rádio: ");
			((Radio) t).getStatus();
		}
		else {
			if(t instanceof TV) {
				((TV)t).setStatus();
				System.out.print("\nStatus TV: ");
				((TV) t).getStatus();
			}
		}
	}

	public static void controleVolume(Controle t) {
		Scanner sc = new Scanner (System.in);
		if (t instanceof Radio) {
			System.out.println("Digite novo volume: ");
			int vol = sc.nextInt();
			((Radio)t).setVolume(vol);
			System.out.println("Volume atual rádio: " + ((Radio) t).getVolume());
		}
		else {
			if(t instanceof TV) {
				System.out.println("Digite novo volume: ");
				int vol = sc.nextInt();
				((TV)t).setVolume(vol);
				System.out.println("Volume atual TV: " + ((TV) t).getVolume());
			}
		}
	}

	public static void selecionaCanal(Controle t) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o novo canal: ");
		int canal = sc.nextInt();
		((TV) t).setCanal(canal);
		System.out.println("Canal atual TV: " + ((TV) t).getCanal());
	}

	public static void selecionaFaixa(Controle t) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nova faixa: ");
		double faixa = sc.nextDouble();
		((Radio) t).setFaixa(faixa);
		System.out.println("Faixa atual rádio: " + ((Radio) t).getFaixa());
	}

	public static void imprimirInfos(Controle t) {
		if (t instanceof TV) {
			System.out.print("Status TV: " );
			((TV) t).getStatus();
			System.out.println("Canal atual TV: " + ((TV) t).getCanal());
			System.out.println("Volume atual TV: " + ((TV) t).getVolume());
		} else {
			if (t instanceof Radio) {
				System.out.println("Status Rádio: ");
				((Radio) t).getStatus();
				System.out.println("Faixa atual Rádio: " + ((Radio) t).getFaixa());
				System.out.println("Volume atual Rádio: " + ((Radio) t).getVolume());
			}
		}

	}

	public static void menu() {
		System.out.println("-----Escolha uma opção-------");
		System.out.println("- 1-Liga/Desliga            -");
		System.out.println("- 2-Controle Volume         -");
		System.out.println("- 3-TV- Seleciona Canal     -");
		System.out.println("- 4-Rádio: Seleciona Faixa  -");
		System.out.println("- 5-Informações TV          -");
		System.out.println("- 6-Informações Rádio       -");
		System.out.println("- 0-Sair                    -");
		System.out.println("-----------------------------");
		System.out.println("Opção: ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Aparelho toshiba = new TV();
		Aparelho pioneer = new Radio();
		
		int opcao = 1000;
		do {
			System.out.println();
			menu();
			opcao = sc.nextInt();
			
			String op;

			switch (opcao) {
			case 1:
				System.out.println("Escolha entre TV ou Rádio");
				op = sc.next().toLowerCase();
				if(op.equals("tv")) {
					ligaDesliga(toshiba);
				}
				else {
					if(op.equals("radio")) {
						ligaDesliga(pioneer);
					}
				}
				break;
			case 2:
				System.out.println("Escolha entre TV ou Rádio");
				op = sc.next().toLowerCase();
				if(op.equals("tv")) {
					controleVolume(toshiba);
				}
				else {
					if(op.equals("radio")) {
						controleVolume(pioneer);
					}
				}
				break;
			case 3:
				selecionaCanal(toshiba);
				break;
			case 4:
				selecionaFaixa(pioneer);
				break;
			case 5:
				imprimirInfos(toshiba);
				break;
			case 6:
				imprimirInfos(pioneer);
				break;
			}

		} while (opcao != 0);

	}

}