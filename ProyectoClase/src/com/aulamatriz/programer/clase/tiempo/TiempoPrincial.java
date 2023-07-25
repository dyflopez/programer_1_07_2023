package com.aulamatriz.programer.clase.tiempo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TiempoPrincial {

    public static void main(String[] args) {
        ZoneId zonaHoraria  = ZoneId.of("Australia/Currie");
        LocalDateTime horaAustralia = LocalDateTime.now(zonaHoraria);
        System.out.println("la hora es "+ horaAustralia);


        LocalDate date = horaAustralia.toLocalDate();

        date=date.plusDays(-1);

        System.out.println(date);

        date=date.minusDays(-1);
        System.out.println(date);

        LocalDate fecha = LocalDate.of(2023, Month.AUGUST,1);

        //Comparacion de las fechas
        LocalDate date1 = LocalDate.of(2023,Month.JULY,24);
        LocalDate date2 = LocalDate.of(2023,Month.JULY,25);

        boolean esIgual = date1.equals(date2);
        boolean antes =  date1.isBefore(date2);
        boolean despues =  date1.isAfter(date2);


        var difereciaDias = date1.until(date2, ChronoUnit.DAYS);

        System.out.println(difereciaDias);
        date= date.plusYears(20);
        LocalDate primerDiaMes = date.with(TemporalAdjusters.lastDayOfYear());

        System.out.println(primerDiaMes.getEra());



    }
}
