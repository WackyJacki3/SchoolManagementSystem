/* CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1; 
CREATE SEQUENCE IF NOT EXISTS student_sequence;

CREATE TABLE IF NOT EXISTS student(
    student_id bigint NOT NULL DEFAULT nextVal('student_sequence') PRIMARY KEY,
    first_name varchar(255),
    last_name varchar(255),
    phone_number varchar(255),
    email varchar(255)
);

CREATE SEQUENCE IF NOT EXISTS teacher_sequence;

CREATE TABLE IF NOT EXISTS teacher(
    teacher_id bigint NOT NULL DEFAULT nextVal('project_sequence') PRIMARY KEY,
    first_name varchar(255),
    last_name varchar(255),
    phone_number varchar(255),
    email varchar(255)
);

CREATE SEQUENCE IF NOT EXISTS course_sequence;

CREATE TABLE IF NOT EXISTS course(
    teacher_id bigint NOT NULL DEFAULT nextVal('course_sequence') PRIMARY KEY,
    title varchar(255),
    description varchar(500)
); */

/* private long courseId;

    private String title;
    private String description; */


/* private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email; */