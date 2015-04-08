package br.com.rsa.folioreader.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import br.com.rsa.folioreader.FolioReaderViewPager;
import br.com.rsa.folioreader.R;
import br.com.rsa.folioreader.adapter.FolioReaderAdapter;

public class FolioReaderActivity extends ActionBarActivity {

    private FolioReaderViewPager pager;
    private FolioReaderAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folio_reader);

        pager = (FolioReaderViewPager) findViewById(R.id.pager);
        adapter = new FolioReaderAdapter(getSupportFragmentManager(), 5);
        pager.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_folio_reader, menu);
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
}