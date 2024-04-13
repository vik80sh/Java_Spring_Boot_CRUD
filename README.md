Update resource > application.properties file with correct database URL 

4 package here
1. dao
2. entity
3. restController
4. service
   

DOA -> Data Access Object, I have added an interface class and implementation class, The Implementation class is @Repository which deals with database


entity -> entity package has data entity define, like school class and added their data with getter setter


restController -> has points where all API has been created, and calling respective Services based on Endpoint


service -> Service class used to call DAO implementation 
