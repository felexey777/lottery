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

public class MainActivity extends AppCompatActivity {
    ArrayList arrayList;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         arrayList = new ArrayList();
        for(int i = 1; i < 43; i++){
            //  treeMap.put(i,i);
            arrayList.add(i);}


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);
            return true;
        }else if(id ==R.id.netlottery){
            Intent intent = new Intent(MainActivity.this, netlottery.class);
            startActivity(intent);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
    public void onclick(View view) {
        count++;
        if(count>42){
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
        Random  random = new Random();
        int size = arrayList.size();
        int ball = random.nextInt(size);
      int a = (int)arrayList.get(ball);
        arrayList.remove(ball);
        int but = R.id.a1 -1 + a;
        Button button ;
        if(view.getId()==but){
           button = (Button)findViewById(but);
            button.setBackgroundColor(Color.GREEN);
        }else{
        button = (Button)findViewById(but);
        button.setBackgroundColor(Color.RED);
        TextView text = (TextView) findViewById(R.id.t1);
        text.setText(button.getText().toString());
        }}


    }
}
