package by.bsu.alekhna;

import java.util.Random;

public class Main {
	public static int[] mass(int size, int diapazon) {
		Random random = new Random();
		int[] mass = new int[size];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(diapazon);
		}
		return mass;
	}

	public static int max(int[] mass) {
		int max = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max) {
				max = mass[i];
			}
		}
		return max;
	}

	public static void task1(int[] mass) {
		System.out.print("Исходный массив: ");
		double masDbl[] = new double[20];
		for (int i = 0; i < mass.length; i++) {
			masDbl[i] = (double) mass[i];
			System.out.print(mass[i] + " ");
		}
		System.out.print("\nМаксимум: " + max(mass) + "\nЧастные: ");
		for (int i = 0; i < mass.length; i++) {
			System.out.print(masDbl[i] / max(mass) + " ");
		}
	}

	public static void task2() {
		double[] mass = new double[20];
		double[] massPoz = new double[20];
		int[] massInt = new int[20];
		Random random = new Random();
		int count = 0;
		for (int i = 0; i < 20; i++) {
			mass[i] = (random.nextDouble() * 10 - 5) * 100;
			massInt[i] = (int) Math.round(mass[i]);
			mass[i] = (double) massInt[i] / 100;
			if (mass[i] > 0 && i % 2 == 0 || (i == 0 && mass[i] > 0)) {
				System.out.print(mass[i] + "   ");
				massPoz[count] = mass[i];
				count++;
			}
		}
		double[] resultArray = new double[count];
		for (int i = 0; i < count; i++){
			resultArray[i] = massPoz[i];
		}
		
		System.out.print("\nИсходный массив: ");
		for (int i = 0; i < 20; i++) {
			System.out.print(mass[i] + " ");
		}
		System.out.print("\nМассив с квадратами положительных элементов в чётный ячейках: ");
		for (int i = 0; i < count; i++) {
			System.out.print(resultArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		task2();

	}
}
