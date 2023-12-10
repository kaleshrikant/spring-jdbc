mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| springjdbc         |
| sys                |
| temp               |
+--------------------+
6 rows in set (0.01 sec)

mysql> use springjdbc;
Database changed
mysql> show tables;
+----------------------+
| Tables_in_springjdbc |
+----------------------+
| student              |
+----------------------+
1 row in set (0.00 sec)

mysql> select * from student;
+-----+---------------+----------+
| id  | name          | city     |
+-----+---------------+----------+
| 111 | Shrikant kale | Amravati |
| 222 | Prashant Kale | Pune     |
| 333 | Shrikant Kale | Amravati |
+-----+---------------+----------+
3 rows in set (0.00 sec)
