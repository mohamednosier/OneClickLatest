package com.gama.task.ui.fragments.gamecards.lordsfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.gama.task.R
import com.gama.task.ui.fragments.giftcards.careemfragment.CareemAdapter
import com.gama.task.ui.fragments.giftcards.careemfragment.CareemData
import kotlinx.android.synthetic.main.fragment_game_card_lords.*
import kotlinx.android.synthetic.main.fragment_gift_card_careem.*

class LordsFragment : Fragment(R.layout.fragment_game_card_lords) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val lordsList=ArrayList<LordsData>()

        lordsList.add(LordsData("2GB Per Month", "50", "100","Nintendo Recharg Card 50 SAR"))
        lordsList.add(LordsData("5GB Per Month", "100", "200","Nintendo Recharg Card 100 SAR"))
        lordsList.add(LordsData("10GB Per Month", "150", "300","Nintendo Recharg Card 150 SAR"))
        lordsList.add(LordsData("15GB Per Month", "200", "400","Nintendo Recharg Card 200 SAR"))
        lordsList.add(LordsData("20GB Per Month", "250", "500","Nintendo Recharg Card 250 SAR"))
        lordsList.add(LordsData("25GB Per Month", "300", "600","Nintendo Recharg Card 300 SAR"))
        lordsList.add(LordsData("30GB Per Month", "350", "700","Nintendo Recharg Card 350 SAR"))
        lordsList.add(LordsData("40GB Per Month", "400", "800","Nintendo Recharg Card 400 SAR"))
        lords_rv.adapter = LordsAdapter(lordsList)
        lords_rv.layoutManager = GridLayoutManager(context,2)
        lords_rv.setHasFixedSize(true)

    }
}