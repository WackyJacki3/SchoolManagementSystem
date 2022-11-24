// alert to comfirm the deletion of student
// const confirmStudentDeletion = () => {
//     const response = confirm("Are you sure you want to remove this student?");

//     if (response) {
//         alert("Removing this student from the list...");
//     } else {
//         alert("Canceled deleting.");    
//     }
// }

function confirmDeletionOfStudent(id) {
    location.href ='/student/delete/' + id
}

// alert to comfirm the deletion of teacher
// const confirmTeacherDeletion = () => {
//     const response = confirm("Are you sure you want to remove this teacher?");

//     if (response) {
//         alert("Removing this teacher from the list...");
//     } else {
//         alert("Canceled deleting.");
//     }
// }

function confirmDeletionOfTeacher(id) {
    location.href ='/teacher/delete/' + id
}

// alert to comfirm the deletion of course
// const confirmCourseDeletion = () => {
//     const response = confirm("Are you sure you want to remove this course?");

//     if (response) {
//         alert("Removing this course from the list...");
//     } else {
//         alert("Canceled deleting.");
//     }
// }

function confirmDeletionOfCourse(id) {
    location.href ='/course/delete/' + id
}