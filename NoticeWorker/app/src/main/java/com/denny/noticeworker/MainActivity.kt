package com.denny.noticeworker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.spinner
import kotlinx.android.synthetic.main.activity_main.majorName

class MainActivity : AppCompatActivity(){

    private var majorNumber: Int = 0
    private var nextpage =1;
    private var keyword: String? = null
    private var resultTrigger: Notice? = null
    private var isLast: Boolean = false
    private var result: ArrayList<Notice> = ArrayList()
    private val complete = { noticeList: ArrayList<Notice> ->
        if (resultTrigger != null && noticeList.size > 0) {
            if (resultTrigger?.url == noticeList[0].url) isLast = true
            else resultTrigger = noticeList[0]
        }
        else if (resultTrigger == null && noticeList.size > 0) resultTrigger = noticeList[0]
        result = noticeList
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 전공 호출
        val item = Test.loadMajor()

        // URL 호출

        // 공지 호출

        val majorAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, item)
        spinner.adapter = majorAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                majorNumber = position
                majorName.text =  Test.majorName(majorNumber)
            }
            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
        Start.setOnClickListener {
            var intent = Intent(this,NotiActivity::class.java)
            intent.putExtra("Number",majorNumber)
            startActivity(intent)
            //finish()
        }

        ID_TEXT.text = "전공선택"
            //TestCalculator.plus(11, 2).toString()
    }

}
