package com;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Appointment extends Actions {

    private static final ArrayList<String> appointmentDoctors = new ArrayList<>();
    private static final ArrayList<String> appointmentPatients = new ArrayList<>();
    private static final ArrayList<String> time = new ArrayList<>();
    private static final ArrayList<String> status = new ArrayList<>();

    public static void setAppointments() {
        System.out.println("Список зарегестрированных пациентов: ");
        System.out.println(Patients.getPatients());
        System.out.print("Введите id пациента для записи: ");
        int number = s.nextInt();
        System.out.println("Список докторов: " + Doctors.getDoctors());
        System.out.print("Введите id доктора для записи: ");
        int id = s.nextInt();
        System.out.print("Введите время записи на прием в формате \"dd-MM HH:mm\": ");
        String timeDate = s.nextLine();
        timeDate = s.nextLine();
        if (number + 1 > patients.size()) {
            System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
        }else if (id + 1 > doctors.size()) {
                System.out.println("Вы ввели неправильный id, которого нет в таблицах, попробуйте еще раз");
            } else {
                appointmentPatients.add(Patients.patients.get(number));
                appointmentDoctors.add(Doctors.doctors.get(id));
                time.add(timeDate);
                status.add("Новый");
            }
        }

    public static void getAppointments() {
        if(appointmentDoctors.isEmpty()){
            System.out.println("Таблица пустая, сначала добавьте данные в таблицу");
        } else {
        for(int i = 0; i < appointmentPatients.size(); i++) {
            System.out.print("Пациент: " + appointmentPatients.get(i));
            System.out.print("Доктор: " + appointmentDoctors.get(i));
            System.out.print("Время приема: " + time.get(i));
            System.out.print("Статус приема: " + status.get(i) + "\n");
        }
        }
    }
}