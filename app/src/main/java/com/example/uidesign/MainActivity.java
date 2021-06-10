package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;

import com.example.uidesign.databinding.EmployeeProfileLayoutBinding;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EmployeeProfileLayoutBinding binding;
    boolean btnstatu=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=EmployeeProfileLayoutBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();


        binding.btneditdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(btnstatu==false) {
                    binding.etname.setEnabled(true);
                    binding.etDepartment.setEnabled(true);
                    binding.etdatejoin.setEnabled(true);
                    binding.etemail.setEnabled(true);
                    binding.etphone.setEnabled(true);
                    binding.etdob.setEnabled(true);
                    binding.btnsavedetails.setVisibility(View.VISIBLE);
                    binding.btneditdetails.setImageResource(R.drawable.ic_baseline_cancel_24);
                    btnstatu=true;
                }else{

                    binding.etname.setEnabled(false);
                    binding.etDepartment.setEnabled(false);
                    binding.etdatejoin.setEnabled(false);
                    binding.etemail.setEnabled(false);
                    binding.etphone.setEnabled(false);
                    binding.etdob.setEnabled(false);
                    binding.btnsavedetails.setVisibility(View.GONE);
                    binding.btneditdetails.setImageResource(R.drawable.ic_baseline_edit_blue);
                    btnstatu=false;
                }









            }
        });
    }

}