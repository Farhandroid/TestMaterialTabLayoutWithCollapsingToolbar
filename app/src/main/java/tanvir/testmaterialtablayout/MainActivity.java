package tanvir.testmaterialtablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar,toolbar2,toolbar3;

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  findViewById(R.id.tolbarlayoutinmainactivity);
        toolbar2=findViewById(R.id.tolbarlayout2inmainactivity);
        toolbar3=findViewById(R.id.tolbarlayout3inmainactivity);
        setSupportActionBar(toolbar);

        tabLayout=findViewById(R.id.tabLayout);
        viewPager=findViewById(R.id.viewPager);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragments(new HomeFragment(),"Home");
        viewPagerAdapter.addFragments(new TopBlankFragment(),"Blank");
        viewPagerAdapter.addFragments(new TopFreeFragment(),"Free");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {


            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {


                if (position==1)
                {
                   //// getSupportActionBar().hide();
                    ///toolbar.setVisibility(View.GONE);
                    toolbar.setVisibility(View.GONE);
                    toolbar3.setVisibility(View.GONE);
                    toolbar2.setVisibility(View.VISIBLE);
                    ///setSupportActionBar(toolbar2);

                    ////Toast.makeText(MainActivity.this, "Blank", Toast.LENGTH_SHORT).show();
                }
                else if (position==2)
                {
                    ///getSupportActionBar().hide();
                    toolbar.setVisibility(View.GONE);
                    toolbar2.setVisibility(View.GONE);
                    toolbar3.setVisibility(View.VISIBLE);
                    ///Toast.makeText(MainActivity.this, "Frdd", Toast.LENGTH_SHORT).show();
                }


                else
                {
                    ////getSupportActionBar().hide();
                    toolbar2.setVisibility(View.GONE);
                    toolbar3.setVisibility(View.GONE);
                    toolbar.setVisibility(View.VISIBLE);
                    ///Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                }
                    ///

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }


        });

    }
}
