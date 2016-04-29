package com.xiaolongonly.customedit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CustomEditText customEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customEditText= (CustomEditText) findViewById(R.id.edit_text);
//        customEditText.initEditText();
//        customEditText.setCompoundDrawablePadding(10);
//        Drawable drawable = this.getDrawable(R.mipmap.ic_shut_down);
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_shut_down);
//            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
//        customEditText.setCompoundDrawables(null,null,bitmapDrawable,null );
//        customEditText.setEditTextDrawable();
    }
}
