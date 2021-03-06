package fyi.jackson.drew.gettingthingsdone.recycler.holders;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import fyi.jackson.drew.gettingthingsdone.R;
import fyi.jackson.drew.gettingthingsdone.recycler.helpers.ItemTouchHelperViewHolder;

public abstract class TaskViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder {

    public View itemView;
    public CheckBox cbTask;
    public TextView tvTaskName;
    public ImageView ivReorder;

    public TaskViewHolder(View v) {
        super(v);
        itemView = v;
        cbTask = v.findViewById(R.id.cb_task_status);
        tvTaskName = v.findViewById(R.id.tv_task_name);
        ivReorder = v.findViewById(R.id.iv_reorder);
    }

    @Override
    public void onItemClear() {
        itemView.setBackgroundColor(0);
    }
}
