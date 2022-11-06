package com.example.mvvmproject.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvmproject.data.Quote
import com.example.mvvmproject.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}