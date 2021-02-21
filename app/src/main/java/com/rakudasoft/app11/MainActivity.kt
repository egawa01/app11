package com.rakudasoft.app11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val appID = "ca-app-pub-3940256099942544~3347511713" // テスト用
    private val adUnitId="ca-app-pub-3940256099942544/6300978111" // テスト用

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this, appID)

        adView.adUnitId = this.adUnitId
        adView.adSize = AdSize.BANNER

        val adRequest : AdRequest = AdRequest.Builder()
                .build()
        adView.loadAd(adRequest)
    }
}