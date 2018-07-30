package com.example.hencoderpracticedraw1;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.hencoderpracticedraw1.DrawFragment.BingFrgment;
import com.example.hencoderpracticedraw1.DrawFragment.CircleFrgment;
import com.example.hencoderpracticedraw1.DrawFragment.ColorFrgment;
import com.example.hencoderpracticedraw1.DrawFragment.Test2Frgment;
import com.example.hencoderpracticedraw1.DrawFragment.TestFrgment;
import com.example.hencoderpracticedraw1.DrawFragment.ZhiFangFrgment;

import java.util.ArrayList;
import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHoder> {
    private List<String> mlist=new ArrayList();
    private MainActivity mcontext;
    private boolean isIconChange = true;

    public RecycleAdapter(List<String> list, MainActivity context) {
        mlist=list;
        mcontext=context;
    }
    static class ViewHoder extends RecyclerView.ViewHolder {
        private Button button;
        public ViewHoder(View itemView) {
            super(itemView);
            button=itemView.findViewById(R.id.text_button);

        }
    }

    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.text_item,parent,false);
        final ViewHoder holder=new ViewHoder(view);
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<parent.getChildCount();i++){
                    View view1=parent.getChildAt(i);
                    view1.findViewById(R.id.text_button).setBackgroundResource(R.drawable.button_bg);
                }
                holder.button.setBackgroundResource(R.drawable.unbutton_bg);
                switch (holder.button.getText().toString()){
                    case "Test":getFragment(new TestFrgment());break;
                    case "Test2":getFragment(new Test2Frgment());break;
                    case "drawColor":getFragment(new ColorFrgment());break;
                    case "drawCircle":getFragment(new CircleFrgment());break;
                    case "直方图":getFragment(new ZhiFangFrgment());break;
                    case "饼图":getFragment(new BingFrgment());break;
                    default:break;
                }
            }
        });

        return holder;
    }
    private void getFragment(Fragment fragment){
        FragmentManager manager=mcontext.getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.frame_layout,fragment);
        transaction.commit();
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHoder holder, int position) {
        String name=mlist.get(position);
        holder.button.setText(name);


    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }


}
