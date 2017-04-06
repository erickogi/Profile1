package com.erickogi14gmail.class1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button _btnHide,_btnShow;
    TextView _txtName,_txtAdmNo,_txtSchool,_txtDepartment,_txtYear,_txtSemister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _txtName=(TextView)findViewById(R.id.txt_name);
        _txtAdmNo=(TextView)findViewById(R.id.txt_adm_no);
        _txtSchool=(TextView)findViewById(R.id.txt_schoool);
        _txtDepartment=(TextView)findViewById(R.id.txt_department);
        _txtYear=(TextView)findViewById(R.id.txt_year);
        _txtSemister=(TextView)findViewById(R.id.txt_semister);


        _btnHide=(Button)findViewById(R.id.btn_hide);
        _btnShow=(Button)findViewById(R.id.btn_show);


          _btnShow.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                 show();
              }
          });
        _btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hide();
            }
        });

    }
    void show(){
        _txtName.setText("JOHN MARK");
        _txtAdmNo.setText("1S/11/15");
        _txtSchool.setText("INFORMATION SCIENCE");
        _txtDepartment.setText("IT");
        _txtYear.setText("3");
        _txtSemister.setText("2");
    }
    void hide(){
        _txtName.setText("");
        _txtAdmNo.setText("");
        _txtSchool.setText("");
        _txtDepartment.setText("");
        _txtYear.setText("");
        _txtSemister.setText("");
    }
}
