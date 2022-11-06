package com.example.mvvmproject.utils

import com.example.mvvmproject.data.FakeDatabase
import com.example.mvvmproject.data.FakeQuoteDao
import com.example.mvvmproject.data.QuoteRepository
import com.example.mvvmproject.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}