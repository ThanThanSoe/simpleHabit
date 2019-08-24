package com.padcmyanmar.padc9.padc9_simplehabit_homework.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.padcmyanmar.padc9.padc9_simplehabit_homework.R;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.EightItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.FirstItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.FiveItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.FourthItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.SecondItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.SevenItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.SixItemViewHolder;
import com.padcmyanmar.padc9.padc9_simplehabit_homework.views.holders.ThirdItemViewHolder;

public class HVAdapter extends RecyclerView.Adapter {

    public static final int VT_FIVE = 0;
    public static final int VT_SIX = 1;
    public static final int VT_SEVEN = 2;
    public static final int VT_EIGHT = 3;
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        int layoutRes;
        switch (viewType) {
            case VT_FIVE:
                layoutRes = R.layout.item_view_five;
                View view = layoutInflater.inflate(layoutRes, parent, false);
                return new FiveItemViewHolder(view);

            case VT_SIX:
                layoutRes = R.layout.item_view_six;
                View viewSix = layoutInflater.inflate(layoutRes, parent, false);
                return new SixItemViewHolder(viewSix);

            case VT_SEVEN:
                layoutRes = R.layout.item_view_seven;
                View viewSeven = layoutInflater.inflate(layoutRes, parent, false);
                return new SevenItemViewHolder(viewSeven);

            case VT_EIGHT:
                layoutRes = R.layout.item_view_eight;
                View viewEight = layoutInflater.inflate(layoutRes, parent, false);
                return new EightItemViewHolder(viewEight);

            default:
                layoutRes = R.layout.item_view_one;
                View defaultView = layoutInflater.inflate(layoutRes, parent, false);
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
            return itemViewType = VT_FIVE;
        else if (position == 1)
            return itemViewType = VT_SIX;
        else if (position == 2)
            return itemViewType = VT_SEVEN;
        return itemViewType;

    }
}
