package com.edgesoftware.weathervane

object DataManager {
    val farmStands = HashMap<String, FarmStandInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeFarmStands()
        initialseNotes()
    }

    private fun initializeFarmStands() {
        var farmStand = FarmStandInfo("hallah_farmstand","Hallah Farm Stand")
        farmStands.set(farmStand.farmStandId, farmStand)

        farmStand = FarmStandInfo("bettys_farmstand", "Betty's Farm Stand")
        farmStands.set(farmStand.farmStandId, farmStand)

        farmStand = FarmStandInfo("micks_farmstand", "Micks Farm Stand")
        farmStands.set(farmStand.farmStandId, farmStand)

        farmStand = FarmStandInfo("blue_jay_orchards", "Blue Jay Orchards")
        farmStands.set(farmStand.farmStandId, farmStand)
    }

    private fun initialseNotes() {
        var farmStand = farmStands["hallah_farmstand"]!!
        var note = NoteInfo(farmStand, "Amazing Produce",
            "Wow, every time I go here the produce is amazing")
        notes.add(note)
        note = NoteInfo(farmStand, "Super delicious",
            "The peaches are super delicious")
        notes.add(note)

        farmStand = farmStands["bettys_farmstand"]!!
        note = NoteInfo(farmStand, "YUMM!",
            "Did you know they are available every Thursday?")
        notes.add(note)
        note = NoteInfo(farmStand, "Long lines: Beware",
            "Great Service but can be very busy")
        notes.add(note)

        farmStand = farmStands["micks_farmstand"]!!
        note = NoteInfo(farmStand, "Perfect",
            "Perfect amount of variety")
        notes.add(note)
        note = NoteInfo(farmStand, "Amazing cheeses",
            "Specializing in raw cheese!")
        notes.add(note)

        farmStand = farmStands["blue_jay_orchards"]!!
        note = NoteInfo(farmStand, "Complete options",
            "Home made honey, fruits, veggies, everything")
        notes.add(note)
        note = NoteInfo(farmStand, "Slow checkout",
            "Very slow checkout process")
        notes.add(note)
    }
}