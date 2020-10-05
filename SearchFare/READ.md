# Getting Started

 ** Mock Project **:
 Run Gradle Mock project so that Fare details can be fetched by back-end application : (port : 8080)


 ** SearchFare (Front-end Application) **:
 Run Maven Application to receive User input : (port : 8082)
 
    URL: http://localhost:8082/home
    Sample Input Parameters : Source      - DEL (3 letter IATA Code)
                              Destination - BOM (3 letter IATA Code)

    Response Format : 
    Fare Details : {"amount":2675.08,"currency":"EUR","origin":"DEL","destination":"BOM"}

 ** trip_java (Back-end Application) ** :
 
  Run this Gradle project to access the mock api for retrieving Fare Details (port : 8081)
    
	URL      : http://localhost:8081/trip/fare/{source}/{destination} 
	Purpose  : It will retrieve fare details accordingly
            
  	URL      : http://localhost:8081/trip/airportinfo/{term}
  	Purpose  : It will retrieve Airport details

