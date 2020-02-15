package com.edgesoftware.weathervane

import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_farm_stand_list.*
import kotlinx.android.synthetic.main.content_farm_stand_list.*

class FarmStandListActivity : AppCompatActivity() {
    private var notePosition = POSITION_NOT_SET

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_farm_stand_list)
        setSupportActionBar(toolbar)

        val adapterFarmStands = ArrayAdapter<FarmStandInfo>(this,
            android.R.layout.simple_spinner_item,
            DataManager.farmStands.values.toList())
        adapterFarmStands.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinnerFarmStands.adapter = adapterFarmStands

        notePosition = intent.getIntExtra(EXTRA_NOTE_POSITION, POSITION_NOT_SET)

        if (notePosition != POSITION_NOT_SET)
            displayNote()
    }

    private fun displayNote() {
        val note = DataManager.notes[notePosition]
        textFarmStandName.setText(note.title)
        textFarmStandText.setText(note.text)

        val farmStandPosition = DataManager.farmStands.values.indexOf(note.farmStand)
        spinnerFarmStands.setSelection(farmStandPosition)
    }

}
