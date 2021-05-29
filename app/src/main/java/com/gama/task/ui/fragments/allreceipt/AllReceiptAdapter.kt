package com.gama.task.ui.fragments.allreceipt

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gama.task.R
import com.gama.task.ui.fragments.cart.models.CartItem
import kotlinx.android.synthetic.main.all_receipts_item.view.*
import kotlinx.android.synthetic.main.cart_item.view.*

class AllReceiptAdapter(private val allReceiptList: List<CartItem>, private val  onItemClickListener: OnItemClickListener) :RecyclerView.Adapter<AllReceiptAdapter.AllReceiptViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllReceiptViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.all_receipts_item,
            parent, false)
        return AllReceiptViewHolder(itemView,onItemClickListener)
    }

    override fun onBindViewHolder(holder: AllReceiptViewHolder, position: Int) {
        val currentItem = allReceiptList[position]
       holder.cardImage.setImageResource(currentItem.text1)
       // holder.cardPrice.text = currentItem.text3
       holder.cardName.text = currentItem.text4
    }

    override fun getItemCount()=allReceiptList.size


    class AllReceiptViewHolder(itemView:View, onItemClickListener: OnItemClickListener):RecyclerView.ViewHolder(itemView){

        val cardImage: ImageView=itemView.voucher_img
        val cardName: TextView=itemView.voucher_text
       // val cardPrice: TextView=itemView.card_price
        //val cardDelete: ImageView=itemView.delet_item_btn
        init {

            itemView.setOnClickListener {
                onItemClickListener.onClick(adapterPosition)
            }
        }
    }

    interface  OnItemClickListener{
        fun onClick(position: Int)

    }
}