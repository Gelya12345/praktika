package com;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Actions {

    protected static final ArrayList<String> patients = new ArrayList<>();
    protected static final ArrayList<String> doctors = new ArrayList<>();
    protected static Scanner s = new Scanner(System.in);

     public Actions() {
         System.out.println("Напишите help для открытия команд");
         setCommand();
     }

     public void setCommand() {
         System.out.print("Напишите команду: ");
         String command = s.nextLine();

             switch (command) {
                 case ("help"): // вызов списка команд
                     helpList();
                     setCommand();
                     break;

                 case ("1"): //добавление пациента
                     Patients.setPatients();
                     setCommand();
                     break;

                 case ("2"): //вывод списка пациентов
                     Patients.getPatients();
                     setCommand();
                     break;

                 case ("3"): //удаление пациента
                     Patients.removePatients();
                     setCommand();
                     break;

                 case ("4"): //смена фио пациента
                     Patients.changePatients();
                     setCommand();
                     break;

                 case ("6"): //добавление доктора
                     Doctors.setDoctors();
                     setCommand();
                     break;

                 case ("5"): //вывод списка докторов
                     Doctors.getDoctors();
                     setCommand();
                     break;

                 case ("7"): //изменение фио доктора
                     Doctors.changeDoctors();
                     setCommand();
                     break;

                 case ("8"): //удаление фио доктора
                     Doctors.removeDoctors();
                     setCommand();
                     break;

                 case ("9"): //добавление приема
                     Appointment.setAppointments();
                     setCommand();
                     break;

                 case ("10"): //вывод списка приемов
                     Appointment.getAppointments();
                     setCommand();
                     break;

                 case ("exit"):
                     System.out.println("Exiting program...");
                     System.exit(0);
                     break;

                 default:
                     System.out.println("Вы ввели неправильную команду");
                     setCommand();
             }
     }

     public void helpList() {
         System.out.println("Добавление нового пациента: 1");
         System.out.println("Вывод списка пациентов: 2");
         System.out.println("Удаление пациентов: 3");
         System.out.println("Смена фио пациентов: 4");
         System.out.println("Вывод списка докторов: 5");
         System.out.println("Добавление нового доктора: 6");
         System.out.println("Изменение фио докторов: 7");
         System.out.println("Удаления докторов: 8");
         System.out.println("Добавления приема: 9");
         System.out.println("Вывод списка приемов: 10");
         System.out.println("Закончить работу: exit");
     }

     public void setDate() {
         DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
         Date date = new Date();
         System.out.println(dateFormat.format(date));
     }
}