package com.test;


import java.util.*;

public class AppointmentManager {
    private List<String> appointments = new ArrayList<>();

    // Add appointment
    public void addAppointment(String name) {
        if (!appointments.contains(name)) {
            appointments.add(name);
            System.out.println("Appointment added for: " + name);
        } else {
            System.out.println("Appointment already exists for: " + name);
        }
    }

    // Cancel appointment
    public void cancelAppointment(String name) {
        if (appointments.contains(name)) {
            appointments.remove(name);
            System.out.println("Appointment cancelled for: " + name);
        } else {
            System.out.println("No appointment found for: " + name);
        }
    }

    // View all appointments
    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            System.out.println("Appointments:");
            for (String name : appointments) {
                System.out.println("- " + name);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        AppointmentManager manager = new AppointmentManager();

        manager.addAppointment("Ravi");
        manager.addAppointment("Priya");
        manager.addAppointment("Ravi"); // Duplicate test

        manager.viewAppointments();

        manager.cancelAppointment("Priya");
        manager.cancelAppointment("Arun"); // Non-existing

        manager.viewAppointments();
    }
}

