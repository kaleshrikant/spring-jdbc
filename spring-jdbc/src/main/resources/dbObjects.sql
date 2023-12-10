mysql> create database springjdbc;
Query OK, 1 row affected (0.03 sec)

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
6 rows in set (0.03 sec)

mysql> use springjdbc;
Database changed
mysql> create table student (id int primary key, name varchar(100) not null, city varchar(200));
Query OK, 0 rows affected (0.12 sec)

mysql> show tables;
+----------------------+
| Tables_in_springjdbc |
+----------------------+
| student              |
+----------------------+
1 row in set (0.00 sec)

mysql> insert into student (id, name, city) values(111,'Shrikant kale','Amravati');
Query OK, 1 row affected (0.03 sec)

mysql> select * from student;
+-----+---------------+----------+
| id  | name          | city     |
+-----+---------------+----------+
| 111 | Shrikant kale | Amravati |
+-----+---------------+----------+
1 row in set (0.00 sec)

mysql> select * from student;
+-----+---------------+----------+
| id  | name          | city     |
+-----+---------------+----------+
| 111 | Shrikant kale | Amravati |
| 222 | SHRIKANT KALE | AMRAVATI |
| 333 | Shrikant Kale | Amravati |
+-----+---------------+----------+
3 rows in set (0.00 sec)
