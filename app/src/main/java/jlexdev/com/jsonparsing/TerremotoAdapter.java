package jlexdev.com.jsonparsing;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JLex on 28/03/18.
 */

public class TerremotoAdapter extends ArrayAdapter<Terremoto> {

    private static final String LOG_TAG = Terremoto.class.getSimpleName();

    /*
     * Este es nuestro propio constructor
     * El context es usado para inflar el archivo layout
     *
     * @param context        El contexto actual, usado para inflar el archivo layout
     * @param objects        Una Lista de objetos Terremoto a mostrar en una lista
     */

    public TerremotoAdapter(@NonNull Context context, @NonNull List<Terremoto> objects) {
        // El segundo argumento es poblado cuando usamos un simple TextView
        // Este es un adaptador personalizado que tiene 3 TextViews,
        // por eso el 2do argumento puede ser cualquier valor, aquí usamos 'cero'
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Verifica si el view existente esta siendo usado, de lo contrario infla la vista
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Obtiene el {@link Terremoto} objeto localizado en esta posición de la lista
        Terremoto actualTerremoto = getItem(position);



        // Encuentra el TextView en el layout list_item.xml con el ID
        TextView tvGrado = listItemView.findViewById(R.id.tv_grado);
        // Obtiene el nombre de la versión del objeto actualTerremoto y lo establece en el TextView
        tvGrado.setText(actualTerremoto.getGrado());

        TextView tvCiudad = listItemView.findViewById(R.id.tv_ciudad);
        tvCiudad.setText(actualTerremoto.getCiudad());

        TextView tvFecha = listItemView.findViewById(R.id.tv_fecha);
        tvFecha.setText(actualTerremoto.getFecha());



    // Retorna el layout de la lista item para que pueda ser mostrado en el ListView
    return listItemView;

    }
}
