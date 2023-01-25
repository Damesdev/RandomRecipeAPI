
# Protein Recipe Generating API

This API returns a single recipe for individual protein sources and can return all recipes stored in the repository.




## Run Locally

### Starting the SQL Server

Download and Install SQL Server from:
https://dev.mysql.com/downloads/mysql/

Configure download settings to the device you are on.

Mac support: https://www.youtube.com/watch?v=-BDbOOY9jsc

Windows support: https://www.youtube.com/watch?v=OM4aZJW_Ojs&t=0s

Once MySQL server is complete and started run following script in MySQL Workbench

```bash
CREATE SCHEMA 'recipes_api'
```

### Accessing Project Files Locally


Clone the project

```bash
  git clone https://github.com/Damesdev/RandomRecipeAPI.git
```

Go to the project directory

```bash
  cd RecipeGeneratorApiFinal
```

Running the Spring Boot Project
```bash
  ./mvnw spring-boot:run
```

## API Endpoints


Get all recipes in repository
```bash
http://localhost:8081/
```

Get all unique proteins available in repository
```bash
http://localhost:8081/protein/unique
```

Get a single recipe for chosen protein from repository
```bash
http://localhost:8081/{protein}
```

Posting a new recipe to the repository (Use POST method)
```bash
http://localhost:8081/
```

Delete recipe by ID in repository (Use Delete method)
```bash
http://localhost:8081/{recipeID}
```
