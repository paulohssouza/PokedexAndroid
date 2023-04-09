package com.paulohenrique.pokedexandroid.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.paulohenrique.pokedexandroid.databinding.FragmentListPokedexBinding

class ListPokemonFragment : Fragment() {
    private var _binding: FragmentListPokedexBinding? = null
    private val binding get() =_binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListPokedexBinding.inflate(inflater,container, false)
        return binding.root
    }
}