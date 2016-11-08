package com.example.khinthirisoe.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        String[] mForecastWeather = {
                "0",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
        };

        ListView listView = (ListView) view.findViewById(R.id.listview_forecast);
        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, mForecastWeather);
        listView.setAdapter(mForecastAdapter);

        return view;

    }
}
