package com.mkspace.mkspacebase

import android.os.Bundle
import com.mkspace.mkspacebase.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}