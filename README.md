##Holiday Tree and Decoration Rental

---

###API

The API (Application Programming Interface) root directory of this project's repository contains the Java backend/server-side portion of the project. The directory currently contains an Eclipse Maven project serving the API in a JSON (JavaScript Object Notation) for a JavaScript application to reach from the client-side.

---

###DB

The DB (Database) root directory of this project's repository will contain an exported CSV file (`.csv`) and/or Excel Spreadsheet (`.xls`) depicting the structure of our database. Our database will be hosted on James Getrost's own server, and managed through the phpmyadmin platform, and possible MySQL Workbench in the future. Currently our database is titled `rental` and contains two tables named `decorations` and `cart`.

####Decorations

The decorations table will contain a full index of all the offered decorations including the following columns:

| Column Name | Data Type | Primary Key | Not Null | Binary | Zero Fill | Auto Increment | Default Value |
|:-----------:|:-----------:|:-----------:|:--------:|:------:|:---------:|:--------------:|:-------------:|
| productid | INT | TRUE | TRUE | FALSE | FALSE | TRUE | NONE |
| price | DOUBLE | FALSE | TRUE | FALSE | FALSE | FALSE | 0.00 |
| holiday | VARCHAR(20) | FALSE | FALSE | FALSE | FALSE | FALSE | NULL |

####Cart

The cart table will contain a listing of all items currently in the cart, including the following columns:

| Column Name | Data Type | Primary Key | Not Null | Binary | Zero Fill | Auto Increment | Default Value |
|:-----------:|:---------:|:-----------:|:--------:|:------:|:---------:|:--------------:|:-------------:|
| productid | INT | FALSE | TRUE | FALSE | FALSE | FALSE | NONE |
| dateadded | DATE | FALSE | FALSE | FALSE | FALSE | FALSE | NULL |
| cartid | INT | TRUE | TRUE | FALSE | FALSE | TRUE | NONE |

---

###UI
The UI (User Interface) root directory of this project's repository will contain the web files (`.html`, `.css`, and `.js`) that will be served to the client's browser for the use of navigation through the web service. In the future, the website will allow users to filter and browse the list of decorations offered, add them to their cart, and purchase them.

---
