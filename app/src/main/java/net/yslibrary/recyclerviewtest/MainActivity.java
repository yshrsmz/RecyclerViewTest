package net.yslibrary.recyclerviewtest;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView list;

    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findById(R.id.toolbar);
        setSupportActionBar(toolbar);

        list = findById(R.id.list);

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,
                false);
        list.setLayoutManager(manager);
        list.setHasFixedSize(false);

        adapter = new MainAdapter();
        adapter.setDataSet(getDataSet());
        list.setAdapter(adapter);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private <T> T findById(@IdRes int resId) {
        return (T) findViewById(resId);
    }

    private List<String> getDataSet() {
        return new ArrayList<String>() {
            {
                add("a");
                add("b");
                add("c");
                add("d");
                add("e");
                add("f");
                add("g");
                add("h");
                add("i");
                add("j");
                add("k");
                add("l");
                add("m");
                add("n");
                add("o");
                add("p");
                add("q");
                add("r");
                add("s");
                add("t");
                add("u");
                add("v");
                add("w");
                add("x");
                add("y");
                add("z");
            }
        };
    }
}
