package me.nasiri.breezy.presentation

import me.nasiri.breezy.R

data class MainState(
    //todo create data
    val isLoading: Boolean = false,
    val error: Error = Error.Unknown(),
) {
    sealed class Error(val message: Int?) {
        class Network(message: Int? = R.string.er_internet) : Error(message)
        class Permission(message: Int? = R.string.er_permission) : Error(message)
        class Unknown(message: Int? = R.string.er_unknown) : Error(message)
    }
}
