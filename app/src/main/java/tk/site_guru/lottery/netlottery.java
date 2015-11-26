package tk.site_guru.lottery;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class netlottery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netlottery);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_netlottery, menu);
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
            Intent intent = new Intent(netlottery.this, Main2Activity.class);
            startActivity(intent);
            return true;
        }else if(id ==R.id.action_settings4){
            Intent intent = new Intent(netlottery.this, MainActivity.class);
            startActivity(intent);
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick2(View view) {

        asintask asintask = new asintask();
        asintask.execute();

    }

    public void onclick(View view) {
    }

    public class asintask extends AsyncTask {
        @Override
        protected Object doInBackground(Object[] params) {
            Document doc = null;
            try {
                doc = Jsoup.connect("http://msl.ua/ru/megalot").get();
            } catch (IOException e) {
                // TODO Auto-generated catch block
               e.printStackTrace();
           }
           String title = doc.outerHtml();
            return title;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            String title = o.toString();
            TextView tvInfo = (TextView)findViewById(R.id.t1);
            tvInfo.setText(title);

        }
    }

}
