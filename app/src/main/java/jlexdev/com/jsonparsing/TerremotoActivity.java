package jlexdev.com.jsonparsing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TerremotoActivity extends AppCompatActivity {

    public static final String LOG_TAG = TerremotoActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terremoto);

        /* Esto es cuando uso un ListView simple

        // Create a fake list of earthquake locations.
        ArrayList<String> terremotos = new ArrayList<>();
        terremotos.add("San Francisco");
        terremotos.add("London");
        terremotos.add("Tokyo");
        terremotos.add("Mexico City");
        terremotos.add("Moscow");
        terremotos.add("Rio de Janeiro");
        terremotos.add("Paris");

        // Create a new {@link ArrayAdapter} of earthquakes
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, terremotos);
        */



        // Creo un ArrayList de objetos {@link Terremoto}
        ArrayList<Terremoto> terremotos = new ArrayList<>();
        terremotos.add(new Terremoto("2.9", "New York", "Dic 13, 2016"));
        terremotos.add(new Terremoto("5.4", "Tokio", "Feb 26, 2017"));
        terremotos.add(new Terremoto("6.4", "París", "Mar 26, 2017"));
        terremotos.add(new Terremoto("7.0", "London", "Mar 30, 2017"));
        terremotos.add(new Terremoto("2.4", "Moscow", "Jun 15, 2017"));
        terremotos.add(new Terremoto("3.6", "París", "Jul 06, 2017"));
        terremotos.add(new Terremoto("1.8", "Río de Janeiro", "Aug 01, 2017"));
        terremotos.add(new Terremoto("4.4", "Lima", "Set 10, 2017"));
        terremotos.add(new Terremoto("5.0", "Chiclayo", "Oct 07, 2017"));
        terremotos.add(new Terremoto("0.4", "Roma", "Nov 26, 2017"));
        terremotos.add(new Terremoto("3.1", "Madrid", "Dic 25, 2017"));


        // Creo un {@link TerremotoAdapter}, cuya fuente de datos es una lista de
        // {@link Terremoto}s. El adaptador sabe como crear la lista de item views
        // para cada item en la lista
        TerremotoAdapter terremotoAdapter = new TerremotoAdapter(this, terremotos);


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(terremotoAdapter);
    }
}
