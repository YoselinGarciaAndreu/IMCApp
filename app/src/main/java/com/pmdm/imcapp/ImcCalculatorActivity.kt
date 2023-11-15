package com.pmdm.imcapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import java.lang.reflect.RecordComponent


class IMCCalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_imc_calculator2)
        initComponents()
        initListeners()
        initUI()

    }

    private lateinit var viewMale: CardView
    private lateinit var viewFemale: CardView
    private var isMaleSelected: Boolean = true

    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)
    }



    private fun initListeners(){
        viewMale.setOnClickListener(){
            setGenderColor()
            isMaleSelected = true}

        viewFemale.setOnClickListener(){
            setGenderColor()
            isMaleSelected = false}
        }

    private fun setGenderColor(){
        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(!isMaleSelected))
    }

    private fun getBackgroundColor(isComponentSelected : Boolean): Int{
        val colorReference = if(isComponentSelected) {
            R.color.bg_comp_sel
        } else {
            R.color.bg_comp
        }
        return ContextCompat.getColor(this,colorReference)
    }

    private fun initUI(){
        setGenderColor()
    }


    private fun isMaleSelected(){

    }

}

