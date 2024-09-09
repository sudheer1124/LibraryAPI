This is a sample LIbrary application which will add books into H2 database.

To Delete the book:
http://localhost:8082/api/books/1

To Add the book: Use POST
http://localhost:8082/api/books

Body: 
{
  "id": 1,
  "title": "Effective Java",
  "author": "Joshua Bloch"
}

To connect to H2:
http://localhost:8082/h2-console/login.do?jsessionid=cb679c8f46e5fb13495218da2f5b3ff0

SELECT * FROM BOOK;
