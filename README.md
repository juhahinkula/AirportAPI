# AirportAPI
<img src="https://github.com/juhahinkula/AirportAPI/blob/main/take-off.png" width="80" height="80">
REST API to get airport data. Contains >50000 airports and heliports worldwide. You can fetch airports by type, by country, by IATA code etc.

## HTTP Request
 ``GET https://airportsapi.herokuapp.com/airports``
 
 ## Sample response

 ```
[
  {
    "id": 16715,
    "type": "large",
    "name": "Lester B. Pearson International Airport",
    "countryCode": "CA",
    "region": "CA-ON",
    "municipality": "Toronto",
    "gpsCode": "CYYZ",
    "iataCode": "YYZ",
    "elevation": 569,
    "lat": 43.67720032,
    "lng": -79.63059998
  }
]
 ```
 
 ### Schema
 
 #### Airport
 
 | Field    | Description |
| ----------- | ----------- |
| id     | Airport id       |
| type   | Type (small, medium, large, closed or heliport) |
| name     | Airport name       |
| countryCode   | Country ISO code |
| region   | Region |
| municipality   | Municipality |
| gpsCode   | GPS code |
| iataCode   | IATA code |
| lat   | Latitude |
| lng   | Longitude |
| elevation   | Elevation (ft) |
 
 ## Endpoints
 
 ### Get all airports
  `` GET /airports``
  
 - Contains paging: default page = 0, default page size = 100
 
  Query parameters: 
 ``page`` Page number
 ``size`` Page size

 Example:
 ```http://localhost:8080/airports?page=1&size=1000```
 
 ### Get airports by id
 ``GET /airports/id?id={airport_id}``
 
 Query parameters: 
 ``id`` Airport id
 
 Example:
 ```http://localhost:8080/airports/id?id=1```
 
 ### Get airports by type
 ``GET /airports/type?type={airport_type}``
 
 Query parameters: 
 ``type`` small, medium, large, heliport or closed
 
 Example:
 ```http://localhost:8080/airports/type?type=small```
 
 ### Get airports by name
 ``GET /airports/name?name={airport_name}``
 
 Query parameters: 
 ``name`` Name of an airport or heliport
 
 Example:
 ```http://localhost:8080/airports/type?name=Stockholm-Arlanda Airport```
 
 ### Get airports by country
 ``GET /airports/country?code={country_code}``
 
 Query parameters: 
 ``code`` Country ISO code
 
 Example:
 ```http://localhost:8080/airports/country?code=US```
 
 ### Get airports by IATA code
 ``GET /airports/iata?code={iata_code}``
 
 Query parameters: 
 ``code`` Airport IATA code
 
 Example:
 ```http://localhost:8080/airports/iata?code=YYZ```
 
 ### Get airports by GPS code
 ``GET /airports/gps?code={gps_code}``
 
 Query parameters: 
 ``code`` Airport GPS code
 
 Example:
 ```http://localhost:8080/airports/gps?code=CYYZ```
 
 