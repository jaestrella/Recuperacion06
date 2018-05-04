package com.iesvirgendelcarmen.dam.recuperacion06;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.TimePicker;

/**
 * Created by matinal on 27/04/2018.
 */

public class Completa extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.completa);
        if(savedInstanceState==null){
            dialogo();
        }
    }

    private void dialogo(){
        FragmentManager fragmentManager=getSupportFragmentManager();
        Dialogo newFragment=new Dialogo();

        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.add(android.R.id.content,newFragment,"COMPLETA").commit();

    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Dialogo fragment=(Dialogo)getSupportFragmentManager().findFragmentByTag("COMPLETA");
        if (fragment !=null){
            fragment.setDateView(year,month,dayOfMonth);
        }
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        Dialogo fragment=(Dialogo)getSupportFragmentManager().findFragmentByTag("COMPLETA");
        if (fragment !=null){
            fragment.setTimeView(hourOfDay,minute);
        }
    }
}
