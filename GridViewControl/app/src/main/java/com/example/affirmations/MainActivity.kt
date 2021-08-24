package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.databinding.ActivityMainBinding
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var numOfItems = 36
    private var numRows = 6
    private var numCols = 6
    private var spanCount = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rebindGridView()

        //recyclerView.setHasFixedSize(true) // 콘텐츠를 변경해도 RecyclerView의 레이아웃 크기가 변경되지 않는다는 것을 아는 경우 이 설정을 사용

        binding.delRowBtn.setOnClickListener{
            if(numRows > 1){
                numRows--
                numOfItems -= numCols
                rebindGridView()
            }
        }

        binding.addRowBtn.setOnClickListener{
            if(numRows < 6){
                numRows++
                numOfItems += numCols
                rebindGridView()
            }
        }

        binding.delColBtn.setOnClickListener{
            if(numCols > 1 && spanCount > 1){
                numCols--
                numOfItems -= numRows
                spanCount--
                rebindGridView()
            }
        }

        binding.addColBtn.setOnClickListener{
            if(numCols < 6 && spanCount < 6){
                numCols++
                numOfItems += numRows
                spanCount++
                rebindGridView()
            }
        }
    }

    private fun rebindGridView(){
        val myDataset = Datasource().loadAffirmations(numOfItems) // Initialize data

        val recyclerView = binding.recyclerView
        recyclerView.isNestedScrollingEnabled = false;
        recyclerView.overScrollMode = View.OVER_SCROLL_NEVER
        recyclerView.adapter = ItemAdapter(this, myDataset)
        (recyclerView.layoutManager as GridLayoutManager).spanCount = spanCount
        recyclerView.adapter = ItemAdapter(this, myDataset)
    }

}