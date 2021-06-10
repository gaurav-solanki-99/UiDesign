package com.example.uidesign;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.uidesign.databinding.RequestApprovalApplicationAdminBinding;

public class ApproveLeavesActivity extends AppCompatActivity {


    RequestApprovalApplicationAdminBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=RequestApprovalApplicationAdminBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

    }
}
