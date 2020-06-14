package project.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import project.noticeworker.seoulnational.SeoulNational
import project.noticeworker.soongsil.Soongsil


class MainActivity : AppCompatActivity() {
    private var deptNumber: Int = 0
    private var majorNumber: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        schoolName.text = "SSU"

        val deptMap = Soongsil.getDeptList()


        val deptAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, deptMap)
        deptSpin.adapter = deptAdapter
        deptSpin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                deptNumber = position
            }
            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
        var majorMap : List<String>

        startDept.setOnClickListener {
            Soongsil.loadMajor((Soongsil.getDeptList()[deptNumber]))

            // 학과 호출
            majorMap = Soongsil.getMajorList(Soongsil.getDeptList()[deptNumber])!!
            val majorAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, majorMap)
            majorSpin.adapter = majorAdapter
            majorSpin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    majorNumber = position

                }
                override fun onNothingSelected(parent: AdapterView<*>) {

                }
            }
        }



        startMajor.setOnClickListener {
            val intent = Intent(this, NotiActivity::class.java)
            intent.putExtra("dept",deptNumber)
            intent.putExtra("major",majorNumber)
            startActivity(intent)
        }


        ID2.text = "전공선택"
    }


}
