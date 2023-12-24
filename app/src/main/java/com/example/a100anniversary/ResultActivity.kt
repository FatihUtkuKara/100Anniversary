package com.example.a100anniversary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class ResultActivity : AppCompatActivity() {
    private lateinit var resultList : ArrayList<Results>
    private lateinit var filteredList : List<Results>
    private lateinit var secondFilteredList :List<Results>
    private lateinit var filterButton : ImageView
    private lateinit var sortButton : ImageView
    private lateinit var adapter: ResultRvAdapter
    private lateinit var infoWorker : String
    private lateinit var rv: RecyclerView
    private lateinit var sortInfo: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        infoWorker =""
        val sharedPreferences = getSharedPreferences("mySharedPreferences", Context.MODE_PRIVATE)
        var firstKey = sharedPreferences.getString("firstKey", "")
        if (firstKey != null) {
            sortInfo = firstKey
        }
        rv = findViewById(R.id.rv)
        filterButton= findViewById(R.id.filterButton)
        sortButton = findViewById(R.id.sortButton)
        if (intent.hasExtra("workername")) {
            infoWorker = intent.getStringExtra("workername")!!
        }

        filterButton.setOnClickListener{
            val intent = Intent(this, FilterActivity::class.java)
            intent.putExtra("workername",infoWorker )
            this.startActivity(intent)
        }

        sortButton.setOnClickListener{
            val intent = Intent(this, SortActivity::class.java)
            intent.putExtra("workername",infoWorker )
            this.startActivity(intent)
        }

        sortInfo = intent.getStringExtra("sortInfo").toString()
        val colorList = intent.getStringArrayListExtra("colorList")
        val brandList = intent.getStringArrayListExtra("brandList")
        val modelList = intent.getStringArrayListExtra("modelList")
        val bodyTypeList = intent.getStringArrayListExtra("bodyTypeList")
        val engineSrcList = intent.getStringArrayListExtra("engineSrcList")
        val transmissionList = intent.getStringArrayListExtra("transmissionList")
        val modelYearList = intent.getStringArrayListExtra("modelYearList")
        var minPriceInt = intent.getIntExtra("minPrice",0)
        var maxPriceInt = intent.getIntExtra("maxPrice",0)
        var maxOdometerInt = intent.getIntExtra("maxOdometer",0)
        var minOdometerInt = intent.getIntExtra("minOdometer",0)
        var maxSafetyInt = intent.getIntExtra("maxSafety",0)
        var minSafetyInt = intent.getIntExtra("minSafety",0)

        Log.d("ResultActivity", "colorList: $colorList")
        Log.d("ResultActivity", "brandList: $brandList")
        Log.d("ResultActivity", "modelList: $modelList")
        Log.d("ResultActivity", "bodyTypeList: $bodyTypeList")
        Log.d("ResultActivity", "engineSrcList: $engineSrcList")
        Log.d("ResultActivity", "transmissionList: $transmissionList")
        Log.d("ResultActivity", "modelYearList: $modelYearList")
        Log.d("ResultActivity", "priceminList: $minPriceInt")
        Log.d("ResultActivity", "pricemaxList: $maxPriceInt")

        rv.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL)

        val c1 = Results("Toyota", "Corolla Hatchback", "Hatchback", 1460000, 2023, "Hybrid", "Automatic", "Blue", 3500, 85.5)
        val c2 = Results("Toyota", "Corolla Hatchback", "Hatchback", 1460000, 2023, "Hybrid", "Automatic", "Silver", 6000, 85.5)
        val c3 = Results("Toyota", "Corolla Hatchback", "Hatchback", 1460000, 2023, "Hybrid", "Automatic", "White", 5500, 85.5)
        val c4 = Results("Toyota", "Corolla Hatchback", "Hatchback", 1460000, 2023, "Hybrid", "Automatic", "Orange", 2500, 85.5)
        val c5 = Results("Toyota", "Corolla Hatchback", "Hatchback", 1460000, 2023, "Hybrid", "Automatic", "Red", 3450, 85.5)

        val c6 = Results("Volkswagen", "Golf", "Hatchback", 1100300, 2022, "Petrol", "Manuel", "Blue", 10450, 82.75)
        val c7 = Results("Volkswagen", "Golf", "Hatchback", 1308500, 2022, "Petrol", "Automatic", "Red", 11400, 82.75)
        val c8 = Results("Volkswagen", "Golf", "Hatchback", 1475800, 2022, "Petrol", "Automatic", "Grey", 12500, 82.75)
        val c9 = Results("Volkswagen", "Golf", "Hatchback", 1537100, 2022, "Petrol", "Automatic", "Yellow", 13600, 82.75)

        val c10 = Results("Volkswagen", "Polo", "Hatchback", 861700, 2022, "Petrol", "Manuel", "Blue", 24600, 78.5)
        val c11 = Results("Volkswagen", "Polo", "Hatchback", 1032000, 2022, "Petrol", "Automatic", "Grey", 23560, 78.5)
        val c12 = Results("Volkswagen", "Polo", "Hatchback", 1191100, 2022, "Petrol", "Automatic", "Red", 21490, 78.5)

        val c13 = Results("Audi", "A3 Sportback", "Hatchback", 1511911, 2023, "Petrol", "Automatic", "Red", 8500, 77.75)
        val c14 = Results("Audi", "A3 Sportback", "Hatchback", 1511911, 2023, "Petrol", "Automatic", "Blue", 7500, 77.75)
        val c15 = Results("Audi", "A3 Sportback", "Hatchback", 1910733, 2023, "Petrol", "Automatic", "Red", 9650, 77.75)

        val c16 = Results("Mini", "Cooper 5 Door", "Hatchback", 1564102, 2023, "Petrol", "Automatic", "Yellow", 4560, 68.5)
        val c17 = Results("Mini", "Cooper 5 Door", "Hatchback", 1564102, 2023, "Petrol", "Automatic", "Green", 3500, 68.5)
        val c18 = Results("Mini", "Cooper 5 Door", "Hatchback", 1705150, 2023, "Petrol", "Automatic", "White", 4300, 68.5)
        val c19 = Results("Mini", "Cooper 5 Door", "Hatchback", 1564102, 2023, "Petrol", "Automatic", "White", 2300, 68.5)

        val c20 = Results("Peugeot", "308", "Hatchback", 1502500, 2023, "Petrol", "Automatic", "Green", 2500, 78.75)
        val c21 = Results("Peugeot", "308", "Hatchback", 1408000, 2023, "Petrol", "Automatic", "Grey", 4300, 78.75)

        val c22 = Results("Fiat", "Tipo Hatchback", "Hatchback", 820213, 2023, "Hybrid", "Manuel", "White", 2300, 65.25)
        val c23 = Results("Fiat", "Tipo Hatchback", "Hatchback", 820213, 2023, "Hybrid", "Manuel", "Orange", 2500, 65.25)
        val c24 = Results("Fiat", "Tipo Hatchback", "Hatchback", 820213, 2023, "Hybrid", "Manuel", "Grey", 4300, 65.25)

        val c25 = Results("Fiat", "Tipo Hatchback", "Hatchback", 740000, 2022, "Hybrid", "Manuel", "White", 12500, 65.25)
        val c26 = Results("Fiat", "Tipo Hatchback", "Hatchback", 740000, 2022, "Diesel", "Manuel", "Grey", 15400, 65.25)

        val c27 = Results("Fiat", "Tipo Hatchback", "Hatchback", 690000, 2021, "Diesel", "Manuel", "White", 36600, 65.25)
        val c28 = Results("Fiat", "Tipo Hatchback", "Hatchback", 700000, 2021, "Diesel", "Manuel", "Grey", 45000, 65.25)
        val c29 = Results("Fiat", "Tipo Hatchback", "Hatchback", 707000, 2021, "Diesel", "Manuel", "Red", 32650, 65.25)

        val c30 = Results("Opel", "Corsa", "Hatchback", 1175900, 2023, "Electric", "Automatic", "Black", 3500, 76.25)
        val c31 = Results("Opel", "Corsa", "Hatchback", 1225900, 2023, "Electric", "Automatic", "Grey", 4500, 76.25)
        val c32 = Results("Opel", "Corsa", "Hatchback", 895000, 2022, "Electric", "Automatic", "Red", 12500, 76.25)

        val c33 = Results("Renault", "Zoe", "Hatchback", 1035000, 2022, "Electric", "Automatic", "Grey", 24800, 37.5)
        val c34 = Results("Renault", "Zoe", "Hatchback", 940000, 2022, "Electric", "Automatic", "Blue", 15600, 37.5)

        val c35 = Results("Ford", "Focus", "Hatchback", 1110000, 2021, "Petrol", "Manuel", "White", 35680, 79.75)
        val c36 = Results("Ford", "Focus", "Hatchback", 1400000, 2022, "Petrol", "Manuel", "White", 16780, 79.75)
        val c37 = Results("Ford", "Focus", "Hatchback", 1200000, 2021, "Petrol", "Manuel", "Grey", 28600, 79.75)
        val c38 = Results("Ford", "Focus", "Hatchback", 1035000, 2021, "Petrol", "Manuel", "Red", 34600, 79.75)
        val c39 = Results("Ford", "Focus", "Hatchback", 1548700, 2023, "Diesel", "Automatic", "Grey", 3500, 79.75)

        val c40 = Results("Hyundai", "i20", "Hatchback", 710000, 2021, "Petrol", "Automatic", "Grey", 24700, 75.25)
        val c41 = Results("Hyundai", "i20", "Hatchback", 755000, 2021, "Petrol", "Automatic", "Red", 15000, 75.25)
        val c42 = Results("Hyundai", "i20", "Hatchback", 860000, 2023, "Petrol", "Manuel", "Yellow", 12300, 75.25)
        val c43 = Results("Hyundai", "i20", "Hatchback", 920000, 2023, "Petrol", "Manuel", "Red", 15500, 75.25)

        val c44 = Results("Opel", "Astra", "Hatchback", 1397900, 2023, "Petrol", "Automatic", "Yellow", 12300, 73.75)
        val c45 = Results("Opel", "Astra", "Hatchback", 1397900, 2023, "Petrol", "Manuel", "Grey", 13500, 73.75)
        val c46 = Results("Opel", "Astra", "Hatchback", 1488900, 2023, "Diesel", "Automatic", "White", 35680, 73.75)
        val c47 = Results("Opel", "Astra", "Hatchback", 1300000, 2022, "Petrol", "Automatic", "Yellow", 34600, 73.75)

        val c48 = Results("Kia", "Picanto", "Hatchback", 760000, 2022, "Petrol", "Manuel", "White", 24700, 55.50)
        val c49 = Results("Kia", "Picanto", "Hatchback", 780000, 2022, "Diesel", "Automatic", "Red", 15500, 55.50)
        val c50 = Results("Kia", "Picanto", "Hatchback", 720000, 2022, "Petrol", "Automatic", "Grey", 12300, 55.50)

        val c51 = Results("Scoda", "Scala", "Hatchback", 1305000, 2022, "Petrol", "Automatic", "Blue", 28600, 85.25)
        val c52 = Results("Scoda", "Scala", "Hatchback", 1305000, 2022, "Petrol", "Automatic", "Black", 34600, 85.25)
        val c53 = Results("Scoda", "Scala", "Hatchback", 1400000, 2023, "Petrol", "Automatic", "White", 24700, 85.25)
        val c54 = Results("Scoda", "Scala", "Hatchback", 1400000, 2023, "Petrol", "Automatic", "Grey", 24700, 85.25)
        val c55 = Results("Scoda", "Scala", "Hatchback", 1400000, 2023, "Petrol", "Automatic", "Red", 5500, 85.25)

        val c56 = Results("Citroen", "C3", "Hatchback", 735000, 2022, "Petrol", "Manuel", "White", 16000, 72.00)
        val c57 = Results("Citroen", "C3", "Hatchback", 740000, 2022, "Petrol", "Manuel", "Grey", 15500, 72.00)
        val c58 = Results("Citroen", "C3", "Hatchback", 950000, 2023, "Petrol", "Automatic", "Red", 2500, 72.00)

        val c59 = Results("Fiat", "500", "Hatchback", 790000, 2021, "Hybrid", "Manuel", "White", 15000, 48.75)
        val c60 = Results("Fiat", "500", "Hatchback", 760000, 2021, "Petrol", "Manuel", "Grey", 12300, 48.75)
        val c61 = Results("Fiat", "500", "Hatchback", 1340000, 2023, "Electric", "Automatic", "Grey", 15500, 48.75)
        val c62 = Results("Fiat", "500", "Hatchback", 745000, 2021, "Hybrid", "Manuel", "Red", 12300, 48.75)
        val c63 = Results("Fiat", "500", "Hatchback", 1300000, 2023, "Electric", "Automatic", "Blue", 13500, 48.75)
        val c64 = Results("Fiat", "500", "Hatchback", 790000, 2022, "Hybrid", "Manuel", "Blue", 35680, 48.75)
        val c65 = Results("Fiat", "500", "Hatchback", 760000, 2021, "Petrol", "Manuel", "Grey", 34600, 48.75)
        val c66 = Results("Fiat", "500", "Hatchback", 790000, 2022, "Hybrid", "Manuel", "White", 24700, 48.75)

        val c67 = Results("Cupra", "Leon", "Hatchback", 1534000, 2023, "Hybrid", "Automatic", "Grey", 15500, 82.50)
        val c68 = Results("Cupra", "Leon", "Hatchback", 1534000, 2023, "Hybrid", "Automatic", "Red", 12300, 82.50)
        val c69 = Results("Cupra", "Leon", "Hatchback", 1190000, 2021, "Petrol", "Manuel", "Grey", 28600, 82.50)

        val c70 = Results("BMW", "1 Series", "Hatchback", 1482990, 2021, "Petrol", "Automatic", "Black", 34600, 79.50)
        val c71 = Results("BMW", "1 Series", "Hatchback", 1645000, 2021, "Diesel", "Automatic", "Grey", 24700, 79.50)
        val c72 = Results("BMW", "1 Series", "Hatchback", 1850000, 2022, "Petrol", "Automatic", "Red", 13500, 79.50)
        val c73 = Results("BMW", "1 Series", "Hatchback", 1960000, 2023, "Diesel", "Automatic", "Black", 4500, 79.50)

        val c74 = Results("Mercedes-Benz", "A Class", "Hatchback", 2020000, 2023, "Hybrid", "Automatic", "White", 3500, 88.50)
        val c75 = Results("Mercedes-Benz", "A Class", "Hatchback", 2020000, 2023, "Hybrid", "Automatic", "Black", 2300, 88.50)
        val c76 = Results("Mercedes-Benz", "A Class", "Hatchback", 2020000, 2023, "Hybrid", "Automatic", "Red", 2500, 88.50)
        val c77 = Results("Mercedes-Benz", "A Class", "Hatchback", 2020000, 2023, "Hybrid", "Automatic", "Blue", 4300, 88.50)

        val c78 = Results("Smart", "EQ", "Hatchback", 805000, 2021, "Electric", "Automatic", "White", 15000, 67.00)
        val c79 = Results("Smart", "EQ", "Hatchback", 805000, 2021, "Electric", "Automatic", "Black", 12300, 67.00)
        val c80 = Results("Smart", "EQ", "Hatchback", 805000, 2021, "Electric", "Automatic", "Red", 15500, 67.00)
        val c81 = Results("Smart", "EQ", "Hatchback", 805000, 2021, "Electric", "Automatic", "Blue", 12300, 67.00)
        val c82 = Results("Smart", "EQ", "Hatchback", 805000, 2021, "Electric", "Automatic", "Green", 13500, 67.00)
        val c83 = Results("Smart", "EQ", "Hatchback", 805000, 2021, "Electric", "Automatic", "Beige", 35680, 67.00)

        val c84 = Results("Nissan", "Micra", "Hatchback", 860000, 2022, "Petrol", "Automatic", "White", 34600, 80.25)
        val c85 = Results("Nissan", "Micra", "Hatchback", 860000, 2022, "Petrol", "Automatic", "Black", 24700, 80.25)
        val c86 = Results("Nissan", "Micra", "Hatchback", 860000, 2022, "Petrol", "Automatic", "Red", 15500, 80.25)
        val c87 = Results("Nissan", "Micra", "Hatchback", 860000, 2022, "Petrol", "Automatic", "Blue", 12300, 80.25)

        val c88 = Results("BMW", "3 Series", "Sedan", 2280000, 2021, "Petrol", "Automatic", "White", 28600, 86.75)
        val c89 = Results("BMW", "3 Series", "Sedan", 2280000, 2021, "Petrol", "Automatic", "Black", 34600, 86.75)
        val c90 = Results("BMW", "3 Series", "Sedan", 2280000, 2021, "Petrol", "Automatic", "Red", 24700, 86.75)
        val c91 = Results("BMW", "3 Series", "Sedan", 2280000, 2021, "Petrol", "Automatic", "Blue", 35680, 86.75)

        val c92 = Results("BMW", "5 Series", "Sedan", 3560000, 2022, "Petrol", "Automatic", "White", 24700, 79.00)
        val c93 = Results("BMW", "5 Series", "Sedan", 3560000, 2022, "Petrol", "Automatic", "Black", 34600, 79.00)
        val c94 = Results("BMW", "5 Series", "Sedan", 3560000, 2022, "Petrol", "Automatic", "Blue", 32450, 79.00)

        val c95 = Results("Fiat", "Tipo Sedan", "Sedan", 756500, 2021, "Petrol", "Manuel", "White", 36600, 65.25)
        val c96 = Results("Fiat", "Tipo Sedan", "Sedan", 756500, 2021, "Petrol", "Manuel", "Black", 45000, 65.25)
        val c97 = Results("Fiat", "Tipo Sedan", "Sedan", 756500, 2021, "Petrol", "Manuel", "Red", 32650, 65.25)
        val c98 = Results("Fiat", "Tipo Sedan", "Sedan", 756500, 2021, "Petrol", "Manuel", "Blue", 35680, 65.25)
        val c99 = Results("Fiat", "Tipo Sedan", "Sedan", 756500, 2021, "Petrol", "Manuel", "Grey", 15000, 65.25)

        val c100 = Results("Alfa Romeo", "Giulia", "Sedan", 3550000, 2023, "Petrol", "Automatic", "White", 12300, 77.00)
        val c101 = Results("Alfa Romeo", "Giulia", "Sedan", 3550000, 2023, "Petrol", "Automatic", "Black", 15500, 77.00)
        val c102 = Results("Alfa Romeo", "Giulia", "Sedan", 3550000, 2023, "Petrol", "Automatic", "Red", 12300, 77.00)
        val c103 = Results("Alfa Romeo", "Giulia", "Sedan", 3550000, 2023, "Petrol", "Automatic", "Blue", 13500, 77.00)

        val c104 = Results("Mercedes-Benz", "C Class", "Sedan", 3100001, 2021, "Hybrid", "Automatic", "White", 35680, 86.00)
        val c105 = Results("Mercedes-Benz", "C Class", "Sedan", 3100001, 2021, "Hybrid", "Automatic", "Black", 34600, 86.00)
        val c106 = Results("Mercedes-Benz", "C Class", "Sedan", 3100001, 2021, "Hybrid", "Automatic", "Red", 24700, 86.00)
        val c107 = Results("Mercedes-Benz", "C Class", "Sedan", 3100001, 2021, "Hybrid", "Automatic", "Blue", 15500, 86.00)

        val c108 = Results("Tesla", "Model 3", "Sedan", 2650000, 2022, "Electric", "Automatic", "White", 12300, 87.50)
        val c109 = Results("Tesla", "Model 3", "Sedan", 2650000, 2022, "Electric", "Automatic", "Black", 28600, 87.50)
        val c110 = Results("Tesla", "Model 3", "Sedan", 2650000, 2022, "Electric", "Automatic", "Red", 34600, 87.50)
        val c111 = Results("Tesla", "Model 3", "Sedan", 2650000, 2022, "Electric", "Automatic", "Blue", 24700, 87.50)

        val c112 = Results("Porsche", "Taycan", "Sedan", 7250000, 2021, "Electric", "Automatic", "White", 12300, 77.75)
        val c113 = Results("Porsche", "Taycan", "Sedan", 7250000, 2021, "Electric", "Automatic", "Black", 13500, 77.75)
        val c114 = Results("Porsche", "Taycan", "Sedan", 7250000, 2021, "Electric", "Automatic", "Green", 35680, 77.75)
        val c115 = Results("Porsche", "Taycan", "Sedan", 7250000, 2021, "Electric", "Automatic", "Blue", 28600, 77.75)

        val c116 = Results("Hyundai", "Elantra", "Sedan", 1450000, 2023, "Petrol", "Automatic", "White", 34600, 90.00)
        val c117 = Results("Hyundai", "Elantra", "Sedan", 1450000, 2023, "Petrol", "Automatic", "Black", 24700, 90.00)
        val c118 = Results("Hyundai", "Elantra", "Sedan", 1450000, 2023, "Petrol", "Automatic", "Grey", 24700, 90.00)

        val c119 = Results("Lexus", "ES", "Sedan", 9500000, 2023, "Hybrid", "Automatic", "White", 34600, 86.25)
        val c120 = Results("Lexus", "ES", "Sedan", 9500000, 2023, "Hybrid", "Automatic", "Black", 3500, 86.25)
        val c121 = Results("Lexus", "ES", "Sedan", 9500000, 2023, "Hybrid", "Automatic", "Grey", 2300, 86.25)
        val c122 = Results("Lexus", "ES", "Sedan", 9500000, 2023, "Hybrid", "Automatic", "Blue", 2500, 86.25)
        val c123 = Results("Tesla", "Model S", "Sedan", 5750000, 2022, "Electric", "Automatic", "White", 16000, 92.00)
        val c124 = Results("Tesla", "Model S", "Sedan", 5750000, 2022, "Electric", "Automatic", "Black", 15500, 92.00)
        val c125 = Results("Tesla", "Model S", "Sedan", 4300000, 2021, "Electric", "Automatic", "Grey", 15000, 92.00)
        val c126 = Results("Tesla", "Model S", "Sedan", 4300000, 2021, "Electric", "Automatic", "Blue", 12300, 92.00)
        val c127 = Results("Tesla", "Model S", "Sedan", 6250000, 2023, "Electric", "Automatic", "Red", 13500, 92.00)
        val c128 = Results("Tesla", "Model S", "Sedan", 6250000, 2023, "Electric", "Automatic", "Black", 35680, 92.00)

        val c129 = Results("Volvo", "S60", "Sedan", 3250000, 2023, "Hybrid", "Automatic", "White", 28600, 82.50)
        val c130 = Results("Volvo", "S60", "Sedan", 3250000, 2023, "Hybrid", "Automatic", "Black", 34600, 82.50)
        val c131 = Results("Volvo", "S60", "Sedan", 3250000, 2023, "Hybrid", "Automatic", "Grey", 24700, 82.50)
        val c132 = Results("Volvo", "S60", "Sedan", 3080000, 2022, "Hybrid", "Automatic", "White", 24700, 82.50)
        val c133 = Results("Volvo", "S60", "Sedan", 3080000, 2022, "Hybrid", "Automatic", "Black", 34600, 82.50)

        val c134 = Results("Audi", "A4", "Sedan", 3005000, 2022, "Diesel", "Automatic", "White", 16000, 81.75)
        val c135 = Results("Audi", "A4", "Sedan", 2820000, 2021, "Diesel", "Automatic", "White", 15500, 81.75)
        val c136 = Results("Audi", "A4", "Sedan", 3005000, 2022, "Diesel", "Automatic", "Black", 15000, 81.75)
        val c137 = Results("Audi", "A4", "Sedan", 2820000, 2021, "Diesel", "Automatic", "Black", 12300, 81.75)

        val c138 = Results("Audi", "E-Tron GT", "Sedan", 5750000, 2021, "Electric", "Automatic", "Black", 13500, 82.00)
        val c139 = Results("Audi", "E-Tron GT", "Sedan", 5750000, 2021, "Electric", "Automatic", "White", 35680, 82.00)

        val c140 = Results("Mercedes-Benz", "E Class", "Sedan", 3550000, 2022, "Diesel", "Automatic", "White", 28600, 77.00)
        val c141 = Results("Mercedes-Benz", "E Class", "Sedan", 4300000, 2021, "Diesel", "Automatic", "White", 34600, 77.00)
        val c142 = Results("Mercedes-Benz", "E Class", "Sedan", 4300000, 2021, "Diesel", "Automatic", "Black", 24700, 77.00)
        val c143 = Results("Mercedes-Benz", "E Class", "Sedan", 3550000, 2022, "Diesel", "Automatic", "Black", 24700, 77.00)
        val c144 = Results("Mercedes-Benz", "E Class", "Sedan", 5000008, 2023, "Diesel", "Automatic", "Grey", 34600, 77.00)
        val c145 = Results("Mercedes-Benz", "EQS", "Limousine", 6050000, 2022, "Electric", "Automatic", "White", 16000, 86.25)
        val c146 = Results("Mercedes-Benz", "EQS", "Limousine", 4600000, 2021, "Electric", "Automatic", "White", 15500, 86.25)
        val c147 = Results("Mercedes-Benz", "EQS", "Limousine", 6050000, 2022, "Electric", "Automatic", "Black", 15000, 86.25)
        val c148 = Results("Mercedes-Benz", "EQS", "Limousine", 4600000, 2021, "Electric", "Automatic", "Black", 12300, 86.25)

        val c149 = Results("Porsche", "Panamera GTS", "Limousine", 17500000, 2023, "Petrol", "Automatic", "White", 13500, 90.00)
        val c150 = Results("Porsche", "Panamera 4S E-Hybrid", "Limousine", 15650000, 2023, "Hybrid", "Automatic", "Black", 35680, 92.00)

        val c151 = Results("BMW", "i7", "Limousine", 8200000, 2021, "Electric", "Automatic", "Black", 28600, 81.00)
        val c152 = Results("BMW", "i7", "Limousine", 9100000, 2023, "Electric", "Automatic", "Grey", 34600, 81.00)

        val c153 = Results("Maserati", "Quattroporte", "Limousine", 7229400, 2018, "Diesel", "Automatic", "Black", 24700, 80.00)
        val c154 = Results("Maserati", "Quattroporte", "Limousine", 8750000, 2022, "Diesel", "Automatic", "Black", 24700, 80.00)

        val c155 = Results("Jaguar", "XJ", "Limousine", 3500000, 2016, "Petrol", "Manuel", "Black", 34600, 70.00)

        val c156 = Results("Lexus", "LS", "Limousine", 1197800, 2023, "Hybrid", "Automatic", "Blue", 3500, 98.00)
        val c157 = Results("Lexus", "LS", "Limousine", 1197800, 2023, "Hybrid", "Automatic", "Black", 5500, 98.00)
        val c158 = Results("Lexus", "LS", "Limousine", 1197800, 2023, "Hybrid", "Automatic", "White", 6000, 98.00)

        val c159 = Results("Volkswagen", "Transporter Panelvan", "Van", 960000, 2023, "Diesel", "Automatic", "Blue", 5500, 60.00)
        val c160 = Results("Volkswagen", "Transporter Panelvan", "Van", 960000, 2023, "Diesel", "Automatic", "Grey", 2500, 60.00)
        val c161 = Results("Volkswagen", "Transporter Panelvan", "Van", 960000, 2023, "Diesel", "Automatic", "Red", 3450, 60.00)
        val c162 = Results("Volkswagen", "Transporter Panelvan", "Van", 960000, 2023, "Diesel", "Automatic", "Beige", 8500, 60.00)
        val c163 = Results("Volkswagen", "Transporter Panelvan", "Van", 880000, 2022, "Diesel", "Automatic", "Red", 16000, 60.00)
        val c164 = Results("Volkswagen", "Transporter Panelvan", "Van", 880000, 2022, "Diesel", "Automatic", "Beige", 15500, 60.00)

        val c165 = Results("Mercedes-Benz", "Vito Panelvan", "Van", 1442200, 2023, "Diesel", "Manuel", "Grey", 15000, 70.00)
        val c166 = Results("Mercedes-Benz", "Vito Panelvan", "Van", 1442200, 2023, "Diesel", "Manuel", "Blue", 12300, 70.00)
        val c167 = Results("Mercedes-Benz", "Vito Panelvan", "Van", 1442200, 2023, "Diesel", "Manuel", "Red", 13500, 70.00)

        val c168 = Results("Fiat", "Scudo Panelvan", "Van", 954900, 2023, "Diesel", "Manuel", "Black", 35680, 49.25)
        val c169 = Results("Fiat", "Scudo Panelvan", "Van", 954900, 2023, "Diesel", "Manuel", "Grey", 28600, 49.25)
        val c170 = Results("Fiat", "Scudo Panelvan", "Van", 870900, 2021, "Diesel", "Manuel", "Grey", 34600, 49.25)
        val c171 = Results("Fiat", "Scudo Panelvan", "Van", 870900, 2021, "Diesel", "Manuel", "White", 24700, 49.25)

        val c172 = Results("Citroen", "Jumpy Panelvan", "Van", 979300, 2023, "Diesel", "Manuel", "Black", 24700, 24.00)
        val c173 = Results("Citroen", "Jumpy Panelvan", "Van", 979300, 2023, "Diesel", "Manuel", "Grey", 34600, 24.00)
        val c174 = Results("Citroen", "Jumpy Panelvan", "Van", 979300, 2023, "Diesel", "Manuel", "Brown", 3500, 24.00)
        val c175 = Results("Citroen", "Jumpy Panelvan", "Van", 979300, 2023, "Diesel", "Manuel", "White", 4500, 24.00)

        resultList = ArrayList<Results>()
        resultList.add(c1)
        resultList.add(c2)
        resultList.add(c3)
        resultList.add(c4)
        resultList.add(c5)
        resultList.add(c6)
        resultList.add(c7)
        resultList.add(c8)
        resultList.add(c9)
        resultList.add(c10)
        resultList.add(c11)
        resultList.add(c12)
        resultList.add(c13)
        resultList.add(c14)
        resultList.add(c15)
        resultList.add(c16)
        resultList.add(c17)
        resultList.add(c18)
        resultList.add(c19)
        resultList.add(c20)
        resultList.add(c21)
        resultList.add(c22)
        resultList.add(c23)
        resultList.add(c24)
        resultList.add(c25)
        resultList.add(c26)
        resultList.add(c27)
        resultList.add(c28)
        resultList.add(c29)
        resultList.add(c30)
        resultList.add(c31)
        resultList.add(c32)
        resultList.add(c33)
        resultList.add(c34)
        resultList.add(c35)
        resultList.add(c36)
        resultList.add(c37)
        resultList.add(c38)
        resultList.add(c39)
        resultList.add(c40)
        resultList.add(c41)
        resultList.add(c42)
        resultList.add(c43)
        resultList.add(c44)
        resultList.add(c45)
        resultList.add(c46)
        resultList.add(c47)
        resultList.add(c48)
        resultList.add(c49)
        resultList.add(c50)
        resultList.add(c51)
        resultList.add(c52)
        resultList.add(c53)
        resultList.add(c54)
        resultList.add(c55)
        resultList.add(c56)
        resultList.add(c57)
        resultList.add(c58)
        resultList.add(c59)
        resultList.add(c60)
        resultList.add(c61)
        resultList.add(c62)
        resultList.add(c63)
        resultList.add(c64)
        resultList.add(c65)
        resultList.add(c66)
        resultList.add(c67)
        resultList.add(c68)
        resultList.add(c69)
        resultList.add(c70)
        resultList.add(c71)
        resultList.add(c72)
        resultList.add(c73)
        resultList.add(c74)
        resultList.add(c75)
        resultList.add(c76)
        resultList.add(c77)
        resultList.add(c78)
        resultList.add(c79)
        resultList.add(c80)
        resultList.add(c81)
        resultList.add(c82)
        resultList.add(c83)
        resultList.add(c84)
        resultList.add(c85)
        resultList.add(c86)
        resultList.add(c87)
        resultList.add(c88)
        resultList.add(c89)
        resultList.add(c90)
        resultList.add(c91)
        resultList.add(c92)
        resultList.add(c93)
        resultList.add(c94)
        resultList.add(c95)
        resultList.add(c96)
        resultList.add(c97)
        resultList.add(c98)
        resultList.add(c99)
        resultList.add(c100)
        resultList.add(c101)
        resultList.add(c102)
        resultList.add(c103)
        resultList.add(c104)
        resultList.add(c105)
        resultList.add(c106)
        resultList.add(c107)
        resultList.add(c108)
        resultList.add(c109)
        resultList.add(c110)
        resultList.add(c111)
        resultList.add(c112)
        resultList.add(c113)
        resultList.add(c114)
        resultList.add(c115)
        resultList.add(c116)
        resultList.add(c117)
        resultList.add(c118)
        resultList.add(c119)
        resultList.add(c120)
        resultList.add(c121)
        resultList.add(c122)
        resultList.add(c123)
        resultList.add(c124)
        resultList.add(c125)
        resultList.add(c126)
        resultList.add(c127)
        resultList.add(c128)
        resultList.add(c129)
        resultList.add(c130)
        resultList.add(c131)
        resultList.add(c132)
        resultList.add(c133)
        resultList.add(c134)
        resultList.add(c135)
        resultList.add(c136)
        resultList.add(c137)
        resultList.add(c138)
        resultList.add(c139)
        resultList.add(c140)
        resultList.add(c141)
        resultList.add(c142)
        resultList.add(c143)
        resultList.add(c144)
        resultList.add(c145)
        resultList.add(c146)
        resultList.add(c147)
        resultList.add(c148)
        resultList.add(c149)
        resultList.add(c150)
        resultList.add(c151)
        resultList.add(c152)
        resultList.add(c153)
        resultList.add(c154)
        resultList.add(c155)
        resultList.add(c156)
        resultList.add(c157)
        resultList.add(c158)
        resultList.add(c159)
        resultList.add(c160)
        resultList.add(c161)
        resultList.add(c162)
        resultList.add(c163)
        resultList.add(c164)
        resultList.add(c165)
        resultList.add(c166)
        resultList.add(c167)
        resultList.add(c168)
        resultList.add(c169)
        resultList.add(c170)
        resultList.add(c171)
        resultList.add(c172)
        resultList.add(c173)
        resultList.add(c174)
        resultList.add(c175)

        if(infoWorker.equals("executive")) {

            filteredList = resultList.filter { it.bodyType.equals("Sedan") || it.bodyType.equals("Limousine") }

    }
        if(infoWorker.equals("white")) {

            filteredList = resultList.filter { it.bodyType.equals("Sedan") || it.bodyType.equals("Hatchback") }

        }

        if(infoWorker.equals("blue")) {

            filteredList = resultList.filter { it.bodyType.equals("Van") || it.bodyType.equals("Hatchback") }

        }


        if(!colorList.isNullOrEmpty()){

            filteredList = filteredList.filter { results ->  colorList.contains(results.color)

            }
        }

        if(!brandList.isNullOrEmpty()){

            filteredList = filteredList.filter { results ->  brandList.contains(results.brand)

            }
        }

        if(!modelList.isNullOrEmpty()){

            filteredList = filteredList.filter { results ->  modelList.contains(results.model)

            }
        }

        if(!bodyTypeList.isNullOrEmpty()){

            filteredList = filteredList.filter { results ->  bodyTypeList.contains(results.bodyType)

            }
        }

        if(!engineSrcList.isNullOrEmpty()){

            filteredList = filteredList.filter { results ->  engineSrcList.contains(results.engineSrc)

            }
        }

        if(!modelYearList.isNullOrEmpty()){

            filteredList = filteredList.filter { results ->  modelYearList.contains(results.modelYear.toString())

            }
        }

        if(minPriceInt != 0 || maxPriceInt != 0){

            filteredList = filteredList.filter { results ->
                results.price in minPriceInt..maxPriceInt
            }

        }
        if(minOdometerInt != 0 || maxOdometerInt != 0){

            filteredList = filteredList.filter { results ->
                results.odometer in minOdometerInt..maxOdometerInt
            }

        }
        if(minSafetyInt != 0 || maxSafetyInt != 0){

            filteredList = filteredList.filter { results ->
                results.safety.toInt() in minSafetyInt..maxSafetyInt
            }
        }

        if (sortInfo.equals("colorIncrease")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val colorOrder = mapOf("Blue" to 1, "Red" to 2, "Yellow" to 3,"Orange" to 4,"White" to 5, "Silver" to 6, "Black" to 7 ,"Grey" to 8)

                val order1 = colorOrder[result1.color] ?: Int.MAX_VALUE
                val order2 = colorOrder[result2.color] ?: Int.MAX_VALUE

                order1.compareTo(order2)}).reversed()

        }
        if (sortInfo.equals("colorDecrease") || firstKey.equals("Color")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val colorOrder = mapOf("Grey" to 1, "Black" to 2, "Silver" to 3,"White" to 4,"Orange" to 5, "Yellow" to 6, "Red" to 7 ,"Blue" to 8)

                val order1 = colorOrder[result1.color] ?: Int.MAX_VALUE
                val order2 = colorOrder[result2.color] ?: Int.MAX_VALUE

                order1.compareTo(order2)}).reversed()
            firstKey=""
        }
        if (sortInfo.equals("brandIncrease")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf("Porsche" to 1, "Mercedes-Benz" to 2, "Tesla" to 3,"Lexus" to 4,"Mini" to 5, "Volvo" to 6, "Audi" to 7 ,"Cupra" to 8,"BMW" to 9,"Alfa Romeo" to 10,"Volkswagen" to 11,"" to 12,"Smart" to 13,"Opel" to 14,"Citroen" to 15,"Peugeot" to 16,"Ford" to 17,"Nissan" to 20,"Renault" to 19,"Hyundai" to 20,"Kia" to 21,"Toyota" to 22,"Fiat" to 23)

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order1.compareTo(order2)}).reversed()

        }
        if (sortInfo.equals("brandDecrease")|| firstKey.equals("Brand")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf(
                    "Porsche" to 1, "Mercedes-Benz" to 2, "Tesla" to 3, "Lexus" to 4,
                    "Mini" to 5, "Volvo" to 6, "Audi" to 7, "Cupra" to 8, "BMW" to 9,
                    "Alfa Romeo" to 10, "Volkswagen" to 11, "" to 12, "Smart" to 13,
                    "Opel" to 14, "Citroen" to 15, "Peugeot" to 16, "Ford" to 17,
                    "Nissan" to 20, "Renault" to 19, "Hyundai" to 20, "Kia" to 21,
                    "Toyota" to 22, "Fiat" to 23
                )

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order1.compareTo(order2)
            })
            firstKey=""
        }
        if (sortInfo.equals("bodyTypeDecrease")|| firstKey.equals("Body Type")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf(
                    "Limousine" to 1, "Sedan" to 2, "Hatchback" to 3, "Van" to 4,
                )

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order1.compareTo(order2)
            })

            firstKey=""

        }
        if (sortInfo.equals("bodyTypeIncrease")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf(
                    "Limousine" to 1, "Sedan" to 2, "Hatchback" to 3, "Van" to 4,
                )

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order2.compareTo(order1)
            })

        }
        if (sortInfo.equals("engineDecrease")|| sortInfo.equals("Engine Source")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf(
                    "Electric" to 1, "Hybrid" to 2, "Diesel" to 3, "Petrol" to 4,
                )

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order1.compareTo(order2)
            })
            firstKey=""
        }
        if (sortInfo.equals("engineIncrease")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf(
                    "Electric" to 1, "Hybrid" to 2, "Diesel" to 3, "Petrol" to 4,
                )

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order2.compareTo(order1)
            })

        }
        if (sortInfo.equals("modelDecrease")|| firstKey.equals("Model")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf("EQ" to 1, "Model S" to 2, "Giulia" to 3,"5 Series" to 4,"3 Series" to 5, "Cooper 5 Door" to 6, "A Class" to 7 ,"A3 Sportback" to 8,"E Class" to 9,"Scala" to 10,"Astra" to 11,"ES" to 12,"1 Series" to 13,"Golf" to 14,"Polo" to 15,"308" to 16,"Zoe" to 17,"A4" to 20,"S60" to 19,"Focus" to 20,"i20" to 21)

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order2.compareTo(order1)}).reversed()
            firstKey=""
        }
        if (sortInfo.equals("modelIncrease")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf("EQ" to 1, "Model S" to 2, "Giulia" to 3,"5 Series" to 4,"3 Series" to 5, "Cooper 5 Door" to 6, "A Class" to 7 ,"A3 Sportback" to 8,"E Class" to 9,"Scala" to 10,"Astra" to 11,"ES" to 12,"1 Series" to 13,"Golf" to 14,"Polo" to 15,"308" to 16,"Zoe" to 17,"A4" to 20,"S60" to 19,"Focus" to 20,"i20" to 21)

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order1.compareTo(order2)}).reversed()

        }
        if (sortInfo.equals("odometerDecrease") ){
            filteredList = filteredList.sortedByDescending { it.odometer }

        }
        if (sortInfo.equals("odometerIncrease")|| firstKey.equals("Odometer")){
            filteredList = filteredList.sortedByDescending { it.odometer }.reversed()
            firstKey=""
        }
        if (sortInfo.equals("transmissionDecrease")|| firstKey.equals("Transmission")){
            filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
                val brandOrder = mapOf("Automatic" to 1, "Manuel" to 2)

                val order1 = brandOrder[result1.brand] ?: Int.MAX_VALUE
                val order2 = brandOrder[result2.brand] ?: Int.MAX_VALUE

                order2.compareTo(order1)}).reversed()
            firstKey=""
        }
        if (sortInfo.equals("transmissionIncrease")){


        }
        if (sortInfo.equals("priceDecrease")){
            filteredList = filteredList.sortedByDescending { it.price }

        }
        if (sortInfo.equals("priceIncrease")|| firstKey.equals("Price")){
            filteredList = filteredList.sortedByDescending { it.price }.reversed()
            firstKey=""
        }
        if (sortInfo.equals("safetyDecrease")|| firstKey.equals("Safety")){
            filteredList = filteredList.sortedByDescending { it.safety }
            firstKey=""
        }
        if (sortInfo.equals("safetyIncrease")){
            filteredList = filteredList.sortedByDescending { it.safety }.reversed()

        }
        if (sortInfo.equals("modelYearDecrease")|| firstKey.equals("Model Year")){
            filteredList = filteredList.sortedByDescending { it.modelYear }
            firstKey=""
        }
        if (sortInfo.equals("modelYearIncrease")){
            filteredList = filteredList.sortedByDescending { it.modelYear }.reversed()

        }

       /* filteredList = filteredList.sortedWith(Comparator { result1, result2 ->
            val colorOrder = mapOf("Blue" to 1, "Red" to 2, "Yellow" to 3,"Orange" to 4,"White" to 5, "Silver" to 6, "Black" to 7 ,"Grey" to 8)

            val order1 = colorOrder[result1.color] ?: Int.MAX_VALUE
            val order2 = colorOrder[result2.color] ?: Int.MAX_VALUE

            order1.compareTo(order2)
        }) */

        //filteredList = filteredList.sortedByDescending { it.odometer }

            adapter = ResultRvAdapter(this,filteredList,infoWorker)

        rv.adapter = adapter

    }
}