# Blockchain News Aggregator using Java & Python
This repository is an archive of Group 10's Object-Oriented Programming (IT3010E) capstone project. 

The aggregator consists of 2 main parts
**The data**

The data is fetched from various blockchain websites using Jsoup (a Java library for inspecting + scraping (mining) HTML contents) and is collected in JSON format. Each Blockchain articles consists of 9 basic details, which is shown in 5 JSON files in _data+website_name_ in _ResourceFiles_ folder

**The search engine + Interface**

The search engine will communicate with the data + interface via Restful API to process user query + return user search results. To run the program, you should run the _RestfulAPI_, which is the _app.py_ file in _resfulAPI_ folder, then run _Main.java_ file from _JavaBlockchain_ folder to show the results
