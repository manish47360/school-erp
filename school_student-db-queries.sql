create database school_student;
use school_student;
create table student(
    id bigint Primary key auto_increment,
    name varchar(200),
    class varchar(20),
    roll_number integer
);

select * from student	