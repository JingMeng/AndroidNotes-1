package com.wildma.androidnotes.base;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;


/**
 * Author   wildma
 * Date     2019/04/16
 * Desc     ${Activity鍩虹被}
 */
public abstract class BaseActivity extends AppCompatActivity {

    public final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayoutId());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initView();
        initPresenter();
    }

    /**
     * 鍒濆鍖栧竷灞€
     */
    protected abstract int initLayoutId();

    /**
     * 鍒濆鍖朧iew
     */
    protected abstract void initView();

    /**
     * 鍒濆鍖栦笟鍔￠€昏緫
     */
    protected abstract void initPresenter();

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setTitle(@StringRes int resId) {
        getSupportActionBar().setTitle(resId);
    }

    public void setTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

}

