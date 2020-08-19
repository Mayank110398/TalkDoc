package com.example.mayank.talk_doc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by HP on 22-06-2018.
 */
public class HomeActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5;
    ListView lv;
    FragmentManager manager=null;
    FragmentTransaction transaction=null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        tv1=(TextView)findViewById(R.id.tvGlobal);
        tv2=(TextView)findViewById(R.id.tvCountry);
        tv3=(TextView)findViewById(R.id.tvState);
        tv4=(TextView)findViewById(R.id.tvCity);
        tv5=(TextView)findViewById(R.id.tvFriends);
        lv=(ListView)findViewById(R.id.listView);
        manager=getSupportFragmentManager();
        transaction=manager.beginTransaction();
        transaction.replace(R.id.ll,new GlobalFragment());
        transaction.commit();



    }
}
