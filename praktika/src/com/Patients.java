package com;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Patients extends Actions {

    private static final ArrayList<Integer> idPatients = new ArrayList<>();
    private static final ArrayList<String> datePatients = new ArrayList<>();

    public static void setPatients() { //добавление пациентов
        System.out.print("Напишите ФИО пациента для добавления: ");
        String name = s.nextLine();
        getDate();
        patients.add(name);
        int id = patients.size();
        idPatients.add(id - 1);
        datePatients.add(getDate());
        System.out.println("Вы добавили пациента: " + name);
    }

    public static void removePatients() { //удаление пациентов
        getPatients();
        System.out.print("Напишите id пациента, фио которого хотите удалить: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()) {
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
        System.out.println("Вы удаляете пациента: " + patients.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
        for(int i = number; i < idPatients.size(); i++ ) {
            idPatients.set(i, idPatients.get(i) - 1);
        }
        }
    }

    public static String getPatients() { //вывод списка с пациентами
        for(int i = 0; i < idPatients.size(); i++) { //перебор массивов и вывод данных построчно
            System.out.print(" ID: " + idPatients.get(i));
            System.out.print(" ФИО: " + patients.get(i));
            System.out.print(" Дата регистрации: " + datePatients.get(i) + "\n");
        }
        return("");
    }

    public static String getDate() { //метод для получения сегодняшней даты в нужном формате
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void changePatients() { //изменение фио пациента
        getPatients();
        System.out.print("Напишите номер пациента по id, фио которого хотите изменить: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()){
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        } else {
            System.out.println("Вы изменяете пациента: " + patients.get(number));
            System.out.print("Напишите новое фио пациента: ");
            String name = s.nextLine();
            name = s.nextLine();
            patients.set(number, name);
        }
    }
}