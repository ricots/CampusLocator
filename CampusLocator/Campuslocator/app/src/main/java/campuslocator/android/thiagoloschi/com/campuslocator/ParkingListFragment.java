package campuslocator.android.thiagoloschi.com.campuslocator;


import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

import java.io.Serializable;

public class ParkingListFragment extends ListFragment implements OnItemClickListener {
    Context context;
    LocationLab ll = new LocationLab();
    Location[] local = ll.getLocations(3);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        context = view.getContext();
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Parking, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);

        getListView().setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
        Intent i = new Intent(context, MapsActivity.class);
        switch (position){
            case 0:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 1:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 2:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 3:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 4:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 5:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 6:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 7:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 8:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 9:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 10:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 11:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 12:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 13:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 14:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
            case 15:
                i.putExtra("local", (Serializable) local[position]);
                startActivity(i);
                break;
        }
    }
}