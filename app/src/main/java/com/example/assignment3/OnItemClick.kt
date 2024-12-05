package com.example.assignment3

import android.icu.text.Transliterator.Position

interface OnItemClick<CardItem>
{
    fun onItemClick(item: BestPracticeAdapter.CardItem,position: Int)
}