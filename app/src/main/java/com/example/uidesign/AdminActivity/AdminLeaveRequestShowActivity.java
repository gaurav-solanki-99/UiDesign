package com.example.uidesign.AdminActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.uidesign.databinding.AllRequstLayoutAdminBinding;
import com.example.uidesign.databinding.RequestApprovalApplicationAdminBinding;

public class AdminLeaveRequestShowActivity extends AppCompatActivity
{
    AllRequstLayoutAdminBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=AllRequstLayoutAdminBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();



    }
}
