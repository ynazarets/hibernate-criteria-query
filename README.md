# hibernate-criteria-query

Given: user has sent the request with URL: 
`http://localhost:8080/phones?features=ips,nfc&producer=apple,nokia,samsung&color=white,red&minPrice=1200&maxPrice=22943`

1. Implement the `URLParser` class
1. Add unit tests for `URLParser` class
1. Run the `init_db.sql` script to generate the schema and insert the data.
1. Configure Hibernate in this project.
1. Add required fields and annotations for `Phone` class.
1. Based on users request - return the data that satisfy the search options (e.g. implement `PhoneDao.findAll` with CriteriaQuery).
1. Return the top 10 most expensive phones. Use HQL here.
