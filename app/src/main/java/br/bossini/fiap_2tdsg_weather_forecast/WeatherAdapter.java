package br.bossini.fiap_2tdsg_weather_forecast;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ArrayAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAdapter extends ArrayAdapter <Weather> {
    private Map <String, Bitmap> figuras =
            new HashMap<>();
    public WeatherAdapter (Context context, List<Weather> previsoes){
        super(context, -1, previsoes);
    }
}

