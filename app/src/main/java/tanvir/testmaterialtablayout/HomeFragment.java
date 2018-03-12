package tanvir.testmaterialtablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    ArrayList<String> data=new ArrayList<>();


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView =  view.findViewById(R.id.recyclerView);


        data.add("abul");
        data.add("abul");
        data.add("abul");
        data.add("abul");
        data.add("abul");
        data.add("abul");
        data.add("abul");
        data.add("abul");
        data.add("abul");data.add("abul");data.add("abul");data.add("abul");
        ///data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");
        ///data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");data.add("abul");


        adapter = new RecyclerAdapter(data);

        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
