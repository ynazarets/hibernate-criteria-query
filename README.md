# hibernate-criteria-query

Imagine, that user has sent the request with URL: 
`http://localhost:8080/phones?countryManufactured=China&producer=apple,nokia,samsung&color=white,red`

__Your task is to implement all PhoneDao methods.__

Method findAll() has one input parameter - `Map<String, String[]> params`. It has following format:
```text
Map<String, String[]> params = new HashMap<>();
params.put("countryManufactured", new String[]{"China"};
params.put("producer", new String[]{"apple", "nokia", "samsung"};
params.put("color", new String[]{"white", "red"};
```
You need to find all phones that match the specified parameters.
