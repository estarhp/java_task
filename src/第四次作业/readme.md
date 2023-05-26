```mysql
create database cqupt;
use cqupt;
create table if not exists "cqupt_student" (
"student_id" varchar(10) not null,
"name" varchar(20) not null,
"sex" varchar(2) not null,
"age" integer ,
"Fee" decimal(10,2),
"address" varchar(50),
"memo" varchar(300),
primary key ("student_id")
);

create table  if not exists "CourseAa" (
"Aa1" varchar(30) not null,
"Aa2" integer not null,
"Aa3" decimal(10)
);

create table if not exists ChooseBb (
"Bb1" varchar(30) not null,
"Bb2" integer,
"Bb3" decimal(6)
);

ALTER table ChooseBb add Bb4 varchar(20) not null default "系统测试值";
ALTER table ChooseBb add Bb5 varchar(10) not null default pk_ChooseBb,add constraint pk_ChooseBb primary key (Bb5) ;



create  view View_Choosebb as select Bb1 as View_bb1,Bb4 as View_bb2 , Bb5 as View_bb3 from chooseBb;


drop view View_Choosebb;

create index Index_bb2 on ChooseBb(Bb2 asc);
create index Index_bb4  on ChooseBb(Bb4 desc);

drop index Index_bb2 on ChooseBb;

create table if not exists "test" (
"Name" varchar(20),
"Age" Integer,
"Score" numeric(10,2),
"Address" varchar(60)
);

insert into test (Name,Age,Score,Address) values
("找一",20,580.00,"chogyou 125"),
("zhaoer",20,580.00,"chongyou 215"),
("zhaosan",20,580.00,"chogyou 213");

create table if not exists "test_temp" (
"Name" varchar(20),
"Age" integer,
"Score" numeric(10,2),
"Address" varchar(60)

);

insert into test (Name,Age,Score,Address) values
("找一",20,580.00,"chogyou 125"),
("zhaoer",20,580.00,"chongyou 215"),
("zhaosan",20,580.00,"chogyou 213");

insert into test (Name,Age,Score,Address) select Name,Age,Score,Address as Name,Age,Score,Address from test_temp;

update test set Score = Score+5 where Age <= 20;
update test set Age=Age-1 where Address = "chongou123" ;

delete from test where Age >= 21 and Score >= 500;
delete from test where Score < 500 and Address = "chongyou";

create table if not exists "Student" (
"SNO" varchar(20),
"Name" varchar(10),
"Age" integer,
"College" varchar(30)

);

create table if not exists "Course" (
"CourseID" varchar(15),
"CourseName" varchar(30),
"CourseBeforeID" varchar(15)

);

create table if not exists "Choose" (
"SNO" varchar(20),
"Course" varchar(30),
"Score" decimal(5,2)
);

insert into Student (SNO,Name,Age,College) values   
(1001, 'Alice', '20'),
(1002, 'Bob', "20"),
(1003, 'Charlie', '20');

insert into Course (CourseID,CourseName,CourseBeforeID) values
(),
(),
();

insert into Choose (SNO,CouseID,Score) values
(),(),(),(),(),(),();

select student_id,student_name from Student Where Address = "chongyou";

select  * from Student where Age between 20 and 23;
select count(*) as total_students from Student;
select max(C1) as max_score,
min(C1) as min_score,
sum(C1) as total_score,
avg(C1) as avg_score from Student;

select couse_id,couse_name from Couse where prerequsets_id is NULL;

select Students.student_id,
Students.student_name,
Couses.couse_name,
Choose.score
from Students,Courses,Choose
where Students.student_id = Choose.student_id and       Couses.couse_id = Choose.course_id;

select * from Students s1 where exists (
select 1
from Students s2
where s2.student_name = "zahngsan" and s1.department =s2.department and s1.student_id != s2.stduent_id
);

select student_id,score from students where C1_score < (select C1_score from students where studen_name = "zahngsan");

select student_id from course_selection where course_name = "c1"
union
select stduen_id from course_selection where course_name = "c3";

select distinct student_id from (
select student_id from course_selecton where course_name = "c1"
union
select student_id from course_selection where course_name = "c3"

) as temp_table;


```

