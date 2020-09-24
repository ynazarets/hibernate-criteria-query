# hibernate-criteria-query

Imagine, that user has sent the request with URL: 
`http://localhost:8080/phones?countryManufactured=China&producer=apple,nokia,samsung&color=white,red`

You have parsed this URL and fetch all required parameters for search. The resulted map looks like:
```text
Map<String, String[]> params = new HashMap<>();
params.put("countryManufactured", new String[]{"China"};
params.put("producer", new String[]{"apple", "nokia", "samsung"};
params.put("color", new String[]{"white", "red"};
```

Your task is to configure Hibernate in this project and implement all PhoneDao methods.
