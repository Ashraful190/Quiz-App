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

        // -------------------- History --------------------
        Quiz("Who was the first President of the United States?", listOf("Abraham Lincoln", "George Washington", "John Adams", "Thomas Jefferson"), 1, "History"),
        Quiz("In which year did World War II end?", listOf("1942", "1945", "1948", "1950"), 1, "History"),
        Quiz("Who was known as the 'Father of the Nation' of India?", listOf("Subhas Chandra Bose", "Jawaharlal Nehru", "Mahatma Gandhi", "Sardar Patel"), 2, "History"),
        Quiz("The Great Wall of China was built to protect against which group?", listOf("Mongols", "Romans", "Huns", "Persians"), 0, "History"),
        Quiz("In which year did Bangladesh gain independence?", listOf("1970", "1971", "1972", "1973"), 1, "History"),
        Quiz("Who discovered America in 1492?", listOf("Vasco da Gama", "Christopher Columbus", "Ferdinand Magellan", "Marco Polo"), 1, "History"),
        Quiz("The ancient city of Rome was founded on which river?", listOf("Tiber", "Nile", "Danube", "Seine"), 0, "History"),
        Quiz("Who was the first Emperor of China?", listOf("Liu Bang", "Qin Shi Huang", "Sun Yat-sen", "Kublai Khan"), 1, "History"),
        Quiz("Which empire built the famous Taj Mahal?", listOf("Gupta Empire", "Mughal Empire", "Maurya Empire", "British Empire"), 1, "History"),
        Quiz("Who was the leader of Germany during World War II?", listOf("Adolf Hitler", "Joseph Stalin", "Winston Churchill", "Benito Mussolini"), 0, "History"),




        // -------------------- Geography --------------------
        Quiz("What is the largest continent on Earth?", listOf("Africa", "Asia", "Europe", "North America"), 1, "Geography"),
        Quiz("Which is the longest river in the world?", listOf("Amazon River", "Nile River", "Yangtze River", "Mississippi River"), 1, "Geography"),
        Quiz("Mount Everest is located in which mountain range?", listOf("Andes", "Rocky Mountains", "Himalayas", "Alps"), 2, "Geography"),
        Quiz("Which country has the largest population?", listOf("India", "China", "USA", "Indonesia"), 1, "Geography"),
        Quiz("What is the capital city of Australia?", listOf("Sydney", "Melbourne", "Canberra", "Brisbane"), 2, "Geography"),
        Quiz("Which ocean is the largest?", listOf("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"), 3, "Geography"),
        Quiz("The Sahara Desert is located in which continent?", listOf("Asia", "Africa", "Australia", "North America"), 1, "Geography"),
        Quiz("Which country is known as the Land of the Rising Sun?", listOf("China", "Japan", "South Korea", "Thailand"), 1, "Geography"),
        Quiz("Which is the smallest country in the world?", listOf("Vatican City", "Monaco", "Maldives", "San Marino"), 0, "Geography"),
        Quiz("What is the capital of Bangladesh?", listOf("Dhaka", "Chittagong", "Khulna", "Sylhet"), 0, "Geography"),




        )
}
