package tanvir.testmaterialtablayout;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by USER on 01-Feb-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<tanvir.testmaterialtablayout.RecyclerAdapter.RecyclerViewHolder> {


    ///String[] title,dateAndTime;

    ArrayList<String> data = new ArrayList<String>();





    public RecyclerAdapter(ArrayList data)
    {
        this.data= data;


    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_to_inflate_in_recyclerview,parent,false);

        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);


        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.textView1.setText(data.get(position));



    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public  static  class  RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView1;


        public RecyclerViewHolder(View view)
        {
            super(view);

            textView1 = (TextView) view.findViewById(R.id.noteTitle);



        }
    }

}
