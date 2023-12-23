package com.example.pendudukapps;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editTextNama, editNik, editKodeDesa, editTextNamaDesa, editTextAlamat;
    RadioGroup radioGroup;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNama = findViewById(R.id.etnm);
        editNik = findViewById(R.id.etem);
        editKodeDesa = findViewById(R.id.etus);
        editTextAlamat = findViewById(R.id.etal);
        editTextNamaDesa = findViewById(R.id.etai);
        radioGroup = findViewById(R.id.rg);
        buttonSubmit = findViewById(R.id.btn);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editTextNama.getText().toString();
                String nik = editNik.getText().toString();
                String kodeDesa = editKodeDesa.getText().toString();
                String alamat = editTextAlamat.getText().toString();
                String namaDesa = editTextNamaDesa.getText().toString();
                RadioButton selectedRadioButton = findViewById(radioGroup.getCheckedRadioButtonId());
                String jenisKelamin = selectedRadioButton.getText().toString();

                // Menampilkan data dalam dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Data Berhasil Disimpan");
                builder.setMessage("Nama: " + nama + "\nNIK: " + nik + "\nKode Desa: " + kodeDesa
                        + "\nAlamat: " + alamat + "\nNama Desa: " + namaDesa
                        + "\nJenis Kelamin: " + jenisKelamin);
                builder.setPositiveButton("OK", null);
                builder.show();

                editTextNama.setText("");
                editNik.setText("");
                editKodeDesa.setText("");
                editTextAlamat.setText("");
                editTextNamaDesa.setText("");
                radioGroup.clearCheck();
            }
        });
    }
}





