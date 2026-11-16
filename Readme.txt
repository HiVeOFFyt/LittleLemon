API Endpoints to test in Insomnia:

1. Static HTML Home Page:
GET http://127.0.0.1:8000/restaurant/

2. User Registration & Token Authentication (Djoser & DRF):
POST http://127.0.0.1:8000/auth/users/
POST http://127.0.0.1:8000/auth/token/login/
POST http://127.0.0.1:8000/restaurant/api-token-auth/

3. Menu API (GET, POST, PUT, DELETE):
GET / POST http://127.0.0.1:8000/restaurant/menu/
GET / PUT / DELETE http://127.0.0.1:8000/restaurant/menu/1

4. Table Booking API (Requires Header: Authorization: Token <your_token>):
GET / POST http://127.0.0.1:8000/restaurant/booking/tables/
GET / PUT / DELETE http://127.0.0.1:8000/restaurant/booking/tables/1
