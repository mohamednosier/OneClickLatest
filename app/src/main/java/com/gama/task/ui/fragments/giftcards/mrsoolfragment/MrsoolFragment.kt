package com.gama.task.ui.fragments.giftcards.mrsoolfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.gama.task.R
import com.gama.task.ui.fragments.giftcards.careemfragment.CareemAdapter
import com.gama.task.ui.fragments.giftcards.careemfragment.CareemData
import kotlinx.android.synthetic.main.fragment_gift_card_careem.*
import kotlinx.android.synthetic.main.fragment_gift_card_mrsool.*

class MrsoolFragment : Fragment(R.layout.fragment_gift_card_mrsool) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val mrsoolList=ArrayList<MrsoolData>()

        mrsoolList.add(MrsoolData("2GB Per Month", "50", "100","Nintendo Recharg Card 50 SAR"))
        mrsoolList.add(MrsoolData("5GB Per Month", "100", "200","Nintendo Recharg Card 100 SAR"))
        mrsoolList.add(MrsoolData("10GB Per Month", "150", "300","Nintendo Recharg Card 150 SAR"))
        mrsoolList.add(MrsoolData("15GB Per Month", "200", "400","Nintendo Recharg Card 200 SAR"))
        mrsoolList.add(MrsoolData("20GB Per Month", "250", "500","Nintendo Recharg Card 250 SAR"))
        mrsoolList.add(MrsoolData("25GB Per Month", "300", "600","Nintendo Recharg Card 300 SAR"))
        mrsoolList.add(MrsoolData("30GB Per Month", "350", "700","Nintendo Recharg Card 350 SAR"))
        mrsoolList.add(MrsoolData("40GB Per Month", "400", "800","Nintendo Recharg Card 400 SAR"))
        mrsool_rv.adapter = MrsoolAdapter(mrsoolList)
        mrsool_rv.layoutManager = GridLayoutManager(context,2)
        mrsool_rv.setHasFixedSize(true)

    }
}