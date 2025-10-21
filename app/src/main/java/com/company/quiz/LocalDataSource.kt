package com.company.quiz


object LocalDataSource {
    val questions = mutableListOf<Quiz>(
        // -------------------- Science --------------------
        Quiz("What is the boiling point of water?", listOf("90°C", "100°C", "110°C", "120°C"), 1, "Science"),
        Quiz("Which planet is known as the Red Planet?", listOf("Earth", "Mars", "Jupiter", "Venus"), 1, "Science"),
        Quiz("What gas do plants absorb from the atmosphere?", listOf("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"), 2, "Science"),
        Quiz("What is the hardest natural substance?", listOf("Iron", "Gold", "Diamond", "Granite"), 2, "Science"),
        Quiz("What part of the plant conducts photosynthesis?", listOf("Root", "Stem", "Leaf", "Flower"), 2, "Science"),
        Quiz("Which organ pumps blood in the human body?", listOf("Lungs", "Kidneys", "Brain", "Heart"), 3, "Science"),
        Quiz("What is the center of an atom called?", listOf("Electron", "Nucleus", "Proton", "Neutron"), 1, "Science"),
        Quiz("What is H2O?", listOf("Oxygen", "Hydrogen", "Water", "Salt"), 2, "Science"),
        Quiz("Which gas is most abundant in the Earth’s atmosphere?", listOf("Oxygen", "Carbon Dioxide", "Nitrogen", "Hydrogen"), 2, "Science"),
        Quiz("What is the national flower of Bangladesh?", listOf("Rose", "Tulip", "Water Lily", "Sunflower"), 2, "Science"),

        // -------------------- Math --------------------
        Quiz("What is 7 + 8?", listOf("15", "14", "13", "16"), 0, "Math"),
        Quiz("What is 12 × 12?", listOf("124", "144", "132", "142"), 1, "Math"),
        Quiz("What is the square root of 81?", listOf("7", "8", "9", "10"), 2, "Math"),
        Quiz("What is 25% of 200?", listOf("40", "45", "50", "55"), 2, "Math"),
        Quiz("What is the value of Pi (approx)?", listOf("3.12", "3.14", "3.16", "3.18"), 1, "Math"),
        Quiz("What is 3²?", listOf("6", "8", "9", "12"), 2, "Math"),
        Quiz("What is 100 divided by 4?", listOf("20", "25", "30", "40"), 1, "Math"),
        Quiz("What is 10³?", listOf("100", "1000", "10", "10000"), 1, "Math"),
        Quiz("Solve: 15 - 7 + 2", listOf("10", "8", "9", "11"), 2, "Math"),
        Quiz("What is the next prime number after 7?", listOf("9", "10", "11", "13"), 2, "Math"),



    )
}
