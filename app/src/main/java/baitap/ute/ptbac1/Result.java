package baitap.ute.ptbac1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Result extends AppCompatActivity {
    Button btnback;
    TextView txtketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resut);
        btnback = findViewById(R.id.Back);
        txtketqua=(TextView) findViewById(R.id.txtkq);
        //lấy intent gọi Activity này
        Intent callerIntent=getIntent();
        //có intent rồi thì lấy Bundle dựa vào MyPackage
        Bundle packageFromCaller=
                callerIntent.getBundleExtra("MyPackage");
        //Có Bundle rồi thì lấy các thông số dựa vào soa, sob
        int a=packageFromCaller.getInt("soa");
        int b=packageFromCaller.getInt("sob");
        //tiến hành xử lý
        giaipt(a, b);
    }
    public void gotoback(View view) {
        Intent back = new Intent(Result.this, MainActivity.class);
        startActivity(back);
    }
    public void giaipt(int a,int b)
    {
        String kq="";
        if(a==0 && b==0)
        {
            kq="Vô số nghiệm";
        }
        else if(a==0 && b!=0)
        {
            kq="Vô nghiệm";
        }
        else
        {
            DecimalFormat dcf=new DecimalFormat("0.##");
            kq=dcf.format(-b*1.0/a);
        }
        txtketqua.setText(kq);
    }

}