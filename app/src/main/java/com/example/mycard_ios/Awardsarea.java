package com.example.mycard_ios;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mycard_ios.Fragment.Awardsarea_Select;
import com.example.mycard_ios.Fragment.CheckPrizeCollectionRecord;
import com.example.mycard_ios.Fragment.RewardList;
import com.example.mycard_ios.Fragment.home;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Awardsarea extends AppCompatActivity {
    private Fragment Awardsarea_Select = null;
//    public String[][] data = {
//            {"填寫會員資料"+"/n"+"進入會員專區填寫會員資料, 完成即可獲得會員點數5點"},
//            {"新會員註冊禮","只要您是尚未註冊過的新會員, 完成後即可獲得60元酷碰券。"},
//            {"觀看新聞抽iPhone12！","於活動期間, 觀看新聞50篇即可獲得抽獎機會。"}
//    };

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new home()).commit();
                    return true;
                case R.id.label:  //我上一篇的menu裡面設的id
                    getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new CheckPrizeCollectionRecord()).commit();  //切換fragment
                    return true;
                case R.id.gift:
                    getSupportFragmentManager();
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment viewPager = new Awardsarea_Select ();
                    ft.add(R.id.frameLayout,viewPager);
                    ft.commit();
                    return true;
            }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awardsarea);
        Awardsarea_Select = new Fragment();
        setMain();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
    private void setMain() {  //這個副程式用來設置顯示剛進來的第一個主畫面

        this.getSupportFragmentManager().beginTransaction().add(R.id.frameLayout, new Awardsarea_Select()).commit();
    }

}