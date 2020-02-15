package com.edgesoftware.weathervane

data class FarmStandInfo(val farmStandId: String, val name: String) {
    override fun toString(): String {
        return name
    }
}

data class NoteInfo(var farmStand: FarmStandInfo, var title: String, var text: String)

