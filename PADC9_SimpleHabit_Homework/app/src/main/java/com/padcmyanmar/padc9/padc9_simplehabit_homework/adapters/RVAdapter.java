package com.padcmyanmar.padc9.padc9_simplehabit_homework.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.padc9_simplehabit_homework.R;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.FirstItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.FourthItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.SecondItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.ThirdItemViewHolder;

public class RVAdapter extends RecyclerView.Adapter {

    public static final int VT_FIRST = 0;
    public static final int VT_SECOND = 1;
    public static final int VT_THIRD = 2;
    public static final int VT_FOUR = 3;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        int layoutRes;
        switch (viewType){
            case VT_FIRST:
                layoutRes = R.layout.item_view_one;
                View view = layoutInflater.inflate(layoutRes,parent,false);
                return new FirstItemViewHolder(view);

            case VT_SECOND:
                layoutRes = R.layout.item_view_two;
                View viewTwo = layoutInflater.inflate(layoutRes,parent,false);
                return new SecondItemViewHolder(viewTwo);

            case VT_THIRD:
                layoutRes = R.layout.item_view_three;
                View viewThree = layoutInflater.inflate(layoutRes,parent,false);
                return new ThirdItemViewHolder(viewThree);

            case VT_FOUR:
                layoutRes = R.layout.item_view_four;
                View viewFour = layoutInflater.inflate(layoutRes,parent,false);
                return new FourthItemViewHolder(viewFour);

                default:
                    layoutRes = R.layout.item_view_one;
                    View defaultView = layoutInflater.inflate(layoutRes,parent,false);
                    return new FirstItemViewHolder(defaultView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    @Override
    public int getItemViewType(int position) {
        int itemViewType = 3;
        if(position == 0)
            return itemViewType = VT_FIRST;
        else if (position == 1)
            return itemViewType = VT_SECOND;
        else if (position == 2)
            return itemViewType = VT_THIRD;
        return itemViewType;

    }
}
