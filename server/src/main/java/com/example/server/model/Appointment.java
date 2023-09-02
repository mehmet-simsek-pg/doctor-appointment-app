package com.example.server.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "day")
    private Date day;

    @Column(name = "consulted")
    private boolean consulted;

    @Column(name = "doctor_name")
    private String doctorName;

    public Appointment() {

    }

    public Appointment(String patientName, Date day, boolean consulted, String doctorName) {
        this.patientName = patientName;
        this.day = day;
        this.consulted = consulted;
        this.doctorName = doctorName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public boolean isConsulted() {
        return consulted;
    }

    public void setConsulted(boolean consulted) {
        this.consulted = consulted;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
}
