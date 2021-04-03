package com.example.weatherapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.example.WeatherApp.R;

public class WeatherFragment extends Fragment {
    Typeface weatherFont;

     TextView cityField;
     TextView weatherIcon;
     TextView updatedField;
     TextView currentTemperatureField;
     TextView detailsField;

    Handler handler;

    public WeatherFragment(){
        handler = new Handler();
    }

    public View inflate(@LayoutRes int resource, @Nullable ViewGroup root, boolean attachToRoot)

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_weather, container, false);

        updatedField = (TextView)rootView.findViewById(R.id.updated_field);
        cityField = (TextView)rootView.findViewById(R.id.city_field);
        currentTemperatureField = (TextView)rootView.findViewById(R.id.current_temperature_field);
        weatherIcon = (TextView)rootView.findViewById(R.id.weather_icon);
        detailsField = (TextView)rootView.findViewById(R.id.details_field);


        return rootView;
    }
}

    public void changeCity(String city){
        updateWeatherData(city);
    }


