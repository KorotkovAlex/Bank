package brain.parsingtest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    String title = "";
    Document doc = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.textView1);

        Thread downloadThread = new Thread() {
            @Override
            public void run() {
                try {
                    doc = Jsoup.connect("http://www.fin33.ru/").get();
                    title += doc.title();
                    Elements elements = doc.select("a[href=/banks/?type=bank&id=55]");// Имя банка
                    Elements elements1 = doc.select("span");// Дата
                    Elements elements2 = doc.select("td.normal.none.rate_up");//Цена
                    Elements elements3 = doc.select("td.normal.none.rate_up");//Цена
                    Log.d("doc.title()","" + elements.first().text());
                    Log.d("doc.title()","" + elements1.first().text());
                    Log.d("doc.title()","" + elements2.first().text());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //textView1.setText(doc.title());
            }
        };

        downloadThread.start();
    }
}
