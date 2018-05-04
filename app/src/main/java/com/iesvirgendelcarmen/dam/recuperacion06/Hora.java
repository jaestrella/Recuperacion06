package com.iesvirgendelcarmen.dam.recuperacion06;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.format.DateFormat;

import java.util.Calendar;

/**
 * Created by matinal on 04/05/2018.
 */

public class Hora extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return dialogo();
    }

    public TimePickerDialog dialogo(){
        final Calendar c=Calendar.getInstance();
        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(),(TimePickerDialog.OnTimeSetListener)getActivity(),hour,minute,
                DateFormat.is24HourFormat(getActivity()));
    }
}
