package harvey.ggc.edu.tourapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class tours extends ListFragment {


    String tourGuides[] = {"Atlanta's Southern Food Tour", "Walking Dead Big Zombie Tour 1",
            "CNN Atlanta Studio Tour", "Atlanta city tour by electric car",
            "Atlanta Historical Homes Tour"};

    public tours() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View rootView = inflater.inflate(R.layout.fragment_tours, container, false);

        ListAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1);
        setListAdapter(adapter);

       return rootView;


               //inflater.inflate(R.layout.fragment_tours, container, false);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        //super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(), getListView().getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

    }
}
