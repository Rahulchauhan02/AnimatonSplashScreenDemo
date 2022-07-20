package com.example.animatonsplashscreendemo

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animatonsplashscreendemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)

        var animationDrawable:AnimationDrawable ?= mainBinding.imageView.background as AnimationDrawable
        animationDrawable?.setEnterFadeDuration(3000)
        animationDrawable?.setExitFadeDuration(1000)
        animationDrawable?.start()
    }
}