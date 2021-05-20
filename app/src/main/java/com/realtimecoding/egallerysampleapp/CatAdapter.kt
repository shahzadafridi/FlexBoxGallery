/*
 * Copyright 2017 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.realtimecoding.egallerysampleapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.google.android.flexbox.FlexboxLayoutManager

internal class CatAdapter : RecyclerView.Adapter<CatAdapter.MyViewHolder>() {

    companion object {
        private val CAT_IMAGE_IDS = intArrayOf(
                R.drawable.cat_1,
                R.drawable.cat_2,
                R.drawable.cat_3,
                R.drawable.cat_4,
                R.drawable.cat_5,
                R.drawable.cat_6,
                R.drawable.cat_7,
                R.drawable.cat_8,
                R.drawable.cat_9,
                R.drawable.cat_10,
                R.drawable.cat_11,
                R.drawable.cat_12,
                R.drawable.cat_13,
                R.drawable.cat_14,
                R.drawable.cat_15,
                R.drawable.cat_16,
                R.drawable.cat_17,
                R.drawable.cat_18,
                R.drawable.cat_1
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_cat, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val pos = position % CAT_IMAGE_IDS.size
        holder.bindTo(CAT_IMAGE_IDS[pos])
    }

    override fun getItemCount() = CAT_IMAGE_IDS.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imageView: LinearLayout = itemView.findViewById(R.id.imageview)

        internal fun bindTo(@DrawableRes drawableRes: Int) {
            imageView.setBackgroundResource(drawableRes)
            val lp = imageView.layoutParams
            //var height = (300..350).random()
            //var width = (380..430).random()
            //lp.height = height
            //lp.width = width
            if (lp is FlexboxLayoutManager.LayoutParams) {
                //lp.flexGrow = 1f
                lp.flexGrow = 2f
            }
        }

    }
}
