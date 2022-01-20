package com.example.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        var photo: ImageView? = null
        var academicButton: Button? = null
        var projectButton: Button? = null
        var trainingButton: Button? = null
        var responsibilityButton: Button? = null
        var extraCurricular:Button?=null
        var skillButton: Button? = null
        var languageButton: Button? = null
        var personalDetailsButton: Button? = null

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        try {
            photo = findViewById(R.id.profilePhoto)
            photo?.setOnClickListener({
                var clickIntend = Intent(this@MainActivity, MyPhoto::class.java)
                startActivity(clickIntend)
            })

            academicButton = findViewById(R.id.academicButton)
            academicButton?.setOnClickListener({
                var clickIntent = Intent(this@MainActivity, AcademicQualification::class.java)
                startActivity(clickIntent)
            })

            projectButton = findViewById(R.id.projectsButton)
            projectButton?.setOnClickListener({
                var clickIntent = Intent(this@MainActivity, Projects::class.java)
                startActivity(clickIntent)
            })

            trainingButton = findViewById(R.id.trainingsButton)
            trainingButton?.setOnClickListener({
                var clickIntend = Intent(this@MainActivity, Trainings::class.java)
                startActivity(clickIntend)
            })

            responsibilityButton = findViewById(R.id.responsibilityButton)
            responsibilityButton?.setOnClickListener({
                var clickIntent = Intent(this@MainActivity, PositionOfResponsibility::class.java)
                startActivity(clickIntent)
            })

            extraCurricular = findViewById(R.id.extraCurricularButton)
            extraCurricular?.setOnClickListener({
                var clickIntent = Intent(this@MainActivity, ExtraCurricularActivities::class.java)
                startActivity(clickIntent)
            })

            skillButton = findViewById(R.id.skillsButton)
            skillButton?.setOnClickListener({
                var clickIntend = Intent(this@MainActivity, Skills::class.java)
                startActivity(clickIntend)
            })

            languageButton = findViewById(R.id.language)
            languageButton?.setOnClickListener({
                var clickIntent = Intent(this@MainActivity, LanguageProficiency::class.java)
                startActivity(clickIntent)
            })

            personalDetailsButton = findViewById(R.id.personalDetailsButton)
            personalDetailsButton?.setOnClickListener({
                var clickIntent = Intent(this@MainActivity, PersonalDetails::class.java)
                startActivity(clickIntent)
            })

        }
        catch (e:Exception)
        {
            Toast.makeText(this@MainActivity ,
                "Something Went Wrong" ,
                Toast.LENGTH_SHORT)
                .show()
            this.finish()
            e.printStackTrace()
        }
    }
}
