package com.edgesoftware.weathervane

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_farm_stand_dashboard.*
import kotlinx.android.synthetic.main.content_farm_stand_dashboard.*

class FarmStandDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // no relationship between activity and layout so this brings in the layout
        setContentView(R.layout.activity_farm_stand_dashboard)

        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            val activityIntent = Intent(this, FarmStandListActivity::class.java)
            startActivity(activityIntent)
        }

        initializeDisplayContent();

        listFarmStands.setOnItemClickListener{parent, view, position, id ->
            val activityIntent = Intent(this, FarmStandListActivity::class.java)
            activityIntent.putExtra(EXTRA_NOTE_POSITION, position)
            startActivity(activityIntent)
        }
    }

    private fun initializeDisplayContent() {
        listFarmStands.adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            DataManager.notes)
    }
}
