package tk.site_guru.lottery;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class Main2Activity extends AppCompatActivity {
    ArrayList arrayList;
    ArrayList arrayList6;
    int count = 0;
    int a1;
    int a2;
    int a3;
    int a4;
    int a5;
    int a6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        arrayList = new ArrayList();
        arrayList6 = new ArrayList();
        for(int i = 1; i < 43; i++){
            //  treeMap.put(i,i);
            arrayList.add(i);}

        Random random = new Random();

        for(int i = 0; i <6; i++){
        int number = random.nextInt(arrayList.size());
        arrayList6.add(arrayList.get(number));
        arrayList.remove(number);}
        int count = 0;
        a1= R.id.a1 -1 + (int)arrayList6.get(0);
        a2= R.id.a1 -1 + (int)arrayList6.get(1);
        a3=R.id.a1 -1 + (int)arrayList6.get(2);
        a4=R.id.a1 -1 + (int)arrayList6.get(3);
        a5=R.id.a1 -1 + (int)arrayList6.get(4);
        a6=R.id.a1 -1 + (int)arrayList6.get(5);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);
            return true;
        }else if(id ==R.id.netlottery){
            Intent intent = new Intent(Main2Activity.this, netlottery.class);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
    public void onclick(View view) {
        count++;
        if(count==7){
            onClick2(view);
            TextView text = (TextView) findViewById(R.id.t1);
            text.setText("" + count);

        }else if(count ==8){
            Intent intent = new Intent(Main2Activity.this, Main2Activity.class);
            startActivity(intent);
        }
        else{
            Button button ;

            int identy = view.getId();
            if(identy == a1 | identy == a2 | identy == a3 | identy==a4 | identy ==a5 | identy ==a6){


                button = (Button)findViewById(identy);
                button.setBackgroundColor(Color.GREEN);
                TextView text = (TextView) findViewById(R.id.t1);
                text.setText("" + count);}
            else{
                button = (Button)findViewById(identy);
                button.setBackgroundColor(Color.RED);
                TextView text = (TextView) findViewById(R.id.t1);
                text.setText("" +count);
            }}


    }

    public void onClick2(View view) {
        Button button;
        button = (Button)findViewById(a1);
        button.setBackgroundColor(Color.GREEN);
        button = (Button)findViewById(a2);
        button.setBackgroundColor(Color.GREEN);
        button = (Button)findViewById(a3);
        button.setBackgroundColor(Color.GREEN);
        button = (Button)findViewById(a4);
        button.setBackgroundColor(Color.GREEN);
        button = (Button)findViewById(a5);
        button.setBackgroundColor(Color.GREEN);
        button = (Button)findViewById(a6);
        button.setBackgroundColor(Color.GREEN);
    }
}
