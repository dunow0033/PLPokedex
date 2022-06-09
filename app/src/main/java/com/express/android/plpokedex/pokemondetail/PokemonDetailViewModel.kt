package com.express.android.plpokedex.pokemondetail

import androidx.lifecycle.ViewModel
import com.express.android.plpokedex.data.remote.responses.Pokemon
import com.express.android.plpokedex.repository.PokemonRepository
import com.express.android.plpokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}