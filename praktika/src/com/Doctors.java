package com;
import java.util.ArrayList;
public class Doctors extends Actions {

    private static final ArrayList<Integer> idDoctors = new ArrayList<>();

    public static void setDoctors() { //добавление докторов
        System.out.print("Напишите ФИО врача для добавления: ");
        String name = s.nextLine();
        doctors.add(name);
        int id = doctors.size();
        idDoctors.add(id - 1);
        System.out.println("Вы добавили доктора: " + name);
    }

    public static String getDoctors() { //вывод докторов
        if (doctors.isEmpty()) { //проверка на пустоту таблицы
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            for (int i = 0; i < doctors.size(); i++) {
                System.out.print("ID: " + idDoctors.get(i));
                System.out.print(" Initials: " + doctors.get(i) + "\n");
            }
        }
        return ("");
    }

    public static void changeDoctors() { //изменение докторов
        if (doctors.isEmpty()) {
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            getDoctors();
            System.out.print("Напишите id доктора по списку, фио которого хотите изменить: ");
            int number = s.nextInt();
            if (number + 1 > idDoctors.size()) {
                System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
            } else {
                System.out.println("Вы изменяете врача: " + doctors.get(number));
                System.out.print("Напишите новое фио доктора: ");
                String name = s.nextLine();
                name = s.nextLine();
                doctors.set(number, name);
            }
        }
    }

    public static void removeDoctors() { //удаление докторов
        if (doctors.isEmpty()) {
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
            getDoctors();
            System.out.print("Напишите id доктора, фио которого хотите удалить: ");
            int number = s.nextInt();
            if (number + 1 > idDoctors.size()) {
                System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
            } else {
                System.out.println("Вы удаляете фио: " + doctors.get(number));
                doctors.remove(number);
                idDoctors.remove(number);
                for (int i = number; i < idDoctors.size(); i++) {
                    idDoctors.set(i, idDoctors.get(i) - 1);
                }
            }
        }
    }
}