package com.example.administrator.myapplication;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.app.FragmentManager;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.example.administrator.myapplication.fragment.FindFragment;
import com.example.administrator.myapplication.fragment.SetFragment;
import com.example.administrator.myapplication.fragment.TxlFragment;
import com.example.administrator.myapplication.fragment.WxFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private LinearLayout lwx, lfind, lset, ltxl;
    private Fragment tab_wx, tab_txl, tab_find, tab_set;
    private ImageButton imgwx, imgtxl, imgfind, imgset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setContentView(R.layout.main);
        initView();
        lwx.setOnClickListener(this);
        ltxl.setOnClickListener(this);
        lfind.setOnClickListener(this);
        lset.setOnClickListener(this);
        imgwx.setOnClickListener(this);
        imgtxl.setOnClickListener(this);
        imgfind.setOnClickListener(this);
        imgset.setOnClickListener(this);
    }

    void initView() {
        lwx = (LinearLayout) this.findViewById(R.id.lwx);
        lfind = (LinearLayout) this.findViewById(R.id.lfind);
        ltxl = (LinearLayout) this.findViewById(R.id.ltxl);
        lset = (LinearLayout) this.findViewById(R.id.lset);

        imgwx = (ImageButton) this.findViewById(R.id.imgwx);
        imgtxl = (ImageButton) this.findViewById(R.id.imgtxl);
        imgfind = (ImageButton) this.findViewById(R.id.imgfind);
        imgset = (ImageButton) this.findViewById(R.id.imgset);

    }


    @Override
    public void onClick(View view) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        imgwx.setImageResource(R.mipmap.wxmsg);
        imgtxl.setImageResource(R.mipmap.wxall);
        imgfind.setImageResource(R.mipmap.wxfind);
        imgset.setImageResource(R.mipmap.wxset);
        switch (view.getId()) {
            case R.id.lwx:
                tab_wx=new WxFragment();
                transaction.replace(R.id.flontent, tab_wx);
                imgwx.setImageResource(R.mipmap.bwxmsg);
                break;
            case R.id.ltxl:
                tab_txl=new TxlFragment();
                transaction.replace(R.id.flontent, tab_txl);
                imgtxl.setImageResource(R.mipmap.bwxall);
                break;
            case R.id.lfind:
                tab_find=new FindFragment();
                transaction.replace(R.id.flontent, tab_find);
                imgfind.setImageResource(R.mipmap.bwxfind);
                break;
            case R.id.lset:
                tab_set=new SetFragment();
                transaction.replace(R.id.flontent, tab_set);
                imgset.setImageResource(R.mipmap.bwxset);
                break;
            case R.id.imgwx:
                tab_wx=new WxFragment();
                transaction.replace(R.id.flontent, tab_wx);
                imgwx.setImageResource(R.mipmap.bwxmsg);
                break;
            case R.id.imgtxl:
                tab_txl=new TxlFragment();
                transaction.replace(R.id.flontent, tab_txl);
                imgtxl.setImageResource(R.mipmap.bwxall);
                break;
            case R.id.imgfind:
                tab_find=new FindFragment();
                transaction.replace(R.id.flontent, tab_find);
                imgfind.setImageResource(R.mipmap.bwxfind);
                break;
            case R.id.imgset:
                tab_set=new SetFragment();
                transaction.replace(R.id.flontent, tab_set);
                imgset.setImageResource(R.mipmap.bwxset);
                break;
        }
        transaction.commit();
    }
}
