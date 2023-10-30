package com.pluralsight.memento;

import java.io.*;

public class MementoEveryDayDemo {

    private static EmployeeSer deserialize() {
        EmployeeSer emp = null;
        try {
            FileInputStream fileIn = new FileInputStream("tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (EmployeeSer) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return emp;
    }

    private static void serialize(EmployeeSer emp) {
        try {
            //serialized object is the memento
            FileOutputStream fileOut = new FileOutputStream(".\\tmp\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        EmployeeSer emp = new EmployeeSer();
        emp.setName("Bryan Hanson");
        emp.setAddress("11 E Code Street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        EmployeeSer newEmp = deserialize();

        System.out.println(newEmp.getName());
    }
}
