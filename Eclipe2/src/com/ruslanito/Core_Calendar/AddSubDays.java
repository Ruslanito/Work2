package com.ruslanito.Core_Calendar;

import java.util.Calendar;

public class AddSubDays {

	public static void main(String[] args) {
		int q = 12;
		// получение текущей даты
		Calendar now = Calendar.getInstance();
		Calendar now2 = Calendar.getInstance();
		System.out.println("Текущая дата:" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));
		// через q дней используя метод now.add()
		now.add(Calendar.DATE, q);
		System.out.println("через q=" + q + " дней:" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE)
				+ "-" + now.get(Calendar.YEAR));
		now.add(Calendar.YEAR, q);
		System.out.println("через q=" + q + " лет:" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.YEAR));
		now.add(Calendar.MONTH, q);
		System.out.println("через q=" + q + " месяцев:" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE)
				+ "-" + now.get(Calendar.YEAR));
		now2.add(Calendar.DATE, q);
		System.out.println("через q=" + q + " дней:" + (now2.get(Calendar.MONTH) + 1) + "-" + now2.get(Calendar.DATE)
				+ "-" + now2.get(Calendar.YEAR));

	}

}
