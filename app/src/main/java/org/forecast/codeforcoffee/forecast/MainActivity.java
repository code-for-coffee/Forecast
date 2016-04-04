package org.forecast.codeforcoffee.forecast;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    private String[] data = {
            "Fri 4/1 - Sunny - 31/17",
            "Sat 4/2 - Foggy - 21/8",
            "Sun 4/3 - Cloudy - 22/17",
            "Mon 4/4 - Rainy - 18/11",
            "Tues 4/5 - Foggy - 21/10",
            "Wed 4/6 - TRAPPED IN WEATHERSTATION - 23/18",
            "Thurs 4/7 - Sunny - 20/7"
    };
    private List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
    private ArrayAdapter<String> forecastAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forecastAdapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);

        FrameLayout frameLayout = (FrameLayout)findViewById(R.id.primary_framelayout);
        View rootView = getLayoutInflater().inflate(R.layout.activity_main, frameLayout);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);
    }
}
