package com;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Patients extends Actions {

    private static final ArrayList<Integer> idPatients = new ArrayList<>();
    private static final ArrayList<String> datePatients = new ArrayList<>();

    public static void setPatients() { //���������� ���������
        System.out.print("�������� ��� �������� ��� ����������: ");
        String name = s.nextLine();
        getDate();
        patients.add(name);
        int id = patients.size();
        idPatients.add(id - 1);
        datePatients.add(getDate());
        System.out.println("�� �������� ��������: " + name);
    }

    public static void removePatients() { //�������� ���������
        getPatients();
        System.out.print("�������� id ��������, ��� �������� ������ �������: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()) {
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
        System.out.println("�� �������� ��������: " + patients.get(number));
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
        for(int i = number; i < idPatients.size(); i++ ) {
            idPatients.set(i, idPatients.get(i) - 1);
        }
        }
    }

    public static String getPatients() { //����� ������ � ����������
        for(int i = 0; i < idPatients.size(); i++) { //������� �������� � ����� ������ ���������
            System.out.print(" ID: " + idPatients.get(i));
            System.out.print(" ���: " + patients.get(i));
            System.out.print(" ���� �����������: " + datePatients.get(i) + "\n");
        }
        return("");
    }

    public static String getDate() { //����� ��� ��������� ����������� ���� � ������ �������
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void changePatients() { //��������� ��� ��������
        getPatients();
        System.out.print("�������� ����� �������� �� id, ��� �������� ������ ��������: ");
        int number = s.nextInt();
        if(number + 1 > idPatients.size()){
            System.out.println("�� ����� ������������ id, �������� ��� � ��������, ���������� ��� ���");
        } else {
            System.out.println("�� ��������� ��������: " + patients.get(number));
            System.out.print("�������� ����� ��� ��������: ");
            String name = s.nextLine();
            name = s.nextLine();
            patients.set(number, name);
        }
    }
}