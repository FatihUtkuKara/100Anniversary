package com.example.a100anniversary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView.RecyclerListener
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class ResultActivity : AppCompatActivity() {

    private lateinit var rv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        rv = findViewById(R.id.rv)

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




    }
}