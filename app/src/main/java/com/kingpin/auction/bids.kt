package com.kingpin.auction

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kingpin.auction.R.drawable.*
import com.kingpin.auction.R.id.discountedRecycler
import com.kingpin.auction.adapter.CategoryAdapter
import com.kingpin.auction.adapter.DiscountedProductAdapter
import com.kingpin.auction.adapter.RecentlyViewedAdapter
import com.kingpin.auction.databinding.ActivityBidsBinding
import com.kingpin.auction.model.Category
import com.kingpin.auction.model.DiscountedProducts
import com.kingpin.auction.model.RecentlyViewed


class bids : AppCompatActivity() {
    private lateinit var binding: ActivityBidsBinding
    var discountRecyclerView: RecyclerView? = null
    var categoryRecyclerView: RecyclerView? = null
    var recentlyViewedRecycler: RecyclerView? = null
    var discountedProductAdapter: DiscountedProductAdapter? = null
    var discountedProductsList: MutableList<DiscountedProducts>? = null
    var categoryAdapter: CategoryAdapter? = null
    var categoryList: MutableList<Category>? = null
    var recentlyViewedAdapter: RecentlyViewedAdapter? = null
    var recentlyViewedList: MutableList<RecentlyViewed>? = null
    var allCategory: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBidsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setContentView(R.layout.activity_bids)
        discountRecyclerView = findViewById(discountedRecycler)
        categoryRecyclerView = findViewById(R.id.categoryRecycler)
        allCategory = findViewById(R.id.allCategoryImage)
        recentlyViewedRecycler = findViewById(R.id.recently_item)

        binding.textView4.setOnClickListener {
            Toast.makeText(applicationContext,"clicked me", Toast.LENGTH_LONG).show()
            val intent = Intent(this,AllCategory::class.java)
            startActivity(intent)
        }


        // adding data to model
        discountedProductsList = ArrayList<DiscountedProducts>()
        discountedProductsList!!.add(DiscountedProducts(1, discountberry))
        discountedProductsList!!.add(DiscountedProducts(2, discountbrocoli))
        discountedProductsList!!.add(DiscountedProducts(3, discountmeat))
        discountedProductsList!!.add(DiscountedProducts(4, discountberry))
        discountedProductsList!!.add(DiscountedProducts(5, discountbrocoli))
        discountedProductsList!!.add(DiscountedProducts(6, discountmeat))

        // adding data to model
        categoryList = ArrayList<Category>()
        categoryList!!.add(Category(1, ic_home_fruits))
        categoryList!!.add(Category(2, ic_home_fish))
        categoryList!!.add(Category(3, ic_home_meats))
        categoryList!!.add(Category(4, ic_home_veggies))
        categoryList!!.add(Category(5, ic_home_fruits))
        categoryList!!.add(Category(6, ic_home_fish))
        categoryList!!.add(Category(7, ic_home_meats))
        categoryList!!.add(Category(8, ic_home_veggies))

        // adding data to model
        recentlyViewedList = ArrayList<RecentlyViewed>()
        recentlyViewedList!!.add(RecentlyViewed("Watermelon",
            "Watermelon has high water content and also provides some fiber.",
            "₹ 80",
            "1",
            "KG",
            card4,
            b4))
        recentlyViewedList!!.add(RecentlyViewed("Papaya",
            "Papayas are spherical or pear-shaped fruits that can be as long as 20 inches.",
            "₹ 85",
            "1",
            "KG",
            card3,
            b3))
        recentlyViewedList!!.add(RecentlyViewed("Strawberry",
            "The strawberry is a highly nutritious fruit, loaded with vitamin C.",
            "₹ 30",
            "1",
            "KG",
            card2,
            b1))
        recentlyViewedList!!.add(RecentlyViewed("Kiwi",
            "Full of nutrients like vitamin C, vitamin K, vitamin E, folate, and potassium.",
            "₹ 30",
            "1",
            "PC",
            card1,
            b2))
        setDiscountedRecycler(discountedProductsList)
        setCategoryRecycler(categoryList)
        setRecentlyViewedRecycler(recentlyViewedList)
    }

    private fun setDiscountedRecycler(dataList: List<DiscountedProducts>?) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        discountRecyclerView!!.layoutManager = layoutManager
        discountedProductAdapter = DiscountedProductAdapter(this, dataList)
        discountRecyclerView!!.adapter = discountedProductAdapter
    }

    private fun setCategoryRecycler(categoryDataList: List<Category>?) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        categoryRecyclerView!!.layoutManager = layoutManager
        categoryAdapter = CategoryAdapter(this, categoryDataList)
        categoryRecyclerView!!.adapter = categoryAdapter
    }

    private fun setRecentlyViewedRecycler(recentlyViewedDataList: List<RecentlyViewed>?) {
        val layoutManager: RecyclerView.LayoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recentlyViewedRecycler!!.layoutManager = layoutManager
        recentlyViewedAdapter = RecentlyViewedAdapter(this, recentlyViewedDataList)
        recentlyViewedRecycler!!.adapter = recentlyViewedAdapter
    } //Now again we need to create a adapter and model class for recently viewed items.
    // lets do it fast.
}
