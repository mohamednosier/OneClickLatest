package com.gama.task.ui.fragments.voicedatacharg.mobilyfragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.gama.task.AppExecutors
import com.gama.task.R
import com.gama.task.databinding.CardMobilyItemBinding
import com.gama.task.models.Content
import com.gama.task.ui.base.DataBoundListAdapter


/**
 * Adapter that displays list of hotels.
 *
 * @property dataBindingComponent DataBindingComponent The DataBindingComponent to use in the binding.
 * @param appExecutors AppExecutors executor pools.
 * @property onHotelClicked Function1<Hotel, Unit> action to perform when hotel selected.
 */
class MobileDataAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val appExecutors: AppExecutors,
    private val onHotelClicked: (Content) -> Unit
) : DataBoundListAdapter<Content, CardMobilyItemBinding>(
    appExecutors,
    object : DiffUtil.ItemCallback<Content>() {
        override fun areItemsTheSame(oldItem: Content, newItem: Content) = false
        override fun areContentsTheSame(oldItem: Content, newItem: Content) = false
    }) {

    override fun createBinding(parent: ViewGroup): CardMobilyItemBinding = DataBindingUtil.inflate(
        LayoutInflater.from(parent.context),
        R.layout.card_mobily_item,
        parent,
        false,
        dataBindingComponent
    )

    override fun bind(binding: CardMobilyItemBinding, item: Content, position: Int) {
        binding.notification = item

//        binding.recyclerAmenities.adapter =
//            HotelAmenitiesAdapter(dataBindingComponent, appExecutors).apply {
//                submitList(item.amenities)
//            }

        binding.root.setOnClickListener { onHotelClicked(item) }
    }
}