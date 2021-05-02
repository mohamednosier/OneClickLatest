package com.gama.task.ui.fragments.gamecards.steamfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.gama.task.R
import com.gama.task.ui.fragments.giftcards.careemfragment.CareemAdapter
import com.gama.task.ui.fragments.giftcards.careemfragment.CareemData
import kotlinx.android.synthetic.main.fragment_game_card_steam.*


class SteamFragment : Fragment(R.layout.fragment_game_card_steam) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val steamList=ArrayList<SteamData>()

        steamList.add(SteamData("2GB Per Month", "50", "100","Nintendo Recharg Card 50 SAR"))
        steamList.add(SteamData("5GB Per Month", "100", "200","Nintendo Recharg Card 100 SAR"))
        steamList.add(SteamData("10GB Per Month", "150", "300","Nintendo Recharg Card 150 SAR"))
        steamList.add(SteamData("15GB Per Month", "200", "400","Nintendo Recharg Card 200 SAR"))
        steamList.add(SteamData("20GB Per Month", "250", "500","Nintendo Recharg Card 250 SAR"))
        steamList.add(SteamData("25GB Per Month", "300", "600","Nintendo Recharg Card 300 SAR"))
        steamList.add(SteamData("30GB Per Month", "350", "700","Nintendo Recharg Card 350 SAR"))
        steamList.add(SteamData("40GB Per Month", "400", "800","Nintendo Recharg Card 400 SAR"))
        steam_rv.adapter = SteamAdapter(steamList)
        steam_rv.layoutManager = GridLayoutManager(context,2)
        steam_rv.setHasFixedSize(true)

    }
}