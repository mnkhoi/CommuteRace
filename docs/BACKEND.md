# CommuteRace - Backend

> [!NOTE]
> This document is incomplete and will be changed later on

## Responsibilities

- Collect data on completion of route
- Generate threads for tracking a user's progress on a route
- Uploading completion data to go through if it worked

## Technologies

- Java
- Spring Boot
- OAuth
- Database: Postgres with PostGIS for information data

## File Structure

Current file structure under `backend/src/main/java/com/mnkhoi/CommuteRace`.

```md
config/         # For configurations
controller/     # Handle request and responses
model/          # Define data structures usually mapped to DB
repository/     # Handle data access to database (CRUD)
service/        # Implement business logic and application rules (validation, 
                calculation, transactions)
```
