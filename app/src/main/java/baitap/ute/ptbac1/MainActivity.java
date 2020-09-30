package baitap.ute.ptbac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   Button btn;
    EditText txta,txtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.Kqua);
        txta=(EditText) findViewById(R.id.txta);
        txtb=(EditText) findViewById(R.id.txtb);

    }
    public void kqua(View view) {
        Bundle bundle=new Bundle();
        int a=Integer.parseInt(txta.getText().toString());
        int b=Integer.parseInt(txtb.getText().toString());
        //đưa dữ liệu riêng lẻ vào Bundle
        bundle.putInt("soa", a);
        bundle.putInt("sob", b);
        Intent myintent = new Intent(MainActivity.this, Result.class);
        myintent.putExtra("MyPackage", bundle);
        startActivity(myintent);

    }

}

